package ch.bbw.m183.vulnerapp.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Privilege {

    @Id
    private Long id;

    private String name;

}
