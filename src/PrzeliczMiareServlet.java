import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/PrzeliczMiareServlet")

public class PrzeliczMiareServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Convert conv=new Convert();
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

       if (centymetry!=null) {
            cm=Double.parseDouble(centymetry);
            m=conv.CmToM(cm);
            mm=conv.CmToMm(cm);
        }

       if (milimetry!=null) {
            mm=Double.parseDouble(milimetry);
            m=conv.MmToM(mm);
            cm=conv.MmToCm(mm);
        }

        conv.odpWMiary(response,m, cm, mm);

    }


}
