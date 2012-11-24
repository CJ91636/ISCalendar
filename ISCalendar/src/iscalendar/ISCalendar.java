/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iscalendar;
import calendar_ex.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author 1002253w
 * @helper 1003019j
 */
public class ISCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalendarEx thisCalendar = new CalendarEx();
        MainFrame MF = new MainFrame();
        MF.main(args, thisCalendar);
        // TODO code application logic here
     
          for (int i=0;i<5;i++) {
    for (int j=0;j<5;j++) {
        MF.getMonthTab().getModel().setValueAt("e", i, j);
        
    }
        } 
    }
}
