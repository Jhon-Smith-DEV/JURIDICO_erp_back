/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.grupo8.ERP.repository;

import com.grupo8.ERP.model.Cliente;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author fidel
 */
public interface ClienteRepository  extends MongoRepository<Cliente, String> {
    Optional<Cliente> findByCi(String ci);
    Optional<Cliente> findById(String id);
}
