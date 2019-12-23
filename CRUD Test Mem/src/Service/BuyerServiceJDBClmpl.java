package Service;

import Model.Buyer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BuyerServiceJDBClmpl implements BuyerService {

    private String jdbcURL = "jdbc:mysql://localhost:3306/Buyer";
    private String jdbcUsername = "root";
    private String jdbcPassword = "LHP28012004bi";


    private static final String SHOW_ALL_BUYER = "SELECT * FROM Buyer";

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
    public List<Buyer> showBuyerAll() {
        List<Buyer> buyers = new ArrayList<>();
        try (Connection connection = getConnection()) {
            try(PreparedStatement statement = connection.prepareStatement(SHOW_ALL_BUYER)){
                ResultSet rs = statement.executeQuery();

                while (rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String address = rs.getString("address");
                    int phone = rs.getInt("phone");
                    String gender = rs.getString("gender");
                    String createBy = rs.getString("createBy");
                    String createDate = rs.getString("createDate");
                    String modifyBy = rs.getString("modifyBy");
                    String modifyDate = rs.getString("modifyDate");
                    String deleteBy = rs.getString("deleteBy");
                    String deleteDate = rs.getString("deleteDate");

                    buyers.add(new Buyer(id,name,address,phone,gender,createBy,createDate,modifyBy,modifyDate,deleteBy,deleteDate));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return buyers;
    }
}
