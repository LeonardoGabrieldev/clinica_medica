package models;

import java.util.Date;

public class Senha {
    private static int contador = 0;
    private final int numero;
    private final Date dataHora;
    private String status;
    private int prioridade;

    public Senha(String status, int prioridade) {
        if (prioridade < 1) {
            throw new IllegalArgumentException("A prioridade deve ser maior que zero.");
        }
        this.numero = ++contador;
        this.dataHora = new Date();
        setStatus(status);
        this.prioridade = prioridade;
    }

    public int getNumero() {
        return numero;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public String getStatus() {
        return status;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setStatus(String status) {
        if (!status.equals("Pendente") && !status.equals("Atendida") && !status.equals("Cancelada")) {
            throw new IllegalArgumentException("Status inválido. Aceitos: Pendente, Atendida, Cancelada.");
        }
        this.status = status;
    }

    @Override
    public String toString() {
        return "Senha{" +
                "numero=" + numero +
                ", dataHora=" + dataHora +
                ", status='" + status + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
