package br.com.gabriepessoa.orderorchestratorapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private Set<Product>  products = new HashSet<>();
}
