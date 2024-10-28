//a unidade militar se camufla e ataca de forma imprevisível
//essa estrategia aumenta a força de ataque em 10
//reduz a defesa em 5
//aumenta a furtividade em 20


public class GuerrilhaStrategy implements IStrategy{
    @Override
    public void aplicarEstrategia (UnidadeMilitar unidade){
        System.out.println("<-------------------------STATUS-------------------------->");
        System.out.println(unidade.getNome()+" está usando a estratégia de guerrilhas...");
        unidade.setAtaque(unidade.getAtaque()+10);
        unidade.setDefesa(unidade.getDefesa()-5);
        unidade.setFurtividade(unidade.getFurtividade()+20);
        unidade.exibirStatus();
    }
}
