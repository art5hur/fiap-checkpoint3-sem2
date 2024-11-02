package br.com.fiap.contatos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.contatos.model.Contato;
import br.com.fiap.contatos.repository.ContatoRepository;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> list() {
        return contatoRepository.findAll();
    }

    public Contato save(Contato contato) {
        return contatoRepository.save(contato);
    }

    public boolean existsById(Long id) {
        return contatoRepository.existsById(id);
    }

    public void delete(Long id) {
        contatoRepository.deleteById(id);
    }

    public Optional<Contato> findById(Long id) {
        return contatoRepository.findById(id);
    }
}
