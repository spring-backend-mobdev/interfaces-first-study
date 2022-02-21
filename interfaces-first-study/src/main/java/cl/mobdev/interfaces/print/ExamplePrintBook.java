package cl.mobdev.interfaces.print;

import cl.mobdev.interfaces.model.*;

import static cl.mobdev.interfaces.model.Gender.*;

public class ExamplePrintBook {
    public static void main(String[] args) {

        Curriculum curriculum = new Curriculum(new Person("Sourabh", "Sharma"),
                "Modern Api", "Engenner Software",  "15 year");
        curriculum.addExperience("Api modern")
                .addExperience("Java Enterprise Edition")
                .addExperience("Spring Framework and Spring Boot")
                .addExperience("Oracle DBA")
                .addExperience("Mongo DDBB")
                .addExperience("Microserices")
                .addExperience("");

        Book book = new Book(new Person("Alan", "Turing"),
                "Machine Turing", PROGRAMMING);

        book.addPage(new Page(""))
                .addPage(new Page(""))
                .addPage(new Page(""))
                .addPage(new Page(""))
                .addPage(new Page(""));

        Informe informe = new Informe(new Person("Martin", "Fowler"),
                new Person("James", "Gosling"), "");

        print


    }


}
