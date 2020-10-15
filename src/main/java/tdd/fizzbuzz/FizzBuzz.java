package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOff(int orderNumber) {
        boolean isModulo3 = orderNumber % MODULO_3 == 0;
        boolean isModulo5 = orderNumber % MODULO_5 == 0;
        boolean isModulo7 = orderNumber % MODULO_7 == 0;
        String studentSay = "";
        if (isModulo3){
            studentSay += FIZZ;
        }
        if (isModulo5){
            studentSay += BUZZ;
        }
        if (isModulo7){
            studentSay += WHIZZ;
        }
        return studentSay.isEmpty()
                ? String.valueOf(orderNumber)
                : studentSay;
    }
}
