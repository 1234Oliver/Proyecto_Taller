
package Modelo;

import Conexion.CConexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CDoctores {
    public void mostrarDoctores(JTable paramTablaDoctores) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Id");
        modelo.addColumn("Nombres");  
        modelo.addColumn("Especialidad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        paramTablaDoctores.setModel(modelo);
        sql = "select * from dbo.Doctores;";
        String[] datos = new String[5];
        Statement st;
        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1); // Id
                datos[1] = rs.getString(2); // Nombres
                datos[2] = rs.getString(3); // Especialidad
                datos[3] = rs.getString(4); // Telefono
                datos[4] = rs.getString(5); // Correo
                

                modelo.addRow(datos);
            }

            paramTablaDoctores.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros, error: " + e.toString());
        }
    }

    public void SeleccionarDocente(JTable paramTablaDoctores, JTextField paramId,JTextField paramNombres,JTextField paramEspecialidad,JTextField paramTelefono, JTextField paramEmail) {
        try {
            int fila = paramTablaDoctores.getSelectedRow();
            if (fila >= 0) {
                paramId.setText(paramTablaDoctores.getValueAt(fila, 0).toString()); 
                paramNombres.setText(paramTablaDoctores.getValueAt(fila, 1).toString());
                paramEspecialidad.setText(paramTablaDoctores.getValueAt(fila, 2).toString());
                paramTelefono.setText(paramTablaDoctores.getValueAt(fila, 3).toString());
                paramEmail.setText(paramTablaDoctores.getValueAt(fila, 4).toString()); 
                 
            } else {
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún registro.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar registro: " + e.toString());
        }
    }

    public void InsertarDoctores(JTextField paramNombres,JTextField paramEspecialidad,JTextField paramTelefono, JTextField paramEmail) {
        CConexion objetoConexion = new CConexion();
        String consulta = "insert into Doctores (Nombre, Especialidad, Telefono, Email) values (?, ?, ?, ?);";
        try {
            
       
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, paramNombres.getText());
            cs.setString(2, paramEspecialidad.getText());
            cs.setString(3, paramTelefono.getText());
            cs.setString(4, paramEmail.getText());
            
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se insertó correctamente el Doctores");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de inserción, error: " + e.toString());
        }
    }

    public void ModificarDoctores(JTextField paramId,JTextField paramNombres,JTextField paramEspecialidad,JTextField paramTelefono, JTextField paramEmail) {
        CConexion objetoConexion = new CConexion();
        String consulta = "UPDATE Doctores SET Doctores.Nombre=?, Doctores.Especialidad=?, Doctores.Telefono=?, Doctores.Email=? WHERE Doctores.ID=?;";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, paramNombres.getText());
            cs.setString(2, paramEspecialidad.getText());
            cs.setString(3, paramTelefono.getText());
            cs.setString(4, paramEmail.getText());
            cs.setInt(5, Integer.parseInt(paramId.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se modificó correctamente el Doctores");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de modificación, error: " + e.toString());
        }
    }

    public void EliminarDoctores(JTextField paramId) {
        CConexion objetoConexion = new CConexion();
        String consulta = "DELETE FROM Doctores WHERE Doctores.ID=?;";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, Integer.parseInt(paramId.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el Doctor");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de eliminación, error: " + e.toString());
        }
    }
}
