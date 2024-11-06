package models;

import java.util.Date;

public class Medico extends Funcionario {
    private Especialidade especialidade;
    private String crm;

    public Medico(String nome, String cpf, Date dataNascimento, String telefone, String email, Especialidade especialidade, String crm) {
        super(nome, cpf, dataNascimento, telefone, email, "Médico", new Date(), 0);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void atualizarCrm(String novoCrm) {
        this.crm = novoCrm;
    }
}
