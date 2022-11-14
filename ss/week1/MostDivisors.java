package ss.week1;

public class MostDivisors {
    public static void main(String[] args) {
        mostDivisors();
    }
    public static int mostDivisors() {
        int maxDivisors=0;
        int numberMostDivisors = 0;
        int count=0;
        for (int i=0;i<=10000;i++) {
            count=0;
            for (int j=1;j<=Math.sqrt(i);j++) {
                if (i%j==0) {
                    if(i%j==i) {
                        count++;
                    }
                    else {
                        count+=2;
                    }
                }
                if (count>maxDivisors) {
                    maxDivisors = count;
                    numberMostDivisors = i;
                }
            }
        }
        System.out.println(maxDivisors);
        System.out.println("  "+numberMostDivisors);
        return maxDivisors;
    }
}
