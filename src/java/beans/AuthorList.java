/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import db.DataBase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author R2-D2
 */
public class AuthorList {
    private List<Author> authorList = new ArrayList<>();
    
    private void loadAuthors(){
        Connection connection = null;
        try{
            connection = DataBase.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM AUTHOR ORDER BY FIO");
            while(resultSet.next()){
                Author author = new Author();
                Calendar birthDay = Calendar.getInstance();
                birthDay.setTimeInMillis(resultSet.getDate("birthday").getTime());
                author.setBirthDay(birthDay);
                author.setName(resultSet.getString("fio"));
                author.setId(resultSet.getLong("id"));
                authorList.add(author);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public List<Author> getAuthorList(){
        if(authorList.isEmpty()){
            loadAuthors();
        }
        return authorList;
    }
}
