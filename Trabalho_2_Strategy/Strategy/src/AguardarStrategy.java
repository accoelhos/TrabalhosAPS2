//essa estrategia é a padrão (inicial), mantém os índices de ataque, defesa e furtividade.

public class AguardarStrategy implements IStrategy{

    @Override
    public void aplicarEstrategia (UnidadeMilitar unidade){
        System.out.println(unidade.getNome()+" está mantendo a posição e aguardando ordens...");
    }
    @Override
    public String getNomeEstrategia(){
        return "Aguardando ordens";
    }
}
