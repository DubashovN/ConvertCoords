package ru.dubashov;

public class Main {
    public static void main(String[] args) {

        if (args.length > 1) {
            System.out.println("Wrong parameters!");
        }
        String command = args[0];
        switch (command) {
            case "DD MM SS" -> System.out.println(Convert.convertDdToSevenD(args));
            case "dd mm.mmmm" -> System.out.println(Convert.convertDdSixMToSevenD(args));
            case "dd.ddddd" -> System.out.println(Convert.convertSevenDToDd(args));
        }
    }
}
