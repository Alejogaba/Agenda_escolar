
package vista;

import controlador.persistencia.ArchivoAdmin;
import controlador.persistencia.ArchivoAsignatura;
import controlador.persistencia.ArchivoHabilitarFechas;
import controlador.persistencia.ArchivoNota;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Asignatura;


public class PanelActivarNotas extends javax.swing.JPanel {
    public boolean activar;
    Principal principal;
    Calendar calendario;
    ArchivoAdmin aa;
String directory = System.getProperty("user.dir");
String fileName = "temp.txt";
String absolutePath = directory + File.separator + fileName;
    
    public PanelActivarNotas(Principal principal) {
        this.principal=principal;
        this.informacionActivacion();
        calendario= new GregorianCalendar();
        aa = new ArchivoAdmin();
        initComponents();
        activarBotones();
    }

    PanelActivarNotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloCierre = new javax.swing.JLabel();
        jLabelDiaCierre = new javax.swing.JLabel();
        jLabelMesCierre = new javax.swing.JLabel();
        jLabelAnioCierre = new javax.swing.JLabel();
        jTextFieldDiaCierre = new javax.swing.JTextField();
        jTextFieldMesCierre = new javax.swing.JTextField();
        jTextFieldAnioCierre = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonActivar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonDesactivar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jLabelFondoPanel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloCierre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTituloCierre.setText("FECHA DE CIERRE");
        add(jLabelTituloCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 187, -1));

        jLabelDiaCierre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDiaCierre.setText("Dia");
        add(jLabelDiaCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 71, -1, -1));

        jLabelMesCierre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMesCierre.setText("Mes");
        add(jLabelMesCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 124, -1, -1));

        jLabelAnioCierre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAnioCierre.setText("Año");
        add(jLabelAnioCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 179, -1, -1));

        jTextFieldDiaCierre.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldDiaCierre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldDiaCierre.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldDiaCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 71, 97, -1));

        jTextFieldMesCierre.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldMesCierre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldMesCierre.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldMesCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 124, 97, -1));

        jTextFieldAnioCierre.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldAnioCierre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldAnioCierre.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldAnioCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 179, 97, -1));

        jButtonLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 243, 106, 43));

        jButtonActivar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonActivar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonActivar.setText("Activar");
        jButtonActivar.setPreferredSize(new java.awt.Dimension(103, 79));
        jButtonActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActivarActionPerformed(evt);
            }
        });
        add(jButtonActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 243, 113, 43));

        jButtonVolver.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 241, 103, 47));

        jButtonDesactivar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDesactivar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDesactivar.setText("Desactivar");
        jButtonDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesactivarActionPerformed(evt);
            }
        });
        add(jButtonDesactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 242, 125, 44));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.gif"))); // NOI18N
        add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 210, 140));

        jLabelFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabelFondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActivarActionPerformed
        Activar();
        this.guardar_archivo();
    }//GEN-LAST:event_jButtonActivarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        volver();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesactivarActionPerformed
       Desactivar();
       this.guardar_archivo();
    }//GEN-LAST:event_jButtonDesactivarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActivar;
    private javax.swing.JButton jButtonDesactivar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAnioCierre;
    private javax.swing.JLabel jLabelDiaCierre;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondoPanel;
    private javax.swing.JLabel jLabelMesCierre;
    private javax.swing.JLabel jLabelTituloCierre;
    private javax.swing.JTextField jTextFieldAnioCierre;
    private javax.swing.JTextField jTextFieldDiaCierre;
    private javax.swing.JTextField jTextFieldMesCierre;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        
        jTextFieldAnioCierre.setText("");
        
        jTextFieldDiaCierre.setText("");
        
        jTextFieldMesCierre.setText("");
    }

    private void Activar() {
        if(validarFormato()){
            if(validarTamanio()){
                if(validarComparacion()){
                    activar=true;
                    //aa.guardarFecha(activar);
                    JOptionPane.showMessageDialog(this,"se habilitaron las fechas para que el docente pueda registrar notas","notas",JOptionPane.INFORMATION_MESSAGE);
                    activarBotones();
                    Limpiar();
                    
                }else{
                    JOptionPane.showMessageDialog(this,"fecha de cierre erronea","activar fecha",JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this,"fechas en formato incorrecto","activar fecha",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"alguna fecha vacia o erronea","activar fecha",JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean validarFormato() {
        if(jTextFieldAnioCierre.getText().equals("")){
            return false;
        }else if(jTextFieldDiaCierre.getText().equals("")){
            return false;
        }else if(jTextFieldMesCierre.getText().equals("")){
            return false;
        }try{
            int a=Integer.parseInt(jTextFieldAnioCierre.getText());
            a=Integer.parseInt(jTextFieldDiaCierre.getText());            
            a=Integer.parseInt(jTextFieldMesCierre.getText());
            return true;
        }catch(NullPointerException e){
            return false;
        }catch(NumberFormatException e){
            return false;
        }
        
    }

    private boolean validarTamanio() {
        String dia=Integer.toString(calendario.get(Calendar.DATE));
        String mes=Integer.toString(calendario.get(Calendar.MONTH));
        String anio=Integer.toString(calendario.get(Calendar.YEAR));
        int dia1=Integer.parseInt(dia);
        int mes1=Integer.parseInt(mes)+1;
        int anio1=Integer.parseInt(anio);
        int diaApertura=dia1;
        int diaCierre=Integer.parseInt(jTextFieldDiaCierre.getText());
        int mesApertura=mes1;
        int mesCierre=Integer.parseInt(jTextFieldMesCierre.getText());
        int anioApertura=anio1;
        int anioCierre=Integer.parseInt(jTextFieldAnioCierre.getText());
        if(((mesApertura>0)&&(mesApertura<13))&&((mesCierre>0)&&(mesCierre<13))){
            if(((anioApertura>2000)&&(anioApertura<3000))&&((anioCierre>2000)&&(anioCierre<3000))){
                if((mesApertura==1)||(mesApertura==3)||(mesApertura==5)||(mesApertura==7)||(mesApertura==8)||(mesApertura==10)||(mesApertura==12)){
                    if((mesCierre==1)||(mesCierre==3)||(mesCierre==5)||(mesCierre==7)||(mesCierre==8)||(mesCierre==10)||(mesCierre==12)){
                        if((diaApertura>0)&&(diaApertura<32)&&(diaCierre>0)&&(diaCierre<32)){
                            return true;
                        }else{
                            return false;
                        }
                    }else if((mesCierre==4)||(mesCierre==6)||(mesCierre==9)||(mesCierre==11)){
                        if((diaApertura>0)&&(diaApertura<31)&&(diaCierre>0)&&(diaCierre<31)){
                            return true;
                        }else{
                            return false;
                        }
                    }else if(mesCierre==2){
                        if((diaApertura>0)&&(diaApertura<29)&&(diaCierre>0)&&(diaCierre<29)){
                            return true;
                        }else{
                            return false;
                        }
                    }
                }else if((mesApertura==4)||(mesApertura==6)||(mesApertura==9)||(mesApertura==11)){
                    if((mesCierre==1)||(mesCierre==3)||(mesCierre==5)||(mesCierre==7)||(mesCierre==8)||(mesCierre==10)||(mesCierre==12)){
                        if((diaApertura>0)&&(diaApertura<32)&&(diaCierre>0)&&(diaCierre<32)){
                            return true;
                        }else{
                            return false;
                        }
                    }else if((mesCierre==4)||(mesCierre==6)||(mesCierre==9)||(mesCierre==11)){
                        if((diaApertura>0)&&(diaApertura<31)&&(diaCierre>0)&&(diaCierre<31)){
                            return true;
                        }else{
                            return false;
                        }
                    }else if(mesCierre==2){
                        if((diaApertura>0)&&(diaApertura<29)&&(diaCierre>0)&&(diaCierre<29)){
                            return true;
                        }else{
                            return false;
                        }
                    }
                }else if(mesApertura==2){
                    if((mesCierre==1)||(mesCierre==3)||(mesCierre==5)||(mesCierre==7)||(mesCierre==8)||(mesCierre==10)||(mesCierre==12)){
                        if((diaApertura>0)&&(diaApertura<32)&&(diaCierre>0)&&(diaCierre<32)){
                            return true;
                        }else{
                            return false;
                        }
                    }else if((mesCierre==4)||(mesCierre==6)||(mesCierre==9)||(mesCierre==11)){
                        if((diaApertura>0)&&(diaApertura<31)&&(diaCierre>0)&&(diaCierre<31)){
                            return true;
                        }else{
                            return false;
                        }
                    }else if(mesCierre==2){
                        if((diaApertura>0)&&(diaApertura<29)&&(diaCierre>0)&&(diaCierre<29)){
                            return true;
                        }else{
                            return false;
                        }
                    }
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    return false;    
    }
    
    private boolean validarComparacion() {
        String dia=Integer.toString(calendario.get(Calendar.DATE));
        String mes=Integer.toString(calendario.get(Calendar.MONTH));
        String anio=Integer.toString(calendario.get(Calendar.YEAR));
        int dia1=Integer.parseInt(dia);
        int mes1=Integer.parseInt(mes)+1;
        int anio1=Integer.parseInt(anio);
        int diaApertura=dia1;
        int diaCierre=Integer.parseInt(jTextFieldDiaCierre.getText());
        int mesApertura=mes1;
        int mesCierre=Integer.parseInt(jTextFieldMesCierre.getText());
        int anioApertura=anio1;
        int anioCierre=Integer.parseInt(jTextFieldAnioCierre.getText());
        if(anioApertura<=anioCierre){
            if(anioApertura==anioCierre){
                if(mesApertura<=mesCierre){
                    if(mesApertura==mesCierre){
                        if(diaApertura<=diaCierre){
                            return true;
                            
                        }else{
                            return false;
                        }
                    }else if(mesApertura<mesCierre){
                        return true;
                    }
                }else{
                    return false;
                }
            }else if(anioApertura<anioCierre){
                return true;
            }
                
        }else{
            return false;
        }
        return false;
    }

    private void volver() {
        principal.irAPanelAdmin();
    }
    
    public boolean informacionActivacion(){
        activar=this.cargar_archivo();
        return activar;
    }     

    private void Desactivar() {
        activar=false;
        JOptionPane.showMessageDialog(this,"se desactivaron las notas al docente","desactivar",JOptionPane.INFORMATION_MESSAGE);
        activarBotones();
    }

    
      public void guardar_archivo(){


// Write the content in file 
try(FileWriter fileWriter = new FileWriter(absolutePath)) {
    String fileContent = String.valueOf(activar);
    fileWriter.write(fileContent);
    fileWriter.close();
} catch (IOException e) {
    // Cxception handling
}
    }
      
      public boolean cargar_archivo(){
try(FileInputStream fileInputStream = new FileInputStream(absolutePath)) {
    int ch = fileInputStream.read();
    String a = "";
    while(ch != -1) {
        a +=String.valueOf((char)ch);
        ch = fileInputStream.read();
    }
    System.out.print(a);
    System.out.print("TODO CORRECTO");
    return Boolean.parseBoolean(a);
} catch (FileNotFoundException e) {
    // exception handling
    System.out.print(e.toString());
    return false;
} catch (IOException e) {
    System.out.print(e.toString());
    return false;
}
    }
      
      
      
    private void activarBotones() {
       jButtonActivar.setEnabled(!activar);
       jButtonDesactivar.setEnabled(activar);
    }
}
