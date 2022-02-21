package cl.mobdev.interfaces.print;


import cl.mobdev.interfaces.model.Curriculum;
import cl.mobdev.interfaces.model.Informe;
import cl.mobdev.interfaces.model.Sheet;

public class ExamplePrintCourse {
    public static void main(String[] args) {

        Curriculum curriculum = new Curriculum("Segunda Guerra Mundial", "Alan Turing", "Ingeniero en Software");
        curriculum.addExperience("Criptography");
        curriculum.addExperience("Java");
        curriculum.addExperience("Code Enigma");
        curriculum.addExperience("Mechanical Engeneer");
        curriculum.addExperience("Spring framework");
        curriculum.addExperience("Angular");

        Informe informe = new Informe("Estudio sobre el código enigma, principal forma de comunicación del tercer Reich", "James Fowler", " Emmanuel Nieto");
        print(curriculum);
        print(informe);
    }

    public static void print(Sheet printing) {
        System.out.println(printing.print());
    }

}
