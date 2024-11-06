package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Receituario {
    private Medico medico;
    private Paciente paciente;
    private Date dataReceita;
    private List<String> medicamentos;
    private List<String> doses;
    private List<String> diasDeUso;

    // Construtor
    public Receituario(Medico medico, Paciente paciente, Date dataReceita, List<String> medicamentos, List<String> doses, List<String> diasDeUso) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataReceita = dataReceita;
        this.medicamentos = medicamentos;
        this.doses = doses;
        this.diasDeUso = diasDeUso;
    }

    // Getter para o paciente
    public Paciente getPaciente() {
        return paciente;
    }

    // Método para exibir o receituário
    public void exibirReceituario() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Receituário de: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Data: " + sdf.format(dataReceita)); // Exibe a data formatada
        System.out.println("Medicamentos e instruções:");
        for (int i = 0; i < medicamentos.size(); i++) {
            System.out.println(medicamentos.get(i) + " - Dose: " + doses.get(i) + " - Dias de uso: " + diasDeUso.get(i));
        }
    }
}
