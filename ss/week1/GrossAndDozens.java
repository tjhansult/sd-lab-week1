package ss.week1;
import ss.utils.TextIO;

public class GrossAndDozens {
    public static void main(String[] args) {
        grossAndDozens();
    }
    public static String grossAndDozens() {
        int eggAmount = TextIO.getlnInt();
        String s = "Your number of eggs is ";
        int gross = eggAmount/144;
        // how do you get a dozen to 3?
        int dozen = (eggAmount/12);
        int rest = eggAmount%12;
        s+=gross+" gross, "+ dozen + " dozen, and " + rest;
        System.out.println(s);
        return s;
    }
}
