/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iscalendar;

import calendar_ex.*;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JTable;

/**
 *
 * @author 1003646s
 * @co-author 1003019j
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        MonthTab.setShowVerticalLines(true);
        //setWeekDisplay();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXMonthView2 = new org.jdesktop.swingx.JXMonthView();
        eventText = new javax.swing.JTextField();
        addEventButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        MonthTab = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        WeekTab = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        DayTab = new javax.swing.JTable();
        currentLabel = new javax.swing.JLabel();
        RightButton = new javax.swing.JButton();
        LeftButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListEvents = new javax.swing.JList();
        EventLabel = new javax.swing.JLabel();
        jXMonthView1 = new org.jdesktop.swingx.JXMonthView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addEventButton.setText("Add Event");
        addEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEventButtonActionPerformed(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        MonthTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "", ""},
                {null, null, null, null, null, null, ""},
                {"", null, null, null, null, null, ""},
                {"", null, null, null, null, null, ""},
                {"", null, null, null, null, null, ""},
                {"", "", "", "", "", "", ""}
            },
            new String [] {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        ));
        MonthTab.setColumnSelectionAllowed(true);
        MonthTab.setRowHeight(134);
        jScrollPane1.setViewportView(MonthTab);
        MonthTab.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTabbedPane1.addTab("Month View", jScrollPane1);

        WeekTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"DATE>>", null, null, null, null, null, null, null},
                {"00:00", null, null, null, null, null, null, null},
                {"01:00", null, null, null, null, null, null, null},
                {"02:00", null, null, null, null, null, null, null},
                {"03:00", null, null, null, null, null, null, null},
                {"04:00", null, null, null, null, null, null, null},
                {"05:00", null, null, null, null, null, null, null},
                {"06:00", null, null, null, null, null, null, null},
                {"07:00", null, null, null, null, null, null, null},
                {"08:00", null, null, null, null, null, null, null},
                {"09:00", null, null, null, null, null, null, null},
                {"10:00", null, null, null, null, null, null, null},
                {"11:00", null, null, null, null, null, null, null},
                {"12:00", null, null, null, null, null, null, null},
                {"13:00", null, null, null, null, null, null, null},
                {"14:00", null, null, null, null, null, null, null},
                {"15:00", null, null, null, null, null, null, null},
                {"16:00", null, null, null, null, null, null, null},
                {"17:00", null, null, null, null, null, null, null},
                {"18:00", null, null, null, null, null, null, null},
                {"19:00", null, null, null, null, null, null, null},
                {"20:00", null, null, null, null, null, null, null},
                {"21:00", null, null, null, null, null, null, null},
                {"22:00", null, null, null, null, null, null, null},
                {"23:00", null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        ));
        WeekTab.setRowHeight(55);
        jScrollPane2.setViewportView(WeekTab);

        jTabbedPane1.addTab("Week View", jScrollPane2);

        DayTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"00:00", ""},
                {"01:00", null},
                {"02:00", null},
                {"03:00", null},
                {"04:00", null},
                {"05:00", null},
                {"06:00", null},
                {"07:00", null},
                {"08:00", null},
                {"09:00", null},
                {"10:00", null},
                {"11:00", null},
                {"12:00", null},
                {"13:00", null},
                {"14:00", null},
                {"15:00", null},
                {"16:00", null},
                {"17:00", null},
                {"18:00", null},
                {"19:00", null},
                {"20:00", null},
                {"21:00", null},
                {"22:00", null},
                {"23:00", null}
            },
            new String [] {
                "Time", "*Date*"
            }
        ));
        DayTab.setRowHeight(55);
        jScrollPane3.setViewportView(DayTab);
        DayTab.getColumnModel().getColumn(0).setMaxWidth(300);

        jTabbedPane1.addTab("Day View", jScrollPane3);

        currentLabel.setText("currentLabel");

        RightButton.setText(">>");
        RightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightButtonActionPerformed(evt);
            }
        });

        LeftButton.setText("<<");
        LeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftButtonActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(ListEvents);

        EventLabel.setText("Upcoming Events");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jXMonthView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXMonthView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(EventLabel)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eventText, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(addEventButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(LeftButton)
                        .addGap(18, 18, 18)
                        .addComponent(currentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RightButton))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentLabel)
                    .addComponent(RightButton)
                    .addComponent(LeftButton))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jXMonthView2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jXMonthView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(eventText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addEventButton)
                        .addGap(286, 286, 286)
                        .addComponent(EventLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        currentLabel.setText("October");
        int k=0;
        for (int i=0;i<6;i++) {
            for (int monthTracker=0;monthTracker<7;monthTracker++) {
                if (k>=5 && k< 36){
                    getMonthTab().getModel().setValueAt(k-4, i, monthTracker);
                }

                k++;
            }
        }
        if (WeekTab.hasFocus()){
            weekNumber=0;
            String val = ""+MonthTab.getModel().getValueAt(weekNumber, 0);
            val = ""+MonthTab.getModel().getValueAt(weekNumber, 0);
            if(val.equals("")){
                weekNumber++;
                val = ""+MonthTab.getModel().getValueAt(weekNumber, 0);
            }
            String start = val+"/"+(((monthTracker+9)%12)+1);
            currentLabel.setText("Week commencing " + start);
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEventButtonActionPerformed
        afe = new AddFullEvent();
        afe.setNameInputBox(eventText.getText());
        afe.setVisible(true);
        afe.setFrame(this);


    }//GEN-LAST:event_addEventButtonActionPerformed
    AddFullEvent afe;
    int monthTracker = 0; //is month tracker
    int weekTracker = 0; // is week tracker 
    int weekNumber = 0; //is week no in month
    LinkedList<Aptment> apts = new LinkedList<Aptment>();

    private void RightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightButtonActionPerformed
        for (int c = 1; c<7; c++){
            for (int j = 1; j<24; j++){
                WeekTab.setValueAt("", j, c);
            }
            
        }


        if (MonthTab.isShowing()) {
            monthTracker++;
            changeMonth(monthTracker);
            refreshApts(monthTracker);

            //System.out.println(j);
            //System.out.println(apts[0].month);
        } else if (WeekTab.isShowing()) {
            //note this only works for OUR specified time period.
            //This WILL NOT WORK should you get a monday on the first of the month.
            //I think to do this youd need to just double check if val is ""
            //and do f++ at the end of the method 
            
            weekTracker++;
            weekNumber++;
            String val = "" + MonthTab.getModel().getValueAt(weekNumber, 0);

            String start = val + "of" + currentLabel.getText();
            for (int c = 0; c < 7; c++) {
                    String dayData = MonthTab.getModel().getValueAt(weekNumber, c).toString();
                        Scanner boxInfo = new Scanner(dayData);
                        if (boxInfo.hasNextInt()) {
                    WeekTab.getModel().setValueAt(boxInfo.nextInt(), 0, c + 1);}
                }
            if ((weekTracker) == 1) {
                start = "26/9";
                weekNumber = 0;
            } else {
                if (weekNumber == 5) {
                    // String val = ""+MonthTab.getModel().getValueAt(f, 0);
                    val = "" + MonthTab.getModel().getValueAt(weekNumber, 0);
                    if (val.equals("")) {
                        weekNumber = 1;
                        monthTracker++;
                        changeMonth(monthTracker);
                        //MonthTab.setVisible(true);
                        val = "" + MonthTab.getModel().getValueAt(weekNumber, 0);

                    }
                    for (int c = 0; c < 7; c++) {
                    String dayData = MonthTab.getModel().getValueAt(weekNumber, c).toString();
                        Scanner boxInfo = new Scanner(dayData);
                        if (boxInfo.hasNextInt()) {
                    WeekTab.getModel().setValueAt(boxInfo.nextInt(), 0, c + 1);}
                }

                }

            }
            start = val + "/" + (((monthTracker + 9) % 12) + 1);
            if (weekNumber == 5) {
                weekNumber = 0;
                monthTracker++;
                changeMonth(monthTracker);

            }

            currentLabel.setText("Week commencing " + start);
             refreshWeekApts(monthTracker);
        }
        int tempDay = 1;
        for (int c = 0; c < 7; c++) {
            if (WeekTab.getModel().getValueAt(0, c + 1).toString().equals("")) {
                WeekTab.getModel().setValueAt(tempDay, 0, c + 1);
                tempDay++;
            }
             refreshWeekApts(monthTracker+1);
        }



    }//GEN-LAST:event_RightButtonActionPerformed

    private void LeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftButtonActionPerformed
        for (int c = 1; c<7; c++){
            for (int j = 1; j<24; j++){
                WeekTab.setValueAt("", j, c);
            }
            
        }
        if (MonthTab.isShowing()) {
            monthTracker--;
            changeMonth(monthTracker);
            refreshApts(monthTracker);
        } else if (WeekTab.isShowing()) {
            
            weekTracker--;
            weekNumber--;
            String val = "" + MonthTab.getModel().getValueAt(weekNumber, 0);

            String start = val + "of" + currentLabel.getText();
            if ((weekTracker) <= 0 || currentLabel.getText().toString().equals("Week commencing 26/9")) {
                start = "26/9";
                weekNumber = 0;
                weekTracker = 0;
                currentLabel.setText("Week commencing " + start);
                for (int c = 0; c < 7; c++) {
                    String dayData = MonthTab.getModel().getValueAt(weekNumber, c).toString();
                        Scanner boxInfo = new Scanner(dayData);
                        if (boxInfo.hasNextInt()) {
                    WeekTab.getModel().setValueAt(boxInfo.nextInt(), 0, c + 1);}
                }
            } else {

                for (int c = 0; c < 7; c++) {
                    String dayData = MonthTab.getModel().getValueAt(weekNumber, c).toString();
                        Scanner boxInfo = new Scanner(dayData);
                        if (boxInfo.hasNextInt()) {
                    WeekTab.getModel().setValueAt(boxInfo.nextInt(), 0, c + 1);}
                }
                while (val.equals("")) {

                    //
                    if (weekNumber == 0) {
                        weekNumber = 5;
                        monthTracker--;
                        changeMonth(monthTracker);
                        //MonthTab.setVisible(true);
                        val = "" + MonthTab.getModel().getValueAt(weekNumber, 0);
                    } else {
                        weekNumber--;
                        val = "" + MonthTab.getModel().getValueAt(weekNumber, 0);
                    }

                }




                start = val + "/" + (((monthTracker + 9) % 12) + 1);
                if (weekNumber == 0) {
                    weekNumber = 5;
                    monthTracker--;
                    changeMonth(monthTracker);
                }
                currentLabel.setText("Week commencing " + start);
                for (int c = 0; c < 7; c++) {
                    String dayData = MonthTab.getModel().getValueAt(weekNumber, c).toString();
                        Scanner boxInfo = new Scanner(dayData);
                        if (boxInfo.hasNextInt()) {
                    WeekTab.getModel().setValueAt(boxInfo.nextInt(), 0, c + 1);}
                }

            }
            refreshWeekApts(monthTracker);
        }
        int tempDay = 1;
        for (int c = 0; c < 7; c++) {
            if (WeekTab.getModel().getValueAt(0, c + 1).toString().equals("")) {
                WeekTab.getModel().setValueAt(tempDay, 0, c + 1);
                tempDay++;
            }
        }
       //
        refreshWeekApts(monthTracker+1);
    }//GEN-LAST:event_LeftButtonActionPerformed

    //listen for a tab change, perform appopriate update to display
    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        //  System.out.println("Here");
        if (MonthTab.isShowing()) {
            changeMonth(monthTracker);
            refreshApts(monthTracker);

            //refreshApts(monthTracker);
        } else if (WeekTab.isShowing()) {
            setWeekDisplay();
            refreshWeekApts(monthTracker);

        }

    }//GEN-LAST:event_jTabbedPane1StateChanged

    //sets the week display. Just a slight change on the code 
    //already in the button handler, so FIX ME TO WORK GOOD.
    private void setWeekDisplay() {
        weekNumber = 0;
        String val;
        val = "" + MonthTab.getModel().getValueAt(weekNumber, 0);
        if (val.equals("")) {
            weekNumber++;
            val = "" + MonthTab.getModel().getValueAt(weekNumber, 0);
        }
        String start = val + "/" + (((monthTracker + 9) % 12) + 1);

        currentLabel.setText("Week commencing " + start);
        for (int c = 0; c < 7; c++) {
                    String dayData = MonthTab.getModel().getValueAt(weekNumber, c).toString();
                        Scanner boxInfo = new Scanner(dayData);
                        if (boxInfo.hasNextInt()) {
                            
                    WeekTab.getModel().setValueAt(boxInfo.nextInt(), 0, c + 1);}
                }

    }

    public void refreshApts(int monthTracker) {
        for (int i = 0; i < 6; i++) {
            for (int b = 0; b < 7; b++) {

                getMonthTab().getModel().setValueAt("", i, b);



            }
        }
        changeMonth(monthTracker);

        apts.add(afe.getAptments());
        for (int i = 0; i < apts.size(); i++) {

            if (apts.get(i).month == monthTracker) {

                for (int z = 0; z < 6; z++) {

                    for (int b = 0; b < 7; b++) {

                        String dayData = MonthTab.getModel().getValueAt(z, b).toString();
                        Scanner boxInfo = new Scanner(dayData);
                        if (boxInfo.hasNextInt()) {

                            int boxDay = boxInfo.nextInt();
                            String currentData = getMonthTab().getModel().getValueAt(z, b).toString();
                            if (boxDay == apts.get(i).day) {
                                getMonthTab().getModel().setValueAt(currentData + " " + apts.get(i).title, z, b);

                            }
                        }
                    }
                }

            }
        }
    }

    public void refreshWeekApts(int monthTracker) {
      
        
        apts.add(afe.getAptments());
        
        //refreshApts(monthTracker);
        for (int count=0; count<apts.size();count++) {
            for (int c = 0; c < 7; c++) {
                if (Integer.parseInt(WeekTab.getModel().getValueAt(0, c + 1).toString())==apts.get(count).day) {
                    if (apts.get(count).month == monthTracker){
                        System.out.println("TICL");
                        WeekTab.getModel().setValueAt(apts.get(count).title, apts.get(count).shour+1, c+1);         
                    }  
            }
        }
        }
    }
    
    public void refreshEventBox(){
        
        String[] events = new String[apts.size()];
        int i = 0;
        for(Aptment a: apts)
            if(a != null){
                events[i] = a.day + "/" + (a.month + 10)%12 + " " + a.getTitle();i++;
            }
        ListEvents.setListData(events);
    }

    private void changeMonth(int monthTracker) {
        int dayTracker = 0;
        for (int i = 0; i < 6; i++) {
            for (int b = 0; b < 7; b++) {

                getMonthTab().getModel().setValueAt("", i, b);


                dayTracker++;
            }
        }
        if (monthTracker % 12 == 3) {
            currentLabel.setText("January");
            weekTracker = 18;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {

                    if (dayTracker >= 6 && dayTracker < 37) {
                        getMonthTab().getModel().setValueAt(dayTracker - 5, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 4) {
            currentLabel.setText("February");
            weekTracker = 22;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 2 && dayTracker < 31) {
                        getMonthTab().getModel().setValueAt(dayTracker - 1, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 5) {
            currentLabel.setText("March");
            weekTracker = 26;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 3 && dayTracker < 34) {
                        getMonthTab().getModel().setValueAt(dayTracker - 2, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 6) {
            currentLabel.setText("April");
            weekTracker = 31;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 6 && dayTracker < 36) {
                        getMonthTab().getModel().setValueAt(dayTracker - 5, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 7) {
            currentLabel.setText("May");
            weekTracker = 35;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 1 && dayTracker < 32) {
                        getMonthTab().getModel().setValueAt(dayTracker, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 8) {
            currentLabel.setText("June");
            weekTracker = 39;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 4 && dayTracker < 34) {
                        getMonthTab().getModel().setValueAt(dayTracker - 3, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 9) {
            currentLabel.setText("July");
            weekTracker = 44;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 6 && dayTracker < 37) {
                        getMonthTab().getModel().setValueAt(dayTracker - 5, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 10) {
            currentLabel.setText("August");
            weekTracker = 48;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 2 && dayTracker < 33) {
                        getMonthTab().getModel().setValueAt(dayTracker - 1, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 11) {
            currentLabel.setText("September");
            weekTracker = 52;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 5 && dayTracker < 35) {
                        getMonthTab().getModel().setValueAt(dayTracker - 4, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 0) {
            currentLabel.setText("October");
            weekTracker = 5;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 5 && dayTracker < 36) {
                        getMonthTab().getModel().setValueAt(dayTracker - 4, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 1) {
            currentLabel.setText("November");
            weekTracker = 9;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 1 && dayTracker < 31) {
                        getMonthTab().getModel().setValueAt(dayTracker, i, b);
                    }

                    dayTracker++;
                }
            }
        } else if (monthTracker % 12 == 2) {
            currentLabel.setText("December");
            weekTracker = 13;
            dayTracker = 0;
            for (int i = 0; i < 6; i++) {
                for (int b = 0; b < 7; b++) {
                    if (dayTracker >= 3 && dayTracker < 34) {
                        getMonthTab().getModel().setValueAt(dayTracker - 2, i, b);
                    }

                    dayTracker++;
                }
            }
        }
    }
    static AddFullEvent FE;
    static CalendarEx cx;
    static CalendarDate cd;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], CalendarEx c) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        cx = c;

        /* Create and display the form */
        FE = new AddFullEvent();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });



    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DayTab;
    private javax.swing.JLabel EventLabel;
    private javax.swing.JButton LeftButton;
    private javax.swing.JList ListEvents;
    private javax.swing.JTable MonthTab;
    private javax.swing.JButton RightButton;
    private javax.swing.JTable WeekTab;
    private javax.swing.JButton addEventButton;
    private javax.swing.JLabel currentLabel;
    private javax.swing.JTextField eventText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.jdesktop.swingx.JXMonthView jXMonthView1;
    private org.jdesktop.swingx.JXMonthView jXMonthView2;
    // End of variables declaration//GEN-END:variables

    JTable getMonthTab() {
        return MonthTab;
    }

    public int getJ() {
        return monthTracker;
    }
}
