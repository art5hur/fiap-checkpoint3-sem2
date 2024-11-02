package br.com.fiap.contatos.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.contatos.dto.ContatoRequestCreateDto;
import br.com.fiap.contatos.dto.ContatoRequestUpdateDto;
import br.com.fiap.contatos.dto.ContatoResponseDto;
import br.com.fiap.contatos.model.Contato;

@Component
public class ContatoMapper {
    @Autowired
    private  ModelMapper modelMapper;

    public ContatoResponseDto toDto(Contato contato) {
        return modelMapper.map(contato, ContatoResponseDto.class);
    }

    public Contato toModel(ContatoRequestCreateDto dto) {
        return modelMapper.map(dto, Contato.class);
    }

    public Contato toModel(Long id,ContatoRequestUpdateDto dto) {
        Contato result = modelMapper.map(dto, Contato.class);
        result.setId(id);
        return result;
    }
}