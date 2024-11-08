//foruns musicais sao os assinantes(observadores)
//produtoras sao as publicadoras 

//quando uma produtora produz uma musica ou um album, os foruns musicais devem ser notificados
public class Cliente {
    public static void main(String[] args) {
        //criando produtoras
        Produtora produtora1 = new Produtora("Som Maneiro");
        Produtora produtora2 = new Produtora("Prod APS");
        //criando os foruns -> assinantes/observadores
        Observador forum1 = new ForumMusical("Musica Aqui!");
        Observador forum2 = new ForumMusical("Kboing");
        Observador forum3 = new ForumMusical("Lalaland");
        Observador forum4 = new ForumMusical("Spopoty");
        //adicionando os foruns na lista de assinantes da produtora 1
        produtora1.addForuns(forum1);
        produtora1.addForuns(forum2);
        produtora1.addForuns(forum3);
        //adicionando os foruns na lista de assinantes da produtora 2
        produtora2.addForuns(forum4);
        produtora2.addForuns(forum3);
        //produzindo algo para a produtora(publicadora) notificar os foruns(assinantes)
        produtora1.produz("música","A música mais maneira de todas");
        produtora2.produz("álbum","Coletânia de sucessos de APS2");
        //removendo um forum da lista de assinantes da produtora 1 e criando mais uma musica para teste
        produtora1.removeForuns(forum3);
        produtora1.produz("música", "Música do cachorro salsicha");
    }
}
