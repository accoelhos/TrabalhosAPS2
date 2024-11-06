//publicadora
import java.util.ArrayList;
import java.util.List;

public class Produtora {
    private final List<Observador> foruns = new ArrayList<>();
    private final String nomeProdutora;

    public Produtora(String nomeProdutora) {
        this.nomeProdutora = nomeProdutora;
    }  
    //add observadores
    public void addForuns(Observador f){
        foruns.add(f);
    }
    //remove observadores
    public void removeForuns(Observador f){
        foruns.remove(f);
    }
   
    //produz uma musica ou um album musical 
    public void produz(String tipo, String nome){
        System.out.println("\n===========================================================================================================");
        System.out.println("Produtora "+nomeProdutora+" produziu e lançou "+tipo+" "+nome+"!");
        System.out.println("===========================================================================================================");
        notificaConcessionarias(tipo, nome);
    }

    //notificar foruns 
    private void notificaConcessionarias(String tipo, String nome){
        for(Observador f : foruns){
            f.atualizar(tipo, nome);
        }
    }

}
