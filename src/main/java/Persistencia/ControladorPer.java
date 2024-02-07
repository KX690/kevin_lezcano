
package Persistencia;

import Logica.Automovil;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorPer {
    AutomovilJpaController autoJpa =new AutomovilJpaController();
    public void agregarAutomovil(Automovil auto) {
        
        try {
            autoJpa.create(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPer.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public List<Automovil> traerDatos() {
        return autoJpa.findAutomovilEntities();
    }

  

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificar(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    
    
}
