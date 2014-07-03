
import java.text.NumberFormat; //imports number formatting for $$ 
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
/*
 * calcJApplet.java
 *
 * Created on February 9, 2008, 8:50 PM
 * Motagage Calculator Example Applet
 */

/**
 *
 * @author  Dale Cox 
 */



public class amortCalc extends javax.swing.JApplet {
    
    /** Initializes the applet calcJApplet */
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//end init
    
    /*@Override
    public void start(){
        initComponents();
    }*/

    
    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPrincipalTitle = new javax.swing.JLabel();
        jTextFieldPrincipal = new javax.swing.JTextField();
        jLabelinterest = new javax.swing.JLabel();
        jTextFieldInterest = new javax.swing.JTextField();
        jLabelTerm = new javax.swing.JLabel();
        jTextFieldTerm = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelMoPay = new javax.swing.JLabel();
        jTextFieldMoPay = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonCalc = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        ErrorLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        amortModel = new DefaultTableModel(columnNames, 0);
        jTableAmort = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setStub(null);

        jLabelPrincipalTitle.setLabelFor(jLabelPrincipalTitle);
        jLabelPrincipalTitle.setText("Principal");

        jLabelinterest.setLabelFor(jTextFieldInterest);
        jLabelinterest.setText("Anual Interest Rate ");

        jLabelTerm.setLabelFor(jTextFieldTerm);
        jLabelTerm.setText("Term in Years");

        jLabelMoPay.setText("Monthly Payment");

        jTextFieldMoPay.setEditable(false);

        jButtonCalc.setText("Calculate");
        jButtonCalc.setToolTipText("Calculate Monthly Payments");
        jButtonCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        ErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        ErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTableAmort.setModel(amortModel);
        jScrollPane1.setViewportView(jTableAmort);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPrincipalTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelinterest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelTerm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMoPay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMoPay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButtonCalc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(jButtonReset))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTerm)
                    .addComponent(jTextFieldInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelinterest)
                    .addComponent(jTextFieldPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrincipalTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelMoPay)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldMoPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonReset)
                        .addComponent(jButtonCalc)))
                .addGap(13, 13, 13)
                .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcActionPerformed
        /**This method calculates Monthly Mortgage Payment**/ 
        
        /**Get Input**/
        
        //Get the vlaue of the text fiels
        sPrinciple = jTextFieldPrincipal.getText();
        //add error checking
        sAnualInterest = jTextFieldInterest.getText();
        //add error checking
        sTermYr = jTextFieldTerm.getText();
        
        //error checking
        if(sPrinciple.isEmpty()||sAnualInterest.isEmpty()||sTermYr.isEmpty()){
            ErrorLabel.setText("Incorrect or missing value");
            return;}
        
        //convert strings to numbers
        dPrinciple = Double.parseDouble(sPrinciple); //Amount Barrowed            
        dInterest = Double.parseDouble(sAnualInterest); //Anual interest Rate
        iYearTerm = Integer.parseInt(sTermYr); // Loan Payback Period in Years
        
        //TODO add error checking
        
        //**get monthly payment info**//
        //Calculate the number of months in the term
        int iMonthterm = iYearTerm * 12;
        
        //Calculate monthly interest 
        double dMonthInterest = dInterest / 1200;

        //Calculate Monthly Payment 
        dMonthlyPayment = (dPrinciple * (Math.pow((1 + dMonthInterest) , iMonthterm))* dMonthInterest)/ 
             ((Math.pow((1 + dMonthInterest) , iMonthterm))-1);
        
        //Formats Monthly Payment
        currency = NumberFormat.getCurrencyInstance(); //creates currency
        sMonthlyPayment=currency.format(dMonthlyPayment);
        
        //write output
        jTextFieldMoPay.setText(sMonthlyPayment);
        
        //writes to Table 
        
         while (iMonthterm > 0){
            iMonthterm = iMonthterm-1;//holds which months payment is on 
            dCurrentInterest = dPrinciple * dMonthInterest; //Shows current interest payed
            dPrinciplePaid = dMonthlyPayment - dCurrentInterest; //shows principle paid
            dPrinciple = dPrinciple - dPrinciplePaid;  //shows remaining principle           
            ++iPayment;
            sPayment = Integer.toString(iPayment);//required for output reasons
            String[] rowData ={sPayment,(currency.format(dMonthlyPayment)),(currency.format(dCurrentInterest)),
                        (currency.format(dPrinciplePaid)),(currency.format(dPrinciple))};
            amortModel.addRow(rowData);
         }//end while

    }//GEN-LAST:event_jButtonCalcActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        //Resets Fields
        clearFields();
    }//GEN-LAST:event_jButtonResetActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton jButtonCalc;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabelMoPay;
    private javax.swing.JLabel jLabelPrincipalTitle;
    private javax.swing.JLabel jLabelTerm;
    private javax.swing.JLabel jLabelinterest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableAmort;
    private javax.swing.JTextField jTextFieldInterest;
    private javax.swing.JTextField jTextFieldMoPay;
    private javax.swing.JTextField jTextFieldPrincipal;
    private javax.swing.JTextField jTextFieldTerm;
    // End of variables declaration//GEN-END:variables
    
    //Input Variables
    String sPrinciple = null;
    String sAnualInterest = null;
    String sTermYr = null;
    String sMonthlyPayment = null;
    
    //calculation variables
    double dPrinciple = 0.0;        //Amount Barrowed            
    double dInterest = 0.0;         //Anual interest Rate
    int iYearTerm = 0;              // Loan Payback Period in Years    
    double dMonthlyPayment =0.0;    //Monthly Payment
    NumberFormat currency;
    
    //table variables
    String[] columnNames= {"Payment #", "Payment Amount", "Interest Payment", "Principle Reduction", "Principle Balance"};
    DefaultTableModel amortModel;
    double dCurrentInterest =0.0;
    double dPrinciplePaid = 0.0;
    String sPayment=null;
    int iPayment = 0;
         
    private void clearFields()
    {
        //resets the fields
        jTextFieldPrincipal.setText("");
        jTextFieldInterest.setText("");
        jTextFieldTerm.setText("");
        jTextFieldMoPay.setText("");        
        amortModel = new DefaultTableModel(columnNames, 0);
        jTableAmort.setModel(amortModel);
        
    } //end of clearFields
    
    
}//end Class