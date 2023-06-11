package br.com.gabriepessoa.orderorchestratorapi.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID productId;

    private String name;
    private String description;
    private Double price;
    private String imgURL;

    @ManyToMany
    private Set<Category> categories = new HashSet<>();
}
