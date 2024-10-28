//a unidade militar parte em ataque sem se preocupar com defesa ou furtividade
//essa estrategia aumenta o ataque em 30
//diminui a defesa em 15
//diminui a furtividade em 20

public class AtaqueStrategy implements IStrategy{
    @Override
    public void aplicarEstrategia (UnidadeMilitar unidade){
        System.out.println(unidade.getNome()+" está usando a estratégia de ataque direto...");
        unidade.setAtaque(unidade.getAtaque()+30);
        unidade.setDefesa(unidade.getDefesa()-15);
        unidade.setFurtividade(unidade.getFurtividade()-20);
       

    }
    @Override
    public String getNomeEstrategia(){
        return "Estratégia de Ataque";
    }
}
