package com.prim4s.gestioncars.modules.car;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
@Data
@NoArgsConstructor
public class Car implements Serializable {

    @Id @GeneratedValue
    private Long id;

    private @NotNull String name;
}
