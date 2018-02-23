public class Convert {

    Dane dane = new Dane();

    String kilogramy = dane.getKilogramy();
    String gramy = dane.getGramy();
    String dekagramy = dane.getDekagramy();
    String metry = dane.getMetry();
    String centymetry = dane.getCentymetry();
    String milimetry = dane.getMilimetry();


    double kg = Double.parseDouble(kilogramy);
    double g = Double.parseDouble(gramy);
    double dag = Double.parseDouble(dekagramy);
    double m = Double.parseDouble(metry);
    double cm = Double.parseDouble(centymetry);
    double mm = Double.parseDouble(milimetry);


    public static String conwertKg(double kg) {
        double g = kg / 1000;
        double dag = kg / 100;
        return"Kilogramy: "+kg+"<br> Dekagramy"+dag+"<br> Gramy: "+g;
    }


    public static String conwertKg(double dag) {
        double kg = dag * 100;
        double g = dag / 10;
        return"Kilogramy: "+kg+"<br> Dekagramy"+dag+"<br> Gramy: "+g;
    }

    public static String conwertKg(double g) {
        double kg = g * 1000;
        double dag = g * 10;
        return"Kilogramy: "+kg+"<br> Dekagramy"+dag+"<br> Gramy: "+g;
    }


    public static String conwertKg(double m) {
        double cm = m / 100;
        double mm = m / 1000;
        return"Metry: "+m+"<br> Centymetry"+cm+"<br> Milimetry: "+mm;
    }

    public static String conwertKg(double cm) {
        double m = cm * 100;
        double mm = cm / 10;
        return"Metry: "+m+"<br> Centymetry"+cm+"<br> Milimetry: "+mm;
    }

    public static String conwertKg(double mm) {
        double m=mm*1000; cm=mm*10;
        return"Metry: "+m+"<br> Centymetry"+cm+"<br> Milimetry: "+mm;
    }

       if(metry!=null){ cm = m / 100; mm = m / 1000; }
       if(centymetry!=null){ m = cm * 100; mm = cm / 10;}
       if(milimetry!=null) { m=mm*1000; cm=mm*10;}


}
