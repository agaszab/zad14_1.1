import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

@WebServlet("/PrzeliczWageServlet")

public  class PrzeliczWageServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Convert conv=new Convert();
        response.setCharacterEncoding("UTF-8");

        String kilogramy=request.getParameter("kilogramy");
        String gramy=request.getParameter("gramy");
        String dekagramy=request.getParameter("dekagramy");

        double kg=0;
        double dag=0;
        double g=0;

        if (kilogramy!=null) {
             kg=Double.parseDouble(kilogramy);
             dag=conv.KgToDag(kg);
             g=conv.KgToG(kg);
        }

        if (gramy!=null) {
             g=Double.parseDouble(gramy);
             dag=conv.GToDag(g);
             kg=conv.GToKg(g);
        }

        if (dekagramy!=null) {
             dag=Double.parseDouble(dekagramy);
             g=conv.DagToG(dag);
             kg=conv.DagToKg(dag);
        }
      odpWagi(response,kg, dag, g);





    }

    public void odpWagi (HttpServletResponse response, double kg, double dag, double g) throws IOException {

        PrintWriter writer = response.getWriter();
        writer.println("Kilogramy: " + kg);
        writer.println("Dekagramy: " + dag);
        writer.println("Gramy: " + g);
    }



}
