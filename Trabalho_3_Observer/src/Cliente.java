//concessionarias sao os assinantes(observadores)
//fabricantes sao as publicadoras 
//carros e motos sao os produtos

public class Cliente {
    public static void main(String[] args) {
        //criando fabricante de carros
        Fabricante fabricanteCarro = new Fabricante("Honda Carros");

        //criando as concessionarias -> assinantes
        Concessionaria conc1 = new Concessionaria("Honda Caxias");
        Concessionaria conc2 = new Concessionaria("Honda Penha");
        Concessionaria conc3 = new Concessionaria("Honda Barra");

        //adicionando as concessionarias na lista de assinantes da fabricante de carros
        fabricanteCarro.addConcessionarias(conc1);
        fabricanteCarro.addConcessionarias(conc2);
        fabricanteCarro.addConcessionarias(conc3);
        
        //passando o carro produzido para a fabricante(publicadora) notificar as concessionarias(assinantes)
        fabricanteCarro.produz("carro","Honda Fit");

        //criando uma fabricante de motos
        Fabricante fabricanteMoto = new Fabricante("Honda Motos");
        //adicionando as concessionarias na lista de assinantes da fabricante de motos
        fabricanteMoto.addConcessionarias(conc1);
        fabricanteMoto.addConcessionarias(conc2);
        fabricanteMoto.addConcessionarias(conc3);
        //passando a moto produzida para a fabricante(publicadora) notificar as concessionarias (assinantes)
        fabricanteMoto.produz("moto","CG 160 Fan");

        //produzindo mais um carro
        fabricanteCarro.produz("carro","Honda Civic 2024");
        //prouzindo mais uma moto
        fabricanteMoto.produz("moto","Pop 110i ES");

        //removendo a concessionaria Honda Barra da lista de assinantes da fabricante de motos e criando mais uma moto para teste
        fabricanteMoto.removeConcessionarias(conc3);
        fabricanteMoto.produz("moto", "PCX");
    }
}
