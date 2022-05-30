package com.beta.newlife.repository;

import java.util.Optional;

import com.beta.newlife.model.Morador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MoradorRepository extends JpaRepository<Morador, Long>, JpaSpecificationExecutor<Morador> {

    @Query("SELECT a FROM Morador a WHERE a.idApartamento =:idApartamento")
    Optional<Morador> findByApartamento(Long idApartamento);

    @Query("SELECT a FROM Morador a WHERE a.nome =:nome")
    Optional<Morador> findByNome(String nome);

}
