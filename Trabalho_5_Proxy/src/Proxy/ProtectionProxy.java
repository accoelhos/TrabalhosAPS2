package Proxy;

import java.util.Arrays;
import java.util.List;

public class ProtectionProxy implements IControleAcesso {
    private final OperacoesBancarias operacoesBancarias = new OperacoesBancarias();

    @Override
    public void acessarArea(String operacao, String papel, String userID) {
        //permissões de operações para cada papel
        List<String> permissoesAdmin = Arrays.asList("DADOSCONFIDENCIAIS", "TRANSACAO");
        List<String> permissoesGerente = Arrays.asList("DADOSCONFIDENCIAIS");
        List<String> permissoesUser = Arrays.asList("TRANSACAO");

        System.out.println("Log de atividade -> Usuário: " + userID + " tentando realizar operação: " + operacao+"...");

        switch (papel.toUpperCase()) {
            case "ADMIN":
                if (permissoesAdmin.contains(operacao.toUpperCase())) {
                    delegarOperacao(operacao, userID);
                } else {
                    System.out.println("Ops! Acesso negado. ADMIN não pode realizar: " + operacao);
                }
                break;
            case "GERENTE":
                if (permissoesGerente.contains(operacao.toUpperCase())) {
                    delegarOperacao(operacao, userID);
                } else {
                    System.out.println("Ops! Acesso negado. GERENTE não pode realizar: " + operacao);
                }
                break;
            case "USER":
                if (permissoesUser.contains(operacao.toUpperCase())) {
                    delegarOperacao(operacao, userID);
                } else {
                    System.out.println("Ops! Acesso negado. USER não pode realizar: " + operacao);
                }
                break;
            default:
                System.out.println("Ops! Acesso negado. Papel desconhecido :p");
        }
    }

    private void delegarOperacao(String operacao, String userID) {
        switch (operacao.toUpperCase()) {
            case "DADOSCONFIDENCIAIS":
                operacoesBancarias.acessarDadosConfidenciais(userID);
                break;
            case "TRANSACAO":
                operacoesBancarias.realizarTransacao(userID);
                break;
            default:
                System.out.println("Operação desconhecida.");
        }
    }
}
