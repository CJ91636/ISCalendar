/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iscalendar;

import java.util.Date;

/**
 *
 * @author 1003019j
 */
public class Aptment {
    String title;
    int month;
    int day;
    int shour;
    int smin;
    int endmonth;
    int endday;
    int endhour;
    int endmin;
    int category;
    boolean rec;
    int p1;
    int p2;
    int month[12] = [31, 30, 31, 31, 29, 31, 30, 31, 30, 31, 31, 30];
    
    
    Date startDate;
    Date endDate;
    
    public Aptment(String name, int jmonth, int jday, int jhour1, int jmin1, int jmonth2, int jday2, int jhour2, int jmin2, boolean r, int o1, int o2){
        this.title = name;
        this.month = jmonth;
        this.day=jday;
        this.shour = jhour1;
        this.smin=jmin1;
        this.endmonth=jmonth2;
        this.endday=jday2;
        this.endhour=jhour2;
        this.endmin=jmin2;
        this.rec = r;
        this.p1=o1;
        this.p2=o2;
    }
    
    public String getTitle(){
        return title;
    }
    
}
