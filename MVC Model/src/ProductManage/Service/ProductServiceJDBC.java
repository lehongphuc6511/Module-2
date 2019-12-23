package ProductManage.Service;

import ProductManage.Model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceJDBC implements ProductServicelmpl {
    private String jdbcURL = "jdbc:mysql://localhost:3306/mvc_demo";
    private String jdbcUsername = "root";
    private String jdbcPassword = "LHP28012004bi";

    private static final String INSERT_USERS_SQL = "INSERT INTO Product" + "  (name, email, address) VALUES "
            + " (?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,price,description, producer from Product where id =?";
    private static final String SELECT_ALL_USERS = "select * from Product";
    private static final String DELETE_USERS_SQL = "delete from Product where id = ?;";
    private static final String UPDATE_USERS_SQL = "update Product set name = ?,price = ?, description =?, producer = ? where id = ?;";


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
    public List<Product> findAll() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Product> users = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String price = rs.getString("price");
                String description = rs.getString("description");
                String producer = rs.getString("producer");
                users.add(new Product(id, name, price, description, producer));
            }

        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
    }

    @Override
    public void save(Product product) {
        System.out.println(INSERT_USERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getPrice());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setString(4, product.getProducer());


            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name = rs.getString("name");
                String price = rs.getString("price");
                String description = rs.getString("description");
                String producer = rs.getString("producer");
                product = new Product(id, name, price, description, producer);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return product;
    }

    @Override
    public void update(int id, Product customer) {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getPrice());
            statement.setString(3, customer.getDescription());
            statement.setString(5, customer.getProducer());
            statement.setInt(4, customer.getId());

            rowUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            printSQLException(e);
        }
        //return rowUpdated;
    }

    @Override
    public void remove(int id) {

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);)
        {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
