package proxy;

public class ProtectionProxy implements ControleAcesso{
    private final SalaRestrita salaRestrita;
    private final String papelAdmin = "ADMIN";
    private final String [] papeisAutorizados = {"ADMIN", "GERENTE"};

    public ProtectionProxy() {
        this.salaRestrita = new SalaRestrita();
    }


    @Override
    public void entrar(String papel, String userID) {
        //verificar se o usuario é autorizado
        System.out.println("-----------------------------------------------");
        if(userAutorizado(papel)){
            System.out.println("Proxy: Foi verificado e "+userID+" possui acesso a sala restrita pois é "+papel);
            System.out.println(userID+" entrando...");
            salaRestrita.entrar(papel, userID);
        }else{
            System.out.println("Proxy: Foi verificado e "+userID+" NÃO possui acesso a sala restrita pois é "+papel);
            System.out.println(userID+" não vai entrar.");
        }
        //se sim exibir que o acesso foi concedido e tal
        //se nao, exibir que o acesso foi negado
        
    }
    //funcao para verificar se o usuario é autorizado (se esta na lista de autorizados)
    private boolean userAutorizado(String papelUser){
        for(String papel : papeisAutorizados){
            if(papel.equals(papelUser)){
                return true;
            }
        }
        return false;
    }
}
