package service;

import Service.StaffService;
import model.Stock;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StaffJDBCServicelmpl implements StaffService {
    private String jdbcURL = "jdbc:mysql://localhost:3306/inventory_management";
    private String jdbcUsername = "root";
    private String jdbcPassword = "LHP28012004bi";

    private static final String INSERT_STAFFS_SQL = "INSERT INTO Staff"
            + "(idStaff, name, age, address, phoneNumber, gender" +
            " deleteBy, deleteDate, modifyBy, modifyDate, createBy, createDate) VALUES"
            + "(?,?,?,?,?,?,?,?,?,?,?)";

    //Lưu ý phần này
    private static final String SELECT_STAFFS_BY_ID = "select idStaff, name, address, phoneNumber," +
            "deleteBy, deleteDate, modifyBy, modifyDate, createBy,createDate from Stock where idStock =?";
    private static final String SELECT_ALL_STAFFS = "select * from Stock";
    private static final String DELETE_STAFFS_SQL = "delete from Stock where idStock = ?";
    private static final String UPDATE_STAFFS_SQL = "update Stock set name=?, address=?, phoneNumber=?," +
            "deleteBy=?, deleteDate=?, modifyBy=?, modifyDate=?, createBy=?, createDate=? where idStock=?";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //TODO Auto-generated catch block
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
    public List<Staff> findAll() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Staff> stocks = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STOCKS)) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idStock = rs.getInt("ID Stock");
                String name = rs.getString("Name");
                String address = rs.getString("Address");
                String phoneNumber = rs.getString("Phone Number");
                String deleteBy = rs.getString("Delete By");
                String deleteDate = rs.getString("Delete Date");
                String modifyBy = rs.getString("Modify By");
                String modifyDate = rs.getString("Modify Date");
                String createBy = rs.getString("Create By");
                String createDate = rs.getString("Create Date");
                stocks.add(new Staff(idStock, name, address, phoneNumber,
                        deleteBy, deleteDate, modifyBy, modifyDate, createBy, createDate));
            }

        } catch (SQLException e) {
            printSQLException(e);
        }
        return stocks;
    }

    //Lưu ý phần này
    @Override
    public void save(Stock stock) {
        System.out.println(INSERT_STOCKS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STOCKS_SQL)) {
            preparedStatement.setString(1, stock.getName());
            preparedStatement.setString(2, stock.getAddress());
            preparedStatement.setString(3, stock.getPhoneNumber());
            preparedStatement.setString(4, stock.getDeleteBy());
            preparedStatement.setString(5, stock.getDeleteDate());
            preparedStatement.setString(6, stock.getModifyBy());
            preparedStatement.setString(7, stock.getModifyDate());
            preparedStatement.setString(8, stock.getCreatBy());
            preparedStatement.setString(9, stock.getCreatDate());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public Stock findById(int idStock) {
        Stock stock = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_STOCKS_BY_ID_STOCK)) {
            preparedStatement.setInt(1, idStock);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name = rs.getString("Name");
                String address = rs.getString("Address");
                String phoneNumber = rs.getString("Phone Number");
                String deleteBy = rs.getString("Delete By");
                String deleteDate = rs.getString("Delete Date");
                String modifyBy = rs.getString("Modify By");
                String modifyDate = rs.getString("Modify Date");
                String createBy = rs.getString("Create By");
                String createDate = rs.getString("Create Date");
                stock = new Stock(idStock, name, address, phoneNumber,
                        deleteBy, deleteDate, modifyBy, modifyDate, createBy, createDate);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return stock;
    }

    //Lưu ý phần này
    @Override
    public void update(int idStock, Stock stock) {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_STOCKS_SQL)) {
            statement.setInt(1, stock.getIdStock());
            statement.setString(2, stock.getName());
            statement.setString(3, stock.getAddress());
            statement.setString(4, stock.getPhoneNumber());
            statement.setString(5, stock.getDeleteBy());
            statement.setString(6, stock.getDeleteDate());
            statement.setString(7, stock.getModifyBy());
            statement.setString(8, stock.getModifyDate());
            statement.setString(9, stock.getCreatBy());
            statement.setString(10, stock.getCreatDate());
            rowUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            printSQLException(e);
        }
        //return rowUpdated;
    }

    @Override
    public void remove(int idStock) {
        {
            try (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement(DELETE_STOCKS_SQL)) {
                statement.setInt(1, idStock);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
