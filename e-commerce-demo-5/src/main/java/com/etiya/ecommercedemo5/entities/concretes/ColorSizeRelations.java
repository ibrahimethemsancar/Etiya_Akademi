package com.etiya.ecommercedemo5.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "colorsizerelations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ColorSizeRelations {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "sizeid")
    private Size size;

    @ManyToOne
    @JoinColumn(name = "colorid")
    private Color color;

}
