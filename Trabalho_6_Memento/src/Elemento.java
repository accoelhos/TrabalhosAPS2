//cada elemento tem obrigatoriamente nome e dados de posicao x y no mapa
public class Elemento {
    private String nome;
    private int x, y;

    public Elemento (String name, int posX, int posY){
        this.nome = name;
        this.x = posX;
        this.y=posY;
    }

    public String getNome() {
        return nome;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    @Override
    public String toString() {
        return "Elemento{" +
                "nome='" + nome + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
