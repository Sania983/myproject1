import java.sql.*;

public class EmployeeData {
    public static void main(String[] args) throws SQLException {

        //step1: load the driver
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //step2: Create connection with database
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","Sania1234&");

        if(connection!=null){
            System.out.println("Connection successful");
        }
        else
            System.out.println("Some problem in sql Connection");

        //step3:Create statement to execute sql query

        Statement statement=connection.createStatement();
        //step4:execute sql query
        ResultSet resultSet = statement.executeQuery("select * from employee");
        while(resultSet.next()) {
            //ResultSet column index starts 1 to n
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getFloat(3));  //we can either use column number or column name

            //resultSet.next();
            //System.out.println(resultSet.getInt("id")+"\t"+resultSet.getString("name")+"\t" +resultSet.getFloat("salary"));
        }


    }
}
/*
ResultSet
          pointer
                beforeFirst -- default pointer position
                first 1
                2
                3
                last
 */