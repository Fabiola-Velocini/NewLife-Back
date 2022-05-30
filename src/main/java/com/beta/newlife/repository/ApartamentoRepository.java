package com.beta.newlife.repository;

import java.util.Optional;

import com.beta.newlife.model.Apartamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface ApartamentoRepository extends JpaRepository<Apartamento, Long>, JpaSpecificationExecutor<Apartamento> {

    /*@Query("SELECT id_apartamento FROM Apartamento WHERE Apartamento.idApartamento =:idApartamento")
    Optional<Apartamento> findByApartamento(Long idApartamento);

    @Query("SELECT Apartamento.id_apartamento FROM Apartamento INNER JOIN Morador ON Apartamento.id_apartamento = (SELECT id_apartamento FROM Morador WHERE nome = :nome) GROUP BY Apartamento.id_apartamento")
    Optional<Apartamento> findByNome(String nome);

    @Query("SELECT Apartamento.id_apartamento FROM Apartamento INNER JOIN Veiculo ON Apartamento.id_apartamento = (SELECT id_apartamento FROM Veiculo WHERE placa = :placa) GROUP BY Apartamento.id_apartamento")
    Optional<Apartamento> findByPlaca(String placa);

    @Query("SELECT Apartamento.id_apartamento FROM Apartamento INNER JOIN Morador ON Apartamento.id_apartamento = (SELECT id_apartamento FROM Morador WHERE nome = :nome) INNER JOIN Veiculo ON Apartamento.id_apartamento = (SELECT id_apartamento FROM Veiculo WHERE placa = :placa) GROUP BY Apartamento.id_apartamento")
    Optional<Apartamento> findByNomePlaca(String nome, String placa);*/
}
