import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/convertKg")
public class convertKg extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Dane dane = createDaneFromRequest(req);
        sendResponse(dane, resp);
    }

    /*
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String kilogramy= request.getParameter("kilogramy");
        String gramy= request.getParameter("gramy");
        String dekagramy= request.getParameter("dekagramy");

        double kg=Double.parseDouble(kilogramy);
        double g=Double.parseDouble(gramy);
        double dag=Double.parseDouble(dekagramy);


        if (kilogramy!=null) {g=kg/1000; dag=kg/100;}
        if (gramy!=null) {kg=g*1000; dag=g*10;}
        if (dekagramy!=null) {kg=dag*100; g=dag/10;}

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<link rel=\"Stylesheet\" type=\"text/css\" href=\"style.css\" />");
        writer.println("<body>");
        writer.print("<h1>Przelicznik masy</h1>");
        writer.print("<div class=\"center\">");
        writer.println("Kilogramy -" + kg+"<br>");
        writer.println("Dekagramy -" +dag+"<br>");
        writer.println("Gramy -" +g+"<br>");


        writer.print("</div>");
        writer.println("</body>");
        writer.println("</html>");
    }

*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Dane dane = createDaneFromRequest(request);
        sendResponse(dane, response);
    }

    private Dane createDaneFromRequest(HttpServletRequest request) {
        Dane dane = new Dane();
        dane.setMetry(request.getParameter("metry"));
        dane.setMilimetry(request.getParameter("milimetry"));
        dane.setCentymetry(request.getParameter("centymetry"));
        return dane;
    }

    private void sendResponse(Dane dane, HttpServletResponse response) throws IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.print("<h2>Dane odebrano pomyślnie</h2>");
        writer.print("<div>");
        writer.println("Milimetry - "+dane.getMilimetry() + "<br>");
        writer.println("Centymetry - "+dane.getCentymetry() + "<br>");
        writer.println("Decymetry - "+dane.getMetry() + "<br>");
        writer.print("</div>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
