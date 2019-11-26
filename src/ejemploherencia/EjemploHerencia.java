package ejemploherencia;

import java.util.ArrayList;
import Seleccion.Entrenador;
import Seleccion.Futbolista;
import Seleccion.Masajista;
import Seleccion.SeleccionFutbol;

public class EjemploHerencia {
//ArrayList de objetos SeleccionFutbol. Independientemente de la clase hija a la que pertenezca el objeto    

    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList();

    public static void main(String[] args) {
        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);
        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);
        //RUEDA DE PRENSA CON EL MÉTODO DEFAULT DE LA INTERFACE
        System.out.println("\nTodos los integrantes dan una rueda de prensa");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.ruedaPrensa();
        }

        //VIDEO PUBLICITARIO CON EL MÉTODO DEFAULT DE LA INTERFACE
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.videoPublicitario();
        }
        //CONCENTRACION
        System.out.println("Todos los integrantes se concentran");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.concentrarse();
        }
        //VIAJE
        System.out.println("\nTodos los integrantes viajan");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }
        //ENTRENAMIENTO
        System.out.println("\nTodos los integrantes entrenan");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenar();
        }
        //JUGAR PARTIDO
        System.out.println("\nTodos los integrantes cumplen su rol en el partido");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.jugarPartido();
        }
                
    }
}
