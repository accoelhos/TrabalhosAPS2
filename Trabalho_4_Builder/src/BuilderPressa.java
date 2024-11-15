//esse builder está com muita pressa então as quantidades podem ser reduzidas

import java.util.concurrent.TimeUnit;
public class BuilderPressa implements Builder{
    Hamburguer h = new Hamburguer();

    @Override
    public Builder setCarne(int qtdCarne) {
        h.setQtdCarne(qtdCarne -50);
        h.setTipoCarne("passada");
        System.out.println("Adicionando "+(qtdCarne -50)+ " gramas de carne passada por causa da pressa...");
        pausa();
        return this;
    }

    @Override
    public Builder setQueijo(int qtdQueijo, String tipoQueijo) {

        if(qtdQueijo == 0){
            h.setQtdQueijo(0);
            System.out.println("Não adiciona queijo");
        }else{
            h.setTipoQueijo(tipoQueijo);
            System.out.println("Adicionando "+(qtdQueijo-5)+ " gramas de queijo "+tipoQueijo);
            h.setQtdQueijo(qtdQueijo-5);
        }
        pausa();
        return this;
    }

    @Override
    public Builder setBacon(int qtdBacon) {
        
        if(qtdBacon == 0){
            h.setQtdBacon(0);
            System.out.println("Não adiciona bacon");
        }else{
            System.out.println("Adicionando "+(qtdBacon-5)+" gramas de bacon");
            h.setQtdBacon(qtdBacon-5);
        }
        pausa();
        return this;
    }

    @Override
    public Builder setTipoPao(String tipoPao) {
        h.setTipoPao(tipoPao);
        System.out.println("Adicionando pão "+ tipoPao);
        pausa();
        return this;
    }

    @Override
    public Builder setSalada(boolean salada) {
        h.setSalada(salada);
        if(salada){
            System.out.println("Adicionando pouca salada rapidamente");
        }else{
            System.out.println("Não adiciona salada");
        }
        pausa();
        return this;
    }

    @Override
    public Builder setCebola(boolean cebola) {
        h.setCebola(cebola);
        if(cebola){
            System.out.println("Adicionando pouquíssima cebola rapidamente");
        }else{
            System.out.println("Não adiciona cebola");
        }
        pausa();
        return this;
    }

    @Override
    public Builder setOvoCodorna(int ovoCodorna) {
        
        if((ovoCodorna-1) <= 0){
            h.setOvoCodorna(0);
            System.out.println("Não adiciona ovo de codorna. Muita pressa.");
        }else{
            System.out.println("Adicionando "+(ovoCodorna-1)+" ovos de codorna");
            h.setOvoCodorna(ovoCodorna-1);
        }
        pausa();
        return this;
    }
    @Override
    public Hamburguer build(){
        return h;
    }
     //metodo para pausar
     private void pausa() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
