package cliente;

import proxy.ControleAcesso;
import proxy.ProtectionProxy;

public class Cliente {
    public static void main(String[] args) {
        ControleAcesso proxy = new ProtectionProxy();

        // Teste 1: Usuário administrador (deve ter acesso)
        System.out.println("Teste 1: Usuário com papel de ADMIN tentando acessar.");
        proxy.entrar("ADMIN", "carolAdmin"); // Sucesso esperado

        // Teste 2: Usuário gerente (deve ter acesso)
        System.out.println("\nTeste 2: Usuário com papel de GERENTE tentando acessar.");
        proxy.entrar("GERENTE", "userGerente"); // Sucesso esperado

        // Teste 3: Usuário comum (não deve ter acesso)
        System.out.println("\nTeste 3: Usuário com papel de USER tentando acessar.");
        proxy.entrar("USER", "userComum"); // Fracasso esperado

        // Teste 4: Usuário não identificado (não deve ter acesso)
        System.out.println("\nTeste 4: Usuário com papel DESCONHECIDO tentando acessar.");
        proxy.entrar("DESCONHECIDO", "userAleatorio"); // Fracasso esperado
    }
}

