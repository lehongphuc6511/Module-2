package Controller;

import Model.Buyer;
import Service.BuyerService;
import Service.BuyerServiceJDBClmpl;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BuyerServlet", urlPatterns = "/Buyer")
public class BuyerServlet extends HttpServlet {
    BuyerService buyerService = new BuyerServiceJDBClmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "":
            default:
                showBuyerAll(request, response);
                break;
        }
    }
    private void showBuyerAll(HttpServletRequest request, HttpServletResponse response){
        List<Buyer> buyers = this.buyerService.showBuyerAll();

        request.setAttribute("buyers", buyers);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Buyer/list.jsp");
        try{
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
