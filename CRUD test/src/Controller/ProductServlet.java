package Controller;

import Model.Product;
import Service.ProductService;
import Service.ProductServiceJDBClmpl;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/Product")
public class ProductServlet extends HttpServlet {
    ProductService productService = new ProductServiceJDBClmpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                updateProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "view":
                viewForm(request, response);
                break;
            case "create":
                createForm(request, response);
                break;
            case "edit":
                editForm(request, response);
                break;
            case "delete":
                deleteForm(request, response);
                break;
            default:
                showAllProduct(request, response);
                break;
        }
    }

    private void showAllProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.productService.showAllProduct();
        request.setAttribute("products", products);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Product/list.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void viewForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product products = this.productService.findById(id);
        RequestDispatcher dispatcher;

        request.setAttribute("products", products);
        dispatcher = request.getRequestDispatcher("Product/view.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        request.setAttribute("products", product);
        dispatcher = request.getRequestDispatcher("Product/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Float price = Float.parseFloat(request.getParameter("price"));
        String type = request.getParameter("type");
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;

        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setType(type);

        this.productService.update(id, product);
        request.setAttribute("products", product);
        dispatcher = request.getRequestDispatcher("Product/edit.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Product/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createProduct(HttpServletRequest request,HttpServletResponse response){
        String name = request.getParameter("name");
        Float price = Float.parseFloat(request.getParameter("price"));
        String type = request.getParameter("type");
        Product product = new Product(name,price,type);
        this.productService.save(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Product/create.jsp");
        try{
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product=this.productService.findById(id);
        request.setAttribute("products", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Product/delete.jsp");
        try{
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        this.productService.delete(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Product/delete.jsp");
        try{
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


