public class UnidadeMilitar {
    private IStrategy estrategia;
    private String nome;
    private int defesa = 50;
    private int ataque = 50;
    private int furtividade = 50;

    public UnidadeMilitar(String nome, IStrategy estrategiaInicial){
        this.nome = nome;
        this.estrategia = estrategiaInicial;
    }

    public void usarEstrategia(){
        estrategia.aplicarEstrategia(this);
    }

    public void setEstrategia(IStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public IStrategy getEstrategia(){
        return estrategia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(int furtividade) {
        this.furtividade = furtividade;
    }

    public void exibirStatus(){
        System.out.println("\n*******************");
        System.out.println("Unidade militar: " + nome);
        System.out.println("Estratégia: " + estrategia.getNomeEstrategia());
        System.out.println("Força de ataque: " + ataque);
        System.out.println("Poder defensivo: " + defesa);
        System.out.println("Furtividade: " + furtividade);
        System.out.println("*******************\n");
    }
}
