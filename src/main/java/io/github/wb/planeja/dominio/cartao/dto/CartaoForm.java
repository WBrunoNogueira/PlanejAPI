package io.github.wb.planeja.dominio.cartao.dto;

import io.github.wb.planeja.dominio.cartao.model.BandeiraCartao;

// Data Acces Object (DTO) para representar os dados de um cartão de crédito.
public record CartaoForm(String nome, BandeiraCartao bandeira) {
}
