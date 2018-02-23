import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ConvertKg")
public class ConvertKg extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Dane dane = createDaneFromRequest(req);
        sendResponse(dane, resp);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Dane dane = createDaneFromRequest(request);
        sendResponse(dane, response);
    }

    private Dane createDaneFromRequest(HttpServletRequest request) {
        Dane dane = new Dane();
        Convert conv=new Convert();

        if (request.getParameter("kilogramy")!=null) { dane.setKilogramy(request.getParameter("kilogramy")); conv.convertKg(request.getParameter("kilogramy")); }
        if (request.getParameter("dekagramy")!=null) { dane.setDekagramy(request.getParameter("dekagramy")); conv.convertDag(request.getParameter("dekagramy"));}
        if (request.getParameter("gramy")!=null) { dane.setGramy(request.getParameter("gramy")); conv.convertDag(request.getParameter("gramy"));}
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
        writer.println("Kilogramy: "+dane.getKilogramy() + "<br>");
        writer.println("Dekagramy: "+dane.getDekagramy() + "<br>");
        writer.println("Gramy: "+dane.getGramy() + "<br>");
        writer.print("</div>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
