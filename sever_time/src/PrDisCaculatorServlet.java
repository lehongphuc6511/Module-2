import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.WriteAbortedException;

@WebServlet(name = "PrDisCaculatorServlet", urlPatterns = "/PrDisCaculator")
public class PrDisCaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        float ProductDescription = Float.parseFloat(request.getParameter("ProductDescription"));
        float ListPrice = Float.parseFloat(request.getParameter("ListPrice"));
        float DiscountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));

        double DiscountAmount = ListPrice * DiscountPercent * 0.1;
        double DiscountPrice = ListPrice - DiscountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("ProductDescription : " + ProductDescription);
        writer.println("Price : " + ListPrice);
        writer.println("Discount Percent : " + DiscountPercent);
        writer.println("Discount Amount : " + DiscountAmount);
        writer.println("Discount Price : " + DiscountPercent);
    }
}
