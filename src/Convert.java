import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Convert {

    public double KgToDag (double kg){
        return  kg / 100;
    }

    public double KgToG (double kg){
        return kg / 1000;
    }

    public double DagToKg (double dag){
        return  dag * 100;
    }

    public double DagToG (double dag){
        return dag / 10;
    }

    public double GToKg (double g){
        return  g * 1000;
    }

    public double GToDag (double g){
        return g * 10;
    }


 public double MToCm (double m){
        return m / 100;
    }

    public double MToMm (double m){
        return m / 1000;
    }


    public double CmToM (double cm){
        return cm * 100;
    }

    public double CmToMm (double cm){
        return cm / 10;
    }

    public double MmToM (double mm){
        return mm*1000;
    }

    public double MmToCm (double mm){
        return mm*10;
    }


}
