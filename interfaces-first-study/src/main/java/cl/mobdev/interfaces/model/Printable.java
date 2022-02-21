package cl.mobdev.interfaces.model;

public interface Printable {

    String TEXT_DEFAULT = "Print a value to be defined";

    default String print() {
        return TEXT_DEFAULT;
    }

    static void print(Printable printable) {
        System.out.println(printable.print());
    }
}
