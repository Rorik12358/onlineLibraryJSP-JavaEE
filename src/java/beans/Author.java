/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Calendar;

/**
 *
 * @author R2-D2
 */
public class Author {
    private long id;
    private String name;
    Calendar birthDay;
    
    public Calendar getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(Calendar birthDay) {
        this.birthDay = birthDay;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
}
