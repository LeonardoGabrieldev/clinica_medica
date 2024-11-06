package models;

public class Guiche {
    private Funcionario funcionario;

    public Guiche(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void exibirInformacoes() {
        if (funcionario != null) {
            System.out.println("Guichê atendido por: " + funcionario.getNome() + " - Cargo: " + funcionario.getCargo());
        } else {
            System.out.println("Este guichê não está atribuído a nenhum funcionário.");
        }
    }
}
