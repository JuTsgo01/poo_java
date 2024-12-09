public class Main {

    public static void main(String[] args) {
        
        Xicara xicaraBranca =  new Xicara("Branca", 250, false);
        System.out.println(xicaraBranca);
        xicaraBranca.esvaziar();
        System.out.println(xicaraBranca);
        xicaraBranca.encher();
        System.out.println(xicaraBranca);


        Aula aula1 = new Aula();
        aula1.iniciarAula();
        aula1.finalizarAula();
    }
}
