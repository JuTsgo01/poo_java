
import java.util.Scanner;

public class Aula {

    String materia;
    Integer tempo;
    String professor;
    Boolean acontecendo;
    Boolean finalizada;
    

    @Override
    public String toString() {
        return "Aula [materia=" + materia + ", tempo=" + tempo + ", professor=" + professor + ", acontecendo=" + acontecendo + ", finalizada=" + finalizada + "]";
    }

    public Aula() {
        this.materia = "Nenhuma aula acontecendo";
        this.tempo = 0;
        this.professor = "Nenhuma aula acontecendo";
        this.acontecendo = false;
        this.finalizada = true;
    }


    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }


    public void setAcontecendo(Boolean acontecendo) {
        this.acontecendo = acontecendo;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }


    void iniciarAula(){
        if(this.acontecendo == false){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o professor: ");
            String nomeProfessor = scanner.nextLine();
            setProfessor(nomeProfessor);

            System.out.println("Informe a matéria: ");

            String nomeMateria = scanner.nextLine();
            setMateria(nomeMateria);

            System.out.println("Informe o tempo de aula :");
            String tempoAula = scanner.nextLine();
            
            setTempo(Integer.valueOf(tempoAula));
            setAcontecendo(true);
            setFinalizada(false);

            System.out.println("O professor " + this.professor + " está iniciando uma aula da matéria " 
            + this.materia + " com duração de " + this.tempo 
            + " minutos e após esse tempo outra poderá ser inciada");


        }else{
            System.out.println("Não há como iniciar uma aula, pois uma já está em andamento!");
        }
    }

    void finalizarAula(){
        if(this.acontecendo == true){

        System.out.println("A aula de " + this.materia + " que estava sendo aplicada pelo professor " 
        + this.professor +  " com duração de " + this.tempo + " minutos foi finalizada e outra pode ser iniciada!");

        setAcontecendo(false);

        setFinalizada(true);


        }else{
            System.out.println("Não há nenhuma aula acontecendo para finalizar!");
        }
    }

}
