package cl.mobdev.interfaces.model;

public class Informe extends Sheet{

    private String author;
    private String revisor;

    public Informe(String content) {
        super(content);
    }

    public Informe(String content, String author, String revisor) {
        super(content);
        this.author = author;
        this.revisor = revisor;
    }

    public Informe(String content, String author) {
        super(content);
        this.author = author;
    }

    @Override
    public String print() {
        return "Informe escrito por :" + author
                + "Revisado por : " + revisor
                +"\n" + this.content;
    }
}
