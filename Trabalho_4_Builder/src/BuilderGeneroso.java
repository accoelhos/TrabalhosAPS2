//esse builder é generoso então as quantidades podem ser aumentadas
public class BuilderGeneroso implements Builder{
    Hamburguer h = new Hamburguer();

    @Override
    public Builder setCarne(float qtdCarne) {
        h.setQtdCarne(qtdCarne +100);
        h.setTipoCarne("bovina de primeira");
        System.out.println("Adicionando "+(qtdCarne +100)+ " gramas de carne bovina de primeira");
        return this;
    }

    @Override
    public Builder setQueijo(float qtdQueijo, String tipoQueijo) {

        if(qtdQueijo == 0){
            h.setQtdQueijo(0);
            h.setTipoQueijo(null);
            System.out.println("Não adiciona queijo");
        }else{
            System.out.println("Adicionando "+(qtdQueijo+10)+ " gramas de queijo "+tipoQueijo);
            h.setQtdQueijo(qtdQueijo+10);
            h.setTipoQueijo(tipoQueijo);
        }
        return this;
    }

    @Override
    public Builder setBacon(float qtdBacon) {
        
        if(qtdBacon == 0){
            h.setQtdBacon(0);
            System.out.println("Não adiciona bacon");
        }else{
            System.out.println("Adicionando "+(qtdBacon+20)+" gramas de bacon");
            h.setQtdBacon(qtdBacon+20);
        }
        return this;
    }

    @Override
    public Builder setTipoPao(String tipoPao) {
        h.setTipoPao(tipoPao);
        System.out.println("Adicionando o melhor pão encontrado do tipo "+ tipoPao);
        return this;
    }

    @Override
    public Builder setSalada(boolean salada) {
        h.setSalada(salada);
        if(salada){
            System.out.println("Adicionando muita salada generosamente");
        }else{
            System.out.println("Não adiciona salada");
        }
        return this;
    }

    @Override
    public Builder setCebola(boolean cebola) {
        h.setCebola(cebola);
        if(cebola){
            System.out.println("Adicionando cebola generosamente");
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
            h.setQtdBacon(ovoCodorna+5);
        }
        return this;
    }

}
