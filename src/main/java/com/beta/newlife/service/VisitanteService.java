package com.beta.newlife.service;

import com.beta.newlife.controller.dto.VisitanteDTO;
import com.beta.newlife.controller.form.VisitanteForm;
import com.beta.newlife.model.Visitante;
import com.beta.newlife.repository.VisitanteRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public VisitanteService(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }

    public VisitanteDTO findVisitanteById(Long id){
        Visitante visitante = visitanteRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        VisitanteDTO dto = new VisitanteDTO(visitante);
        return dto;
    }

    public void  createVisitante(VisitanteForm form){
        Visitante visitante = new Visitante(form);
        visitanteRepository.save(visitante);
    }

    public void  updateVisitante(VisitanteForm form, Long id){
        Visitante visitante = visitanteRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        visitante.update(form);
        visitanteRepository.save(visitante);

    }

    public void  deleteVisitante(Long id){
        Visitante visitante = visitanteRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        visitanteRepository.delete(visitante);
    }

    public Page<Visitante> findAll(Pageable pageable) {
        return this.visitanteRepository.findAll(pageable);
    }
    
}
