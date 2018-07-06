package view;

public class ConsoleView {

    public ConsoleView(){}

    public static void consoleDebug(String string) {
        System.out.println("\n+++");
        System.out.println(string);
        System.out.println("+++");
    }
}
