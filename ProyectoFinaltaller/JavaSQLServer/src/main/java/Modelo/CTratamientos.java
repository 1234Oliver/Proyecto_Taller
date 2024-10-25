
package Modelo;

import Conexion.CConexion;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CTratamientos {
    public void mostrarTratamientos(JTable paramTablaTratamientos) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql;

        modelo.addColumn("ID");
        modelo.addColumn("ID Paciente");
        modelo.addColumn("Descripción Tratamiento");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Fin");
        modelo.addColumn("Observaciones");
        paramTablaTratamientos.setModel(modelo);
        sql = "SELECT * FROM dbo.Tratamientos;"; // Asegúrate de que la consulta es correcta
        String[] datos = new String[6]; // Cambié a 6 columnas
        Statement st;
        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("ID");                       // ID
                datos[1] = rs.getString("ID_Paciente");              // ID Paciente
                datos[2] = rs.getString("DescripcionTratamiento");   // Descripción Tratamiento
                datos[3] = rs.getString("FechaInicio");              // Fecha Inicio
                datos[4] = rs.getString("FechaFin");                 // Fecha Fin
                datos[5] = rs.getString("Observaciones");            // Observaciones

                modelo.addRow(datos);
            }

            paramTablaTratamientos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros, error: " + e.toString());
        }
    }

    public void seleccionarTratamiento(JTable paramTablaTratamientos, JTextField paramId, JTextField paramIdPaciente, JTextField paramDescripcionTratamiento, JTextField paramFechaInicio, JTextField paramFechaFin, JTextField paramObservaciones) {
        try {
            int fila = paramTablaTratamientos.getSelectedRow();
            if (fila >= 0) {
                paramId.setText(paramTablaTratamientos.getValueAt(fila, 0).toString());                       // ID
                paramIdPaciente.setText(paramTablaTratamientos.getValueAt(fila, 1).toString());              // ID Paciente
                paramDescripcionTratamiento.setText(paramTablaTratamientos.getValueAt(fila, 2).toString());   // Descripción Tratamiento
                paramFechaInicio.setText(paramTablaTratamientos.getValueAt(fila, 3).toString());              // Fecha Inicio
                paramFechaFin.setText(paramTablaTratamientos.getValueAt(fila, 4).toString());                 // Fecha Fin
                paramObservaciones.setText(paramTablaTratamientos.getValueAt(fila, 5).toString());            // Observaciones
            } else {
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún tratamiento.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar tratamiento: " + e.toString());
        }
    }

    public void insertarTratamiento(JTextField paramIdPaciente, JTextField paramDescripcionTratamiento, JTextField paramFechaInicio, JTextField paramFechaFin, JTextField paramObservaciones) {
        CConexion objetoConexion = new CConexion();
        String consulta = "INSERT INTO Tratamientos (ID_Paciente, DescripcionTratamiento, FechaInicio, FechaFin, Observaciones) VALUES (?, ?, ?, ?, ?);";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
cs.setInt(1, Integer.parseInt(paramIdPaciente.getText())); 
cs.setString(2, paramDescripcionTratamiento.getText());
            cs.setString(3, paramFechaInicio.getText()); // Asegúrate de que el formato sea correcto
            cs.setString(4, paramFechaFin.getText());     // Asegúrate de que el formato sea correcto
            cs.setString(5, paramObservaciones.getText());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Tratamiento insertado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de inserción, error: " + e.toString());
        }
    }

    public void modificarTratamiento(JTextField paramId, JTextField paramIdPaciente, JTextField paramDescripcionTratamiento, JTextField paramFechaInicio, JTextField paramFechaFin, JTextField paramObservaciones) {
        CConexion objetoConexion = new CConexion();
        String consulta = "UPDATE Tratamientos SET ID_Paciente=?, DescripcionTratamiento=?, FechaInicio=?, FechaFin=?, Observaciones=? WHERE ID=?;";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, Integer.parseInt(paramIdPaciente.getText())); 
            cs.setString(2, paramDescripcionTratamiento.getText());
            cs.setString(3, paramFechaInicio.getText()); // Asegúrate de que el formato sea correcto
            cs.setString(4, paramFechaFin.getText());     // Asegúrate de que el formato sea correcto
            cs.setString(5, paramObservaciones.getText());
            cs.setInt(6, Integer.parseInt(paramId.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Tratamiento modificado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de modificación, error: " + e.toString());
        }
    }

    public void eliminarTratamiento(JTextField paramId) {
        CConexion objetoConexion = new CConexion();
        String consulta = "DELETE FROM Tratamientos WHERE ID=?;";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, Integer.parseInt(paramId.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Tratamiento eliminado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de eliminación, error: " + e.toString());
        }
    }
}
