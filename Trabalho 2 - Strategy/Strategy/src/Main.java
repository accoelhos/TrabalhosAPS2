import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int escolha;
        String strategy;
        IStrategy estrategia = new AguardarStrategy();


        UnidadeMilitar unidade1 = new UnidadeMilitar("Vingadores", estrategia);
        UnidadeMilitar unidade2 = new UnidadeMilitar("Liga da Justiça", estrategia);
        UnidadeMilitar unidade3 = new UnidadeMilitar("Jovens Titãs", estrategia);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nTodas as suas unidades militares possuem 50 pontos de ataque, defesa e furtiviadde e estão aguardando ordens.");
        System.out.println("<------------------------->");
        System.out.println("1 - Dar ordens");
        System.out.println("2 - Obter status das unidades");
        System.out.println("3 - Encerrar");

        escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                //funçao pra setar estrategias, mudar estrategia, etc
                //pode exibir as unidades p usuario escolher para qual quer setar
                break;
            case 2:
                //aqui tem que exibir o status de todas as unidades, inclusive a estrategia atual
                break;
            case 3:
                //sair e encerrar jogo
            break;
            default:
                throw new AssertionError();
        }
    }

    //funcao para setar a estrategia para cada unidade
    //deve poder selecionar a unidade e depois a estrategia

    //funcao para mostrar o status de todas as unidades
    
    //pensar em fazer 2 jogadores com um array de 3 ou 2 unidades...?


}
