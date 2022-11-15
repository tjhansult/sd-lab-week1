package ss.week1.hotel;

public class SimpleBillPrinter {
    public static void main(String[] args) {
        printBill();
    }
    public static void printBill() {
        String bill = "";
        String description = "Hotel night 1x";
        double value = 85.50;
        bill = String.format(description + "%25.8f", value);
        System.out.println(bill);
    }
    public static void test(){
        System.out.println("This works");
    }
    public static void gracjan(){
        System.out.println("Gracjan");
    }
}
