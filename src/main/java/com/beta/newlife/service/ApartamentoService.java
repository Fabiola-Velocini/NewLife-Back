package com.beta.newlife.service;

import com.beta.newlife.repository.ApartamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class ApartamentoService {

    private final ApartamentoRepository apartamentoRepository;

    public ApartamentoService(ApartamentoRepository apartamentoRepository) {
        this.apartamentoRepository = apartamentoRepository;
    }

}
