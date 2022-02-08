package data_types;

public class DoubleForCurrency {
    public static void main(String[] args) {
        double total = 0.2;
        for (int i = 0; i < 10; i++) {
            //System.out.println("total when loop count is "+(i+1)+"="+ total);
            total += 0.2;
        }
        System.out.println("total = " + total);
    }
}                                                    