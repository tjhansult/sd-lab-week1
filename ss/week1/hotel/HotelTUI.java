package ss.week1.hotel;

import ss.utils.TextIO;

public class HotelTUI {
    public static void main(String[] args) {
        check();
    }
    // use switch statement
    public static void check() {
        String menu = "Welcome to the Hotel booking system of the U Parkhotel Commands:\n" +
                "i name ........... check in guest with name \no name ........... check out guest with name" +
                "\nr name ........... request room of guest\n" +
                "h ................ help (this menu)\n" +
                "p ................ print state\n" +
                "x ................ exit";
        String roomInformation = "Standard Room";
        String hotelInformation = "Deluxe Resort";
        System.out.println(menu);
        boolean exit = false;
        String guest = "";
        final char IN = 'i';
        final char OUT = 'o';
        final char ROOM = 'r';
        final char HELP = 'h';
        final char PRINT = 'p';
        final char EXIT = 'x';
        String input = TextIO.getln();
        String[] words = input.split(" ");
        String command = words[0];
        String parm = "";
        while (!exit) {
            input = TextIO.getln();
            words = input.split(" ");
            command = words[0];
            parm = null;
            if (words.length>1) {
                parm = words[1];
            }
            if (command.length()==1) {
                if (command.equals(IN)) {
                    if (parm.equals(null)) {
                        System.out.println("Error");
                    }
                    else if (guest.equals(null)) {
                        guest = parm;
                    }
                }
                else if (command.equals(OUT)) {
                    if (parm.equals(null)) {
                        System.out.println("Error");
                    }
                    else if (!guest.equals(parm)) {
                        System.out.println("Error");
                    }
                    else {
                        guest = null;
                    }
                }
                else if (command.equals(ROOM)) {
                    if (parm.equals(null)) {
                        System.out.println("Error");
                    }
                    else if (!parm.equals(guest)) {
                        System.out.println("Error");
                    }
                    else {
                        System.out.println(roomInformation);
                    }
                }
                else if (command.equals(PRINT)) {
                    System.out.println(hotelInformation);
                }
                else if (command.equals(HELP)) {
                    System.out.println(menu);
                }
                else if (command.equals(EXIT)) {
                    exit = true;
                }
                else {
                    System.out.println("Error");
                }
            }
            else {
                System.out.println("Error");
            }
        }
    }

}
