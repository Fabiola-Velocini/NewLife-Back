package com.beta.newlife.service;

import com.beta.newlife.controller.dto.MoradorDTO;
import com.beta.newlife.controller.form.MoradorForm;
import com.beta.newlife.model.Morador;
import com.beta.newlife.repository.MoradorRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MoradorService {

    private final MoradorRepository moradorRepository;

    public MoradorService(MoradorRepository moradorRepository) {
        this.moradorRepository = moradorRepository;
    }

    public MoradorDTO findMoradorById(Long id){
        Morador morador = moradorRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        MoradorDTO dto = new MoradorDTO(morador);
        return dto;
    }

    public void  createMorador(MoradorForm form){
        Morador morador = new Morador(form);
        moradorRepository.save(morador);
    }

    public void  updateMorador(MoradorForm form, Long id){
        Morador morador = moradorRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        morador.update(form);
        moradorRepository.save(morador);

    }

    public void  deleteMorador(Long id){
        Morador morador = moradorRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        moradorRepository.delete(morador);
    }

    public Page<Morador> findAll(Pageable pageable) {
        return this.moradorRepository.findAll(pageable);
    }

}
