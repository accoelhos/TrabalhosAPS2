public class Pedido {
    int qtdCarne;
    int qtdQueijo;
    int qtdBacon;
    String tipoPao;
    String tipoQueijo;
    boolean salada;
    boolean cebola;
    int ovoCodorna;


    public Pedido(int qtdCarne, int qtdQueijo, String tipoQueijo, int qtdBacon, String tipoPao, boolean salada, boolean cebola, int ovoCodorna){
        this.qtdCarne = qtdCarne;
        this.qtdQueijo = qtdQueijo;
        this.qtdBacon = qtdBacon;
        this.salada = salada;
        this.cebola = cebola;
        this.tipoPao = tipoPao;
        this.ovoCodorna = ovoCodorna;
        this.tipoQueijo = tipoQueijo;

    }
}
