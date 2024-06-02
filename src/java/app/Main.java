package app;

public class Main {
    public static void main(String[] args) {
        Printer printer = new mainMessage();

        Printer.Message messageOne = new Printer.Message("Hi", "Tim");
        Printer.Message messageTwo = new Printer.Message("", "Tim");
        Printer.Message messageThree = new Printer.Message("Hi", "");
        printer.print(messageOne);
        printer.print(messageTwo);
        printer.print(messageThree);
    }
}
