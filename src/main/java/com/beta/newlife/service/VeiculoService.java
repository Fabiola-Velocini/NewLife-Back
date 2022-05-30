package com.beta.newlife.service;

import com.beta.newlife.controller.dto.VeiculoDTO;
import com.beta.newlife.controller.form.VeiculoForm;
import com.beta.newlife.model.Veiculo;
import com.beta.newlife.repository.VeiculoRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public VeiculoDTO findVeiculoById(Long id){
        Veiculo veiculo = veiculoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        VeiculoDTO dto = new VeiculoDTO(veiculo);
        return dto;
    }

    public void  createVeiculo(VeiculoForm form){
        Veiculo veiculo = new Veiculo(form);
        veiculoRepository.save(veiculo);
    }

    public void  updateVeiculo(VeiculoForm form, Long id){
        Veiculo veiculo = veiculoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        veiculo.update(form);
        veiculoRepository.save(veiculo);

    }

    public void  deleteVeiculo(Long id){
        Veiculo veiculo = veiculoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        veiculoRepository.delete(veiculo);
    }

    public Page<Veiculo> findAll(Pageable pageable) {
        return this.veiculoRepository.findAll(pageable);
    }
    
}
