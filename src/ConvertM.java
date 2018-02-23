import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ConvertM")
public class ConvertM extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String metry= request.getParameter("metry");
        String centymetry= request.getParameter("centymetry");
        String milimetry= request.getParameter("milimetry");
        double metr=Double.parseDouble(metry);
        double centymetr=Double.parseDouble(centymetry);
        double milimetr=Double.parseDouble(milimetry);


        if (metry!=null) {centymetr=metr/100; milimetr=metr/1000;}
        if (centymetry!=null) {metr=centymetr*100; milimetr=centymetr/10;}
        if (milimetry!=null) {metr=milimetr*1000; centymetr=milimetr*10;}

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<link rel=\"Stylesheet\" type=\"text/css\" href=\"style.css\" />");
        writer.println("<body>");
        writer.print("<h1>Przelicznik długości</h1>");
        writer.print("<div>");
        writer.println("Metry -" + metr+"<br>");
        writer.println("Centymetry -" +centymetr+"<br>");
        writer.println("Milimetry -" +milimetr+"<br>");


        writer.print("</div>");
        writer.println("</body>");
        writer.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");


    }
}
