package com.furqaan.restapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Data
@Accessors(chain = true)
@Entity
public class Produk {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nameProduct;
    private String descProduct;
    private int priceProduct;
    private int stockProduct;
}
