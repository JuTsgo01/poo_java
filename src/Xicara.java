public class Xicara {

    String cor;
    Integer volume;
    Boolean pegador;
    Boolean cheia;
    Boolean vazia;

    @Override
    public String toString() {
        return "Xicara [cor=" + cor + ", volume=" + volume + ", pegador=" + pegador + ", cheia=" + cheia + ", vazia="
                + vazia + "]";
    }

    
    public Xicara(String cor, Integer volume, Boolean pegador) {
        this.cor = cor;
        this.volume = volume;
        this.pegador = pegador;
        this.cheia = true;
        this.vazia = false;
    }

    public String getCor() {
        return cor;
    }

    public Integer getVolume() {
        return volume;
    }

    public Boolean getPegador() {
        return pegador;
    }

    public Boolean getCheia() {
        return cheia;
    }

    public Boolean getVazia() {
        return vazia;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setPegador(Boolean pegador) {
        this.pegador = pegador;
    }

    public void setCheia(Boolean cheia) {
        this.cheia = cheia;
    }

    public void setVazia(Boolean vazia) {
        this.vazia = vazia;
    }


    void encher(){
        if (vazia){
            System.out.println("Colocando " + this.volume + " de chá");
            setCheia(true);
            setVazia(false);
        }else{
            System.out.println("Não é possivel encher a xicara, pois ela contém " + this.volume + " de chá");
        }
    };

    void esvaziar(){
        if(cheia){
            System.out.println("Retirando " + this.volume + " de chá");
            setCheia(false);
            setVazia(true);
        }else{
            System.out.println("Não é possivel esvaziar a xicara, pois ela já está vazia, já que seu volume preenchido é " + this.volume + " de chá");
        }
    };

}




