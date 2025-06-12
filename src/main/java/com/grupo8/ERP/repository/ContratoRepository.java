/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.grupo8.ERP.repository;

import com.grupo8.ERP.model.Contrato;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author fidel
 */
public interface ContratoRepository extends MongoRepository<Contrato, String> {
    List<Contrato> findByClienteId(String clienteId);
    List<Contrato> findByAbogadoId(String abogadoId);
    
}