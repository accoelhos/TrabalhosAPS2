//esse builder é generoso então as quantidades podem ser aumentadas
public class BuilderNormal implements Builder{
    Hamburguer h = new Hamburguer();

    @Override
    public Builder setCarne(int qtdCarne) {
        h.setQtdCarne(qtdCarne);
        h.setTipoCarne("bovina");
        System.out.println("Adicionando "+(qtdCarne)+ " gramas de carne");
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
        
        if(qtdBacon == 0){
            h.setQtdBacon(0);
            System.out.println("Não adiciona bacon");
        }else{
            System.out.println("Adicionando "+(qtdBacon)+" gramas de bacon");
            h.setQtdBacon(qtdBacon);
        }
        return this;
    }

    @Override
    public Builder setTipoPao(String tipoPao) {
        h.setTipoPao(tipoPao);
        System.out.println("Adicionando o pão do tipo "+ tipoPao);
        return this;
    }

    @Override
    public Builder setSalada(boolean salada) {
        h.setSalada(salada);
        if(salada){
            System.out.println("Adicionando salada");
        }else{
            System.out.println("Não adiciona salada");
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
            System.out.println("Adicionando "+(ovoCodorna)+" ovos de codorna");
            h.setQtdBacon(ovoCodorna);
        }
        return this;
    }
    @Override
    public Hamburguer build(){
        return h;
    }

}
