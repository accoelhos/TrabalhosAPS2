//publicadora
import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    private final List<Observador> concessionarias = new ArrayList<>();
    private final String nomeFabricante;

    public Fabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }  
    //add observadores
    public void addConcessionarias(Observador c){
        concessionarias.add(c);
    }
    //remove observadores
    public void removeConcessionarias(Observador c){
        concessionarias.remove(c);
    }
   
    //produz um veiculo de algum modelo
    public void produz(String tipo, String novoModelo){
        System.out.println("\n===========================================================================================================");
        System.out.println("Fabricante "+nomeFabricante+" produziu "+tipo+" "+novoModelo+" e disponibilizou para as concessionarias!");
        System.out.println("===========================================================================================================");
        notificaConcessionarias(tipo, novoModelo);
    }

    //notificar concessionarias para veiculos prontos e disponiveis
    private void notificaConcessionarias(String tipoVeiculo, String modelo){
        for(Observador c : concessionarias){
            c.atualizar(tipoVeiculo, modelo);
        }
    }

}
