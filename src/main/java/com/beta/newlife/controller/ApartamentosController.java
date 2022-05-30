package com.beta.newlife.controller;

import java.util.ArrayList;
import java.util.List;

import com.beta.newlife.controller.dto.ApartamentoDTO;
import com.beta.newlife.repository.ApartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/apartamentos")
public class ApartamentosController {

    @Autowired
    private ApartamentoRepository apartamentoRepository;

    @GetMapping
    public ResponseEntity<?> findByDescription (
        @RequestParam (required = false) String placa,
        @RequestParam (required = false) String nome,
        @RequestParam (required = false) Long idApartamento
    ) {
        List<ApartamentoDTO> pesquisa = new ArrayList<> ();

       /*if (placa == null && nome == null) {
            apartamentoRepository.findByApartamento(idApartamento);
        } else if (placa == null && idApartamento == null) {
            apartamentoRepository.findByNome(nome);
        } else if (nome == null && idApartamento == null) {
            apartamentoRepository.findByPlaca(placa);
        } else if (nome == null) {
            apartamentoRepository.findByPlaca(placa);
        } else if (placa == null) {
            apartamentoRepository.findByNome(nome);
        } else if (idApartamento == null) {
            apartamentoRepository.findByNomePlaca(nome, placa);
        } else {
            apartamentoRepository.findByNomePlaca(nome, placa);
        }*/

        return ResponseEntity.status(HttpStatus.OK).body(pesquisa);

    }

}
