package com.beta.newlife.repository;

import java.util.Optional;

import com.beta.newlife.model.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>, JpaSpecificationExecutor<Funcionario> {

    @Query("SELECT a FROM Funcionario a WHERE a.idApartamento =:idApartamento")
    Optional<Funcionario> findByApartamento(Long idApartamento);

}

