/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iscalendar;

/**
 *
 * @author 1003019j
 */
public class Aptment {
    String title;
    int month;
    int day;
    
    public Aptment(String name, int jmonth, int jday){
        this.title = name;
        this.month = jmonth;
        this.day=jday;
    }
    
    public String getTitle(){
        return title;
    }
    
}
