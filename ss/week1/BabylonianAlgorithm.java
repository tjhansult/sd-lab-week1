package ss.week1;

import ss.utils.TextIO;

public class BabylonianAlgorithm {
    public static void main(String[] args) {
        babylonianAlgorithm();
    }
    public static String babylonianAlgorithm () {
        double n = TextIO.getDouble();
        double guess = n/2;
        double r = n / guess;
        double prevGuess = 0;
        guess = (guess + r) / 2;
        // conditional for 1% range
        for (int i=0;i<100000;i++) {
            if (Math.sqrt(n)/guess>0.99) {
                break;
            }
            r = n / guess;
            prevGuess = guess;
            guess = (guess + r) / 2;
        }
        System.out.println(String.format("%.2f",guess));
        System.out.println("Hello");
        return String.format("%.2f",guess);
    }
}
