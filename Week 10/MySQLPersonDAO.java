import java.sql.*;

/**
 * File     : MySQLPersonDAO.java
 * Deskripsi: Implementasi PersonDAO untuk MySQL
 */
public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi, nama database, user, dan password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/pbo", "root", "");

        // Kerjakan MySQL query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Tutup koneksi database
        con.close();
    }
}
