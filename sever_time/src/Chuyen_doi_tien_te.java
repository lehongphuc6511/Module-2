import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Chuyen_doi_tien_te", urlPatterns ="/Chuyen_doi_tien_te" )
public class Chuyen_doi_tien_te extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("Rate"));
        float usd = Float.parseFloat(request.getParameter("USD"));
        float vnd = rate * usd;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>" + "Rate : " + rate + "</h1>");
        writer.println("<h1>" + "USD : " + usd + "</h1>");
        writer.println("<h1>" + "VND : " + vnd + "</h1>");
        writer.println("</html>");

    }
}
