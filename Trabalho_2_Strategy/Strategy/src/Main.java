import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static UnidadeMilitar[] unidades;

    public static void main(String[] args) {

        //iniciando as 3 unidades com a estrategia default
        unidades = new UnidadeMilitar[] {
            new UnidadeMilitar("Vingadores", new AguardarStrategy()),
            new UnidadeMilitar("Liga da Justiça", new AguardarStrategy()),
            new UnidadeMilitar("Jovens Titãs", new AguardarStrategy())
        };
        System.out.println("\n<-------------------------BATALHA-------------------------->");
        System.out.println("Nesse simulador, você possui 3 unidades militares e deve dar ordens, escolhendo estratégias para elas.");
        System.out.println("Suas unidades começam com 50 pontos de ataque, defesa e furtividade");
        System.out.println("Cada estratégia afeta os níveis de ataque, defesa e furtividade da unidade militar.\n");

        for (UnidadeMilitar unidade : unidades) {
            unidade.usarEstrategia();
        }

        int escolha;
        //menu inicial
        do {
            System.out.println("Escolha com sabedoria...");
            System.out.println("\n1 - Dar ordens");
            System.out.println("2 - Obter status das unidades");
            System.out.println("3 - Avaliar a melhor unidade para cada atributo");
            System.out.println("4 - Encerrar");
            
            escolha = sc.nextInt();


            switch (escolha) {
                case 1 -> menuUnidades();
                case 2 -> mostrarStatusUnidades();
                case 3 -> avaliarUnidades();
                case 4 -> System.out.println("Poxa! Encerrando o jogo...");
                default -> System.out.println("Escolha inválida! Tente novamente.");
            }
        } while (escolha != 4);

        sc.close();
    }

    //menu para escolher a unidade militar
    private static void menuUnidades() {
        System.out.println("\nEscolha a unidade militar para dar ordens: ");
        for (int i = 0; i < unidades.length; i++) {
            System.out.println((i + 1) + " - " + unidades[i].getNome());
        }
        int escolha = sc.nextInt();

        if (escolha >= 1 && escolha <= unidades.length) {
            UnidadeMilitar unidadeEscolhida = unidades[escolha - 1];
            menuEstrategias(unidadeEscolhida);
        } else {
            System.out.println("Unidade inválida! Retornando ao menu principal.");
        }
    }

    //menu para escolher a estrategia
    private static void menuEstrategias(UnidadeMilitar unidade) {
        System.out.println("\nEscolha a estratégia para " + unidade.getNome() + ":");
        System.out.println("1 - Formação de Guerrilha");
        System.out.println("2 - Formação de Defesa");
        System.out.println("3 - Formação de Ataque");
        System.out.println("4 - Aguardar Ordens");
        int escolha = sc.nextInt();

        IStrategy novaEstrategia = switch (escolha) {
            case 1 -> new GuerrilhaStrategy();
            case 2 -> new DefesaStrategy();
            case 3 -> new AtaqueStrategy();
            case 4 -> new AguardarStrategy();
            default -> {
                System.out.println("Estratégia inválida! Aplicando 'Aguardar Ordens' como padrão.");
                yield new AguardarStrategy();
            }
        };

        //verifica se a nova estratégia é igual a atual
        if (unidade.getEstrategia().getClass().equals(novaEstrategia.getClass())) {
            System.out.println("A unidade " + unidade.getNome() + " já está em " + novaEstrategia.getNomeEstrategia() + "!");
        } else {
            //setando a estrategia
            unidade.setEstrategia(novaEstrategia);
            //aplicando a estrategia de fato
            unidade.usarEstrategia();
            System.out.println("Estratégia aplicada com sucesso!\n");
        }
    }

    //exibir status de todas as unidades 
    private static void mostrarStatusUnidades() {
        System.out.println("\n<-------------------------STATUS DAS UNIDADES-------------------------->");
        for (UnidadeMilitar unidade : unidades) {
            unidade.exibirStatus();
        }
    }

    //exibir as melhores unidades para cada atributo
    private static void avaliarUnidades() {
        UnidadeMilitar melhorDefesa = unidades[0];
        UnidadeMilitar melhorAtaque = unidades[0];
        UnidadeMilitar melhorFurtividade = unidades[0];

        for (UnidadeMilitar unidade : unidades) {
            if (unidade.getDefesa() > melhorDefesa.getDefesa()) {
                melhorDefesa = unidade;
            }
            if (unidade.getAtaque() > melhorAtaque.getAtaque()) {
                melhorAtaque = unidade;
            }
            if (unidade.getFurtividade() > melhorFurtividade.getFurtividade()) {
                melhorFurtividade = unidade;
            }
        }

        System.out.println("\n<-------------------------AVALIAÇÃO------------------------->");
        System.out.println("Unidade com melhor Defesa: " + melhorDefesa.getNome() + " (Defesa: " + melhorDefesa.getDefesa() + ")");
        System.out.println("Unidade com melhor Ataque: " + melhorAtaque.getNome() + " (Ataque: " + melhorAtaque.getAtaque() + ")");
        System.out.println("Unidade com melhor Furtividade: " + melhorFurtividade.getNome() + " (Furtividade: " + melhorFurtividade.getFurtividade() + ")");
    }
}
