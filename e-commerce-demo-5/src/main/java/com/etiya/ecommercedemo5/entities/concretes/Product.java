package com.etiya.ecommercedemo5.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "unitprice")
    private double unit_price;

    @Column(name = "stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "colorsizeid")
    private ColorSizeRelations colorSizeRelations;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<ProductCategories> productCategories;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<Order> orders;
}
