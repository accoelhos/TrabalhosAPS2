
import java.util.Scanner;

//tipo de pao, gramas de carne, tipo qtd queijo, grama bacon, tipo molho, salada, cebola

//hamburguer o produto a ser criado com essa variedade de ingredientes pelo builder
//builder constroi pao carne queijos etc
//diretor responsavel por receber o pedido e orquestrar a montagem enquanto o builder constroi o pedido 

//criar pelo menos 2 builders diferentes que montam de formas diferentes (pode ser um vegano, um generoso e um desleixado)
//criar classe pedido com infos do pedido do hamburguer
//somente o objeto pedido deve ser passado para o diretor

//cliente deve criar um pedido e passa-lo ao diretor
//cliente deve receber um hamburguer montado
//imprimir no console os passos da montagem
//passar o mesmo pedido para outro diretor com outro builder diferente e imprimir no console

public class Cliente {
    public static void main(String[] args) {
        menu();
        Pedido pedido = montaPedido();
        Diretor diretor = new Diretor();

    }
    public static void menu(){

        System.out.println("==========LANCHEFET==========");
        System.out.println("\nOlá! Aqui na Lanchefet você mesmo cria seu hambúrguer.");
        System.out.println("\nSe você estiver com pressa, seu pedido pode sofrer algumas reduções :(");
        System.out.println("\nSe você estiver com sorte, seu pedido pode vir com ingredientes extras! ;)");
        System.out.println("\nTambém temos opções para os vegetarianos e veganos! Verde é vida.");
        System.out.println("\nVamos iniciar o seu pedido...\n----------------");
        
    }
    public static Pedido montaPedido(){
        int qtdCarne;
        int qtdQueijo;
        int qtdBacon;
        String tipoPao;
        String tipoQueijo; 
        boolean salada;
        boolean cebola;
        int ovoCodorna;
        String opSalada;
        String opCebola;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite o tipo de pão (exemplo: australiano, brioche...): ");
        tipoPao = sc.nextLine();
        System.out.println("\nDigite a quantidade da carne (em gramas): ");
        qtdCarne = sc.nextInt();
        System.out.println("\nDigite a quantidade do queijo (em gramas). Se você não quiser, digite 0: ");
        qtdQueijo = sc.nextInt();
        if(qtdQueijo!=0){
            System.out.println("\nDigite o tipo do queijo (ex: cheddar, mussarela): ");
            tipoQueijo = sc.nextLine();
        }else{
            tipoQueijo = null;
        }
        System.out.println("\nDigite a quantidade de bacon (em gramas). Se você não quiser, digite 0: ");
        qtdBacon = sc.nextInt();
        System.out.println("\nGostaria de salada? (s/n)");
        opSalada = sc.nextLine();
        salada = "s".equals(opSalada);
        System.out.println("\nGostaria de cebola? (s/n)");
        opCebola = sc.nextLine();
        cebola = "s".equals(opCebola);
        System.out.println("\nDigite a quantidade de ovos de codorna (quantidade): ");
        ovoCodorna = sc.nextInt();
        Pedido p = new Pedido(qtdCarne, qtdQueijo, tipoQueijo, qtdBacon, tipoPao, salada, cebola, ovoCodorna);
        System.out.println("===================================================");
        return p;
        
    }
    public static Builder decideBuilder(){
        int escolha;
        Builder builder;
        Scanner s = new Scanner(System.in);
        System.out.println("\nPreciso de mais algumas informações! Digite...");
        System.out.println("1 - Se estiver com pressa");
        System.out.println("2 - Se for vegetariano/vegano");
        System.out.println("3 - Se quiser um lanche generoso");
        System.out.println("4 - Se quiser um lanche normal");
        System.out.println("Não quero mais nada!");
        escolha = s.nextInt();
        switch (1) {
            case 1 -> builder = new BuilderPressa();
            case 2 -> builder = new BuilderVeg();
            case 3 -> builder = new BuilderGeneroso();
            case 4 -> builder = new BuilderNormal();
            default -> {
                return null;
            }
        }
        return builder;
       
    }
    
}
