package br.com.fiap.checkpoint1.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Profissional {
    private Long id;
    private String nome;
    private BigDecimal valor_hora;
    private LocalDateTime criado_as;
    private LocalDateTime atualizado_as;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getValor_hora() {
        return valor_hora;
    }
    public void setValor_hora(BigDecimal valor_hora) {
        this.valor_hora = valor_hora;
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
