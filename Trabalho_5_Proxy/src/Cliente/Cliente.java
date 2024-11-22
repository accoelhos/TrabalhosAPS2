package Cliente;

import Proxy.IControleAcesso;
import Proxy.ProtectionProxy;

//exemplo de sistema bancario com protection proxy
//admin pode acessar todos os dados confidenciais e transações
//gerente só pode acessar os dados confidenciais
//usuário comum só realiza transações
//papéis desconhecidos não podem fazer nada

public class Cliente {
    public static void main(String[] args) {
    	//criando somente o proxy para nao expor nenhuma outra classe
        IControleAcesso proxy = new ProtectionProxy();

        //teste 1: Administrador acessando dados confidenciais
        //esperado sucesso
        System.out.println("Teste 1: ADMIN tentando acessar dados confidenciais...");
        proxy.acessarArea("DADOSCONFIDENCIAIS", "ADMIN", "adminCarol");

        //teste 2: Gerente tentando acessar dados confidenciais
        //esperado sucesso
        System.out.println("\nTeste 2: GERENTE tentando acessar dados confidenciais...");
        proxy.acessarArea("DADOSCONFIDENCIAIS", "gerente", "gerenteMarcelo");

        //teste 3: Usuário comum tentando acessar dados confidenciais
        //esperado fracasso
        System.out.println("\nTeste 3: USER tentando acessar dados confidenciais...");
        proxy.acessarArea("DADOSCONFIDENCIAIS", "user", "userPessoa");

        //teste 4: Usuário comum tentando realizar transação
        //esperado sucesso
        System.out.println("\nTeste 4: USER tentando realizar uma transação..");
        proxy.acessarArea("TRANSACAO", "USER", "userTony");

        //teste 5: Papel desconhecido tentando realizar qualquer operação
        //esperado fracasso
        System.out.println("\nTeste 5: DESCONHECIDO tentando realizar uma operação...");
        proxy.acessarArea("TRANSACAO", "DESCONHECIDO", "aleatorio123");
        
        //teste 6: Gerente tentando acessar transacoes
        //esperado fracasso
        System.out.println("\nTeste 6: GERENTE tentando acessar transações...");
        proxy.acessarArea("TRANSACAO", "gerente", "gerenteMarcelo");
    }
}
