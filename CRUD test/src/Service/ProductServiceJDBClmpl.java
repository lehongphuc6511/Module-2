package Service;

import Model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceJDBClmpl implements ProductService {

    private String jdbcURL = "jdbc:mysql://localhost:3306/Product";
    private String jdbcUsername = "root";
    private String jdbcPassword = "LHP28012004bi";

    private static final String SHOW_PRODUCT_ALL = "SELECT * FROM Product;";
    private static final String FIND_BY_ID = "SELECT id,name,price,type FROM Product Where id = ?;";
    private static final String UPATE_PRODUCT = "UPDATE Product SET name = ?,price = ?,type = ? WHERE id = ?";
    private static final String SAVE_PRODUCT = "INSERT INTO Product (name, price, type) VALUE (?,?,?)";
    private static final String DELETE_PRODUCT = "DELETE FROM Product WHERE id = ?";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    @Override
    public List<Product> showAllProduct() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(SHOW_PRODUCT_ALL)) {
                System.out.println(preparedStatement);
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    float price = rs.getFloat("price");
                    String type = rs.getString("type");
                    products.add(new Product(id, name, price, type));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID)) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                float price = rs.getFloat("price");
                String type = rs.getString("type");

                product = new Product(id, name, price, type);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return product;
    }

    @Override
    public void update(int id, Product product) {
        boolean abc;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("UPDATE Product SET name = ?,price = ?,type = ? WHERE id = ?");) {

            statement.setString(1, product.getName());
            statement.setFloat(2, product.getPrice());
            statement.setString(3, product.getType());
            statement.setInt(4, product.getId());
            abc = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Product product) {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO Product (name, price, type) VALUE (?,?,?)")) {

            statement.setString(1, product.getName());
            statement.setFloat(2, product.getPrice());
            statement.setString(3, product.getType());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT)){
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

