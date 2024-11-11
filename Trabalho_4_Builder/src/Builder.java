public interface Builder {
    //metodos para construir o hamburguer
    Builder setCarne(int qtdCarne);
    Builder setQueijo(int qtdQueijo, String tipoQueijo);
    Builder setBacon(int qtdBacon);
    Builder setTipoPao(String tipoPao);
    Builder setSalada(boolean salada);
    Builder setCebola(boolean cebola);
    Builder setOvoCodorna(int ovoCodorna);
    Hamburguer build();
}
