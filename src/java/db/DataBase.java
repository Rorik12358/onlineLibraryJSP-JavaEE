/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author R2-D2
 */
public class DataBase {

    private static InitialContext initialContext;
    private static DataSource dataSource;
    private static Connection connection;

    public static Connection getConnection() {
        try {
            initialContext = new InitialContext();
            dataSource = (DataSource) initialContext.lookup("jdbc/library");
            if(connection==null){
                connection = dataSource.getConnection();
            }
        } catch (NamingException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

}
