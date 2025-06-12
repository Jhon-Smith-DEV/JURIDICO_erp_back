/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo8.ERP.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author fidel
 */
@Setter
@Getter
@Document(collection = "clientes")
public class Cliente {

    @Id
    private String id;

    private String nombre;
    private String apellido;
    private String ci;
    private String telefono;
    private String correo;
    private String fechaNac;
    private String cuentaETH;
   
}
