//a unidade militar parte em ataque sem se preocupar com defesa ou furtividade
//essa estrategia aumenta o ataque em 30
//diminui a defesa em 15
//diminui a furtividade em 20

public class AtaqueStrategy implements IStrategy{
    @Override
    public void aplicarEstrategia (UnidadeMilitar unidade){
        System.out.println("<-------------------------STATUS-------------------------->");
        System.out.println(unidade.getNome()+" está usando a estratégia de defesa em formação...");
        unidade.setAtaque(unidade.getAtaque()+30);
        unidade.setDefesa(unidade.getDefesa()-15);
        unidade.setFurtividade(unidade.getFurtividade()-20);
        unidade.exibirStatus();
    }
}
