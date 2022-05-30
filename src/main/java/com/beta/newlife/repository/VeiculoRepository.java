package com.beta.newlife.repository;

import java.util.Optional;

import com.beta.newlife.model.Veiculo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>  , JpaSpecificationExecutor<Veiculo> {
    
    @Query("SELECT a FROM Veiculo a WHERE a.idApartamento =:idApartamento")
    Optional<Veiculo> findByApartamento(Long idApartamento);

    @Query("SELECT a FROM Veiculo a WHERE a.placa =:placa")
    Optional<Veiculo> findByPlaca(String placa);

}