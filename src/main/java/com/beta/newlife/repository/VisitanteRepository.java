package com.beta.newlife.repository;

import java.util.Optional;

import com.beta.newlife.model.Visitante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> , JpaSpecificationExecutor<Visitante> {

    @Query("SELECT a FROM Visitante a WHERE a.idApartamento =:idApartamento")
    Optional<Visitante> findByApartamento(Long idApartamento);

}
