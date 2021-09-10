package com.backend;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yuvarani on 9/9/21.
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
}