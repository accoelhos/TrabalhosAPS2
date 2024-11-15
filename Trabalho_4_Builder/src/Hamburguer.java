public class Hamburguer {
    private int qtdCarne;
    private int qtdQueijo;
    private int qtdBacon;
    private String tipoPao;
    private String tipoQueijo;
    private String tipoCarne;
    private boolean salada;
    private boolean cebola;
    private int ovoCodorna;

    //getters and setters de hamburguer
    
    public int getQtdCarne() {
        return qtdCarne;
    }

 
    public void setQtdCarne(int qtdCarne) {
        this.qtdCarne = qtdCarne;
    }

    public int getQtdQueijo() {
        return qtdQueijo;
    }

    public void setQtdQueijo(int qtdQueijo) {
        this.qtdQueijo = qtdQueijo;
    }

    public int getQtdBacon() {
        return qtdBacon;
    }

    public void setQtdBacon(int qtdBacon) {
        this.qtdBacon = qtdBacon;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    /**
     * @param tipoPao the tipoPao to set
     */
    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public String getTipoQueijo() {
        return tipoQueijo;
    }

    public void setTipoQueijo(String tipoQueijo) {
        this.tipoQueijo = tipoQueijo;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public boolean isSalada() {
        return salada;
    }

    public void setSalada(boolean salada) {
        this.salada = salada;
    }

    public boolean isCebola() {
        return cebola;
    }

    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }

    public int isOvoCodorna() {
        return ovoCodorna;
    }

    public void setOvoCodorna(int ovoCodorna) {
        this.ovoCodorna = ovoCodorna;
    }
    @Override
    public String toString() {
        return """
                \nHamburguer pronto: 
                \n-> Carne: """ + qtdCarne + "g" +
                "\n-> Tipo da carne: '" + tipoCarne + '\'' +
                "\n-> Queijo: " + qtdQueijo + "g" +
                "\n-> Tipo queijo: '" + tipoQueijo + '\'' +
                "\n-> Bacon: " + qtdBacon + "g" +
                "\n-> Pao: '" + tipoPao + '\'' +
                "\n-> Salada: " + (salada ? "Sim" : "Não") +
                "\n-> Cebola: " + (cebola ? "Sim" : "Não") +
                "\n-> Ovo de codorna: " + (ovoCodorna > 0 ? ovoCodorna + " ovo(s)" : "Sem ovo de codorna");
    }

    
}
