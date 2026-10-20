package io.github.wb.planeja.dominio.cartao.dto;

import io.github.wb.planeja.dominio.cartao.model.BandeiraCartao;

import java.time.LocalDateTime;

public record CartaoDetalhes(String id, String nome , BandeiraCartao bandeira, LocalDateTime dataCadastro) {
}
