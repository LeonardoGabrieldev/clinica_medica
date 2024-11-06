package models;

import java.util.ArrayList;

public class Clinica {
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;

    public Clinica(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void adicionarPaciente(Paciente paciente) {
        if (buscarPaciente(paciente.getCpf()) == null) {
            pacientes.add(paciente);
        } else {
            System.out.println("Paciente com CPF " + paciente.getCpf() + " já existe.");
        }
    }

    public void removerFuncionario(String cpf) {
        funcionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpf));
    }

    public void removerMedico(String cpf) {
        medicos.removeIf(medico -> medico.getCpf().equals(cpf));
    }

    public void removerPaciente(String cpf) {
        pacientes.removeIf(paciente -> paciente.getCpf().equals(cpf));
    }

    public ArrayList<Funcionario> listarFuncionarios() {
        return new ArrayList<>(funcionarios);
    }

    public ArrayList<Medico> listarMedicos() {
        return new ArrayList<>(medicos);
    }

    public ArrayList<Paciente> listarPacientes() {
        return new ArrayList<>(pacientes);
    }

    public Paciente buscarPaciente(String cpf) {
        return pacientes.stream()
                .filter(paciente -> paciente.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public Medico buscarMedico(String cpf) {
        return medicos.stream()
                .filter(medico -> medico.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }
}