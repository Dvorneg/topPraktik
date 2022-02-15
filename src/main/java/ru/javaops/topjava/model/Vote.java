package ru.javaops.topjava.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import ru.javaops.topjava.HasId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/*vote-голосование*/

@Entity
@Table(name = "vote")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Vote extends BaseEntity implements HasId, Serializable {

    @Column(name = "user_id", nullable = false)
    //@Range(min = 10, max = 10000)
    private Integer user_id;  //int NOT NULL,

    @Column(name = "restaurant_id", nullable = false)
    @Range(min = 10, max = 10000)
    private Integer menu_id;

    @Column(name = "date_vote", nullable = false, columnDefinition = "timestamp default now()", updatable = false)
    @NotNull
    private LocalDateTime date_vote = LocalDateTime.now();

}
