package Seleccion;

public interface IntegranteSeleccionFutbol {
    void concentrarse();
    void viajar();
    void entrenar();
    void jugarPartido();
    default void ruedaPrensa(){
        System.out.println("Participar de una rueda de prensa(Desde la interface)");
    }
    default void videoPublicitario(){
        System.out.println("Hacer un video publicitario(Desde la interface");
    }
}
