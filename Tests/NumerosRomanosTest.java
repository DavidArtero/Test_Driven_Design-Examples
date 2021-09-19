import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class NumerosRomanosTest {

    NumerosRomanos numerosRomanos = new NumerosRomanos();
    @Test
    public void pasarAromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(1);

        assertEquals(romano, "I");
    }

    @Test
    public void pasar2Aromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(2);
        assertEquals(romano, "II");
    }

    @Test
    public void pasar3Aromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(3);
        assertEquals(romano, "III");
    }

    @Test
    public void pasar4Aromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(4);
        assertEquals(romano, "IV");
    }

    @Test
    public void pasar5Aromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(5);
        assertEquals(romano, "V");
    }

    @Test
    public void pasar6Aromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(6);
        assertEquals(romano, "VI");
    }

    @Test
    public void pasar7Aromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(7);
        assertEquals(romano, "VII");
    }

    @Test
    public void pasar8Aromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(8);
        assertEquals(romano, "VIII");
    }

    @Test
    public void pasar9Aromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(9);
        assertEquals(romano, "IX");
    }

    @Test
    public void pasar14Aromanos(){
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        String romano = numerosRomanos.convertirAromanos(14);
        assertEquals(romano, "XIV");
    }

    @Test
    public void verificarVeintenaRomanos(){
        List<Integer> numerosNaturales = Arrays.asList(20,21,22,23,24,25,26,27,28,29);

        List<String> romanos = numerosNaturales.stream()
                .map(number-> numerosRomanos.convertirAromanos(number))
                .collect(Collectors.toList());

        assertEquals(romanos.get(0), "XX");
        assertEquals(romanos.get(1), "XXI");
        assertEquals(romanos.get(2), "XXII");
        assertEquals(romanos.get(3), "XXIII");
        assertEquals(romanos.get(4), "XXIV");
        assertEquals(romanos.get(5), "XXV");
        assertEquals(romanos.get(6), "XXVI");
        assertEquals(romanos.get(7), "XXVII");
        assertEquals(romanos.get(8), "XXVIII");
        assertEquals(romanos.get(9), "XXIX");
    }

    @Test
    public void verificarTreintenaRomanos(){
        List<Integer> numerosNaturales = Arrays.asList(30,31,32,33,34,35,36,37,38,39);

        List<String> romanos = numerosNaturales.stream()
                .map(number-> numerosRomanos.convertirAromanos(number))
                .collect(Collectors.toList());

        assertEquals(romanos.get(0), "XXX");
        assertEquals(romanos.get(1), "XXXI");
        assertEquals(romanos.get(2), "XXXII");
        assertEquals(romanos.get(3), "XXXIII");
        assertEquals(romanos.get(4), "XXXIV");
        assertEquals(romanos.get(5), "XXXV");
        assertEquals(romanos.get(6), "XXXVI");
        assertEquals(romanos.get(7), "XXXVII");
        assertEquals(romanos.get(8), "XXXVIII");
        assertEquals(romanos.get(9), "XXXIX");
    }

    @Test
    public void verificarDecimalesRomanos(){
        List<Integer> numerosNaturales = Arrays.asList(40,50,60,70,80,90,88,67);

        List<String> romanos = numerosNaturales.stream()
                .map(number-> numerosRomanos.convertirAromanos(number))
                .collect(Collectors.toList());

        assertEquals(romanos.get(0), "XL");
        assertEquals(romanos.get(1), "L");
        assertEquals(romanos.get(2), "LX");
        assertEquals(romanos.get(3), "LXX");
        assertEquals(romanos.get(4), "LXXX");
        assertEquals(romanos.get(5), "XC");
        assertEquals(romanos.get(6), "LXXXVIII");
        assertEquals(romanos.get(7), "LXVII");
    }

    @Test
    public void verificarRomanos(){
        List<Integer> numerosNaturales = Arrays.asList(100,200,300,400,500,600,700,800,900,3234);

        List<String> romanos = numerosNaturales.stream()
                .map(number-> numerosRomanos.convertirAromanos(number))
                .collect(Collectors.toList());

        assertEquals(romanos.get(0), "C");
        assertEquals(romanos.get(1), "CC");
        assertEquals(romanos.get(2), "CCC");
        assertEquals(romanos.get(3), "CD");
        assertEquals(romanos.get(4), "D");
        assertEquals(romanos.get(5), "DC");
        assertEquals(romanos.get(6), "DCC");
        assertEquals(romanos.get(7), "DCCC");
        assertEquals(romanos.get(8), "CM");
        assertEquals(romanos.get(9), "MMMCCXXXIV");
    }



}
