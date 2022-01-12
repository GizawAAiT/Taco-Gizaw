package com.gizaw.tacocloud;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Taco {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String designName;
    @ManyToMany
    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    @ManyToOne
    private List<Ingredient> ingredients;
}
