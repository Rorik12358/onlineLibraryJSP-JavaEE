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
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author R2-D2
 */
public class GenreList {
    private List<Genre> genreList = new ArrayList<>();
    private void loadGenres(){
        Connection connection = null;
        try{
            connection = DataBase.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM library.genre ORDER BY NAME");
            while(resultset.next()){
                Genre genre = new Genre();
                genre.setName(resultset.getString("name"));
                genre.setId(resultset.getLong("id"));
                genreList.add(genre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GenreList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Genre> getGenreList(){
        if(genreList.isEmpty()){
            loadGenres();
        }
        return genreList;
    }
}
