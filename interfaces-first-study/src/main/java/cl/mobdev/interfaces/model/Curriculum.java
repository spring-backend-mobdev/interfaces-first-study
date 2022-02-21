package cl.mobdev.interfaces.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Sheet{

    private String person;
    private String career;
    private List<String> experience;

    public Curriculum(String content, String person, String career) {
        super(content);
        this.person = person;
        this.career = career;
    }

    public Curriculum(String content, String person, String carrer, List<String> expirence) {
        super(content);
        this.person = person;
        this.career = carrer;
        this.experience = new ArrayList<>();
    }

    public Curriculum addExperience(String exp) {
        experience.add(exp);
        return this;
    }

    @Override
    public String print() {
        StringBuilder stringBuilder = new StringBuilder("nombre: ");
        stringBuilder.append(person).append("\n")
                .append("Summary: ").append(this.content)
                .append("\n").append("Profession: ")
                .append(this.career).append("\n")
                .append("Experience: \n");

        for (String exp: this.experience) {
            stringBuilder.append("- ").append(exp).append("\n");
        }
        return stringBuilder.toString();
    }
}
