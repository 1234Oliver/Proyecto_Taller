
package Vista;

import Modelo.CPacientes;
import Modelo.CTratamientos;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class FormularioCRUDT extends javax.swing.JPanel {

    public FormularioCRUDT() {
        initComponents();     
CTratamientos objetoTratamientos = new CTratamientos (); 
objetoTratamientos.mostrarTratamientos(tablePacientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDescipcionTratamiento = new javax.swing.JTextField();
        txtIdPaciente = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtObservaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePacientes = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRATAMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("DES. TRATAMIENTO:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("ID PACIENTE:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("FECHA DE INICIO:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("FECHA FIN:");

        txtID.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtDescipcionTratamiento.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtDescipcionTratamiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescipcionTratamientoFocusLost(evt);
            }
        });
        txtDescipcionTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescipcionTratamientoActionPerformed(evt);
            }
        });

        txtIdPaciente.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtIdPaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdPacienteFocusLost(evt);
            }
        });

        txtFechaInicio.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtFechaInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaInicioFocusLost(evt);
            }
        });
        txtFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioActionPerformed(evt);
            }
        });

        txtFechaFin.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtFechaFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFinFocusLost(evt);
            }
        });
        txtFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaFinActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(51, 51, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(153, 255, 153));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtObservaciones.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacionesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("OBSERVACIONES:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtObservaciones)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(txtDescipcionTratamiento)
                    .addComponent(txtIdPaciente)
                    .addComponent(txtFechaInicio)
                    .addComponent(txtFechaFin)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescipcionTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablePacientes.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePacientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtDescipcionTratamientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescipcionTratamientoFocusLost
        
    }//GEN-LAST:event_txtDescipcionTratamientoFocusLost

    private void txtDescipcionTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescipcionTratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescipcionTratamientoActionPerformed

    private void txtIdPacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdPacienteFocusLost
        String textoDNI = txtIdPaciente.getText(); // Obtén el texto del campo

    if (!esNumero(textoDNI)) { // Verifica si NO es un número
        // Muestra un mensaje solicitando que ingrese un número válido
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para el Telefono.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        
        // Limpia el campo de texto
        txtIdPaciente.setText("");

        // Vuelve a enfocar el campo para que el usuario lo corrija
        txtIdPaciente.requestFocus();
    }
    }//GEN-LAST:event_txtIdPacienteFocusLost

    private void txtFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioActionPerformed

    }//GEN-LAST:event_txtFechaInicioActionPerformed

    private void txtFechaFinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFinFocusLost
        String textoFechaNacimiento = txtFechaFin.getText(); // Obtén el texto del campo

        // Define el formato de fecha esperado
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false); // Para evitar fechas inválidas

        try {
            // Intenta parsear la fecha ingresada
            Date fechaNacimiento = (Date) formatoFecha.parse(textoFechaNacimiento);

            // Si llegamos aquí, la fecha es válida y puedes proceder
            // Aquí puedes almacenar 'fechaNacimiento' en tu base de datos
        } catch (ParseException e) {
            // Muestra un mensaje solicitando que ingrese una fecha válida
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha válida en el formato dd/MM/yyyy.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);

            // Limpia el campo de texto
            txtFechaFin.setText("");

            // Vuelve a enfocar el campo para que el usuario lo corrija
            txtFechaFin.requestFocus();
        }
        }

        // Método para verificar si el texto es un número
        private boolean esNumero(String texto) {
            try {
                Double.parseDouble(texto);  // Verifica si se puede convertir a número
                return true; // Es un número
            } catch (NumberFormatException e) {
                return false; // No es un número
            }
    }//GEN-LAST:event_txtFechaFinFocusLost

    private void txtFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFinActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        CTratamientos objetoPacientes = new CTratamientos ();
        objetoPacientes. insertarTratamiento(txtIdPaciente, txtDescipcionTratamiento, txtFechaInicio, txtFechaFin, txtObservaciones);
        objetoPacientes.mostrarTratamientos(tablePacientes);
        txtID.setText("");
        txtDescipcionTratamiento.setText("");
        txtIdPaciente.setText("");
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        txtObservaciones.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        CTratamientos objetoPacientes = new CTratamientos ();
        objetoPacientes.modificarTratamiento(txtID, txtIdPaciente, txtDescipcionTratamiento, txtFechaInicio, txtFechaFin, txtObservaciones);
        objetoPacientes.mostrarTratamientos(tablePacientes);
        txtID.setText("");
        txtDescipcionTratamiento.setText("");
        txtIdPaciente.setText("");
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        txtObservaciones.setText("");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        CTratamientos objetoPacientes = new CTratamientos ();
        objetoPacientes.eliminarTratamiento(txtID);
        objetoPacientes.mostrarTratamientos(tablePacientes);
        txtID.setText("");
        txtDescipcionTratamiento.setText("");
        txtIdPaciente.setText("");
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        txtObservaciones.setText("");

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePacientesMouseClicked
        CTratamientos objetoPacientes = new CTratamientos ();
        objetoPacientes.seleccionarTratamiento(tablePacientes, txtID, txtIdPaciente, txtDescipcionTratamiento, txtFechaInicio, txtFechaFin, txtObservaciones);
    }//GEN-LAST:event_tablePacientesMouseClicked

    private void txtObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesActionPerformed

    private void txtFechaInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaInicioFocusLost
        String textoFechaNacimiento = txtFechaInicio.getText(); // Obtén el texto del campo

        // Define el formato de fecha esperado
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false); // Para evitar fechas inválidas

        try {
            // Intenta parsear la fecha ingresada
            Date fechaNacimiento = (Date) formatoFecha.parse(textoFechaNacimiento);

            // Si llegamos aquí, la fecha es válida y puedes proceder
            // Aquí puedes almacenar 'fechaNacimiento' en tu base de datos
        } catch (ParseException e) {
            // Muestra un mensaje solicitando que ingrese una fecha válida
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha válida en el formato dd/MM/yyyy.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);

            // Limpia el campo de texto
            txtFechaInicio.setText("");

            // Vuelve a enfocar el campo para que el usuario lo corrija
            txtFechaInicio.requestFocus();
        }
        

        
    }//GEN-LAST:event_txtFechaInicioFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePacientes;
    private javax.swing.JTextField txtDescipcionTratamiento;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
