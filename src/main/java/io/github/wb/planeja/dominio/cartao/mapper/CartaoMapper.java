package io.github.wb.planeja.dominio.cartao.mapper;

import io.github.wb.planeja.dominio.cartao.dto.CartaoDetalhes;
import io.github.wb.planeja.dominio.cartao.dto.CartaoForm;
import io.github.wb.planeja.dominio.cartao.model.CartaoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartaoMapper {
    CartaoForm toEntity(CartaoForm form);

    CartaoDetalhes toDetalhes(CartaoEntity form);
}
