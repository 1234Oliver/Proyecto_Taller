
package Modelo;

import Conexion.CConexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CPacientes {
public void mostrarPacientes (JTable paramTablaPacientes) {
CConexion objetoConexion = new CConexion ();
DefaultTableModel modelo = new DefaultTableModel();
String sql="";

modelo.addColumn ("Id");
modelo.addColumn ("Nombre");
modelo.addColumn ("Fecha de Nacimiento");
modelo.addColumn ("Direccion");
modelo.addColumn ("Telefono");
modelo.addColumn ("Email");
paramTablaPacientes.setModel (modelo);
sql="select * from dbo.Pacientes;";
String []datos= new String[6];
Statement st;
try {
st =
objetoConexion.establecerConexion().createStatement ();
ResultSet rs = st.executeQuery (sql);
while (rs.next()) {
    
datos [0]=rs.getString(1); 
datos [1]=rs.getString (2); 
datos [2]=rs.getString(3); 
datos [3]=rs.getString(4); 
datos [4]=rs.getString(5);
datos [5]=rs.getString(6);

modelo.addRow(datos);
}

paramTablaPacientes.setModel (modelo);
}
catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se mostraron los registros, error: "+ e.toString());
}
}
public void SeleccionarPacientes (JTable paramTablaPacientes, JTextField paramId,JTextField paramNombre,JTextField paramFechaNacimiento, JTextField paramDireccion, JTextField paramTelefono,JTextField paramEmail) { 
    try {
        int fila = paramTablaPacientes.getSelectedRow();
if (fila>=0) {

paramId.setText (paramTablaPacientes.getValueAt (fila, 0).toString());
paramNombre.setText (paramTablaPacientes.getValueAt (fila, 1).toString());
paramFechaNacimiento.setText (paramTablaPacientes.getValueAt (fila, 2).toString());
paramDireccion.setText (paramTablaPacientes.getValueAt (fila, 3).toString());
paramTelefono.setText (paramTablaPacientes.getValueAt (fila, 4).toString());
paramEmail.setText (paramTablaPacientes.getValueAt (fila, 5).toString());
}
else{
}
//JOptionPane.showMessageDialog(null, "No se selecciono registros, error: ");
    }catch(Exception e){ 
        
        JOptionPane.showMessageDialog(null, "error de selec, error: "+ e.toString());
        
    }

}
public void InsertarPacientes (JTextField paramNombre,JTextField paramFechaNacimiento, JTextField paramDireccion, JTextField paramTelefono,JTextField paramEmail){
CConexion objetoConexion = new CConexion();
String consulta = "insert into Pacientes (Nombre,FechaNacimiento,Direccion,Telefono,Email) values(?,?,?,?,?);";
try {
CallableStatement cs=objetoConexion.establecerConexion () .prepareCall (consulta);
cs.setString (1, paramNombre.getText());
cs.setString (2, paramFechaNacimiento.getText());
cs.setString (3, paramDireccion.getText());
cs.setString (4, paramTelefono.getText());
cs.setString (5, paramEmail.getText());
cs.execute();
JOptionPane.showMessageDialog(null, "Se insertó correctamente el Paciente");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Error de inserción, error: "+ e.toString());
}
}

public void ModificarPacientes (JTextField paramId,JTextField paramNombre,JTextField paramFechaNacimiento, JTextField paramDireccion, JTextField paramTelefono,JTextField paramEmail){
    CConexion objetoConexion = new CConexion ();
    String consulta = "UPDATE Pacientes SET Pacientes.Nombre=?, Pacientes.FechaNacimiento=?, Pacientes.Direccion=?, Pacientes.Telefono=?, Pacientes.Email=? WHERE Pacientes.ID=?;";
        try {
    CallableStatement cs =objetoConexion.establecerConexion () .prepareCall (consulta);
    cs.setString (1, paramNombre.getText());
cs.setString (2, paramFechaNacimiento.getText());
cs.setString (3, paramDireccion.getText());
cs.setString (4, paramTelefono.getText());
cs.setString (5, paramEmail.getText());
cs.execute();
JOptionPane.showMessageDialog(null, "Se modificó correctamente el alumno");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Error de modificación, error: "+ e.toString());
}
}

public void EliminarPacientes (JTextField paramCodigo) {
    CConexion objetoConexion=new CConexion();
    String consulta ="DELETE FROM Pacientes WHERE Pacientes.ID=?;";
    try {
    CallableStatement cs =objetoConexion.establecerConexion () .prepareCall (consulta);
    cs.setInt(1, Integer.parseInt (paramCodigo.getText())); cs.execute();
    JOptionPane.showMessageDialog(null, "Se eliminó correctamente el Pacientes");
    } catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error de eliminación, error: "+ e.toString());
    }
    
}
}
