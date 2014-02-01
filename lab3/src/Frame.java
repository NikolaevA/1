
import java.awt.Color;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artem
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        jPanel1 = new javax.swing.JPanel();
        FunctionLabel = new javax.swing.JLabel();
        Function = new javax.swing.JTextField();
        DimensionLabel = new javax.swing.JLabel();
        Dimension = new javax.swing.JTextField();
        Start = new javax.swing.JButton();
        RangeLabel = new javax.swing.JLabel();
        RangeFrom = new javax.swing.JTextField();
        RangeFromLabel = new javax.swing.JLabel();
        RangeToLabel = new javax.swing.JLabel();
        RangeTo = new javax.swing.JTextField();
        y0Label = new javax.swing.JLabel();
        y0 = new javax.swing.JTextField();
        MethodLabel = new javax.swing.JLabel();
        Adams2 = new javax.swing.JCheckBox();
        Adams3 = new javax.swing.JCheckBox();
        Adams4 = new javax.swing.JCheckBox();
        ErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FunctionLabel.setText("Введите функцию:");

        Function.setMinimumSize(new java.awt.Dimension(200, 28));
        Function.setPreferredSize(new java.awt.Dimension(200, 28));

        DimensionLabel.setText("Введите размерность");

        Dimension.setMinimumSize(new java.awt.Dimension(140, 28));
        Dimension.setPreferredSize(new java.awt.Dimension(140, 28));
        Dimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DimensionActionPerformed(evt);
            }
        });

        Start.setText("Ок");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        RangeLabel.setText("Введите отрезок:");

        RangeFrom.setMinimumSize(new java.awt.Dimension(60, 28));
        RangeFrom.setPreferredSize(new java.awt.Dimension(60, 28));
        RangeFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangeFromActionPerformed(evt);
            }
        });

        RangeFromLabel.setText("От:");

        RangeToLabel.setText("До:");

        RangeTo.setMinimumSize(new java.awt.Dimension(60, 28));
        RangeTo.setPreferredSize(new java.awt.Dimension(60, 28));
        RangeTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangeToActionPerformed(evt);
            }
        });

        y0Label.setText("y0:");

        y0.setMinimumSize(new java.awt.Dimension(60, 28));
        y0.setPreferredSize(new java.awt.Dimension(60, 28));
        y0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y0ActionPerformed(evt);
            }
        });

        MethodLabel.setText("Метод:");

        Adams2.setText("Метод Адамса 2 порядка");
        Adams2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adams2ActionPerformed(evt);
            }
        });

        Adams3.setText("Метод Адамса 3 порядка");
        Adams3.setToolTipText("");

        Adams4.setText("Метод Адамса 4 порядка");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(RangeFromLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(RangeFrom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(RangeToLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(RangeTo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(FunctionLabel)
                    .add(Function, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(DimensionLabel)
                    .add(Dimension, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(RangeLabel)
                    .add(Start)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(y0Label)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(y0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(MethodLabel)
                    .add(Adams2)
                    .add(Adams3)
                    .add(Adams4)
                    .add(ErrorLabel))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(FunctionLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Function, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(DimensionLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Dimension, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(RangeLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(RangeToLabel)
                        .add(RangeTo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(RangeFromLabel)
                        .add(RangeFrom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(y0Label)
                    .add(y0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(MethodLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Adams2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Adams3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Adams4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Start)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(ErrorLabel)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        // TODO add your handling code here:
        
        try{
            ErrorLabel.setText("");
        if (Function.getText() != ""  && Dimension.getText() != "" && RangeFrom.getText() != "" && RangeTo.getText() != "" ) {
            WriteToFile w=new WriteToFile();
            if (Double.isNaN(Formula.solution(Function.getText(), 0,0))){ 
                ErrorLabel.setForeground(Color.red);
                ErrorLabel.setText("Ошибка ввода формулы");
                return;
            }
            String func=Function.getText();
            double from=Double.parseDouble(RangeFrom.getText());
            double to=Double.parseDouble(RangeTo.getText());
            double yZero=Double.parseDouble(y0.getText());
            double dim=Double.parseDouble(Dimension.getText());
            if (Adams2.isSelected()){
                w.add(ODU.solution(func, 2, from, to, yZero, dim));
            }
            if (Adams3.isSelected()){
                w.add(ODU.solution(func, 3, from, to, yZero, dim));            
            }
            if (Adams4.isSelected()){
                w.add(ODU.solution(func, 4, from, to, yZero, dim));            
            }
            w.close();
        }
        }catch(Exception e){
            ErrorLabel.setForeground(Color.red);
            ErrorLabel.setText("Ошибка");
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_StartActionPerformed

    private void RangeToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangeToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RangeToActionPerformed

    private void y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y0ActionPerformed

    private void Adams2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adams2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Adams2ActionPerformed

    private void DimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DimensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DimensionActionPerformed

    private void RangeFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangeFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RangeFromActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Adams2;
    private javax.swing.JCheckBox Adams3;
    private javax.swing.JCheckBox Adams4;
    private javax.swing.JTextField Dimension;
    private javax.swing.JLabel DimensionLabel;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JTextField Function;
    private javax.swing.JLabel FunctionLabel;
    private javax.swing.JLabel MethodLabel;
    private javax.swing.JTextField RangeFrom;
    private javax.swing.JLabel RangeFromLabel;
    private javax.swing.JLabel RangeLabel;
    private javax.swing.JTextField RangeTo;
    private javax.swing.JLabel RangeToLabel;
    private javax.swing.JButton Start;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField y0;
    private javax.swing.JLabel y0Label;
    // End of variables declaration//GEN-END:variables
}