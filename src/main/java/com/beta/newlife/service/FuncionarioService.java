package com.beta.newlife.service;

import com.beta.newlife.controller.dto.FuncionarioDTO;
import com.beta.newlife.controller.form.FuncionarioForm;
import com.beta.newlife.model.Funcionario;
import com.beta.newlife.repository.FuncionarioRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public FuncionarioDTO findFuncionarioById(Long id){
        Funcionario funcionario = funcionarioRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        FuncionarioDTO dto = new FuncionarioDTO(funcionario);
        return dto;
    }

    public void  createFuncionario(FuncionarioForm form){
        Funcionario funcionario = new Funcionario(form);
        funcionarioRepository.save(funcionario);
    }

    public void  updateFuncionario(FuncionarioForm form, Long id){
        Funcionario funcionario = funcionarioRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        funcionario.update(form);
        funcionarioRepository.save(funcionario);

    }

    public void  deleteFuncionario(Long id){
        Funcionario funcionario = funcionarioRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        funcionarioRepository.delete(funcionario);
    }

    public Page<Funcionario> findAll(Pageable pageable) {
        return this.funcionarioRepository.findAll(pageable);
    }

}
