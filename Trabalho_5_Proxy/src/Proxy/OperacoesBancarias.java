package Proxy;

public class OperacoesBancarias {

    public void acessarDadosConfidenciais(String userID) {
        System.out.println("================== ACESSO CONFIDENCIAL ==================");
        System.out.println("Usuário " + userID + " foi permitido e está acessando dados confidenciais de clientes.");
    }

    public void realizarTransacao(String userID) {
        System.out.println("================== REALIZAR TRANSAÇÃO ==================");
        System.out.println("Usuário " + userID + " foi permitido está executando uma transação financeira.");
    }
}
