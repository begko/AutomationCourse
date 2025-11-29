package dataBaseConnection;
import org.jdbi.v3.core.Jdbi;

public class RemotePostgresPrepared {
    public static void main(String[] args) {
        // 1- Remote MySQL database connection details
        String url = "jdbc:mysql://remotedatabase-begko.g.aivencloud.com:16121/defaultdb?useSSL=true";
        String user = "avnadmin";
        String pass = "AVNS_gHYKyNBZJ_bAnGJssWh";

        Jdbi jdbi = Jdbi.create(url, user, pass);

        // 2- Connect to remote MySQL using JDBI
        System.out.println("Connection object created successfully!");

        // 3- Create table staff
        jdbi.useHandle(handle -> {
            handle.execute("CREATE TABLE IF NOT EXISTS ad_soyad (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "surname VARCHAR(50))");
            System.out.println("Table ad_soyad created successfully!");
        });

        // 4- Insert records into 'ad_soyad'
        jdbi.useHandle(handle -> {
            handle.execute("INSERT INTO ad_soyad (name, surname) VALUES (?, ?)", "Ali", "Kara");
            handle.execute("INSERT INTO ad_soyad (name, surname) VALUES (?, ?)", "Ahmet", "Deniz");
            System.out.println("2 records inserted successfully!");
        });

        // 5- Update a record
        jdbi.useHandle(handle -> {
            handle.execute("UPDATE ad_soyad SET surname = ? WHERE name = ?", "Demirci", "Ali"); // Change Ali's surname from "Kara" to "Demirci"
            System.out.println("Record updated successfully!");
        });

        // 5- Delete a record
        jdbi.useHandle(handle -> {
            handle.execute("DELETE FROM ad_soyad WHERE name = ? AND surname = ?", "Ahmet", "Deniz"); // Delete Ahmet Deniz from the table
            System.out.println("Record deleted successfully!");
        });
    }
}
