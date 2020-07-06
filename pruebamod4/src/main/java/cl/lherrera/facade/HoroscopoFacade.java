
package cl.lherrera.facade;

import cl.lherrera.entidad.HoroscopoChino;

public class HoroscopoFacade {

    public static String obtenerHoroscopo(int anio) {

        String horoscopo = "";
        int anyo = anio;
        int resto = anyo % 12;

        switch (resto) {

        case 0:
            horoscopo = HoroscopoChino.MONO.toString();
            break;

        case 1:
            horoscopo = HoroscopoChino.CABALLO.toString();
            break;

        case 2:
            horoscopo = HoroscopoChino.PERRO.toString();
            break;

        case 3:
            horoscopo = HoroscopoChino.CERDO.toString();
            break;

        case 4:
            horoscopo = HoroscopoChino.RATA.toString();
            break;

        case 5:
            horoscopo = HoroscopoChino.BUEY.toString();
            break;

        case 6:
            horoscopo = HoroscopoChino.TIGRE.toString();
            break;

        case 7:
            horoscopo = HoroscopoChino.CONEJO.toString();
            break;

        case 8:
            horoscopo = HoroscopoChino.DRAGON.toString();
            break;

        case 9:
            horoscopo = HoroscopoChino.SERPIENTE.toString();
            break;

        case 10:
            horoscopo = HoroscopoChino.CABALLO.toString();
            break;

        default:
            horoscopo = HoroscopoChino.CABRA.toString();
            break;

        }

        return horoscopo;

    }

}
