package models;

import java.util.Date;

public class Paciente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String telefone;
    private String email;

    public Paciente(String nome, String cpf, Date dataNascimento, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}