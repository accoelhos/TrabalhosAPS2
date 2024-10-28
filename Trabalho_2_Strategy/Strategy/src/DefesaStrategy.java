//a unidade militar fica em formação de defesa 
//essa estrategia diminui a força de ataque em 15
//aumenta a defesa em 20
//aumenta a furtividade em 10

public class DefesaStrategy implements IStrategy{
    @Override
    public void aplicarEstrategia (UnidadeMilitar unidade){
       
        System.out.println(unidade.getNome()+" está usando a estratégia de defesa em formação...");
        unidade.setAtaque(unidade.getAtaque()-15);
        unidade.setDefesa(unidade.getDefesa()+20);
        unidade.setFurtividade(unidade.getFurtividade()+10);
      

        
    }
    @Override
    public String getNomeEstrategia(){
        return "Estratégia de Defesa";
    }
}