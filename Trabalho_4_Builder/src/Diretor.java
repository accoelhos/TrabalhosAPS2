//so deve receber o pedido
public class Diretor {
    //o tipo do hamburguer vai ser passado como parametro 
    //o pedido é montado de maneiras diferentes de acordo com o builder passado no pedido. para otimizar o codigo, só existe essa função montarHamburguer, que retorna um hamburguer que pode variar de acordo com o builder utilizado
    private final Builder builder;
    public Diretor(Builder builder){
        this.builder = builder;
    }
    public Hamburguer montarHamburguer(Pedido pedido){
        builder.setTipoPao(pedido.tipoPao);
        builder.setCarne(pedido.qtdCarne);
        builder.setQueijo(pedido.qtdQueijo, pedido.tipoQueijo);
        builder.setBacon(pedido.qtdBacon);
        builder.setCebola(pedido.cebola);
        builder.setSalada(pedido.salada);
        builder.setOvoCodorna(pedido.ovoCodorna);
        return builder.build();
    }
}
