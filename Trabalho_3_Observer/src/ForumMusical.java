//observador (assinante)
public class ForumMusical implements Observador{
    private final String nome;
    public ForumMusical(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String tipo, String nomeItem){
        System.out.println("\nEba!! Fórum musical "+nome+ " foi notificado que "+tipo+" "+nomeItem+" foi produzido(a) e está disponível para ser ouvido(a)");
    }
    
}
