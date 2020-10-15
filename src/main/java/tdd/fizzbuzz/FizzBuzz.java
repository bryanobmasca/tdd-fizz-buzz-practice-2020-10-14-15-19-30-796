package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final String FIZZ = "Fizz";

    public String countOff(int orderNumber) {
        boolean isModulo3 = orderNumber % MODULO_3 == 0;
        if(isModulo3){
            return FIZZ;
        }
        return String.valueOf(orderNumber);
    }
}
