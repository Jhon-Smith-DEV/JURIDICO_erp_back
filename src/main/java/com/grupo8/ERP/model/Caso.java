/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.ERP.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author fidel
 */
@Setter
@Getter
@Document(collection = "casos")
public class Caso {
    @Id
    private String id;
    
    private String demandante;
    private String meteria;
    private String tipoProceso;
    private String lugarAsignado;
}
