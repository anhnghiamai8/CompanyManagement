/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author anhng
 */
public class IDGenerate_Modify {
      public static int getID() {
        ID_Generate idGenerate = new ID_Generate();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser", "root", "");
            String sql = "select * from id_generate";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                ID_Generate idg = new ID_Generate(resultSet.getInt("ID")
                        
                    );
               idGenerate=idg;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDGenerate_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(IDGenerate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(IDGenerate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return idGenerate.getId();
    }
     
    public static void update(int ID) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser", "root", "");
            String sql = "update id_generate set ID=?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, ID);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(IDGenerate_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(IDGenerate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(IDGenerate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
