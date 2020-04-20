package org.example.code;

public class FizzBuzz {

    public String getFizzBuzzCode(Integer numero) {
        String retorno= "";
//        if(numero % 3 == 0 && numero% 5 == 0)
//            return "org.example.code.FizzBuzz";

        if(numero % 3 == 0)
            retorno = "Fizz";
        if(numero % 5 == 0)
            retorno = retorno + "Buzz";

        if(retorno.equals(""))
            retorno = numero.toString();

        return retorno;
    }
}
