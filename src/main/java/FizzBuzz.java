public class FizzBuzz {

    public String getFizzBuzzCode(int numero) {
        if(numero % 3 == 0)
            return "Fizz";
        if(numero % 5 == 0)
            return "Buzz";

        return "1";
    }
}
