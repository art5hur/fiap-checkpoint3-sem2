package br.com.fiap.contatos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.contatos.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>  {

    <T> List<T> findByNome(String nome);
    <T> List<T> findAllByNomeContains(String nome);

}