/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.ERP.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author fidel
 */
@Getter
@Setter
@Document(collection = "contratos")
public class Contrato {

    @Id
    private String id;
    private String detalles;
    private String hashAddress;
    private String precioETH;
    private Double precioBS;
    private String fecha;
    
    @DBRef
    private Cliente cliente;

    @DBRef
    private Abogado abogado;
    
    @DBRef
    private Caso caso;
    
}