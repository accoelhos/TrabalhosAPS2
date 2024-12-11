
import java.util.ArrayList;
import java.util.List;

//cada vez que o estado do mapa é alterado (elemento inserido ou removido) um objeto memento deve ser automaticamente criado para capturar o estado do mapa naquele momento

public class Memento {
    private final List<Elemento> estadoSalvo;
    
    public Memento(List<Elemento> estadoSalvo){
        this.estadoSalvo = estadoSalvo;
    }
    public List<Elemento> getEstado(){
        return new ArrayList<>(estadoSalvo);
    }
}
