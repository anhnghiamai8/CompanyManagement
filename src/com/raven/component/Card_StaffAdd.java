package com.raven.component;

import Model.Academiclevel;
import Model.Academiclevel_Modify;
import Model.Department;
import Model.Department_Modify;
import Model.IDGenerate_Modify;
import Model.Role;
import Model.Role_Modify;
import Model.Staff;
import Model.StaffModify;
import com.raven.datechooser.SelectedDate;
import com.raven.model.ModelCard;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import java.util.List;

public class Card_StaffAdd extends javax.swing.JPanel {

    static int ID_Generate1;

    public Color getColorGradient() {
        return colorGradient;
    }

    public void setColorGradient(Color colorGradient) {
        this.colorGradient = colorGradient;
    }

    private Color colorGradient;

    public Card_StaffAdd() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(112, 69, 246));
        colorGradient = new Color(255, 255, 255);
        showAcademiclevel();
        showDepartment();
        showRole();
        showID();
    }

    public void setData(ModelCard data) {
        DecimalFormat df = new DecimalFormat("#,##0.##");

    }

    public void getDate() {
        /* SelectedDate d = date.getSelectedDate();
        System.out.println(d.getDay() + "-" + d.getMonth() + "-" + d.getYear());
        System.out.println("Text : " + txtDate.getText());*/
    }

    public void showAcademiclevel() {
        List<Academiclevel> academicList = Academiclevel_Modify.findAll();
        for (Academiclevel acl : academicList) {
            combobox_Academic.addItem(acl);
        }
    }

    public void showDepartment() {
        List<Department> departmentList = Department_Modify.findAll();
        for (Department dpt : departmentList) {
            combobox_Department1.addItem(dpt);
        }
    }

    public void showRole() {
        List<Role> roleList = Role_Modify.findAll();
        for (Role rol : roleList) {
            combobox_ROLE.addItem(rol);
        }
    }
    
    public void showID(){
ID_Generate1 = IDGenerate_Modify.getID();
Text_ID.setText(String.valueOf(ID_Generate1));
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new com.raven.datechooser.DateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Text_ID = new com.raven.swing.TextField();
        Text_Address = new com.raven.swing.TextField();
        Text_BirthDate = new com.raven.swing.TextField();
        Text_Name = new com.raven.swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        radioButtonCustom_MEN = new com.raven.swing.RadioButtonCustom();
        radioButtonCustom_WOMEN = new com.raven.swing.RadioButtonCustom();
        buttonGradient1 = new com.raven.swing.ButtonGradient();
        Text_Birthplace = new com.raven.swing.TextField();
        combobox_Department1 = new com.raven.swing.Combobox<>();
        combobox_Academic = new com.raven.swing.Combobox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        combobox_ROLE = new com.raven.swing.Combobox<>();

        date.setForeground(new java.awt.Color(0, 153, 247));
        date.setDateFormat("dd-MMMM-yyyy");
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

        buttonGroup1.add(radioButtonCustom_MEN);
        radioButtonCustom_MEN.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonCustom_MEN.setText("Nam");
        radioButtonCustom_MEN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        radioButtonCustom_MEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCustom_MENActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonCustom_WOMEN);
        radioButtonCustom_WOMEN.setForeground(new java.awt.Color(255, 255, 255));
        radioButtonCustom_WOMEN.setText("Nu");
        radioButtonCustom_WOMEN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        buttonGradient1.setText("SUBMIT");
        buttonGradient1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonGradient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient1ActionPerformed(evt);
            }
        });

        Text_Birthplace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Text_Birthplace.setLabelText("BIRTH PLACE");

        combobox_Department1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox_Department1.setLabeText("DEPARTMENT");

        combobox_Academic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox_Academic.setLabeText("ACADEMIC BANCHELOR");
        combobox_Academic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_AcademicActionPerformed(evt);
            }
        });

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SKILL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(109, 109, 109))); // NOI18N
        jList1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        combobox_ROLE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox_ROLE.setLabeText("ROLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combobox_Academic, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combobox_Department1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_ROLE, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(59, 59, 59)
                                .addComponent(radioButtonCustom_MEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButtonCustom_WOMEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Text_Birthplace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Text_BirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Text_Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Text_ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(648, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combobox_Academic, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combobox_Department1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combobox_ROLE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Text_Birthplace, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(radioButtonCustom_MEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButtonCustom_WOMEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combobox_AcademicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_AcademicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_AcademicActionPerformed

    private void buttonGradient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient1ActionPerformed
        // TODO add your handling code here:
        int id = ID_Generate1;
        String name = Text_Name.getText();
        String gender = "";
        if (radioButtonCustom_MEN.isSelected()) {
            gender = "Nam";
        } else if (radioButtonCustom_WOMEN.isSelected()) {
            gender = "Nu";
        } else {
            gender = "None";
        }
        String adr = Text_Address.getText();
        String bp = Text_Birthplace.getText();

        SelectedDate d = date.getSelectedDate();
        String bd = (d.getYear() + "-" + d.getMonth() + "-" + d.getDay());

        String ac = combobox_Academic.getSelectedItem().toString();
        String dp = combobox_Department1.getSelectedItem().toString();

        Staff stf = new Staff(id, name, gender, adr, bp, bd, ac, dp);

        StaffModify.insert(stf);

        ID_Generate1++;
        IDGenerate_Modify.update(ID_Generate1);
        Text_ID.setText(String.valueOf(ID_Generate1));

    }//GEN-LAST:event_buttonGradient1ActionPerformed

    private void radioButtonCustom_MENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCustom_MENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCustom_MENActionPerformed

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
    private com.raven.swing.TextField Text_Address;
    private com.raven.swing.TextField Text_BirthDate;
    private com.raven.swing.TextField Text_Birthplace;
    private com.raven.swing.TextField Text_ID;
    private com.raven.swing.TextField Text_Name;
    private com.raven.swing.ButtonGradient buttonGradient1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.raven.swing.Combobox<Academiclevel> combobox_Academic;
    private com.raven.swing.Combobox<Department> combobox_Department1;
    private com.raven.swing.Combobox<Role> combobox_ROLE;
    private com.raven.datechooser.DateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.RadioButtonCustom radioButtonCustom_MEN;
    private com.raven.swing.RadioButtonCustom radioButtonCustom_WOMEN;
    // End of variables declaration//GEN-END:variables
}
