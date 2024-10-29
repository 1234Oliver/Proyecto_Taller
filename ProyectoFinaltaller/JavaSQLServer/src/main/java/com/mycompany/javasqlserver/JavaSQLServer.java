    

package com.mycompany.javasqlserver;

import Controlador.ControladorP;
import Vista.FormularioCRUDPrincipal;

/**
 *
 * @author RedEyes
 */
public class JavaSQLServer {

   public static void main(String[] args) {
       // Inicializa la vista (FormularioCRUDPrincipal)
       FormularioCRUDPrincipal vista = new FormularioCRUDPrincipal();
       
       // Pasa la vista correctamente inicializada al controlador
       ControladorP controlador = new ControladorP(vista);
       
       // Haz visible el formulario
       vista.setVisible(true);
   }
}
