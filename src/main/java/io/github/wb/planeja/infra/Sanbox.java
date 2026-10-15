package io.github.wb.planeja.infra;

import io.github.wb.planeja.dominio.cartao.CartaoRepository;
import io.github.wb.planeja.dominio.cartao.model.BandeiraCartao;
import io.github.wb.planeja.dominio.cartao.model.CartaoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Teste sandbox para salvar um cartão no banco de dados ao iniciar a aplicação
@Component
public class Sanbox implements CommandLineRunner{

    @Autowired
    private  CartaoRepository repository;

    public void salvarCartao() {

        CartaoEntity cartao = new CartaoEntity();
        cartao.setNome("ITAU Personalite");
        cartao.setBandeira(BandeiraCartao.AMERICAN_EXPRESS);
        cartao.setDataCadastro(java.time.LocalDate.now());
        repository.save(cartao);
    }


    //CommandLineRunner é uma interface do Spring Boot que permite executar código específico após a inicialização do aplicativo.
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Executando teste sandbox...");
        salvarCartao();

    }
}
