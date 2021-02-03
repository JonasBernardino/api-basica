package com.jonas.myapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Length(min = 3,max = 100, message = "tamanho entre 3 e 100")
    @NotEmpty(message ="Campo nome é mandatório")
    private String name;

    @NotEmpty(message ="Campo login é mandatório")
    private String login;

    @NotEmpty(message ="Campo senha é mandatório")
    private String senha;
}
