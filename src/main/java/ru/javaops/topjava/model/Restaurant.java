package ru.javaops.topjava.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.javaops.topjava.HasId;
import ru.javaops.topjava.util.validation.NoHtml;

import javax.net.ssl.HandshakeCompletedListener;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "restaurant")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Restaurant extends NamedEntity implements HasId, Serializable {

    @Column(name = "commentary")
    @NotBlank
    @NoHtml
    private String commentary;

}
