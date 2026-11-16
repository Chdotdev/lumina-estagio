package br.com.lumina.ordemcerta.modelo;

import java.time.LocalDateTime;

public class OrdemServico {
    private String id;
    private String titulo;
    private String descricao;
    private StatusOS statusOS;
    private PrioridadeOS prioridadeOS;
    private LocalDateTime dataAbertura;

    public OrdemServico(String id,String titulo, String descricao, PrioridadeOS prioridadeOS ) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridadeOS = prioridadeOS;
        dataAbertura = LocalDateTime.now();
        statusOS = StatusOS.ABERTA;
    }

    public PrioridadeOS getPrioridade() {
        return prioridadeOS;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public StatusOS getStatus() {
        return statusOS;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getId() {
        return id;
    }

    public void concluir(){
        if (statusOS == StatusOS.CONCLUIDA){
            throw new IllegalStateException("Essa tarefa já foi conluida e não está disponível para alteração");
        }
        this.statusOS = statusOS.CONCLUIDA;
    }

}
