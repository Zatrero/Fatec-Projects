package estacionamento;

import java.sql.*;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
        BLL_Carro cb = new BLL_Carro();
        DAO_Carro cd = new DAO_Carro(con);

        //Testando método inserir
        cb.setPlaca("ELF7777");
        cb.setCor("Cinza");
        cb.setDescricao("Carro do extrato de tomate ETI");
        System.out.println(cd.inserir(cb));
        /* ALTERACAO
        //Testando método alterar
        cb.setPlaca("BTS7766");
        cb.setCor("FUCSIA");
        cb.setDescricao("Carro da Penelope CHARMOSA");
        System.out.println(cd.alterar(cb));  
         */
        //Testando excluir
        /* cb.setPlaca("ZZZ6666");
        System.out.println(cd.excluir(cb));
         */
        List<BLL_Carro> lista = cd.listarTodos();
        if (lista != null) {
            for (BLL_Carro carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descrição:" + carro.getDescricao());
            }
        }
        Conexao.fecharConexao((com.mysql.jdbc.Connection) con);
    }

}
