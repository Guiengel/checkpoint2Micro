package br.com.fiap.checkpoint1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.dto.PacienteRequestCreate;
import br.com.fiap.checkpoint1.dto.PacienteRequestUpdate;
import br.com.fiap.checkpoint1.model.Paciente;

@Service
public class PacienteService {
    
    private List<Paciente> pacientes = new ArrayList<>();
    private Long sequence = 1L;

    public Paciente createPaciente(PacienteRequestCreate dto) {
        Paciente novoPaciente = new Paciente();
        novoPaciente.setId(sequence++);
        novoPaciente.setNome(dto.getNome());
        novoPaciente.setEndereco(dto.getEndereco());
        novoPaciente.setBairro(dto.getBairro());
        novoPaciente.setEmail(dto.getEmail());
        novoPaciente.setTelefone_Completo(dto.getTelefone_completo());
        
        pacientes.add(novoPaciente);
        return novoPaciente;
    }

    public Optional<Paciente> updatePaciente(Long id, PacienteRequestUpdate dados) {
        return getPacienteById(id).map(paciente -> {
            if (dados.getNome() != null) {
                paciente.setNome(dados.getNome());
            }
            if (dados.getEndereco() != null) {
                paciente.setEndereco(dados.getEndereco());
            }
            if (dados.getBairro() != null) {
                paciente.setBairro(dados.getBairro());
            }
            if (dados.getEmail() != null) {
                paciente.setEmail(dados.getEmail());
            }
            if (dados.getTelefone_completo() != null) {
                paciente.setTelefone_Completo(dados.getTelefone_completo());
            }
            return paciente;
        });
    }

    public boolean deletePaciente(Long id) {
        return pacientes.removeIf(p -> p.getId().equals(id));
    }

    public Optional<Paciente> getPacienteById(Long id) {
         
        return pacientes.stream()
                      .filter(p -> p.getId().equals(id))
                      .findFirst();

    }

    public List<Paciente> listarTodos() {
        return List.copyOf(pacientes);
    }
}
