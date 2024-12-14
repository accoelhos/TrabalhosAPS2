//implementar add/undo/redo do editor de mapas
//cada vez que o estado do mapa é alterado (elemento inserido ou removido) um objeto memento deve ser automaticamente criado para capturar o estado do mapa naquele momento
//armazenar os mementos em um caretaker que permita que os jogadores desfaçam ou refaçam as açoes

//na classe cliente um jogador cria um mapa, add ou removendo elementos e depois add os mecanismos do caretaker de undo e redo
import static java.lang.System.exit;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Mapa mapa = new Mapa();
        System.out.println("===================================EDITOR DE MAPAS===================================");
        System.out.println("\nNesse mini editor de mapas você pode adicionar ou remover um elemento, indicando o nome, posição x e posição y.");
        System.out.println("Além disso, você pode desfazer ou refazer uma ação.");
        menu(caretaker, mapa);


    }
    public static void menu(Caretaker c, Mapa m){
        int opcao;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("\nEscolha: ");
            System.out.println("1 - adicionar elemento");
            System.out.println("2 - remover elemento");
            System.out.println("3 - desfazer");
            System.out.println("4 - refazer");
            System.out.println("5 - exibir mapa atual");
            System.out.println("6 - sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> adicionar(c,m);
                case 2 -> remover(c,m);
                case 3 -> c.desfazer(m);
                case 4 -> c.refazer(m);
                case 5 -> System.out.println(m);
                case 6 -> {
                    System.out.println("Saindo...");
                    exit(0);
                }
                default -> System.out.println("Escolha uma opção correta!");
            }
        } while (opcao != 0);


    }
    public static void adicionar(Caretaker c, Mapa m){
        String nome;
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("A");
        System.out.println("\nDigite o nome do elemento a ser adicionado:");
        nome = s.nextLine();
        System.out.println("Digite a posição x no mapa: ");
        x = s.nextInt();
        System.out.println("Digite a posição y no mapa: ");
        y = s.nextInt();
        Elemento e = new Elemento(nome, x, y);
        m.addElemento(e, c);
        System.out.println("Foi adicionado o elemento "+nome);
        System.out.println(m);
    }
    public static void remover(Caretaker c, Mapa m) {
        String nome;
        int x, y;
        Scanner s = new Scanner(System.in); 
        System.out.println("\nDigite o nome do elemento a ser removido:");
        nome = s.nextLine();
        System.out.println("Digite a posição x no mapa: ");
        x = s.nextInt();
        System.out.println("Digite a posição y no mapa: ");
        y = s.nextInt();
    
        boolean sucesso = m.removeElemento(nome, x, y, c);
        if (sucesso) {
            System.out.println("O elemento foi removido com sucesso.");
        } else {
            System.out.println("Elemento não encontrado no mapa.");
        }
        System.out.println(m);
    }
    
    
}
