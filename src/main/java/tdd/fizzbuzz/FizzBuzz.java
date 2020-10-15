package tdd.fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";

    public String countOff(int orderNumber) {
        if(orderNumber % 3 == 0){
            return FIZZ;
        }
        return String.valueOf(orderNumber);
    }
}
