package service;

import model.Staff;
import model.Store;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffJDBCServiceImpl implements StaffService {

    private String jdbcURL = "jdbc:mysql://localhost:3306/inventory_management";
    private String jdbcUsername = "codegym";
    private String jdbcPassword = "codegym.123";

    private static final String INSERT_STALL_ALL = "INSERT INTO staff" + " ( name, gender , age, address, phoneNumber, deleteBy, deleteDate, modifyBY, modifyDate, creatBy, creatDate) VALUES "
            + " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_ALL_STAFFS = "SELECT idStaff, name, gender, age, address, phoneNumber,deleteBy," +
            "deleteDate,modifyBy,modifyDate,createBy,createDate FROM staff where isDelete = 0";
    private static final String SELECT_USER_BY_ID_STAFF = "SELECT idStaff, name, gender,age ,address, phoneNumber,deleteBy," +
            "deleteDate,modifyBy,modifyDate,createBy,createDate FROM staff where idStaff = ?";

    private static final String UPDATE_STAFF = "UPDATE staff SET name = ?, gender = ?, age = ?,address = ?, phoneNumber = ? ,modifyBy = ? where idStaff = ?;";
    private static final String DELETE_STAFF = "UPDATE staff set isDelete ='1',deleteBy = ? WHERE idStaff = ?;";

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
    public List<Staff> showAll() {
        List<Staff> staffs = new ArrayList<>();
        try (Connection connection = getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STAFFS)) {
                System.out.println(preparedStatement);
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    int idStaff = rs.getInt("idStaff");
                    String name = rs.getString("name");
                    String gender = rs.getString("gender");
                    int age = rs.getInt("age");
                    String address = rs.getString("address");
                    String PhoneNumber = rs.getString("phoneNumber");
                    String deleteBy = rs.getString("deleteBy");
                    String deleteDate = rs.getString("deleteDate");
                    String modifyBy = rs.getString("modifyBy");
                    String modifyDate = rs.getString("modifyDate");
                    String createBy = rs.getString("createBy");
                    String createDate = rs.getString("createDate");
                    staffs.add(new Staff(idStaff,name,gender, age, address, PhoneNumber, deleteBy, deleteDate, modifyBy
                            , modifyDate, createBy, createDate));
                }
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return staffs;
    }

    @Override
    public void save(Staff staff) {
        System.out.println(INSERT_STALL_ALL);
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STALL_ALL)) {
            preparedStatement.setString(1, staff.getName());
            preparedStatement.setString(2, staff.getGender());
            preparedStatement.setInt(3, staff.getAge());
            preparedStatement.setString(4, staff.getAddress());
            preparedStatement.setString(5, staff.getPhoneNumber());

            preparedStatement.setString(6,staff.getCreatBy());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public Staff findById(int idStaff) {
        Staff staff = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID_STAFF);) {
            preparedStatement.setInt(1, idStaff);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                String PhoneNumber = rs.getString("phoneNumber");
                String deleteBy = rs.getString("deleteBy");
                String deleteDate = rs.getString("deleteDate");
                String modifyBy = rs.getString("modifyBy");
                String modifyDate = rs.getString("modifyDate");
                String createBy = rs.getString("createBy");
                String createDate = rs.getString("createDate");
                staff = (new Staff(idStaff, name, gender, age, address,PhoneNumber, deleteBy, deleteDate, modifyBy , modifyDate, createBy, createDate));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return staff;
    }


    @Override
    public void update(int idStaff, Staff staff) {

        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_STAFF);) {
            statement.setString(1, staff.getName());
            statement.setString(2, staff.getGender());
            statement.setInt(3, staff.getAge());
            statement.setString(4, staff.getAddress());
            statement.setString(5, staff.getPhoneNumber());

            statement.setString(6, staff.getModifyBy());

            statement.setInt(7, staff.getIdStaff());
            rowUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public void remove(int idStaff) {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_STAFF);)
        {
            statement.setInt(2, idStaff);


            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
