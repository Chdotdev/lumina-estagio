package br.com.lumina.ordemcerta;

import br.com.lumina.ordemcerta.modelo.ListaDeOrdens;
import br.com.lumina.ordemcerta.modelo.OrdemServico;
import br.com.lumina.ordemcerta.modelo.PrioridadeOS;

public class Main {
    public static void main(String[] args) {
        OrdemServico os1 = new OrdemServico("761576", "Geladeira", "Motor em mal funcionamento", PrioridadeOS.MEDIA);
        OrdemServico os2 = new OrdemServico("93446", "Televisão", "Sem imagem", PrioridadeOS.BAIXA);

        ListaDeOrdens listaDeOrdens = new ListaDeOrdens();
        listaDeOrdens.adicionarOrdem(os1);
        listaDeOrdens.adicionarOrdem(os2);

        listaDeOrdens.listarOrdens();

        try {
            os1.concluir();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------");
        listaDeOrdens.listarOrdens();

        try{
            os2.iniciar();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }


        try{
            os1.iniciar();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------");

        listaDeOrdens.listarOrdens();

    }
}
