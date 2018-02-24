import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/PrzeliczMiareServlet")

public class PrzeliczMiareServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Convert conv=new Convert();
        PrintWriter writer = response.getWriter();

        response.setCharacterEncoding("UTF-8");

        String metry=request.getParameter("metry");
        String centymetry=request.getParameter("centymetry");
        String milimetry=request.getParameter("milimetry");

        double m=0;
        double cm=0;
        double mm=0;

        if (metry!=null) {
            m=Double.parseDouble(metry);
            cm=conv.MToCm(m);
            mm=conv.MToMm(m);
        }

       else if (centymetry!=null) {
            cm=Double.parseDouble(centymetry);
            m=conv.CmToM(cm);
            mm=conv.CmToMm(cm);
        }

        else if (milimetry!=null) {
            mm=Double.parseDouble(milimetry);
            m=conv.MmToM(mm);
            cm=conv.MmToCm(mm);
        }

        if (metry==null && centymetry==null && milimetry==null) writer.println("Nie wypełniłeś żadnego pola.");
        else odpMiary(response,writer, m, cm, mm);

    }

    public void odpMiary (HttpServletResponse response, PrintWriter writer, double m, double cm, double mm) throws IOException {


        writer.println("Metry: " + m);
        writer.println("Centymetry: " + cm);
        writer.println("Milimetry: " + mm);
    }

}
