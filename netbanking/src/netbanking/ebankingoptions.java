/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbanking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static netbanking.loginmain.unamelogin;

/**
 *
 * @author makka
 */
public class ebankingoptions extends javax.swing.JFrame {

    /**
     * Creates new form ebankingoptions
     */
    public ebankingoptions() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    String x,y;
    
    int flag=0;
    int balance;
    boolean proceed=false;
    int acno;
    
    public ebankingoptions(String val1,String val2)
    {
        this.setLocationRelativeTo(null);
        initComponents();
        x=val1;
        y=val2;
        
              try
        {
            PreparedStatement ps;
            ResultSet rs,rscheck;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/netbanking","root","meenu1");
            Statement st=(Statement) con.createStatement();
         
         String query = "SELECT * FROM registered_customers WHERE user_name="+"\""+x+"\""+";";
         rscheck=st.executeQuery(query);
         if(rscheck.next())
         {
            acno = rscheck.getInt("Account_no");
                   String n = rscheck.getString("name");
                   naam.setText(n);
                   String n1 = rscheck.getString("email");
                   emailid.setText(n1);
                   String n2 = rscheck.getString("ph_no");
                   call.setText(n2);
                    
           
           String balquery = "SELECT account_balance FROM bank_customers WHERE Account_no="+acno+";";
           rs = st.executeQuery(balquery);
           if(rs.next())
           {
                   balance = rs.getInt("account_balance");
                   proceed=true;
                   
                              
           }
         }
        }
     catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"SQL ERROR");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginmain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public ebankingoptions(int accno)
    {
        initComponents();
        
              try
        {
            acno= accno;
            PreparedStatement ps;
            ResultSet rs,rscheck;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/netbanking","root","meenu1");
            Statement st=(Statement) con.createStatement();
           
           String balquery = "SELECT account_balance FROM bank_customers WHERE Account_no="+acno+";";
           rs = st.executeQuery(balquery);
           if(rs.next())
           {
                   balance = rs.getInt("account_balance");
                   proceed=true;
                              
           }
         
        }
     catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"SQL ERROR");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginmain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        naam = new javax.swing.JLabel();
        call = new javax.swing.JLabel();
        emailid = new javax.swing.JLabel();
        viewdetails = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        viewbalance = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        aboutus = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        transferfunds = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        billpay = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        transhistory = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netbanking/banklogo11.png"))); // NOI18N
        jLabel1.setText("Account holder");

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netbanking/default1.png"))); // NOI18N

        naam.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        naam.setText("Meenu");
        naam.setAlignmentX(0.5F);

        call.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        call.setText(" 8168807235");
        call.setAlignmentX(0.5F);

        emailid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailid.setText("meenu@gmail.com");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailid)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(naam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(call, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(16, 16, 16)
                .addComponent(naam, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(call)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailid)
                .addGap(50, 50, 50)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewdetails.setBackground(new java.awt.Color(204, 204, 204));
        viewdetails.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0), null));
        viewdetails.setPreferredSize(new java.awt.Dimension(542, 145));
        viewdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewdetailsMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel3.setText("View account details");

        javax.swing.GroupLayout viewdetailsLayout = new javax.swing.GroupLayout(viewdetails);
        viewdetails.setLayout(viewdetailsLayout);
        viewdetailsLayout.setHorizontalGroup(
            viewdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewdetailsLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel3)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        viewdetailsLayout.setVerticalGroup(
            viewdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewdetailsLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        viewbalance.setBackground(new java.awt.Color(153, 153, 153));
        viewbalance.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153)));
        viewbalance.setPreferredSize(new java.awt.Dimension(352, 145));
        viewbalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewbalanceMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel2.setText("View balance");

        javax.swing.GroupLayout viewbalanceLayout = new javax.swing.GroupLayout(viewbalance);
        viewbalance.setLayout(viewbalanceLayout);
        viewbalanceLayout.setHorizontalGroup(
            viewbalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewbalanceLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewbalanceLayout.setVerticalGroup(
            viewbalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewbalanceLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(40, 40, 40))
        );

        aboutus.setBackground(new java.awt.Color(204, 204, 204));
        aboutus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aboutus.setPreferredSize(new java.awt.Dimension(378, 145));
        aboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutusMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel7.setText("About us");

        javax.swing.GroupLayout aboutusLayout = new javax.swing.GroupLayout(aboutus);
        aboutus.setLayout(aboutusLayout);
        aboutusLayout.setHorizontalGroup(
            aboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutusLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aboutusLayout.setVerticalGroup(
            aboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutusLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        transferfunds.setBackground(new java.awt.Color(153, 153, 153));
        transferfunds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        transferfunds.setPreferredSize(new java.awt.Dimension(370, 145));
        transferfunds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferfundsMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel4.setText("Transfer funds");

        javax.swing.GroupLayout transferfundsLayout = new javax.swing.GroupLayout(transferfunds);
        transferfunds.setLayout(transferfundsLayout);
        transferfundsLayout.setHorizontalGroup(
            transferfundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferfundsLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transferfundsLayout.setVerticalGroup(
            transferfundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferfundsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        billpay.setBackground(new java.awt.Color(204, 204, 204));
        billpay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        billpay.setPreferredSize(new java.awt.Dimension(352, 145));
        billpay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billpayMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel6.setText("Bill-payment");

        javax.swing.GroupLayout billpayLayout = new javax.swing.GroupLayout(billpay);
        billpay.setLayout(billpayLayout);
        billpayLayout.setHorizontalGroup(
            billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billpayLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billpayLayout.setVerticalGroup(
            billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billpayLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        transhistory.setBackground(new java.awt.Color(153, 153, 153));
        transhistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        transhistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transhistoryMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel5.setText("Transaction history");

        javax.swing.GroupLayout transhistoryLayout = new javax.swing.GroupLayout(transhistory);
        transhistory.setLayout(transhistoryLayout);
        transhistoryLayout.setHorizontalGroup(
            transhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transhistoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(92, 92, 92))
        );
        transhistoryLayout.setVerticalGroup(
            transhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transhistoryLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aboutus, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(transferfunds, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                            .addComponent(viewdetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                            .addComponent(transhistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(billpay, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                            .addComponent(viewbalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferfunds, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(billpay, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transhistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aboutus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       
       loginmain loginpage = new loginmain();
       loginpage.setVisible(true);
       loginpage.setLocationRelativeTo(null);
       dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void viewbalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewbalanceMouseClicked
        
        if(proceed)
        {
                viewbalance viewbal = new viewbalance(balance,acno);
                   viewbal.setVisible(true);
                   this.hide();
                   viewbal.setLocationRelativeTo(null);
        }
       
    }//GEN-LAST:event_viewbalanceMouseClicked

    private void viewdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdetailsMouseClicked
        try
        {
            PreparedStatement ps;
            ResultSet rs,rscheck;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/netbanking","root","meenu1");
            Statement st=(Statement) con.createStatement();
         
            String uname="",uph="",usname="";
             int ubranch=0;
         String query = "SELECT * FROM registered_customers WHERE Account_no="+acno+";";
         rscheck=st.executeQuery(query);
         if(rscheck.next())
         {
            uname = rscheck.getString("name");
            usname = rscheck.getString("user_name");
            ubranch = rscheck.getInt("branch");
            uph = rscheck.getString("ph_no");
     
/*        accountdetails details = new accountdetails(x,uname,acno,ubranch,uph);
        details.setVisible(true);
        this.hide();
        details.setLocationRelativeTo(null);*/
         }
             if(proceed)
           {
               accountdetails details = new accountdetails(usname,uname,acno,ubranch,uph);
            details.setVisible(true);
                this.hide();
                details.setLocationRelativeTo(null);
            }
           else{
               JOptionPane.showMessageDialog(null,"exit");
           }
         
        }
     catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"SQL ERROR");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginmain.class.getName()).log(Level.SEVERE, null, ex);
        }                                     
    }//GEN-LAST:event_viewdetailsMouseClicked

    private void transferfundsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferfundsMouseClicked
        transferfunds tf = new transferfunds(acno);
        tf.setVisible(true);
        tf.setLocationRelativeTo(null);
        this.hide();
      
    }//GEN-LAST:event_transferfundsMouseClicked

    private void billpayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billpayMouseClicked
          billpay ab = new billpay(acno);
                   ab.setVisible(true);
                   this.hide();
                   ab.setLocationRelativeTo(null);
    }//GEN-LAST:event_billpayMouseClicked

    private void aboutusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseClicked
    
    
        aboutus abc = new aboutus(acno);
                   abc.setVisible(true);
                   this.hide();
                   abc.setLocationRelativeTo(null);
     
    }//GEN-LAST:event_aboutusMouseClicked

    private void transhistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transhistoryMouseClicked

        if(proceed)
        {
        records history = new records(acno);
        history.setVisible(true);
        history.setLocationRelativeTo(null);
        this.hide();
         }
    
    }//GEN-LAST:event_transhistoryMouseClicked

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
            java.util.logging.Logger.getLogger(ebankingoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ebankingoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ebankingoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ebankingoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ebankingoptions eb = new ebankingoptions();
                eb.setVisible(true);
                
                     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutus;
    private javax.swing.JPanel billpay;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel call;
    private javax.swing.JLabel emailid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel naam;
    private javax.swing.JPanel transferfunds;
    private javax.swing.JPanel transhistory;
    private javax.swing.JPanel viewbalance;
    private javax.swing.JPanel viewdetails;
    // End of variables declaration//GEN-END:variables
}
