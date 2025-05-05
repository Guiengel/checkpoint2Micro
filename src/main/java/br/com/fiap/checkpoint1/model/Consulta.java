package br.com.fiap.checkpoint1.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Consulta {
    private Long id;
    private Integer id_profissional;
    private Integer id_paciente;
    private LocalDateTime data_consulta;
    private String status_consulta;
    private Integer quantidade_horas;
    private BigDecimal valor_consulta;
    private LocalDateTime criado_as;
    private LocalDateTime atualizado_as;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getId_profissional() {
        return id_profissional;
    }
    public void setId_profissional(Integer id_profissional) {
        this.id_profissional = id_profissional;
    }
    public Integer getId_paciente() {
        return id_paciente;
    }
    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }
    public LocalDateTime getData_consulta() {
        return data_consulta;
    }
    public void setData_consulta(LocalDateTime data_consulta) {
        this.data_consulta = data_consulta;
    }
    public String getStatus_consulta() {
        return status_consulta;
    }
    public void setStatus_consulta(String status_consulta) {
        this.status_consulta = status_consulta;
    }
    public Integer getQuantidade_horas() {
        return quantidade_horas;
    }
    public void setQuantidade_horas(Integer quantidade_horas) {
        this.quantidade_horas = quantidade_horas;
    }
    public BigDecimal getValor_consulta() {
        return valor_consulta;
    }
    public void setValor_consulta(BigDecimal valor_consulta) {
        this.valor_consulta = valor_consulta;
    }
    public LocalDateTime getCriado_as() {
        return criado_as;
    }
    public void setCriado_as(LocalDateTime criado_as) {
        this.criado_as = criado_as;
    }
    public LocalDateTime getAtualizado_as() {
        return atualizado_as;
    }
    public void setAtualizado_as(LocalDateTime atualizado_as) {
        this.atualizado_as = atualizado_as;
    }
}
