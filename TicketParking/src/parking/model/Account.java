package parking.model;

import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Account {

    private int id;
    private String username;
    private String password;
    private String email;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Account() {
        this.id = 0;
        this.username = null;
        this.password = null;
        this.email = null;
        this.created_at = null;
        this.updated_at = null;
    }

    // Getter and Setter methods...
    public Account(int id, String username, String password, String email, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public void insertData() {
        try (PreparedStatement sql = MyModel.conn.prepareStatement("INSERT INTO account(username, password, email) VALUES(?, ?, ?)")) {
            sql.setString(1, this.username);
            sql.setString(2, this.password);
            sql.setString(3, this.email);
            sql.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error in insertData: " + e.getMessage());
        }
    }

    public void updateData() {
        try (PreparedStatement sql = MyModel.conn.prepareStatement("UPDATE account SET username = ?, password = ?, email = ?, updated_at = ? WHERE id = ?")) {
            sql.setString(1, this.username);
            sql.setString(2, this.password);
            sql.setString(3, this.email);
            sql.setTimestamp(4, this.updated_at);
            sql.setInt(5, this.id);
            sql.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error in updateData: " + e.getMessage());
        }
    }

    public void deleteData() {
        try (PreparedStatement sql = MyModel.conn.prepareStatement("DELETE FROM account WHERE id = ?")) {
            sql.setInt(1, this.id);
            sql.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error in deleteData: " + e.getMessage());
        }
    }

    public ArrayList<Object> viewListData() {
        ArrayList<Object> collections = new ArrayList<>();
        try (Statement statement = MyModel.conn.createStatement(); ResultSet result = statement.executeQuery("SELECT * FROM account")) {
            while (result.next()) {
                Account acc = new Account(
                        result.getInt("id"),
                        result.getString("username"),
                        result.getString("password"),
                        result.getString("email"),
                        result.getTimestamp("created_at"),
                        result.getTimestamp("updated_at")
                );
                collections.add(acc);
            }
        } catch (SQLException e) {
            System.out.println("Error in viewListData: " + e.getMessage());
        }
        return collections;
    }
}
