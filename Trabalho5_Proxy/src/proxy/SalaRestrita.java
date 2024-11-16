package proxy;

public class SalaRestrita implements ControleAcesso{

    @Override
    public void entrar(String papel, String userID) {
        System.out.println("==================SALA RESTRITA==================");
        System.out.println(userID+" acabou de entrar.");
    }

    
}
