public class Hamburguer {
    private float qtdCarne;
    private float qtdQueijo;
    private float qtdBacon;
    private String tipoPao;
    private String tipoQueijo;
    private String tipoCarne;
    private boolean salada;
    private boolean cebola;
    private int ovoCodorna;

    //getters and setters de hamburguer
    
    public float getQtdCarne() {
        return qtdCarne;
    }

 
    public void setQtdCarne(float qtdCarne) {
        this.qtdCarne = qtdCarne;
    }

    public float getQtdQueijo() {
        return qtdQueijo;
    }

    public void setQtdQueijo(float qtdQueijo) {
        this.qtdQueijo = qtdQueijo;
    }

    public float getQtdBacon() {
        return qtdBacon;
    }

    public void setQtdBacon(float qtdBacon) {
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
}
