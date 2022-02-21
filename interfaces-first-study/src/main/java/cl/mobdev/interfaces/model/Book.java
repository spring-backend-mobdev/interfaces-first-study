package cl.mobdev.interfaces.model;

import java.util.List;

public class Book implements Printable{

    private List<Printable> pages;
    private Person author;
    private String title;
    private Gender gender;

    public Book(Person author, String title, Gender gender) {
        this.author = author;
        this.title = title;
        this.gender = gender;
    }

    public Book addPage(Printable page) {
        pages.add(page);
        return this;
    }

    @Override
    public String print() {
        StringBuilder stringBuilder = new StringBuilder("Title: ");
        stringBuilder.append(this.title).append("\n")
                .append("Author: ").append(this.author).append("\n")
                .append("Gender: ").append(gender).append("\n");

        for (Printable pagining: this.pages) {
            stringBuilder.append(pagining.print()).append("\n");
        }
        return stringBuilder.toString();
    }
}
