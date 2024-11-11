//so deve receber o pedido
public class Diretor {
    //o tipo do hamburguer vai ser passado como parametro 
    public Hamburguer montarHamburguer(Builder builder, Pedido pedido){
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
