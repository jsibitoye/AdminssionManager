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
import java.util.ArrayList;

import java.util.Random;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author j
 */
public class IndexPage extends javax.swing.JFrame {
JFileChooser pic= new JFileChooser();

File f;
String s,fac, dept;
int focusValue,credits, imcount = 0;
private ResultSet rs;
PreparedStatement ps;
String conString= "jdbc:mysql://localhost:3306/adminssion manager";
              String username= "root";
              String Password = "";
Random rnd = new Random();
     
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
      DefaultTableModel tableM;
    private final ActionListener al;
    private final Timer t;
    /**
     * Creates new form IndexPage
     */
    
    
    
    public IndexPage() {
        initComponents();
         tableM = (DefaultTableModel)jTable1.getModel();
        department.setEnabled(false);
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
        for(int i= 2; i<=400 ; i++){
        jComboBox7.addItem(i);
        jComboBox10.addItem(2022-i);
        if(i<=100)
            jComboBox8.addItem(i);
        }
        jRadioButton1.setActionCommand("male");
        jRadioButton2.setActionCommand("Female");
         jLabel21.setVisible(false);
        jLabel25.setVisible(false);
        jTextField4.setVisible(false);
        jTextField10.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false );
        
        
        al = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             String Img[] = {"bg2.jpg","bg11.jpg","bg3.jpg"};
             System.out.println("Out here"+ imcount);
             //FileOutputStream fos=new FileOutputStream("img/"+Img+".jpg");
             //int len= (int)b.length();
             //byte[] buf = b.getBytes(1, len);
             //fos.write(buf,0,len);
             jLabel41.setIcon(new ImageIcon("img/"+Img[imcount]));
             imcount++;
             if(imcount==3)
                 imcount = 0;
            }
        };
        t= new Timer(5000,al);
        t.start();
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
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
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 139, 182));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/Hnet.com-image (7).png"))); // NOI18N
        jLabel1.setText("Student List");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/indexICo.png"))); // NOI18N
        jLabel2.setText("Dashboard");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quick Links");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/Hnet.com-image (6).png"))); // NOI18N
        jLabel4.setText("Home");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/Hnet.com-image (5).png"))); // NOI18N
        jLabel5.setText("New Student");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 50));

        jLabel43.setText("Log Out");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel43MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 650));

        jPanel3.setBackground(new java.awt.Color(60, 139, 182));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(60, 139, 182));
        jTextField1.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Enter Text Here");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 240, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/Hnet.com-image (10).png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/Hnet.com-image (9).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 770, 70));

        jTabbedPane2.setBackground(new java.awt.Color(60, 139, 182));
        jTabbedPane2.setForeground(new java.awt.Color(60, 139, 182));
        jTabbedPane2.setOpaque(true);
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Admission Manager App for Staff use Only");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 590, 40));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/bg11.jpg"))); // NOI18N
        jLabel41.setText("jLabel41");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 770, 590));

        jTabbedPane2.addTab("", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 16, -1, 131));

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

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 400, 260));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Background"));
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

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 340, 500));

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

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 400, 240));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/Hnet.com-image (12).png"))); // NOI18N
        jLabel36.setText("Clear");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel36MouseReleased(evt);
            }
        });
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 130, 40));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/Hnet.com-image (11).png"))); // NOI18N
        jLabel37.setText("Register");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel37MouseReleased(evt);
            }
        });
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 130, 40));

        jTabbedPane2.addTab("", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jPanel6HierarchyChanged(evt);
            }
        });
        jPanel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel6FocusGained(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel6MouseReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name ", "State", "Email Address", "Student ID", "Department "
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/editt.png"))); // NOI18N
        jLabel29.setText("Edit");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel29MouseReleased(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminssionmanager/img/viieww.png"))); // NOI18N
        jLabel34.setText("View");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel34MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("1");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 770, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
         jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
        try
        {
              //Connection con = DBcon();
            
            String conString= "jdbc:mysql://localhost:3306/adminssion manager";
              String username= "root";
              String Password = "";
              Connection con =  DriverManager.getConnection(conString, username, Password);  
              String sql= "SELECT a.name, a.state, a.email, a.stud_id, b.Department  FROM s_info a, program b where a.stud_id =  b.stud_id";// where Department <> ''";
              ps = (PreparedStatement) con.prepareStatement(sql);
              rs = ps.executeQuery();
              tableM.setRowCount(0);
              while(rs.next()){
                  Object []tableObject = {rs.getString("name"),rs.getString("state"),rs.getString("email"),rs.getString("stud_id"),rs.getString("Department")};
                  tableM.addRow(tableObject);
                  //System.out.println("getting here ######" +tableObject.toString());
              }
             // jTable1.setModel(DbUtils.resultSetToModel(rs));
             // ArrayList <String> name= new ArrayList();
              
              //while(rs.next()){
            //  name.add(rs.getString("name"));
                 // jList1.add(rs.getString("name"));
            //  }
        }
        catch(Exception e){
            System.out.println("There is an error here"+ e);
        }
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i= pic.showOpenDialog(this);
        if(i== JFileChooser.APPROVE_OPTION){
            f= pic.getSelectedFile();
            Image im = getToolkit().createImage(f.getAbsolutePath());
            im = im.getScaledInstance(130, 120, Image.SCALE_SMOOTH);
            jLabel13.setIcon(new ImageIcon(im));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void jLabel37MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseReleased
        // TODO add your handling code here:
         getData();         
    }//GEN-LAST:event_jLabel37MouseReleased

    private void jLabel36MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseReleased
        // TODO add your handling code here: 
        System.out.println("print something here" +   ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());    
        
    }//GEN-LAST:event_jLabel36MouseReleased

    private void jPanel6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel6FocusGained
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_jPanel6FocusGained

    private void jPanel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseReleased

    private void jPanel6HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel6HierarchyChanged
        // TODO add your handling code here:
       // if (focusValue == 0){
      //      focusValue +=1;
       // }
      //  else focusValue -=1;
        
      //  System.out.println("Focused : " + focusValue);
      
        
    }//GEN-LAST:event_jPanel6HierarchyChanged

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
        jLabel29.setEnabled(false);
       jLabel34.setEnabled(false);
    }//GEN-LAST:event_jTable1FocusLost

    private void jLabel29MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseReleased
        // TODO add your handling code here:
        
        int rowSelected = jTable1.getSelectedRow();
        String IDvalue =  jTable1.getModel().getValueAt(rowSelected, 3).toString();
        if (IDvalue != ""){
            new ViewStudent(IDvalue).setVisible(true);
            this.dispose();
        }
        else  System.out.println("No Student Selected " );
    }//GEN-LAST:event_jLabel29MouseReleased

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased

        search();
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        //if(evt.getKeyCode() == 10)
        if(jTabbedPane2.getSelectedIndex() == 2 || evt.getKeyCode() == 10) 
        search();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jLabel34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseReleased
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Implementation in Progress");
    }//GEN-LAST:event_jLabel34MouseReleased

    private void jLabel43MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseReleased
        // TODO add your handling code here:
        
        new loginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel43MouseReleased

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
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
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
              
              Connection con =  DriverManager.getConnection(conString, username, Password);  
              String sql="";    
              id = checkStudent();
        //proceed with checks
            
          if (personal.size()==8 && edu.length==3 && (Olevel.size()>=11 && Olevel.size()<=12))
            { 
             PreparedStatement ps;
             
             // Check for possible department;
             choiceOfProgram();
              //query for result
                if(Olevel.size()==12){
                    System.out.println("2seetings");
                        sql = "INSERT INTO s_result(seating,e_num1,e_num2,english,math,"
                           + "physics,chem,bio,jamb_no,jamb_score,postjamb_no,postjamb_score,stud_id)"
                                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        ps= (PreparedStatement) con.prepareStatement(sql);
                         for (int i=0; i<12; i++){
                            System.out.println("print for " +Olevel.get(i)+" at position"+(i+1));
                            ps.setString(i+1, Olevel.get(i));
                         }
                         ps.setString(13, id);
                         ps.executeUpdate();
                         System.out.println("got here 1 ####");
                         ps.close();
                }
                else if(Olevel.size()==11){
                        System.out.println("1seetings");
                        sql = "INSERT INTO s_result(seating,e_num1,english,math,"
                           + "physics,chem,bio,jamb_no,jamb_score,postjamb_no,postjamb_score,stud_id)"
                                + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
                        ps= (PreparedStatement) con.prepareStatement(sql);
                        for (int i=0; i<11; i++)
                        { 
                            System.out.println("print for " +Olevel.get(i)+" at position"+(i+1));
                          ps.setString(i+1, Olevel.get(i));  
                        }
                        ps.setString(12, id);
                        ps.executeUpdate();
                         System.out.println("got here 2 ####");
                        ps.close();
                }
                //query fo personal info
                sql="INSERT INTO s_info(img,name,dob,home_Add,state,gender,phone,email,stud_id) "
                        + "values(?,?,?,?,?,?,?,?,?)";
                ps= (PreparedStatement) con.prepareStatement(sql);
                 ps.setBinaryStream(1, new FileInputStream(f), f.length());
                 for (int i=0; i<8; i++){
                     System.out.println("print for " +personal.get(i)+" at position"+(i+1));
                    if(i == 2){
                       ps.setString(3,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
                    }
                    else  ps.setString(i+1, personal.get(i));
                 }
                 ps.setString(9, id);
                 ps.executeUpdate();
                  System.out.println("got here 3 ####");
                 ps.close();
            //query for student school
                
                sql="INSERT INTO s_school( school,school_state,year_of_graduation,stud_id) "
                        + "values(?,?,?,?)";
                ps= (PreparedStatement) con.prepareStatement(sql);
                 ps.setBinaryStream(1, new FileInputStream(f), f.length());
                 for (int i=0; i<3; i++){
                    System.out.println("print for " +edu[i]+" at position"+(i+1));
                 System.out.println("print" +i);
                 ps.setString(i+1, edu[i]);
                 }
                 ps.setString(4, id);
                 ps.executeUpdate(); 
                  System.out.println("got here 4 ####");
                 ps.close();
                  //query for Relative
                
                sql="INSERT INTO relative(fulll_ame, relationship, home_address, phone,email, stud_id) "
                        + "values(?,?,?,?,?,?)";
                ps= (PreparedStatement) con.prepareStatement(sql);
                 for (int i=0; i<5; i++){
                      System.out.println("print for " +relative.get(i)+" at position"+(i+1));
                     System.out.println("print" +i);
                     ps.setString(i+1, relative.get(i));
                 }
                 ps.setString(6, id);
                 ps.executeUpdate(); 
                 System.out.println("got here 4 ####");
                 ps.close();
                 
                 // choice of program 
                 
                  sql="INSERT INTO Program(faculty, Department, Mode_of_admission,stud_id) "
                        + "values(?,?,?,?)";
                ps= (PreparedStatement) con.prepareStatement(sql);
                 
                 ps.setString(1, fac);
                 ps.setString(2, dept);
                 ps.setString(3, "Jamb");
                 ps.setString(4, id);
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

    private Connection DBcon() {
        
        try{
             String conString= "jdbc:mysql://localhost:3306/adminssion manager";
              String username= "root";
              String Password = "";
             return DriverManager.getConnection(conString, username, Password);  
        }
        catch (Exception ex){
            
        }
        finally {
        return null;
        }
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    private String checkStudent() {
        String id="Student00"+ (int)rnd.nextInt(99999);
        try{
          String conString= "jdbc:mysql://localhost:3306/adminssion manager";
          String username= "root";
          String Password = "";
          Connection con =  DriverManager.getConnection(conString, username, Password);  
          String sql= "SELECT * FROM s_info,program";// where Department <> ''";
          ps = (PreparedStatement) con.prepareStatement(sql);
          rs = ps.executeQuery();          
          while(rs.next()){
              if (id == rs.getString("stud_id"))
                  checkStudent();
              //System.out.println("getting here ######" +tableObject.toString());
          }
        }catch(Exception exx){
        
        }
    return id;
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void search() {
        
                // TODO add your handling code here:
//        try{Connection con = DriverManager.getConnection(conString, username, Password);
//             String sql= "SELECT * FROM s_info WHERE stud_id like '%"+jTextField1.getText().trim()+"%'";
//             ps= (PreparedStatement) con.prepareStatement(sql);
//             ResultSet rs = ps.executeQuery();
//             //jButton3.setText("Update Info");
//             rs.next();
//             
//         new ViewStudent(rs.getString("stud_id")).setVisible(true);
//        }catch(Exception exx){
//        
//        }

try
        {
              //Connection con = DBcon();
            
            String conString= "jdbc:mysql://localhost:3306/adminssion manager";
              String username= "root";
              String Password = "";
              Connection con =  DriverManager.getConnection(conString, username, Password);  
             String sql= "SELECT * FROM s_info a, program b WHERE a.stud_id like '%"+jTextField1.getText().trim()+"%'";
             sql ="SELECT * FROM s_info a, program b, s_school c, relative d WHERE a.stud_id = b.stud_id and b.stud_id= c.stud_id and c.stud_id = d.stud_id and ( a.stud_id like '%"+jTextField1.getText().trim()+"%' or a.name like '%"+jTextField1.getText().trim()+"%' or d.fulll_ame like '%"+jTextField1.getText().trim()+"%' or d.home_address like '%"+jTextField1.getText().trim()+"%' or b.faculty like '%"+jTextField1.getText().trim()+"%' or b.Department like '%"+jTextField1.getText().trim()+"%') ";
              ps = (PreparedStatement) con.prepareStatement(sql);
              rs = ps.executeQuery();
              tableM.setRowCount(0);
              while(rs.next()){
                  Object []tableObject = {rs.getString("name"),rs.getString("gender"),rs.getString("phone"),rs.getString("stud_id"),rs.getString("Department")};
                  tableM.addRow(tableObject);
                  //System.out.println("getting here ######" +tableObject.toString());
              }
             // jTable1.setModel(DbUtils.resultSetToModel(rs));
             // ArrayList <String> name= new ArrayList();
              
              //while(rs.next()){
            //  name.add(rs.getString("name"));
                 // jList1.add(rs.getString("name"));
            //  }
        jTabbedPane2.setSelectedIndex(2);
        }
        catch(Exception e){
            System.out.println("There is an error here"+ e);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
