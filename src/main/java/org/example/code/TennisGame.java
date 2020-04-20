package org.example.code;

public class TennisGame {
    int puntosJugador1;
    int puntosJugador2;

    public TennisGame() {
        puntosJugador1 = 0;
        puntosJugador2 = 0;
    }

    public String resultadoActual() {

        if(puntosJugador1 == puntosJugador2 && puntosJugador1 < 3){
            return puntoToString(puntosJugador1) + " iguales";
        }
        else if(puntosJugador1 == puntosJugador2 && puntosJugador1 >= 3){
            return "Deuce";
        }
        else if(puntosJugador1 == puntosJugador2 + 1 && puntosJugador1 >= 4){
            return "Ventaja jugador 1";
        }
        else if(puntosJugador1 + 1 == puntosJugador2 && puntosJugador2 >= 4){
            return "Ventaja jugador 2";
        }
        else{
            String resultadoJugador1 = puntoToString(puntosJugador1);
            String resultadoJugador2 = puntoToString(puntosJugador2);

            return resultadoJugador1 + " - " + resultadoJugador2;
        }

    }

    public void ganaPuntoJugador1() {
        this.puntosJugador1 ++;
    }

    public void ganaPuntoJugador2() {
        this.puntosJugador2 ++;
    }

    private String puntoToString(int puntuacion){
        switch (puntuacion){
            case 0:
                return "Nada";
            case 1:
                return "Quince";
            case 2:
                return "Treinta";
            case 3:
                return "Cuarenta";
        }

        return "";
    }
}
