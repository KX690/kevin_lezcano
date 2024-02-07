package Logica;

import Persistencia.ControladorPer;
import java.util.List;

public class ControladorLog {

    ControladorPer persi = new ControladorPer();

    public void agregarAutomovil(String modelo, String marca, String color, String chapa, String motor, int can) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(chapa);
        auto.setPuerta(can);

        persi.agregarAutomovil(auto);
    }

    public List<Automovil> traerDatos() {
        return persi.traerDatos();
    }

    

    public void borrarAuto(int idAuto) {
           persi.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return persi.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String color, String chapa, String motor, int can) {
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPatente(chapa);
        auto.setModelo(modelo);
        auto.setPuerta(can);
        
        persi.modificar(auto);
    }



}
