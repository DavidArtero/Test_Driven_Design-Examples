import com.sun.org.apache.bcel.internal.generic.RETURN;

public class NumerosRomanos {
    public String convertirAromanos(Integer numeroNatural) {

        char[] numerosChart = numeroNatural.toString().toCharArray();

        if(numerosChart.length>=2){
            String unidadRomana = pasarUnidad(Character.getNumericValue(numerosChart[1]));
            String decenaRomana = pasarDecena(Character.getNumericValue(numerosChart[0]));

            return decenaRomana + unidadRomana;

        }
        if(numerosChart.length>=1){
            return pasarUnidad(Character.getNumericValue(numerosChart[0]));
        }



        if(numeroNatural<=3){
            return sumarI(1,numeroNatural, "");
        }

        if(numeroNatural<=8){
            return sumarI(6, numeroNatural, "V");
        }

        return null;
    }


    private String pasarDecena(int decena) {

        switch (decena) {
            case 4:
                return "XL";
            case 9:
                return "XC";
        }

        if(decena<=3){
            return sumarX(1,decena, "");
        }

        if(decena<=8){
            return sumarX(6, decena, "L");
        }
        return null;

    }

    private String pasarUnidad(int unidad) {
        switch (unidad) {
            case 4:
                return "IV";
            case 9:
                return "IX";
        }

        if(unidad<=3){
            return sumarI(1,unidad, "");
        }

        if(unidad<=8){
            return sumarI(6, unidad, "V");
        }
        return null;
    }


    private String sumarI(int inicioCuenta, int numeroNatural, String inicioNumeroRomano){
        for (int i = inicioCuenta; i <= numeroNatural; i++) {
            inicioNumeroRomano +="I";
        }
        return inicioNumeroRomano;
    }

    private String sumarX(int inicioCuenta, int numeroNatural, String inicioNumeroRomano){
        for (int i = inicioCuenta; i <= numeroNatural; i++) {
            inicioNumeroRomano +="X";
        }
        return inicioNumeroRomano;
    }


}
