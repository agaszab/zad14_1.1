public class Convert {

    public String convertKg(double kg) {
        double g = kg / 1000;
        double dag = kg / 100;
        return "Kilogramy: "+kg+" Dekagramy: "+dag+" Gramy: "+g;
    }


    public String convertDag(double dag) {
        double kg = dag * 100;
        double g = dag / 10;
        return "Kilogramy: "+kg+" Dekagramy: "+dag+" Gramy: "+g;
    }

    public String convertG(double g) {
        double kg = g * 1000;
        double dag = g * 10;
        return "Kilogramy: "+kg+" Dekagramy: "+dag+" Gramy: "+g;
    }


    public  String convertM(double m) {
        double cm = m / 100;
        double mm = m / 1000;
        return "Metry: "+m+" Centymetry: "+cm+" Milimetry: "+mm;
    }

    public  String convertCm(double cm) {
        double m = cm * 100;
        double mm = cm / 10;
        return "Metry: "+m+" Centymetry: "+cm+" Milimetry: "+mm;
    }

    public  String convertMm(double mm) {
        double m=mm*1000;
        double cm=mm*10;
        return "Metry: "+m+" Centymetry: "+cm+" Milimetry: "+mm;
    }

}
