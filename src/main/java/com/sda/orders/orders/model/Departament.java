package com.sda.orders.orders.model;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity

public class Departament {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer id;
    private  String name;
    private  String description;




}
