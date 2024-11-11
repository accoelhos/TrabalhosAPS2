//esse builder é vegetariano/vegano então a carne é de soja. se o cliente for vegetariano apenas, ele pode pedir qualquer queijo
public class BuilderVeg implements Builder{
    Hamburguer h = new Hamburguer();

    @Override
    public Builder setCarne(int qtdCarne) {
        h.setQtdCarne(qtdCarne);
        h.setTipoCarne("soja");
        System.out.println("Adicionando "+(qtdCarne)+ " gramas de carne de soja. Oh yeah.");
        return this;
    }

    @Override
    public Builder setQueijo(int qtdQueijo, String tipoQueijo) {

        if(qtdQueijo == 0){
            h.setQtdQueijo(0);
            h.setTipoQueijo(null);
            System.out.println("Não adiciona queijo");
        }else{
            System.out.println("Adicionando "+(qtdQueijo)+ " gramas de queijo "+tipoQueijo);
            h.setQtdQueijo(qtdQueijo);
            h.setTipoQueijo(tipoQueijo);
        }
        return this;
    }

    @Override
    public Builder setBacon(int qtdBacon) {
       System.out.println("Não adiciona bacon. Você não pode comer isso!");
       h.setQtdBacon(0);
       return this;
    }

    @Override
    public Builder setTipoPao(String tipoPao) {
        h.setTipoPao(tipoPao);
        System.out.println("Adicionando pão "+ tipoPao);
        return this;
    }

    @Override
    public Builder setSalada(boolean salada) {
        h.setSalada(salada);
        if(salada){
            System.out.println("Adicionando salada. Muito bem!!");
        }else{
            System.out.println("Não adiciona salada... Mas você não é veg? Tem que comer salada...");
        }
        return this;
    }

    @Override
    public Builder setCebola(boolean cebola) {
        h.setCebola(cebola);
        if(cebola){
            System.out.println("Adicionando cebola");
        }else{
            System.out.println("Não adiciona cebola");
        }
        return this;
    }

    @Override
    public Builder setOvoCodorna(int ovoCodorna) {
        
        if((ovoCodorna) == 0){
            h.setOvoCodorna(0);
            System.out.println("Não adiciona ovo de codorna");
        }else{
            System.out.println("Adicionando "+(ovoCodorna+5)+" ovos de codorna");
            h.setQtdBacon(ovoCodorna);
        }
        return this;
    }
    @Override
    public Hamburguer build(){
        return h;
    }

}
