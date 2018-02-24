import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PrzeliczServlet")

public class PrzeliczServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Convert conv=new Convert();
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("UTF-8");

        String kilogramy=request.getParameter("kilogramy");
        double kilogram=Double.parseDouble(kilogramy);

        String gramy=request.getParameter("gramy");
        double gram=Double.parseDouble(gramy);

        String dekagramy=request.getParameter("dekagramy");
        double dekagram=Double.parseDouble(dekagramy);

        String metry=request.getParameter("metry");
        double metr=Double.parseDouble(metry);

        String centymetry=request.getParameter("centymetry");
        double centymetr=Double.parseDouble(centymetry);

        String milimetry=request.getParameter("milimetry");
        double milimetr=Double.parseDouble(milimetry);

        if (kilogramy!=null) writer.println(conv.convertKg(kilogram));
        if (gramy!=null) writer.println(conv.convertG(gram));
        if (dekagramy!=null) writer.println(conv.convertDag(dekagram));

        if (metry!=null) writer.println(conv.convertM(metr));
        if (centymetry!=null) writer.println(conv.convertCm(centymetr));
        if (milimetry!=null) writer.println(conv.convertMm(milimetr));


    }


}
