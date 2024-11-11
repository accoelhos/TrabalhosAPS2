public interface Builder {
    //metodos para construir o hamburguer
    Builder setCarne(float qtdCarne);
    Builder setQueijo(float qtdQueijo, String tipoQueijo);
    Builder setBacon(float qtdBacon);
    Builder setTipoPao(String tipoPao);
    Builder setSalada(boolean salada);
    Builder setCebola(boolean cebola);
    Builder setOvoCodorna(int ovoCodorna);

}
