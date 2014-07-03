/*
 * JAppletSearch.java
 *
 * Created on September 26, 2008, 4:45 PM
 */

package JavaSearch;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.logging.Level;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultStyledDocument;

/**
 *
 * @author  dale cox
 */
public class JAppletSearch extends javax.swing.JApplet {
    
    /** Initializes the applet JAppletSearch */
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSource = new javax.swing.JPanel();
        jScrollPaneSource = new javax.swing.JScrollPane();
        sourceDoc = new DefaultStyledDocument();
        jTextPaneSource = new javax.swing.JTextPane();
        jLabelSourceSearch = new javax.swing.JLabel();
        jCheckBoxSourceMatchWord = new javax.swing.JCheckBox();
        jCheckBoxSourceMatchCase = new javax.swing.JCheckBox();
        jButtonSourcePrevious = new javax.swing.JButton();
        jButtonSourceNext = new javax.swing.JButton();
        jComboBoxSearchSource = new javax.swing.JComboBox();

        jPanelSource.setMinimumSize(new java.awt.Dimension(640, 450));

        jTextPaneSource.setDocument(sourceDoc);
        jTextPaneSource.setEditable(false);
        jTextPaneSource.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextPaneSourceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextPaneSourceMouseReleased(evt);
            }
        });
        jScrollPaneSource.setViewportView(jTextPaneSource);

        jLabelSourceSearch.setText("Search");

        jCheckBoxSourceMatchWord.setText("Match Word");

        jCheckBoxSourceMatchCase.setSelected(true);
        jCheckBoxSourceMatchCase.setText("Match Case");

        jButtonSourcePrevious.setText("Previous");
        jButtonSourcePrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSourcePreviousActionPerformed(evt);
            }
        });

        jButtonSourceNext.setText("Next");
        jButtonSourceNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSourceNextActionPerformed(evt);
            }
        });

        jComboBoxSearchSource.setEditable(true);
        jComboBoxSearchSource.setMaximumRowCount(7);
        jComboBoxSearchSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchSourceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSourceLayout = new javax.swing.GroupLayout(jPanelSource);
        jPanelSource.setLayout(jPanelSourceLayout);
        jPanelSourceLayout.setHorizontalGroup(
            jPanelSourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneSource, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(jPanelSourceLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabelSourceSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSearchSource, 0, 289, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSourceNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSourcePrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxSourceMatchCase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxSourceMatchWord))
        );
        jPanelSourceLayout.setVerticalGroup(
            jPanelSourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSourceLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPaneSource, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSourceMatchWord)
                    .addComponent(jCheckBoxSourceMatchCase)
                    .addComponent(jButtonSourcePrevious)
                    .addComponent(jButtonSourceNext)
                    .addComponent(jLabelSourceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSearchSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelSource, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPaneSourceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPaneSourceMousePressed
        //jTextPaneSourceMouseReleased(evt);
    }//GEN-LAST:event_jTextPaneSourceMousePressed

    private void jTextPaneSourceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPaneSourceMouseReleased
        //jTextpaneMouseEvent(evt, jTextPaneSource);
    }//GEN-LAST:event_jTextPaneSourceMouseReleased

    private void jButtonSourcePreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSourcePreviousActionPerformed
        try{
            MultiSyntaxDocument syntax = new MultiSyntaxDocument();
            
            if(sourceCurrentPosition==0 ){
                JOptionPane optionPane = new JOptionPane();
                int selection = optionPane.showConfirmDialog(this, "Reached top of file, continue from end of file?", "Continue Search?",JOptionPane.YES_NO_OPTION);
                if(selection == 0){
                    //remove previous highlighting
                    syntax.setSearchHighlighting(sourceDoc, sourceMatchOffsets[sourceCurrentPosition][0], sourceMatchOffsets[sourceCurrentPosition][1]);
                    //set new highlighting
                    sourceCurrentPosition = sourceMatchOffsets.length-1;
                    jTextPaneSource.setCaretPosition(0);//reset the textPane
                    jTextPaneSource.setCaretPosition(sourceMatchOffsets[sourceCurrentPosition][0]);
                    syntax.setSelectedSearchHighlighting(sourceDoc, sourceMatchOffsets[sourceCurrentPosition][0], sourceMatchOffsets[sourceCurrentPosition][1]);
                }
                return;
            }
            //remove previous highlighting
            syntax.setSearchHighlighting(sourceDoc, sourceMatchOffsets[sourceCurrentPosition][0], sourceMatchOffsets[sourceCurrentPosition][1]);
            //set new highlighting
            --sourceCurrentPosition;
            jTextPaneSource.setCaretPosition(0);//reset the textPane
            jTextPaneSource.setCaretPosition(sourceMatchOffsets[sourceCurrentPosition][0]);
            syntax.setSelectedSearchHighlighting(sourceDoc, sourceMatchOffsets[sourceCurrentPosition][0], sourceMatchOffsets[sourceCurrentPosition][1]);
        }//end try
        catch(Exception x){
            JOptionPane.showMessageDialog(this, "Error: " + x, "Applet Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSourcePreviousActionPerformed

    private void jButtonSourceNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSourceNextActionPerformed
        try{
            MultiSyntaxDocument syntax = new MultiSyntaxDocument();
            if(sourceCurrentPosition==(sourceMatchOffsets.length-1)){
                JOptionPane optionPane = new JOptionPane();
                int selection = optionPane.showConfirmDialog(this, "Reached end of file, continue from begining?", "Continue Search?",JOptionPane.YES_NO_OPTION);
                if(selection == 0){
                    //remove previous highlighting
                    syntax.setSearchHighlighting(sourceDoc, sourceMatchOffsets[sourceCurrentPosition][0], sourceMatchOffsets[sourceCurrentPosition][1]);
                    //set new highlighting
                    sourceCurrentPosition = 0;
                    jTextPaneSource.setCaretPosition(0);//reset the textPane
                    jTextPaneSource.setCaretPosition(sourceMatchOffsets[sourceCurrentPosition][0]);
                    syntax.setSelectedSearchHighlighting(sourceDoc, sourceMatchOffsets[sourceCurrentPosition][0], sourceMatchOffsets[sourceCurrentPosition][1]);
                }
                return;
            }
            //remove previous highlighting
            syntax.setSearchHighlighting(sourceDoc, sourceMatchOffsets[sourceCurrentPosition][0], sourceMatchOffsets[sourceCurrentPosition][1]);
            //set new highlighting
            ++sourceCurrentPosition;
            jTextPaneSource.setCaretPosition(0);//reset the textPane
            jTextPaneSource.setCaretPosition(sourceMatchOffsets[sourceCurrentPosition][0]);
            syntax.setSelectedSearchHighlighting(sourceDoc, sourceMatchOffsets[sourceCurrentPosition][0], sourceMatchOffsets[sourceCurrentPosition][1]);
        }//end try
        catch(Exception x){
            JOptionPane.showMessageDialog(this, "Error: " + x, "Applet Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSourceNextActionPerformed

    private void jComboBoxSearchSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchSourceActionPerformed
        //fix the Issue with double action
        if(jTextPaneSource.getStyledDocument().getLength()<1)//if the source is empty return
            return;
        long timeBetweenClicks = System.currentTimeMillis() - searchDelay;
        if(timeBetweenClicks<1000)
            return;
        searchDelay = System.currentTimeMillis();
        
        //System.out.println("Action preformed source search");
        JComboBox cb = (JComboBox)evt.getSource();
        
        //get search term add qualifiers
        String newSelection = (String)cb.getSelectedItem();
        if(newSelection.length()<1)
            return;
        //System.out.println("Entered Text "+ newSelection);
        boolean matchCase = jCheckBoxSourceMatchCase.isSelected();
        //System.out.println("Match Case "+ matchCase);
        boolean matchWord = jCheckBoxSourceMatchWord.isSelected();
        //System.out.println("Match Word "+ matchWord);
        
        //find term and highlight
        try{
            MultiSyntaxDocument syntax = new MultiSyntaxDocument();
            //remove search highlighting if offset is valid
            if(sourceCurrentPosition!= -1)
                for(int i=0; i<sourceMatchOffsets.length; ++i){
                    syntax.removeSearchHighlighting(sourceDoc, sourceMatchOffsets[i][0], sourceMatchOffsets[i][1]);//apply formating to all matches
                }
            jTextPaneSource.setCaretPosition(0);//reset carret position
            sourceCurrentPosition =0;//reset current position
            
            //get new offsets
            sourceMatchOffsets=syntax.findMatch(newSelection, matchCase, matchWord, sourceDoc);
            
            //get offset of current view
            Rectangle rec = jTextPaneSource.getVisibleRect();
            Point loc = rec.getLocation();
            int viewOffset = jTextPaneSource.viewToModel(loc);
            int closestOffSet=0;
            
            //apply highlighting
            if(sourceMatchOffsets[0][1] != 0){
                //System.out.println("sourceMatchOffsets.length "+ sourceMatchOffsets.length);
                
                for(int i=0; i<sourceMatchOffsets.length; ++i){
                    if(sourceMatchOffsets[i][0]>=viewOffset){
                        closestOffSet = sourceMatchOffsets[i][0];//sets offset to closest view
                        break;
                    }//end if
                }//end for
                for(int i=0; i<sourceMatchOffsets.length; ++i){
                    if(sourceMatchOffsets[i][0] == closestOffSet){
                        syntax.setSelectedSearchHighlighting(sourceDoc, sourceMatchOffsets[i][0], sourceMatchOffsets[i][1]);
                        sourceCurrentPosition = i;
                    } else
                        syntax.setSearchHighlighting(sourceDoc, sourceMatchOffsets[i][0], sourceMatchOffsets[i][1]);//apply formating to all matches
                }
                if(closestOffSet==0)
                    syntax.setSelectedSearchHighlighting(sourceDoc, sourceMatchOffsets[0][0], sourceMatchOffsets[0][1]);
                jTextPaneSource.setCaretPosition(closestOffSet);//move view to first match
            }//end if
        }//end try
        catch(Exception x){
            JOptionPane.showMessageDialog(this, "Error: " + x, "Applet Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //add term to combo box
        cb.addItem(newSelection);//adds last used search term to combo box
    }//GEN-LAST:event_jComboBoxSearchSourceActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSourceNext;
    private javax.swing.JButton jButtonSourcePrevious;
    private javax.swing.JCheckBox jCheckBoxSourceMatchCase;
    private javax.swing.JCheckBox jCheckBoxSourceMatchWord;
    private javax.swing.JComboBox jComboBoxSearchSource;
    private javax.swing.JLabel jLabelSourceSearch;
    private javax.swing.JPanel jPanelSource;
    private javax.swing.JScrollPane jScrollPaneSource;
    private javax.swing.JTextPane jTextPaneSource;
    // End of variables declaration//GEN-END:variables
    
   DefaultStyledDocument sourceDoc;
   
   //search
  int[][] sourceMatchOffsets;
  int sourceCurrentPosition= -1;
  int[][] summaryMatchOffsets;
  int summaryCurrentPosition= -1;
  
  private long searchDelay = System.currentTimeMillis();
}//end class