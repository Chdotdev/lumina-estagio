package br.com.lumina.ordemcerta.modelo;

import java.util.ArrayList;
import java.util.List;

public class ListaDeOrdens {
    private List<OrdemServico> ordensDeServico;

    public ListaDeOrdens(){
        ordensDeServico = new ArrayList<>();
    }

    public void adicionarOrdem(OrdemServico o){
        ordensDeServico.add(o);
    }

    public void listarOrdens(){
        for (StatusOS status: StatusOS.values()){
            System.out.println("=== " + status + " ===");
            for (OrdemServico o: ordensDeServico){
                if (o.getStatusOS() == status){
                    System.out.println(o);
                }
            }
        }
    }
}
