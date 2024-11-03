//observador -> assinante
public class Concessionaria implements Observador{
    private final String nome;
    public Concessionaria(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String tipoVeiculo, String modelo){
        System.out.println("\nEba!! Concessionaria "+nome+ " foi notificada que "+tipoVeiculo+" "+modelo+" foi produzido(a) e está disponível para reabastecimento no estoque!");
    }
    
}
