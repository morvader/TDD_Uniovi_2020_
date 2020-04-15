import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void unNumeroNormal_DevuelveElNumero(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        int numero = 1;
        String retorno = fizzbuzz.getFizzBuzzCode(numero);

        assertEquals("El código retornado no es correcto","1", retorno);
    }


}
