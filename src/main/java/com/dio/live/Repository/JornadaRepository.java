package com.dio.live.Repository;

import com.dio.live.model.JornadaTrabalho;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long>{

    
    
}
