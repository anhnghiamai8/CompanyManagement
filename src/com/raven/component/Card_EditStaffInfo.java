package com.raven.component;

import Login.EventCallBack;
import Login.EventTextField;
import Model.Academiclevel;
import Model.Academiclevel_Modify;
import Model.Department;
import Model.Department_Modify;
import Model.IDGenerate_Modify;
import Model.Role;
import Model.Role_Modify;
import com.raven.model.ModelCard;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import Model.Staff;
import Model.StaffModify;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Card_EditStaffInfo extends javax.swing.JPanel {
    private Staff stf;
    
    DefaultTableModel tableModel;
    
    List<Staff> staffList = new ArrayList<>();
    
    
    
    public Color getColorGradient() {
        return colorGradient;
    }

    public void setColorGradient(Color colorGradient) {
        this.colorGradient = colorGradient;
    }

    private Color colorGradient;

    public Card_EditStaffInfo() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(112, 69, 246));
        colorGradient = new Color(255, 255, 255);
        tableModel = (DefaultTableModel) table1.getModel();
        showStaff();
        showAcademiclevel();
        showDepartment();
        showRole();
        Search();
    }

    private void showStaff(){
        List<Staff> staffList = StaffModify.findAll();
        
        tableModel.setRowCount(0);
        
        staffList.forEach(staff -> {
            tableModel.addRow(new Object[] {staff.getId(), staff.getHoten(),
                staff.getGioitinh(), staff.getDiachithuongtru(),staff.getNoisinh(), staff.getTrinhdohocvan(),
                staff.getPhongban() } );
        });
    }
    
    public void setData(ModelCard data) {
        DecimalFormat df = new DecimalFormat("#,##0.##");
     
       
     
        
    }
      public void showAcademiclevel(){
         List<Academiclevel> academicList = Academiclevel_Modify.findAll();
         for(Academiclevel acl :academicList ){
             combobox_Academic.addItem(acl);
         }
    }
    
     public void showDepartment(){
         List<Department> departmentList = Department_Modify.findAll();
         for(Department dpt :departmentList){
             combobox_Department1.addItem(dpt);
         }
    }
     
      public void showRole(){
         List<Role> roleList = Role_Modify.findAll();
         for(Role rol :roleList){
             combobox_Role.addItem(rol);
         }
    }
      
      public void AcademicIndex(Staff stf){
              
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
       
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser", "root", "");
            String sql = "select * from level where AcademicName = ?";
            int AcademicId ;
            String AcademicName1=stf.getTrinhdohocvan();
            statement = connection.prepareStatement(sql);
            statement.setString(1, AcademicName1);
            resultSet = statement.executeQuery();
             System.out.print(AcademicName1);
            if (resultSet.next()) {
                
                AcademicId=resultSet.getInt("Academic_ID");
             
                combobox_Academic.setSelectedIndex(AcademicId-1);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffModify.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
      
       public void DepartmentIndex(Staff stf){
              
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
       
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser", "root", "");
            String sql = "select * from department where DepartmentName = ?";
            int DepartmentId ;
            String DepartmentName=stf.getPhongban();
            statement = connection.prepareStatement(sql);
            statement.setString(1, DepartmentName);
            resultSet = statement.executeQuery();
          
            if (resultSet.next()) {
                
                DepartmentId=resultSet.getInt("Department_ID");
                combobox_Department1.setSelectedIndex(DepartmentId-1);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffModify.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new com.raven.datechooser.DateChooser();
        Text_ID = new com.raven.swing.TextField();
        Text_Address = new com.raven.swing.TextField();
        Text_BirthDate = new com.raven.swing.TextField();
        Text_Name = new com.raven.swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        radioButtonCustom_MEN = new com.raven.swing.RadioButtonCustom();
        radioButtonCustom_WOMEN = new com.raven.swing.RadioButtonCustom();
        button_Edit = new com.raven.swing.ButtonGradient();
        Text_Birthplace = new com.raven.swing.TextField();
        combobox_Department1 = new com.raven.swing.Combobox<>();
        combobox_Academic = new com.raven.swing.Combobox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.table.Table();
        combobox_Role = new com.raven.swing.Combobox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        button_Submit = new com.raven.swing.ButtonGradient();
        SearchTextField = new Login.TextFieldAnimation();

        date.setForeground(new java.awt.Color(0, 153, 247));
        date.setTextRefernce(Text_BirthDate);

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Text_ID.setEditable(false);
        Text_ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Text_ID.setLabelText("ID");

        Text_Address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Text_Address.setLabelText("ADDRESS");

        Text_BirthDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Text_BirthDate.setLabelText("DAY OF BIRTH");

        Text_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Text_Name.setLabelText("NAME");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GENDER");

        radioButtonCustom_MEN.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonCustom_MEN.setText("MEN");
        radioButtonCustom_MEN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        radioButtonCustom_WOMEN.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonCustom_WOMEN.setText("WOMEN");
        radioButtonCustom_WOMEN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        button_Edit.setText("EDIT");
        button_Edit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EditActionPerformed(evt);
            }
        });

        Text_Birthplace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Text_Birthplace.setLabelText("BIRTH PLACE");

        combobox_Department1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox_Department1.setLabeText("DEPARTMENT");

        combobox_Academic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox_Academic.setLabeText("ACADEMIC BANCHELOR");

        jScrollPane1.setBorder(null);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "HỌ TÊN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table1);

        combobox_Role.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox_Role.setLabeText("ROLE");

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SKILL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(109, 109, 109))); // NOI18N
        jList1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        button_Submit.setText("SUBMIT");
        button_Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combobox_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combobox_Academic, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_Department1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonCustom_MEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonCustom_WOMEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_Birthplace, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(Text_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Text_BirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Text_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(button_Submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addContainerGap(553, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combobox_Academic, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combobox_Department1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Birthplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(radioButtonCustom_MEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButtonCustom_WOMEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(button_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(button_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(135, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SubmitActionPerformed
        // TODO add your handling code here:
        int row = table1.getSelectedRow();
        int stfId = Integer.valueOf(String.valueOf(table1.getValueAt(row, 0)));
        Staff stf = StaffModify.getStaffId(stfId);
        stf.setHoten(Text_Name.getText());
        stf.setDiachithuongtru(Text_Address.getText());
        stf.setNoisinh(Text_Birthplace.getText());
        stf.setNoisinh(Text_Name.getText());
        stf.setTrinhdohocvan(combobox_Academic.getSelectedItem().toString());
        stf.setPhongban(combobox_Department1.getSelectedItem().toString());
        StaffModify.update(stf);
        JOptionPane.showMessageDialog(Text_BirthDate, "Success Update");
        showStaff();
    }//GEN-LAST:event_button_SubmitActionPerformed

    private void button_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EditActionPerformed
        // TODO add your handling code here:
        int row = table1.getSelectedRow();
        int stfId = Integer.valueOf(String.valueOf(table1.getValueAt(row, 0)));
        Staff stf = StaffModify.getStaffId(stfId);
        Text_ID.setText(String.valueOf(stf.getId()));
        Text_Name.setText(String.valueOf(stf.getHoten()));
        Text_Address.setText(String.valueOf(stf.getDiachithuongtru()));
        Text_BirthDate.setText(String.valueOf(stf.getNgaysinh()));
        Text_Birthplace.setText(String.valueOf(stf.getNoisinh()));
        AcademicIndex(stf);
        DepartmentIndex(stf);
        String gender=stf.getGioitinh();
        if(gender.equalsIgnoreCase("nam")){
            radioButtonCustom_MEN.setSelected(true);
        } else{
            radioButtonCustom_WOMEN.setSelected(true);
        }
    }//GEN-LAST:event_button_EditActionPerformed

    private void Search(){
        SearchTextField.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
               String input = SearchTextField.getText();
        if (input != null && input.length() > 0){
            staffList = StaffModify.findByName(input);
            tableModel.setRowCount(0);
        
        staffList.forEach((staff) -> {
            tableModel.addRow(new Object[] {tableModel.getRowCount() + 1, staff.getHoten(),
                staff.getGioitinh(), staff.getDiachithuongtru(),staff.getNoisinh(), staff.getTrinhdohocvan(),
                staff.getPhongban() } );
        });
        }  
        else showStaff();
                try {
                    for (int i = 1; i <= 100; i++) {
                        //do action here
                        Thread.sleep(10);
                    }
                    call.done();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            @Override
            public void onCancel() {
                showStaff();
            }
        });
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, getHeight(), getBackground(), getWidth(), 0, colorGradient);
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Login.TextFieldAnimation SearchTextField;
    private com.raven.swing.TextField Text_Address;
    private com.raven.swing.TextField Text_BirthDate;
    private com.raven.swing.TextField Text_Birthplace;
    private com.raven.swing.TextField Text_ID;
    private com.raven.swing.TextField Text_Name;
    private com.raven.swing.ButtonGradient button_Edit;
    private com.raven.swing.ButtonGradient button_Submit;
    private com.raven.swing.Combobox<Academiclevel> combobox_Academic;
    private com.raven.swing.Combobox<Department> combobox_Department1;
    private com.raven.swing.Combobox<Role> combobox_Role;
    private com.raven.datechooser.DateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.raven.swing.RadioButtonCustom radioButtonCustom_MEN;
    private com.raven.swing.RadioButtonCustom radioButtonCustom_WOMEN;
    private com.raven.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
