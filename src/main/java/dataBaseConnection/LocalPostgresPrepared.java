package dataBaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LocalPostgresPrepared {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "12345";

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            if (connection != null){
                System.out.println("Database connection is succeeded!");
                //1- This code prepares and executes an SQL statement to create the ad_soyad table in the database
                String create = "CREATE TABLE IF NOT EXISTS ad_soyad (id SERIAL PRIMARY KEY, name VARCHAR(50), surname VARCHAR(50))";
                PreparedStatement psCreate = connection.prepareStatement(create);
                psCreate.execute();

                //2- Insert records
                String insertSQL = "INSERT INTO ad_soyad (name, surname) VALUES (?, ?)";
                PreparedStatement psInsert = connection.prepareStatement(insertSQL);

                //1st record
                psInsert.setString(1,"Cicek");
                psInsert.setString(2, "Sari");
                psInsert.executeUpdate();

                //2nd record
                psInsert.setString(1,"Aylin");
                psInsert.setString(2, "Solmaz");
                psInsert.executeUpdate();

                System.out.println("2 records inserted successfully!");

                //3- Update records
                String updateSQL = "UPDATE ad_soyad SET surname = ? WHERE name = ?";
                PreparedStatement psUpdate = connection.prepareStatement(updateSQL);

                //Update 2nd record
                psUpdate.setString(1, "Yilmaz"); //New surname
                psUpdate.setString(2,"Aylin"); // Person to update
                psUpdate.executeUpdate();

                System.out.println("1 records updated successfully!");

                //3- Delete records
                String deleteSQL = "DELETE FROM ad_soyad WHERE name = ? AND surname = ?";
                PreparedStatement psDelete= connection.prepareStatement(deleteSQL);

                //Delete 1st record
                psDelete.setString(1,"Cicek");
                psDelete.setString(2, "Sari");
                psDelete.executeUpdate();

                System.out.println("1 records deleted successfully!");

                connection.close();
            }

        } catch (SQLException e) {
            System.out.println("Connection error!" + e.getMessage());
        }
    }
}

