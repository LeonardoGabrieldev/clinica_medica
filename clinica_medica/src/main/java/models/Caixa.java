package models;

public class Caixa {
    private double total;

    public void registrarPagamento(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para pagamento.");
            return;
        }
        total += valor;
        System.out.println("Pagamento de R$" + valor + " registrado. Total em caixa: R$" + total);
    }

    public void cancelarPagamento(double valor) {
        if (valor <= 0 || valor > total) {
            System.out.println("Valor inválido para cancelamento.");
            return;
        }
        total -= valor;
        System.out.println("Pagamento de R$" + valor + " cancelado. Total em caixa: R$" + total);
    }

    public double getTotal() {
        return total;
    }

    public void exibirTotal() {
        System.out.println("Total em caixa: R$" + total);
    }
}
