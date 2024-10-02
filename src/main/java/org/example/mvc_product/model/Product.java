package org.example.mvc_product.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

/*Свойства
        Id
Название
        Цена
Категоря
Срок годности*/
@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private Double price;
    private String category;
    private Date best_before_date;


}
