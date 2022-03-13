/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminssionmanager;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author j
 */
public class ViewStudent extends javax.swing.JFrame {

    /**
     * Creates new form ViewStudent
     */
    PreparedStatement ps;
    File f;
    String s,fac, dept;
    int focusValue,credits;
    private ResultSet rs;
    String facultyList[] = {"Select","Science", "Helth Science","Business School","Agriculture","Applied Arts","Engineering"};
     String hold[] = {"Select"};
     DefaultComboBoxModel<String> holdModel = new DefaultComboBoxModel<>( hold );
     String Science[] = {"Select", "Computer Science","Physics","Physics","Chemistry","Biology"};
     DefaultComboBoxModel<String> scienceModel = new DefaultComboBoxModel<>( Science );
     String Helth_Science[] = {"Select", "Medicin","Public Health","Health Care Administration","Psychology"};
     DefaultComboBoxModel<String> Health_ScienceModel = new DefaultComboBoxModel<>( Helth_Science );
     String Business_School[] = {"Select", "Business Administration","Public Administration","Human Resource Management","Business Management","Logistics and Supply Chain Management"};
     DefaultComboBoxModel<String> BusinessModel = new DefaultComboBoxModel<>(Business_School);
     String Agriculture[] = {"Select","Agric Econoomics","Fishry","Agric Extension","Agric Science"};
     DefaultComboBoxModel<String> AgricModel = new DefaultComboBoxModel<>( Agriculture );
     String Applied_Arts[] = {"Select","Fine Art","Fashion Design","Entertainment","Music"};
     DefaultComboBoxModel<String> ArtsModel = new DefaultComboBoxModel<>( Applied_Arts );
     String Engineering[] = {"Select","Electrical Engineering","Chemical Engineering","Urban and Regional Planning"};
     DefaultComboBoxModel<String> EngModel = new DefaultComboBoxModel<>( Engineering );
      final JComboBox Faculty = new JComboBox(facultyList);
      JComboBox department = new JComboBox(hold);
    JFileChooser pic= new JFileChooser();
    String conString= "jdbc:mysql://localhost:3306/adminssion manager",username= "root",Password = "";
    
    Random rnd = new Random();
    private String iD;
    
    public ViewStudent() {
        initComponents();
    }

    ViewStudent(String IDvalue) {
        initComponents();
        iD= IDvalue;
        this.setLocationRelativeTo(null);
        jRadioButton1.setActionCommand("male");
        jRadioButton2.setActionCommand("Female");
        for(int i= 2; i<=400 ; i++){
            jComboBox7.addItem(i);
            jComboBox10.addItem(2017-i);
            if(i<=100)
                jComboBox8.addItem(i);
        }
        //System.out.println("this is ID" +IDvalue);
        setFieldValues(IDvalue);
        Faculty.addActionListener(new ActionListener() {//add actionlistner to listen for change
                            @Override
                            public void actionPerformed(ActionEvent e) { 
                               
                               
                                String s = (String) Faculty.getSelectedItem();//get the selected item  
                                // System.out.println("Entering @@@@@@@@@@@"+s);
                                try {
                                switch (s) {//check for a match
                                    case "Science":
                                        department.setModel(scienceModel);
                                        department.setEnabled(true);
                                    ;                           
                                        break;
                                    case "Helth Science":
                                        department.setModel(Health_ScienceModel);
                                        department.setEnabled(true );
                                        
                                        break;
                                    case "Business School":
                                        department.setModel(BusinessModel);
                                        department.setEnabled(true );
                                        break;
                                    case "Agriculture":
                                        department.setModel(AgricModel);
                                        department.setEnabled(true );          
                                        break;
                                    case "Applied Arts":
                                        department.setModel(ArtsModel);
                                        department.setEnabled(true );          
                                        break;
                                    case "Engineering":
                                        department.setModel(EngModel);
                                        department.setEnabled(true );          
                                        break;
                                        
                                    default:
                                        department.setModel(holdModel);
                                        department.setEnabled(false );
                                        
                                } }catch (Exception Exc){System.out.println("Error here :" +Exc);};
                            }
});
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField7 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Biodata"));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Brows Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 153, 152, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jPanel7.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel10.setText("Adddess :");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        jLabel8.setText("Full Name :");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setText("E-mail:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 40, 20));
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 130, -1));
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 130, -1));

        jLabel9.setText("DOB:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 20));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/ico_alpha_user_male_48x48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 16, 150, 131));

        jLabel14.setText("Gender :");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 50, 20));

        jLabel26.setText("State of Origin:");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Oyo", "Osun", "Kwara", "Kaduna", "Kogi", "Abia", "Anambra", "Corss River", "Delta", "Abuja", "Lagos", "Eboyin", "Adamawa", " ", " ", " " }));
        jPanel7.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, -1));

        jLabel15.setText("Phone/Mobile :");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jPanel7.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, -1));

        jDateChooser1.setDateFormatString("yyyy-mm-dd");
        jPanel7.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 50, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Student ID");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, 40));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 400, 260));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Background"));
        jPanel8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("Post Jamb Bumber:");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));
        jPanel8.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 417, 124, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A", "B", "C", "D", "E", "F" }));
        jPanel8.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 188, 132, -1));

        jLabel24.setText("Post Jamb Score :");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 443, -1, -1));

        jLabel16.setText("Mathematics :");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 220, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1" }));
        jPanel8.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 443, 120, -1));

        jLabel17.setText("Physics :");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 245, -1, -1));

        jLabel18.setText("Biology :");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 302, -1, -1));

        jLabel19.setText("Chemistry :");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 276, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A", "B", "C", "D", "E", "F" }));
        jPanel8.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 219, 132, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A", "B", "C", "D", "E", "F" }));
        jPanel8.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 245, 132, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A", "B", "C", "D", "E", "F" }));
        jPanel8.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 276, 132, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A", "B", "C", "D", "E", "F" }));
        jPanel8.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 302, 132, -1));

        jLabel20.setText("Jamb Bumber:");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 371, -1, -1));

        jLabel21.setText("Exam Number :");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 139, -1, -1));
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 136, 132, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1", "2" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 110, 132, -1));

        jLabel22.setText("Number Of Seatings :");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 113, -1, -1));
        jPanel8.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 162, 132, -1));

        jLabel25.setText("Exam Number :");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 162, -1, -1));
        jPanel8.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 365, 124, -1));

        jLabel27.setText("Jamb Score :");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 394, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1" }));
        jPanel8.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 391, 124, -1));

        jLabel28.setText("English :");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 188, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Jamb Result");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 328, -1, 31));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel8.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 84, 132, -1));

        jLabel38.setText("School Attended :");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 35, -1, -1));
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 32, 136, -1));

        jLabel39.setText("SchoolState :");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, 20));

        jTextField3.setText("  ");
        jPanel8.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 58, 136, -1));

        jLabel40.setText("Year of Graduation :");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 87, -1, -1));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 11, 340, 500));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Next Of Kin"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Full Name :");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));
        jPanel9.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 180, -1));

        jLabel31.setText("Home Adddess :");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, -1));

        jLabel32.setText("Phone/Mobile :");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 180, -1));

        jLabel33.setText("E-mail :");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 40, 20));
        jPanel9.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 180, -1));

        jLabel35.setText("Relationship:");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));
        jPanel9.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, -1));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 277, 400, 234));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 522, 126, 34));

        jButton3.setText("close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 522, 138, 34));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/Hnet.com-image (2).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i= pic.showOpenDialog(this);
        if(i== JFileChooser.APPROVE_OPTION){
            f= pic.getSelectedFile();
            Image im = getToolkit().createImage(f.getAbsolutePath());
            im = im.getScaledInstance(130, 120, Image.SCALE_SMOOTH);
            jLabel13.setIcon(new ImageIcon(im));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        if(jComboBox6.getSelectedIndex()==1)
        {
            jLabel21.setVisible(true);
            jTextField4.setVisible(true);
            jLabel25.setVisible(false);
            jTextField10.setVisible(false);
        }
        else if(jComboBox6.getSelectedIndex()==2)
        {
            jLabel21.setVisible(true);
            jLabel25.setVisible(true);
            jTextField4.setVisible(true);
            jTextField10.setVisible(true);
        }
        else{
            jLabel21.setVisible(false);
            jLabel25.setVisible(false);
            jTextField4.setVisible(false);
            jTextField10.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         getData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new IndexPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void setFieldValues(String ID) {        
           try{
             Connection con = DriverManager.getConnection(conString, username, Password);
             String sql= "SELECT * FROM s_info WHERE stud_id = '"+ID.trim()+"'";
             ps= (PreparedStatement) con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             //jButton3.setText("Update Info");
             jLabel1.setText(ID);
             while(rs.next()){
            // jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(rs.getString(1)))); 
             jTextField5.setText(rs.getString(2));
             java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse(rs.getString(3));
             jDateChooser1.setDate(date);
             jTextField7.setText(rs.getString(4));
             for(int i = 1 ; i< jComboBox9.getItemCount(); i++)
                 if (jComboBox9.getItemAt(i).equals(rs.getString(5)))
                 jComboBox9.setSelectedIndex(i);
             
             if (rs.getString(6).equalsIgnoreCase("male"))
                 jRadioButton1.setSelected(true);
             else 
                 jRadioButton2.setSelected(true);
             jTextField8.setText(rs.getString(7));
             jTextField9.setText(rs.getString(8));
             }
        
            sql= "SELECT * FROM s_result WHERE stud_id = '"+ID.trim()+"'";
             ps= (PreparedStatement) con.prepareStatement(sql);
             rs = ps.executeQuery();
             while(rs.next()){
             
                 for(int i = 1 ; i< jComboBox6.getItemCount(); i++)
                 if (jComboBox6.getItemAt(i).equals(rs.getString(1)))
                 jComboBox6.setSelectedIndex(i);
                 if (rs.getString(1).equals("2"))
                     jTextField10.setVisible(true);
                 jTextField4.setText(rs.getString(2));
                 jTextField10.setText(rs.getString(3));
                 for(int i = 1 ; i< jComboBox1.getItemCount(); i++)
                 if (jComboBox1.getItemAt(i).equals(rs.getString(4)))
                 jComboBox1.setSelectedIndex(i);
                 
                  for(int i = 1 ; i< jComboBox2.getItemCount(); i++)
                 if (jComboBox2.getItemAt(i).equals(rs.getString(5)))
                 jComboBox2.setSelectedIndex(i);
                  
                   for(int i = 1 ; i< jComboBox3.getItemCount(); i++)
                 if (jComboBox3.getItemAt(i).equals(rs.getString(6)))
                 jComboBox3.setSelectedIndex(i);
                   
                    for(int i = 1 ; i< jComboBox4.getItemCount(); i++)
                 if (jComboBox4.getItemAt(i).equals(rs.getString(7)))
                 jComboBox4.setSelectedIndex(i);
                    
                     for(int i = 1 ; i< jComboBox5.getItemCount(); i++)
                 if (jComboBox5.getItemAt(i).equals(rs.getString(8)))
                 jComboBox5.setSelectedIndex(i);
                     
                 jTextField11.setText(rs.getString(9));
                 
                 for(int i = 1 ; i< jComboBox7.getItemCount(); i++)
                 if (jComboBox7.getItemAt(i).toString().trim().equals(rs.getString(10)))
                 jComboBox7.setSelectedIndex(i);
                 
                 jTextField12.setText(rs.getString(11));
                 
                 for(int i = 1 ; i< jComboBox8.getItemCount(); i++)
                 if (jComboBox8.getItemAt(i).toString().trim().equals(rs.getString(12)))
                 jComboBox8.setSelectedIndex(i);
                 
                 
                 sql= "SELECT * FROM s_school WHERE stud_id = '"+ID.trim()+"'";
             ps= (PreparedStatement) con.prepareStatement(sql);
             rs = ps.executeQuery();
             while(rs.next()){
                 jTextField2.setText(rs.getString(1));
                 jTextField3.setText(rs.getString(2));
                 
                  for(int i = 1 ; i< jComboBox10.getItemCount(); i++)
                 if (jComboBox10.getItemAt(i).toString().trim().equals(rs.getString(3)))
                 jComboBox10.setSelectedIndex(i);
             }
             
            // jLabel27.setVisible(true);
            
            
              sql= "SELECT * FROM relative WHERE stud_id = '"+ID.trim()+"'";
             ps= (PreparedStatement) con.prepareStatement(sql);
             rs = ps.executeQuery();
             while(rs.next()){
                 jTextField13.setText(rs.getString(1));
                 jTextField17.setText(rs.getString(2));
                 jTextField14.setText(rs.getString(3));
                 jTextField15.setText(rs.getString(4));
                 jTextField16.setText(rs.getString(5));      
             }
             
//              sql= "SELECT * FROM program WHERE stud_id = '"+ID.trim()+"'";
//             ps= (PreparedStatement) con.prepareStatement(sql);
//             rs = ps.executeQuery();
//             while(rs.next()){
//                 jTextField3.setText(rs.getString(1));
//                 jTextField7.setText(rs.getString(2));
//                 jTextField4.setText(rs.getString(3));
//                 jTextField5.setText(rs.getString(4));
//                 jTextField16.setText(rs.getString(5));      
//             }

           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private void getData() {
           credits =0;    
           String edu[] = new String[3];
           ArrayList <String> Olevel = new ArrayList();
           ArrayList <String> relative = new ArrayList();
           ArrayList  <String>personal = new ArrayList();
           
           String id="";

         //personal detail
         try{
         s= f.getAbsolutePath();
           if(! f.getAbsolutePath().equals(""))
                personal.add(s);
           else {
             errorMessage(" or provide a picture for the prospect");
             return ;
             }
         }
         catch(Exception ee)
         { 
             System.out.println("there is an error please check imaage "+ee);
         }
          if( !jTextField5.getText().toString().equals(""))
           personal.add(jTextField5.getText());
          else {
             errorMessage(" the Prospective student's name");
             return ;
             }
          if( ! ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().equals(""))
           personal.add( ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
          else {
             errorMessage("Prosct's Date of Birth");
             return ;
             }
          if( !jTextField7.getText().toString().equals(""))
           personal.add(jTextField7.getText());
          else {
             errorMessage("Prospect's Home Address");
             return ;
             }
          if( !jComboBox9.getSelectedItem().toString().equalsIgnoreCase("select"))
           personal.add(jComboBox9.getSelectedItem().toString());
          else {
             errorMessage("Prospect's State of Origin");
             return ;
             }
           try{
               if( !buttonGroup1.getSelection().getActionCommand().equals(""))
                personal.add(buttonGroup1.getSelection().getActionCommand());
               else {
             errorMessage(" or Select Gender");
             return ;
             }
           }
           catch(Exception e){
                System.out.println("eeven not working here "+ e);
           }
          if( !jTextField8.getText().toString().equals(""))
           personal.add(jTextField8.getText());
          else {
             errorMessage("Prospect's Contact Line");
             return ;
             }
          if( !jTextField9.getText().toString().equals("")){
            if(jTextField9.getText().indexOf("@")>2 && jTextField9.getText().indexOf(".")>2)
                 personal.add(jTextField9.getText());
            else {JOptionPane.showMessageDialog(this,"wrong email address","Data Error",JOptionPane.ERROR_MESSAGE);
                  return;}
          }else {
             errorMessage("Email Address");
             return ;
             } 
         
           
         //Relative data
         if(!jTextField13.getText().equals(""))
             relative.add(jTextField13.getText());
         else {
             JOptionPane.showMessageDialog(this, "Next of kin Name is Empty","Data Error",JOptionPane.ERROR_MESSAGE);
             return ;
         }
         
          if(!jTextField17.getText().toString().equals(""))
             relative.add(jTextField17.getText().toString());
          else {
             JOptionPane.showMessageDialog(this, "Next of kin Relationship Is Empty","Data Error",JOptionPane.ERROR_MESSAGE);
             return ;
         }
          
           if(!jTextField14.getText().toString().equals(""))
             relative.add(jTextField14.getText().toString());
           else {
             JOptionPane.showMessageDialog(this, " Next of kin Home Address Is Empty","Data Error",JOptionPane.ERROR_MESSAGE);
             return ;
         }
           
            if(!jTextField15.getText().equals(""))
             relative.add(jTextField15.getText());
            else {
             JOptionPane.showMessageDialog(this, "Please Enter next of kin Phone Number","Data Error",JOptionPane.ERROR_MESSAGE);
             return ;
         }
             if(!jTextField16.getText().equals(""))
             relative.add(jTextField16.getText()); 
             else {
             JOptionPane.showMessageDialog(this, "Please input next of kin email address","Data Error",JOptionPane.ERROR_MESSAGE);
             return ;
         }
             
        //educaitional background data
           if( !jTextField2.getText().toString().equals(""))
            edu[0]= jTextField2.getText().toString();
           else {
             JOptionPane.showMessageDialog(this, "School Attended is Empty","Data Error",JOptionPane.ERROR_MESSAGE);
             return ;
         }
           
           if( !jTextField3.getText().toString().equals(""))
            edu[1]= jTextField3.getText().toString();
           else {
             errorMessage("School State");
             return ;
         }
           
          if( !jComboBox10.getSelectedItem().toString().equalsIgnoreCase("select"))
            edu[2]= jComboBox10.getSelectedItem().toString();
          else {
             errorMessage("Year of Graduation");
             return ;
         }
        
         //Olevel data
         if (!jComboBox6.getSelectedItem().toString().equalsIgnoreCase("select"))
            Olevel.add(jComboBox6.getSelectedItem().toString());
          else {
             errorMessage("Number of Seating");
             return ;
         }
          if(jComboBox6.getSelectedItem().toString().equalsIgnoreCase("1")){
              if(jTextField4.getText() != "")
              Olevel.add(jTextField4.getText());
              else {
             errorMessage("Exam Identification Number");
             return ;
             }
          }else if(jComboBox6.getSelectedItem().toString().equalsIgnoreCase("2"))
          {
              if(jTextField4.getText() != "" ){
               Olevel.add(jTextField4.getText());
               Olevel.add(jTextField10.getText());
              }
              else {
             errorMessage(" Identification For both Sittings");
             return ;
             }
          }
         if( !jComboBox1.getSelectedItem().toString().equalsIgnoreCase("select")){
          Olevel.add(jComboBox1.getSelectedItem().toString());
          CreditCheck(jComboBox1.getSelectedItem().toString());
         }
         else {
             errorMessage("Grade for English Language");
             return ;
             }
         if( !jComboBox2.getSelectedItem().toString().equalsIgnoreCase("select")){
          Olevel.add(jComboBox2.getSelectedItem().toString());
          CreditCheck(jComboBox2.getSelectedItem().toString());
         }
         else {
             errorMessage("Grade for Mathematics");
             return ;
             }
         if( !jComboBox3.getSelectedItem().toString().equalsIgnoreCase("select")){
          Olevel.add(jComboBox3.getSelectedItem().toString());
          CreditCheck(jComboBox3.getSelectedItem().toString());
         }
         else {
             errorMessage("Grade for Physics");
             return ;
             }
         if( !jComboBox4.getSelectedItem().toString().equalsIgnoreCase("select")){
          Olevel.add(jComboBox4.getSelectedItem().toString());
          CreditCheck(jComboBox4.getSelectedItem().toString());
         }
         else {
             errorMessage("Grade for Chemistr");
             return ;
             }
         if( !jComboBox5.getSelectedItem().toString().equalsIgnoreCase("select")){
          Olevel.add(jComboBox5.getSelectedItem().toString());
         CreditCheck(jComboBox5.getSelectedItem().toString());
    }
         else {
             errorMessage("Grade for Biology");
             return ;
             }
         if( !jTextField11.getText().toString().equals(""))
          Olevel.add(jTextField11.getText());
         else {
             errorMessage("Jamb Examination Number");
             return ;
             }
         if( !jComboBox7.getSelectedItem().toString().equalsIgnoreCase("select")){
          Olevel.add(jComboBox7.getSelectedItem().toString());
          CreditCheck("Jamb",Integer.parseInt(jComboBox7.getSelectedItem().toString()));
         }
         else {
             errorMessage("Jamb Score");
             return ;
             }
         if( !jTextField12.getText().equals(""))
          Olevel.add(jTextField12.getText());
         else {
             errorMessage("Post Jamb Number");
             return ;
             }
         if( !jComboBox8.getSelectedItem().toString().equalsIgnoreCase("select")){
          Olevel.add(jComboBox8.getSelectedItem().toString());
          CreditCheck("Post_Jamb",Integer.parseInt(jComboBox8.getSelectedItem().toString()));
         }
         else {
             errorMessage("Post Jamb Score");
             return ;
             }

         // now check before connecting to db 
        try{
            if (credits <7){
                System.out.println("Total Credit :" +credits );
             JOptionPane.showMessageDialog(this,"Unforttunately, the prospect does not qualify for this program \n "
                     + "Possible Reasons Bellow : \n Doesn't have a total of 5 credits in all 5 Subjects \n Jamb or Post Jamb Score may not meet requirement","Not Qualified",JOptionPane.ERROR_MESSAGE);
            return;
        }
            
            
            // check to see that student doesn't already exist
              String conString= "jdbc:mysql://localhost:3306/adminssion manager";
              String username= "root";
              String Password = "";
              Connection con =  DriverManager.getConnection(conString, username, Password);  
              String sql="";    
              id = iD;
        //proceed with checks
            
          if (personal.size()==8 && edu.length==3 && (Olevel.size()>=11 && Olevel.size()<=12))
            { 
             PreparedStatement ps;
             
             // Check for possible department;
             choiceOfProgram();
              //query for result
                if(Olevel.size()==12){
                    System.out.println("2seetings");
                       
                       sql= "UPDATE s_result SET seating=?,e_num1=?,e_num2=?,english=?,math=?,"
                           + "physics=?,chem=?,bio=?,jamb_no=?,jamb_score=?,postjamb_no=?,postjamb_score=?"
                                +  "WHERE stud_id='"+iD+"'";
                        ps= (PreparedStatement) con.prepareStatement(sql);
                         for (int i=0; i<12; i++){
                            System.out.println("print for " +Olevel.get(i)+" at position"+(i+1));
                            ps.setString(i+1, Olevel.get(i));
                         }
                         ps.executeUpdate();
                         System.out.println("got here 1 ####");
                         ps.close();
                }
                else if(Olevel.size()==11){
                        System.out.println("1seetings");
                        sql= "UPDATE s_result SET seating=?,e_num1=?,english=?,math=?,"
                           + "physics=?,chem=?,bio=?,jamb_no=?,jamb_score=?,postjamb_no=?,postjamb_score=?"
                                +  "WHERE stud_id='"+iD+"'";
                        ps= (PreparedStatement) con.prepareStatement(sql);
                        for (int i=0; i<11; i++)
                        { 
                            System.out.println("print for " +Olevel.get(i)+" at position"+(i+1));
                          ps.setString(i+1, Olevel.get(i));  
                        }
                        ps.executeUpdate();
                         System.out.println("got here 2 ####");
                        ps.close();
                }
                //query fo personal info
               // sql="INSERT INTO s_info(img,name,dob,home_Add,state,gender,phone,email,stud_id) "
                 //       + "values(?,?,?,?,?,?,?,?,?)";
                
                sql="UPDATE s_info SET img=?,name=?,dob=?,home_Add=?,state=?,gender=?,phone=?,email=?"
                        + "WHERE stud_id='"+iD+"'";
                ps= (PreparedStatement) con.prepareStatement(sql);
                 ps.setBinaryStream(1, new FileInputStream(f), f.length());
                 for (int i=0; i<8; i++){
                     System.out.println("print for " +personal.get(i)+" at position"+(i+1));
                    if(i == 2){
                       ps.setString(3,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
                    }
                    else  ps.setString(i+1, personal.get(i));
                 }
                 ps.executeUpdate();
                  System.out.println("got here 3 ####");
                 ps.close();
            //query for student school
                
                sql="UPDATE s_school SET school=?,school_state=?,year_of_graduation=?"
                         + "WHERE stud_id='"+iD+"'";
                ps= (PreparedStatement) con.prepareStatement(sql);
                 ps.setBinaryStream(1, new FileInputStream(f), f.length());
                 for (int i=0; i<3; i++){
                    System.out.println("print for " +edu[i]+" at position"+(i+1));
                 System.out.println("print" +i);
                 ps.setString(i+1, edu[i]);
                 }
                 ps.executeUpdate(); 
                  System.out.println("got here 4 ####");
                 ps.close();
                  //query for Relative
                
                sql="UPDATE relative SET fulll_ame=?, relationship=?, home_address=?, phone=?,email=?"
                        + "WHERE stud_id='"+iD+"'";
                ps= (PreparedStatement) con.prepareStatement(sql);
                 for (int i=0; i<5; i++){
                      System.out.println("print for " +relative.get(i)+" at position"+(i+1));
                     System.out.println("print" +i);
                     ps.setString(i+1, relative.get(i));
                 }
                 ps.executeUpdate(); 
                 System.out.println("got here 4 ####");
                 ps.close();
                 
                 // choice of program 
                 
                  sql="UPDATE Program SET faculty=?, Department=?, Mode_of_admission=?"
                        + "WHERE stud_id='"+iD+"'";
                ps= (PreparedStatement) con.prepareStatement(sql);
                 
                 ps.setString(1, fac);
                 ps.setString(2, dept);
                 ps.setString(3, "Jamb");
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Student meets all requirements and Admitted into : \n " +dept+" Department \n, the Faculty of " +fac );
                // System.out.println("Student meets all requirements and Admitted into : \n " +dept+" Department \n, the Faculty of " +fac);
                 ps.close();

              con.close();
            }
          else
          {
            JOptionPane.showMessageDialog(this, "Data not correctly given, please review the fields !!!");
          }
          
        }
        catch(Exception ex){
          
         JOptionPane.showMessageDialog(this, "The Generated Id Already exist, please click the Button again"+ ex);
        }
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
         private void errorMessage(String errorMessage) {
        

             JOptionPane.showMessageDialog(this,"Please input "+ errorMessage,"Data Error",JOptionPane.ERROR_MESSAGE);

   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CreditCheck(String credit) {
        switch (credit) {
                    case "A":
                        credits++;                          
                        break;
                    case "B":
                        credits++;                          
                        break;
                    case "C":
                        credits++;                          
                        break;
        }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void CreditCheck(String exam, int credit) {
      if (exam =="Jamb"){
        if (credit>= 200){
           credits ++;
       }
      }else if (exam =="Post_Jamb"){
        if (credit>= 55){
           credits +=2;
       }
       else if(credit>= 50)
           credits++;
      }
           
    }
    
        private void choiceOfProgram() {  
                   fac ="";
                   dept ="";
                     Random rnd = new Random();
                     int randomNumber =0,input;
                    
                    if( !jComboBox8.getSelectedItem().toString().equalsIgnoreCase("select")){
                      
                      if (Integer.parseInt(jComboBox8.getSelectedItem().toString()) >= 55){
                          Object []objct = {
                              "Faculty :", Faculty,
                              "Department :", department
                          };
                         input= JOptionPane.showConfirmDialog(this, objct, "Select Prefered Program", JOptionPane.OK_CANCEL_OPTION);
                         if(input == JOptionPane.OK_OPTION){
                             fac = (String)Faculty.getSelectedItem();
                             dept = (String)department.getSelectedItem();
                         }
                         else{
                             JOptionPane.showMessageDialog(this, "please select a Program");
                             choiceOfProgram();
                         }
                     }
                      else{
                         
                          while( randomNumber<1 || randomNumber >2)
                            randomNumber = (int)rnd.nextInt(3);
                          if (randomNumber == 1){
                                fac = "Agriculture";
                                randomNumber = 0;
                                 while( randomNumber<1 || randomNumber >Agriculture.length-1)
                                 randomNumber = (int)rnd.nextInt(3);
                                 dept= Agriculture[randomNumber];
                          
                          }else if (randomNumber == 2){
                               fac = "Applied Arts";
                                randomNumber = 0;
                                 while( randomNumber<1 || randomNumber >Applied_Arts.length-1)
                                 randomNumber = (int)rnd.nextInt(3);
                                 dept= Applied_Arts[randomNumber];
                          }
                      }
                  }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
