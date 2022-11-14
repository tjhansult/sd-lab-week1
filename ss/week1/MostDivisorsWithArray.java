package ss.week1;

import java.util.ArrayList;

public class MostDivisorsWithArray {
    public static void main(String[] args) {
        mostDivisorsWithArray();
    }
    public static int mostDivisorsWithArray() {
        int maxDivisors=0;
        String s = "";
        ArrayList<Integer> maxValues = new ArrayList<>();
        int count=0;
        int[] divisors = new int[10000];
        for (int i=0;i<10000;i++) {
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

            }
            if (count>maxDivisors) {
                maxDivisors = count;
            }
            divisors[i] = count;
        }
        for (int k=0; k<divisors.length;k++) {
            if (divisors[k]==maxDivisors) {
                maxValues.add(k);
            }
        }
        s = "Among integers between 1 and 10000,\nThe maximum number of divisors was "+maxDivisors;
        s += "\nNumbers with that many divisors include:\n";
        for (int a: maxValues) {
            s+=a+"\n";
        }
        System.out.println(s);
        return maxDivisors;
    }
}
