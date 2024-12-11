//mapa é o originator
import java.util.ArrayList;
import java.util.List;

//classe mapa: contem uma colecao de varios objetos da classe elemento (pilha é melhor). 
//cada elemento tem nome e dados de uma posicao no mapa
public class Mapa {
    private List<Elemento> elementos = new ArrayList<>();

    public void addElemento(Elemento e, Caretaker caretaker) {
        caretaker.salvarEstado(this.salvar()); //salva o estado -> cria um memento
        elementos.add(e);
        System.out.println("Elemento adicionado: " + e);
    }

    public boolean removeElemento(String nome, int x, int y, Caretaker caretaker) {
        boolean elementoEncontrado = false;
    
        for (int i = 0; i < elementos.size(); i++) {
            Elemento atual = elementos.get(i);
            if (atual.getNome().equals(nome) && atual.getX() == x && atual.getY() == y) {
                caretaker.salvarEstado(this.salvar());
                elementos.remove(i);
                elementoEncontrado = true;
                break;
            }
        }
    
        return elementoEncontrado;
    }
    
    public Memento salvar() {
        return new Memento(new ArrayList<>(elementos)); //salva o estado atual como um novo memento
    }

    public void restaurar(Memento memento) {
        this.elementos = memento.getEstado(); //restaura o estado salvo no memento
        System.out.println("Mapa restaurado: " + this);
    }

    @Override
    public String toString() {
        return "Mapa{" + "elementos=" + elementos + '}';
    }
}
