import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void unNumeroNormal_DevuelveElNumero(){
        int numero = 1;
        String retorno = fizzBuzz.getFizzBuzzCode(numero);

        assertEquals("El código retornado no es correcto","1", retorno);
    }

    @Test
    public void unMultiploDeTres_DevuelveFizz(){
        int numero = 3;
        String retorno = fizzBuzz.getFizzBuzzCode(numero);

        assertEquals("El código retornado no es correcto","Fizz", retorno);
    }

    @Test
    public void unMultiploDeCinco_DevuelveBuzz(){
        int numero = 5;
        String retorno = fizzBuzz.getFizzBuzzCode(numero);

        assertEquals("El código retornado no es correcto","Buzz", retorno);
    }
}
