package ss.week1;

import ss.utils.TextIO;

public class ThreeWayLamp {
    public static void main(String[] args) {
        threeWayLamp();
    }
    public enum State {
        OFF,LOW,MEDIUM,HIGH,STATE,NEXT,HELP,EXIT
    }
    public static void threeWayLamp() {
        System.out.println("menu");
        String state = TextIO.getln();
        State light = State.OFF;
        if (!(state.equals("OFF")||state.equals("LOW")||state.equals("MEDIUM")||state.equals("HIGH")||state.equals("STATE")||state.equals("NEXT")||state.equals("HELP")||state.equals("NEXT"))) {
            System.out.println("Invalid input");
        }
        boolean exit = false;
        while (!exit) {
            state = TextIO.getln();
            switch (state) {
                case "OFF":
                    light = State.OFF;
                case "LOW":
                    light = State.LOW;
                case "MEDIUM":
                    light = State.MEDIUM;
                case "HIGH":
                    light = State.HIGH;
                case "STATE":
                    System.out.println(light);
                case "NEXT":
                    light = next(light);
                case "HELP":
                    System.out.println("menu");
                case "EXIT":
                    exit = true;
                default:
                    System.out.println("Error");
            }

        }
    }
    public static State next(State state) {
        if (state.equals("OFF")) {
            return State.LOW;
        }
        else if (state.equals("LOW")) {
            return State.MEDIUM;
        }
        else if (state.equals("MEDIUM")) {
            return State.HIGH;
        }
        else {
            return State.OFF;
        }
    }
}
