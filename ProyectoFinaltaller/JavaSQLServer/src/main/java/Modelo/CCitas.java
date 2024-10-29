
package Modelo;
import Conexion.CConexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CCitas {
    public void mostrarPersonal(JTable paramTablaCitas) {
        
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Id");
        modelo.addColumn("Id Paciente");
        modelo.addColumn("Id Doctor");
        modelo.addColumn("Fecha Hora");
        modelo.addColumn("Motivo");
        modelo.addColumn("Estado");
        paramTablaCitas.setModel(modelo);
        sql = "select * from dbo.Citas;";
        String[] datos = new String[6];
        Statement st;
        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1); // Id
                datos[1] = rs.getString(2); // Id_Paciente
                datos[2] = rs.getString(3); // Id_Doctor
                datos[3] = rs.getString(4); // fecha hora
                datos[4] = rs.getString(5); // motivo
                datos[5] = rs.getString(6); // estado
                

                modelo.addRow(datos);
            }

            paramTablaCitas.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros, error: " + e.toString());
        }
    }
    public String obtenerDatosPaciente(String ID_Paciente) throws SQLException {
    String consulta = "SELECT Nombre, Telefono, Email FROM dbo.Pacientes WHERE ID = ?";
    Connection conexion = objetoConexion.establecerConexion();  // Guarda la conexión en una variable
    
    if (conexion == null) {
        throw new SQLException("Error al establecer la conexión con la base de datos.");
    }
    
    PreparedStatement stmtPaciente = conexion.prepareStatement(consulta);
    stmtPaciente.setString(1, ID_Paciente);
    ResultSet rsPaciente = stmtPaciente.executeQuery();

    if (rsPaciente.next()) {
        return "Paciente: " + rsPaciente.getString("Nombre")  + "\n" +
               "Telefono: " + rsPaciente.getInt("Telefono") + "\n" +
               "Email: " + rsPaciente.getString("Email") + "\n"+
        "---------------------------------";
    }
    return "Paciente no encontrado.\n";
}
   
    CConexion objetoConexion = new CConexion();
    
    
    
    public String obtenerDatosDoctor(String ID_Doctor) throws SQLException {
    String consulta = "SELECT Nombre, Especialidad, Telefono FROM dbo.Doctores WHERE ID = ?";
    Connection conexion = objetoConexion.establecerConexion();  // Guarda la conexión en una variable
    
    if (conexion == null) {
        throw new SQLException("Error al establecer la conexión con la base de datos.");
    }
    
    PreparedStatement stmtDoctor = conexion.prepareStatement(consulta);
    stmtDoctor.setString(1, ID_Doctor);
    ResultSet rsDoctor = stmtDoctor.executeQuery();

    if (rsDoctor.next()) {
        return "\n" + "Doctor: " + rsDoctor.getString("Nombre")  + "\n" +
               "Especialidad: " + rsDoctor.getString("especialidad") + "\n"+
                "Telefono: " + rsDoctor.getString("Telefono");
        
    }
    return "Doctor no encontrado.\n";
}

    public void SeleccionarCita(JTable paramTablaCitas, JTextField paramId, JTextField paramIdPaciente, JTextField paramIdDoctor, JTextField paramFechaHora, JTextField paramMotivo, JComboBox<String> paramEstado) {
    try {
        int fila = paramTablaCitas.getSelectedRow();
        if (fila >= 0) {
            paramId.setText(paramTablaCitas.getValueAt(fila, 0).toString());        // Id
            paramIdPaciente.setText(paramTablaCitas.getValueAt(fila, 1).toString());  // IdPaciente
            paramIdDoctor.setText(paramTablaCitas.getValueAt(fila, 2).toString());   // IdDoctor
            paramFechaHora.setText(paramTablaCitas.getValueAt(fila, 3).toString());  // FechaHora
            paramMotivo.setText(paramTablaCitas.getValueAt(fila, 4).toString());     // Motivo
            
            // Seleccionar el estado correcto en el JComboBox
            String estado = paramTablaCitas.getValueAt(fila, 5).toString();  // El estado debe estar en la columna 5
            paramEstado.setSelectedItem(estado);  // Establece el estado seleccionado en el JComboBox
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna cita.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al seleccionar cita: " + e.toString());
    }
}

    public void InsertarCita(JTextField paramIdPaciente, JTextField paramIdDoctor, JTextField paramFechaHora, JTextField paramMotivo, String paramEstado) {
    CConexion objetoConexion = new CConexion();
    String consulta = "insert into Citas (Id_Paciente, Id_Doctor, FechaHora, Motivo, Estado) values (?, ?, ?, ?, ?);";
    try {
        CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
        cs.setInt(1, Integer.parseInt(paramIdPaciente.getText()));
        cs.setInt(2, Integer.parseInt(paramIdDoctor.getText()));
        cs.setString(3, paramFechaHora.getText());
        cs.setString(4, paramMotivo.getText());
        cs.setString(5, paramEstado);  // Ahora es un String directamente
        cs.execute();
        JOptionPane.showMessageDialog(null, "Se insertó correctamente la cita.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de inserción, error: " + e.toString());
    }
}


 public void ModificarCita(JTextField paramId, JTextField paramIdPaciente, JTextField paramIdDoctor, JTextField paramFechaHora, JTextField paramMotivo, String paramEstado) {
    CConexion objetoConexion = new CConexion();
    String consulta = "UPDATE Citas SET Id_Paciente=?, Id_Doctor=?, FechaHora=?, Motivo=?, Estado=? WHERE ID=?;";
    
    // Validar que el ID sea un número válido
    try {
        int idCita = Integer.parseInt(paramId.getText());

        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, Integer.parseInt(paramIdPaciente.getText()));
        cs.setInt(2, Integer.parseInt(paramIdDoctor.getText()));
            cs.setString(3, paramFechaHora.getText());
            cs.setString(4, paramMotivo.getText());
            cs.setString(5, paramEstado);
            cs.setInt(6, idCita);  // Usar el ID como entero validado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se modificó correctamente el personal");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de modificación en la base de datos: " + e.toString());
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "El ID de la cita no es válido. Debe ser un número.");
    }
}

    public void EliminarCita(JTextField paramCodigo) {
        CConexion objetoConexion = new CConexion();
        String consulta = "DELETE FROM Citas WHERE Citas.ID=?;";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, Integer.parseInt(paramCodigo.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la cita");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de eliminación, error: " + e.toString());
        }
    }
}
