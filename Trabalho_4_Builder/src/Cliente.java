
import java.util.Scanner;

//hamburguer o produto a ser criado com essa variedade de ingredientes pelo builder
//builder constroi pao carne queijos etc
//diretor responsavel por receber o pedido e orquestrar a montagem enquanto o builder constroi o pedido 

public class Cliente {
    public static void main(String[] args) {
        menu();
        //primeiro, escolhendo o builder a ser utilizado
        Builder builder = decideBuilder();
        //depois criamos o diretor passando o builder escolhido no construtor
        Diretor diretor = new Diretor(builder);
        //montamos o pedido
        Pedido pedido = montaPedido();
        //por fim, cria o hamburguer passando o pedido para a funçao montarHamburguer do diretor
        Hamburguer hamburguer = diretor.montarHamburguer(pedido);

        System.out.println("\n===================PEDIDO PRONTO===================");
        System.out.println("Eba! Seu hamburguer está pronto! \n"+hamburguer);
    }
    public static void menu(){

        System.out.println("====================LANCHEFET====================");
        System.out.println("\nOlá! Aqui na Lanchefet você mesmo cria seu hambúrguer.");
        System.out.println("\nSe você estiver com pressa, seu pedido pode sofrer algumas reduções :(");
        System.out.println("\nSe você estiver com muita fome, seu pedido pode vir com ingredientes extras! ;)");
        System.out.println("\nTambém temos opções para os vegetarianos e veganos! Verde é vida.");
        System.out.println("\nVamos iniciar o seu pedido...\n========================================");
        
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
        sc.nextLine();
        if(qtdQueijo!=0){
            System.out.println("\nDigite o tipo do queijo (ex: cheddar, mussarela): ");
            tipoQueijo = sc.nextLine();
        }else{
            tipoQueijo = null;
        }
        System.out.println("\nDigite a quantidade de bacon (em gramas). Se você não quiser, digite 0: ");
        qtdBacon = sc.nextInt();
        sc.nextLine();
        System.out.println("\nGostaria de salada? (s/n)");
        opSalada = sc.nextLine();
        salada = "s".equals(opSalada);
        System.out.println("\nGostaria de cebola? (s/n)");
        opCebola = sc.nextLine();
        cebola = "s".equals(opCebola);
        System.out.println("\nDigite a quantidade de ovos de codorna. Se você não quiser, digite 0: ");
        ovoCodorna = sc.nextInt();
        Pedido p = new Pedido(qtdCarne, qtdQueijo, tipoQueijo, qtdBacon, tipoPao, salada, cebola, ovoCodorna);
        System.out.println("====================MONTANDO PEDIDO=======================");
        return p;
        
    }
    public static Builder decideBuilder() {
        int escolha;
        Builder builder = null;
        Scanner s = new Scanner(System.in);
        
        do {
            System.out.println("\nDigite...");
            System.out.println("1 - Se estiver com pressa");
            System.out.println("2 - Se for vegetariano/vegano");
            System.out.println("3 - Se estiver com muita fome");
            System.out.println("4 - Se quiser um lanche normal");
            escolha = s.nextInt();
            
            switch (escolha) {
                case 1 -> builder = new BuilderPressa();
                case 2 -> builder = new BuilderVeg();
                case 3 -> builder = new BuilderGeneroso();
                case 4 -> builder = new BuilderNormal();
                default -> System.out.println("Escolha uma opção correta!");
            }
        } while (builder == null); 
        
        return builder;
    }
    
}
