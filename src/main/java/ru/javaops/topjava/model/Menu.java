package ru.javaops.topjava.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import ru.javaops.topjava.HasId;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MENU")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu extends BaseEntity implements HasId {


/*    @Column(name = "restaurant_id", nullable = false, columnDefinition = "int default 2000")
   // @Range(min = 10, max = 10000)
    private Integer restaurant_id;*/

    @Column(name = "enabled", nullable = false, columnDefinition = "bool default true")
    private boolean enabled = true;

    @Column(name = "menu_date", nullable = false, columnDefinition = "timestamp default now()", updatable = false)
    @NotNull
    private Date menu_date = new Date();

    @ManyToOne(fetch = FetchType.EAGER)
    //@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    @JoinColumn(name = "restaurant_id", nullable = false)//Не может быть меню без ресторана
    @JsonBackReference
    private Restaurant restaurant;

    //Пока без оптимизации, EAGER
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "menu")//, cascade = CascadeType.REMOVE, orphanRemoval = true)
    //@OrderBy("dateTime DESC")
    @JsonManagedReference
    @OnDelete(action = OnDeleteAction.CASCADE) //https://stackoverflow.com/a/44988100/548473
    private List<MenuItem> menuItems = new java.util.ArrayList<>();


}
