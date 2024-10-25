
package Vista;

import Modelo.CCitas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class FormularioCRUDP extends javax.swing.JPanel {

    public FormularioCRUDP() {
        initComponents();
        CCitas objetoAlumno = new CCitas (); 
        objetoAlumno.mostrarPersonal(tableAlumnos);
        btnVerPyD.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlumnos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaInfo = new javax.swing.JTextArea();
        btnVerPyD = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtIdPaciente = new javax.swing.JTextField();
        txtIdDoctor = new javax.swing.JTextField();
        txtFechaHora = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();

        tableAlumnos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAlumnos);

        textAreaInfo.setColumns(20);
        textAreaInfo.setRows(5);
        jScrollPane2.setViewportView(textAreaInfo);

        btnVerPyD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVerPyD.setForeground(new java.awt.Color(204, 204, 204));
        btnVerPyD.setText("Ver Paciente y Doctor");
        btnVerPyD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPyDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVerPyD)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnVerPyD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CITAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Id Paciente");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Id Doctor");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Fecha/Hora");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Motivo");

        txtID.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtIdPaciente.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtIdPaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdPacienteFocusLost(evt);
            }
        });
        txtIdPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPacienteActionPerformed(evt);
            }
        });

        txtIdDoctor.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtIdDoctor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdDoctorFocusLost(evt);
            }
        });

        txtFechaHora.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtFechaHora.setText("dd/MM/yyyy HH:mm");
        txtFechaHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaHoraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaHoraFocusLost(evt);
            }
        });
        txtFechaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaHoraActionPerformed(evt);
            }
        });

        txtMotivo.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        txtMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotivoActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Estado");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agendada", "Confirmada", "En espera", "Completada", "Cancelada", "No asistió" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
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
                    .addComponent(txtID)
                    .addComponent(txtIdPaciente)
                    .addComponent(txtIdDoctor)
                    .addComponent(txtFechaHora)
                    .addComponent(txtMotivo)
                    .addComponent(cboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(jLabel2)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(16, 16, 16))
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

    private void tableAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAlumnosMouseClicked
 mostrarDatos();                                               
    CCitas objetoAlumno = new CCitas();
    
    // Pasar el JComboBox completo en lugar de un String
    objetoAlumno.SeleccionarCita(tableAlumnos, txtID, txtIdPaciente, txtIdDoctor, txtFechaHora, txtMotivo, cboEstado);

    }//GEN-LAST:event_tableAlumnosMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIdPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPacienteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
       try {
        CCitas objetoAlumno = new CCitas();

        // Obtén el valor seleccionado del ComboBox como texto
        String estadoSeleccionado = cboEstado.getSelectedItem().toString();
        
        // Inserta la cita con los datos del formulario
        objetoAlumno.InsertarCita(txtIdPaciente, 
                                  txtIdDoctor, 
                                  txtFechaHora, 
                                  txtMotivo, 
                                  estadoSeleccionado);  // Pasando el estado como String

        // Actualiza la tabla de alumnos
        objetoAlumno.mostrarPersonal(tableAlumnos);

        // Limpiar campos de texto después de guardar
        txtID.setText("");
        txtIdPaciente.setText("");
        txtIdDoctor.setText("");
        txtFechaHora.setText("");
        txtMotivo.setText("");
        
    } catch (Exception e) {
        e.printStackTrace();  // Para ver el error en la consola
        JOptionPane.showMessageDialog(null, "Error al guardar la cita: " + e.getMessage());
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
try {
        CCitas objetoAlumno = new CCitas();
        
        // Obtén el valor seleccionado del ComboBox como texto
        String estadoSeleccionado = cboEstado.getSelectedItem().toString();
        
        // Modifica la cita con los datos del formulario
        objetoAlumno.ModificarCita(txtID,           // ID de la cita
                                   txtIdPaciente,   // ID del paciente
                                   txtIdDoctor,     // ID del doctor
                                   txtFechaHora,    // Fecha y hora de la cita
                                   txtMotivo,       // Motivo de la cita
                                   estadoSeleccionado);  // Estado seleccionado del ComboBox

        // Actualiza la tabla de citas
        objetoAlumno.mostrarPersonal(tableAlumnos);

        // Limpiar los campos de texto después de la modificación
        txtID.setText("");
        txtIdPaciente.setText("");
        txtIdDoctor.setText("");
        txtFechaHora.setText("");
        txtMotivo.setText("");
        
    } catch (Exception e) {
        e.printStackTrace();  // Imprimir el error en la consola para depuración
        JOptionPane.showMessageDialog(null, "Error al modificar la cita: " + e.getMessage());
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        CCitas objetoAlumno = new CCitas ();
        objetoAlumno.EliminarCita(txtID);
        objetoAlumno.mostrarPersonal(tableAlumnos);
        txtID.setText("");
        txtIdPaciente.setText("");
        txtIdDoctor.setText("");
        txtFechaHora.setText("");
        txtMotivo.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdPacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdPacienteFocusLost
        String textoDNI = txtIdPaciente.getText(); // Obtén el texto del campo

    if (!esNumero(textoDNI)) { // Verifica si NO es un número
        // Muestra un mensaje solicitando que ingrese un número válido
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para el ID.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        
        // Limpia el campo de texto
        txtIdPaciente.setText("");

        // Vuelve a enfocar el campo para que el usuario lo corrija
        txtIdPaciente.requestFocus();
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

    
    }//GEN-LAST:event_txtIdPacienteFocusLost

    private void txtMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotivoActionPerformed
       
    }//GEN-LAST:event_txtMotivoActionPerformed

    private void txtIdDoctorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdDoctorFocusLost

}                                 

// Método para verificar si el texto contiene números
private boolean contieneNumero(String texto) {
    // Recorre cada caracter del texto y verifica si es un dígito
    for (char c : texto.toCharArray()) {
        if (Character.isDigit(c)) {
            return true; // Si encuentra un número, retorna verdadero
        }
    }
    return false; // Si no encuentra números, retorna falso

    
    }//GEN-LAST:event_txtIdDoctorFocusLost

    private void txtFechaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaHoraActionPerformed
      
    }//GEN-LAST:event_txtFechaHoraActionPerformed

    private void txtFechaHoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaHoraFocusLost
      String textoFechaHora = txtFechaHora.getText(); // Obtén el texto del campo

    // Define el formato de fecha y hora esperado
    SimpleDateFormat formatoFechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    formatoFechaHora.setLenient(false); // Para evitar fechas y horas inválidas

    try {
        // Intenta parsear la fecha y hora ingresada
        Date FechaHora = (Date) formatoFechaHora.parse(textoFechaHora);

        // Si llegamos aquí, la fecha y hora son válidas y puedes proceder
        // Aquí puedes almacenar 'fechaInicio' en tu base de datos

    } catch (ParseException e) {
        // Muestra un mensaje solicitando que ingrese una fecha y hora válida
        JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha y hora válida en el formato dd/MM/yyyy HH:mm.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);

        // Limpia el campo de texto
        txtFechaHora.setText("");

        // Vuelve a enfocar el campo para que el usuario lo corrija
        txtFechaHora.requestFocus();
    }
    }//GEN-LAST:event_txtFechaHoraFocusLost

    private void txtFechaHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaHoraFocusGained
       txtFechaHora.setText("");
    }//GEN-LAST:event_txtFechaHoraFocusGained

    private void btnVerPyDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPyDActionPerformed
        btnVerPyD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDatos();
            }
        });
        }
        private void mostrarDatos() {
            int selectedRow = tableAlumnos.getSelectedRow();

            if (selectedRow != -1) {
                try {
                    // Obtener los IDs de paciente y doctor desde la tabla
                    String ID_Paciente = tableAlumnos.getValueAt(selectedRow, 1).toString();
                    String ID_Doctor = tableAlumnos.getValueAt(selectedRow, 2).toString();

                    // Instanciar CCitas y obtener la información
                    CCitas citas = new CCitas();
                    String pacienteInfo = citas.obtenerDatosPaciente(ID_Paciente);
                    String doctorInfo = citas.obtenerDatosDoctor(ID_Doctor);

                    // Mostrar la información en el JTextArea
                    textAreaInfo.setText(pacienteInfo + doctorInfo);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al obtener datos: " + ex.getMessage());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Ocurrió un error: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona una fila de la tabla de citas.");
            }
    }//GEN-LAST:event_btnVerPyDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVerPyD;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAlumnos;
    private javax.swing.JTextArea textAreaInfo;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdDoctor;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtMotivo;
    // End of variables declaration//GEN-END:variables
}
