package br.com.fiap.checkpoint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.checkpoint1.model.Consulta;

@Repository
public interface ConsultaRepository
        extends JpaRepository<Consulta, Long> {

}
