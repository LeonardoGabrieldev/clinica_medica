package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private Date dataConsulta; // Data da consulta
    private String horarioConsulta; // Horário da consulta

    // Construtor da classe com data como parâmetro
    public Consulta(Medico medico, Paciente paciente, Date dataConsulta, String horarioConsulta) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataConsulta = dataConsulta != null ? dataConsulta : getDataPadrao();
        this.horarioConsulta = horarioConsulta;
    }

    // Método para retornar a data padrão (18/11/2024)
    private Date getDataPadrao() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse("18/11/2024");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Getter para a Data da Consulta
    public Date getDataConsulta() {
        return dataConsulta;
    }

    // Getter para o Médico
    public Medico getMedico() {
        return medico;
    }

    // Getter para o Paciente
    public Paciente getPaciente() {
        return paciente;
    }

    // Getter para o Horário da Consulta
    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    // Método para exibir informações sobre a consulta com a data formatada
    public void exibirInformacoes() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(dataConsulta);

        System.out.println("Informações da Consulta:");
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Data: " + dataFormatada);
        System.out.println("Horário: " + horarioConsulta);
    }
}
