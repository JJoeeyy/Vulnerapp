package ch.bbw.m183.vulnerapp.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;


@Getter
@Setter
public class Role {

        @Id
        private Long id;

        private String name;
}
