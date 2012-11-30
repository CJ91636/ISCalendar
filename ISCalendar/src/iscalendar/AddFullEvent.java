/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iscalendar;
import calendar_ex.*;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author 1002253w
 */
public class AddFullEvent extends javax.swing.JFrame {
    Aptment b;
    MainFrame mf;
    boolean addEvent = false;
    boolean recurring = false; 
    int op1;
    int op2;
    /**
     * Creates new form AddFullEvent
     */
    public AddFullEvent() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        NameInputBox = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        startDateDay = new javax.swing.JSpinner();
        endDateDay = new javax.swing.JSpinner();
        checkRecurring = new javax.swing.JCheckBox();
        buttonConfirm = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        recurringChoice = new javax.swing.JComboBox();
        durationRecurrance = new javax.swing.JComboBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameInputBox.setText(NameInput);
        NameInputBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputBoxActionPerformed(evt);
            }
        });

        NameLabel.setText("Name of Event:");

        TitleLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        TitleLabel.setText("Add/Edit Event");

        startLabel.setText("Start:");

        endLabel.setText("End:");

        startDateDay.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1317423600000L), new java.util.Date(1317423600000L), new java.util.Date(1349045940000L), java.util.Calendar.MINUTE));

        endDateDay.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1317423600000L), new java.util.Date(1317423600000L), new java.util.Date(1349045940000L), java.util.Calendar.MINUTE));

        checkRecurring.setText("Recurring");

        buttonConfirm.setText("Confirm");
        buttonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        recurringChoice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daily", "Weekly", "Two Weeks", "Four Weeks" }));
        recurringChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recurringChoiceActionPerformed(evt);
            }
        });

        durationRecurrance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Month", "2 Months", "3 Months", "4 Months" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(TitleLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(startLabel)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(startDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(endLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(endDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(buttonConfirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonCancel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkRecurring)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(recurringChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(durationRecurrance, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startLabel)
                    .addComponent(endLabel)
                    .addComponent(endDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkRecurring)
                    .addComponent(recurringChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationRecurrance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonConfirm))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameInputBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInputBoxActionPerformed

    private void buttonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmActionPerformed
        addEvent = true;
        boolean isRecurring = checkRecurring.isSelected();
        int rec = 0;
        if(isRecurring){
            rec = recurringChoice.getSelectedIndex()+1;
        }
        boolean isAllDay = false;
        //boolean isAllDay = checkAllDay.isSelected();
        Date startDate = (Date) startDateDay.getValue();
        int startMin = startDate.getMinutes();
        int startHour = startDate.getHours();
        int startDay = startDate.getDay();
        int startMonth = startDate.getMonth();
        int startYear = startDate.getYear();
        
        Date endDate = (Date) endDateDay.getValue();
        int endMin = endDate.getMinutes();
        int endHour = endDate.getHours();
        int endDay = endDate.getDay();
        int endMonth = endDate.getMonth();
        int endYear = endDate.getYear();
        String loc = null;
        
        CalendarTime calStartTime = new CalendarTime(startMin, startHour);
        CalendarDate calStartDate = new CalendarDate(startDay,startMonth,startYear);
        CalendarTime calEndTime = new CalendarTime(endMin, endHour);
        CalendarDate calEndDate = new CalendarDate(endDay, endMonth, endYear);
        
        String name = NameInputBox.getText();
        
        Appointment ap = new Appointment(calStartDate,calEndDate,calStartTime,calEndTime,
                name, isAllDay,rec, loc);
        
       op1 = recurringChoice.getSelectedIndex();
            op2 = durationRecurrance.getSelectedIndex();
       recurring = checkRecurring.isEnabled();
       //System.out.println(name);
        b = new Aptment(name, (startMonth+3)%12, startDate.getDate(), startHour, startMin, (endMonth+3)%12, endDate.getDate(), endHour, endMin, recurring, op1, op2);
        b.startDate = startDate;
        b.endDate = endDate;
       /**if (recurring){
            op1 = recurringChoice.getSelectedIndex();
            op2 = durationRecurrance.getSelectedIndex();
            
            if (op1 == 0){
                if(op2 == 0){
                    for(int daycount = b.startDate.getDate(); daycount < 31; daycount ++){
                        Aptment c = new Aptment(name, (startMonth+3)%12, (startDate.getDate() + 1), startHour, startMin, (endMonth+3)%12, endDate.getDate(), endHour, endMin);
                        mf.refreshApts(mf.getJ());
                    }
                }
            }
            
        }*/
        
        mf.refreshApts(mf.getJ());
        

        mf.refreshEventBox();
        this.setVisible(false);
        addEvent = false;
        b=null;
    }//GEN-LAST:event_buttonConfirmActionPerformed

    public void setFrame(MainFrame m){
        mf = m;
    }
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        NameInput = null;
        mf.refreshApts(mf.getJ());
        this.setVisible(false);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void recurringChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recurringChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recurringChoiceActionPerformed
    
    public void editOptions(Aptment a){
        addEvent = true;
        /*boolean isRecurring = checkRecurring.isSelected();
        int rec = 0;
        if(isRecurring){
            rec = recurringChoice.getSelectedIndex()+1;
        }*/
        //boolean isAllDay = checkAllDay.isSelected();
        //Date startDate = (Date) startDateDay.getValue();
        NameInputBox.setText(a.getTitle());
        startDateDay.setValue(a.startDate);
        
        //Date endDate = (Date) endDateDay.getValue();
        endDateDay.setValue(a.endDate);
        buttonCancel.setEnabled(false);
    }
    
    public Aptment getAptments(){
       // System.out.println(b.getTitle());
        return b;
    }
    /**
     * @param args the command line arguments
     */
    static String NameInput;
    static CalendarEx Calendar;
    public static void main(String args[],CalendarEx c) {
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
            java.util.logging.Logger.getLogger(AddFullEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFullEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFullEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFullEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        NameInput = args[0];
        Calendar = c;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFullEvent().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameInputBox;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonConfirm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkRecurring;
    private javax.swing.JComboBox durationRecurrance;
    private javax.swing.JSpinner endDateDay;
    private javax.swing.JLabel endLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox recurringChoice;
    private javax.swing.JSpinner startDateDay;
    private javax.swing.JLabel startLabel;
    // End of variables declaration//GEN-END:variables

    void setNameInputBox(String name) {
        NameInputBox.setText(name);
    }
}
