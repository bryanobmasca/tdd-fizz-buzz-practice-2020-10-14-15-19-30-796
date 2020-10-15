package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    private static final String FIZZ = "Fizz";
    private static final int MODULO_5 = 5;
    private static final String BUZZ = "Buzz";
    private static final int MODULO_7 = 7;
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ_WHIZZ = "FizzWhizz";
    private static final String BUZZ_WHIZZ = "BuzzWhizz";
    private static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    public String countOff(int orderNumber) {
        boolean isModulo3 = orderNumber % MODULO_3 == 0;
        boolean isModulo5 = orderNumber % MODULO_5 == 0;
        boolean isModulo7 = orderNumber % MODULO_7 == 0;
        if(isModulo3 && isModulo5 && isModulo7){
            return FIZZ_BUZZ_WHIZZ;
        }
        if(isModulo3 && isModulo5){
            return FIZZ_BUZZ;
        }
        if(isModulo3 && isModulo7){
            return FIZZ_WHIZZ;
        }
        if(isModulo5 && isModulo7){
            return BUZZ_WHIZZ;
        }
        if(isModulo3){
            return FIZZ;
        }
        if(isModulo5){
            return BUZZ;
        }
        if(isModulo7){
            return WHIZZ;
        }
        return String.valueOf(orderNumber);
    }
}
