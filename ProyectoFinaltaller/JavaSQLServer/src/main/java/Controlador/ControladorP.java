
package Controlador;

import Vista.FormularioCRUDPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorP {
    
    private FormularioCRUDPrincipal vista;
    
        
    public ControladorP(FormularioCRUDPrincipal vista){
    
        this.vista=vista;
        
        
        this.vista.agregarAlumnoListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                VizualizarA();
            }
    });
        this.vista.agregarDocenteListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                VizualizarD();
            }
    });
        this.vista.agregarPersonalListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                VizualizarP();
            }
    });
        this.vista.agregarCitalListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                VizualizarCita();
            }
    });
        

        this.vista.agregarSalirListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Salir();
            }
        });
        

    }
    
    public void VizualizarA(){
    
        vista.añadirA();
        
    }
    public void VizualizarD(){
    
        vista.añadirD();
        
    }
    public void VizualizarP(){
    
        vista.añadirP();
        
    }
    public void VizualizarCita(){
    
        vista.añadirCita();
        
    }
    
    
    public void Salir(){
    
        System.exit(0);
        
    }

}
