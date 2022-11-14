package ss.week1;

public class RollTheDice {
    public static void main(String[] args) {
        int r1 = (int)(Math.random()*6) + 1;
        int r2 = (int)(Math.random()*6) + 1;
        System.out.println(printResults(r1,r2));

    }
    public static String printResults(int r1, int r2) {
        String s = "Your first die comes up ";
        s+=r1+"\n"+"The second die comes up "+ r2;
        int r3 = r1+r2;
        s+="\n" + "Your final result is " + r3;
        return s;
    }
}
