
import java.util.Stack;

//armazenar os mementos em um caretaker que permita que os jogadores desfaçam ou refaçam as açoes

public class Caretaker {
    private final Stack<Memento> desfazerPilha = new Stack<>();
    private final Stack<Memento> refazerPilha = new Stack<>();
    
    public void salvarEstado(Memento m){
        desfazerPilha.push(m);
        refazerPilha.clear();
        System.out.println("Estado salvo. DesfazerPilha: " + desfazerPilha.size() + ", RefazerPilha: " + refazerPilha.size());

    }

    public void desfazer(Mapa mapa){
        if(!desfazerPilha.isEmpty()){
            refazerPilha.push(mapa.salvar());
            mapa.restaurar(desfazerPilha.pop());
            System.out.println("Desfeito. Mapa atual: " + mapa);
        }else{
            System.err.println("Não há nada para desfazer.");
        }
    }

    public void refazer(Mapa mapa){
        if(!refazerPilha.isEmpty()){
            desfazerPilha.push(mapa.salvar());
            mapa.restaurar(refazerPilha.pop());
            System.out.println("Refeito. Mapa atual: " + mapa);
        }else{
            System.err.println("Não há nada para refazer.");
        }
    }

}
