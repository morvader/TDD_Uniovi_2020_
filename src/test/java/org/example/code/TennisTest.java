package org.example.code;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {

    TennisGame tennisGame;

    @Before
    public void setUp() throws Exception {
        tennisGame = new TennisGame();
    }

    @Test
    public void cuandoEmpiezaElJuego_ResultadoNadaIguales() {

        String resultadoObtenido = tennisGame.resultadoActual();
        String resultadoEsperado = "Nada iguales";

        assertEquals("El resultado al inicio del partido no es nada iguales", resultadoEsperado, resultadoObtenido );
    }

    @Test
    public void cuandoElJugadorGanaLaPrimeraBola_QuinceNada() {

        tennisGame.ganaPuntoJugador1();

        String resultadoObtenido = tennisGame.resultadoActual();
        String resultadoEsperado = "Quince - Nada";

        assertEquals("El resultado al inicio del partido no es nada iguales", resultadoEsperado, resultadoObtenido );
    }
    @Test
    public void cuandoLosDosGanan2Puntos_TreintaIguales() {

        tennisGame.ganaPuntoJugador1();
        tennisGame.ganaPuntoJugador2();

        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador1();

        String resultadoObtenido = tennisGame.resultadoActual();
        String resultadoEsperado = "Treinta iguales";

        assertEquals("El resultado al inicio del partido no es nada iguales", resultadoEsperado, resultadoObtenido );
    }

    @Test
    public void cuandoJugador2Gana3BolasyEl1Ninguna_NadaCuarenta() {

        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();

        String resultadoObtenido = tennisGame.resultadoActual();
        String resultadoEsperado = "Nada - Cuarenta";

        assertEquals("El resultado al inicio del partido no es nada iguales", resultadoEsperado, resultadoObtenido );
    }

    @Test
    public void cuandoLosJugadoresEmpatanAMasde3Bolas_EsDeuce() {

        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();

        tennisGame.ganaPuntoJugador1();
        tennisGame.ganaPuntoJugador1();
        tennisGame.ganaPuntoJugador1();

        String resultadoObtenido = tennisGame.resultadoActual();
        String resultadoEsperado = "Deuce";

        assertEquals("El resultado al inicio del partido no es nada iguales", resultadoEsperado, resultadoObtenido );
    }

    @Test
    public void cuandoHayDeuceJugador1HacePunto_VentajaJugador1() {

        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();

        tennisGame.ganaPuntoJugador1();
        tennisGame.ganaPuntoJugador1();
        tennisGame.ganaPuntoJugador1();
        //DEUCE

        tennisGame.ganaPuntoJugador1();

        String resultadoObtenido = tennisGame.resultadoActual();
        String resultadoEsperado = "Ventaja jugador 1";

        assertEquals("El resultado al inicio del partido no es nada iguales", resultadoEsperado, resultadoObtenido );
    }

    @Test
    public void cuandoHayDeuceJugador2HacePunto_VentajaJugador2() {

        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();
        tennisGame.ganaPuntoJugador2();

        tennisGame.ganaPuntoJugador1();
        tennisGame.ganaPuntoJugador1();
        tennisGame.ganaPuntoJugador1();
        tennisGame.ganaPuntoJugador1();
        tennisGame.ganaPuntoJugador1();

        //DEUCE

        tennisGame.ganaPuntoJugador2();

        String resultadoObtenido = tennisGame.resultadoActual();
        String resultadoEsperado = "Ventaja jugador 2";

        assertEquals("El resultado al inicio del partido no es nada iguales", resultadoEsperado, resultadoObtenido );
    }
}
