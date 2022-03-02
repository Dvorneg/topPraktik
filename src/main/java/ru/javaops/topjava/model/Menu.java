package ru.javaops.topjava.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.javaops.topjava.HasId;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "menu")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu extends BaseEntity implements HasId, Serializable {


/*    @Column(name = "restaurant_id", nullable = false, columnDefinition = "int default 2000")
   // @Range(min = 10, max = 10000)
    private Integer restaurant_id;*/

    @Column(name = "enabled", nullable = false, columnDefinition = "bool default true")
    private boolean enabled = true;

    @Column(name = "menu_date", nullable = false, columnDefinition = "timestamp default now()", updatable = false)
    @NotNull
    private Date menu_date = new Date();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id", nullable = false)//Не может быть меню без ресторана
    @JsonBackReference
    private Restaurant restaurant;

}
