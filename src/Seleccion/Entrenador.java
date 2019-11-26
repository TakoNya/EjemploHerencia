package Seleccion;

public class Entrenador extends SeleccionFutbol{
    private String idFederacion;
    private Entrenador(){
        super();
    }
    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion){
        super(id, nombre, apellidos, edad);
        this.idFederacion=idFederacion;
        
    }

    /**
     * @return the idFederacion
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     * @param idFederacion the idFederacion to set
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido(){
        System.out.println("Dirige un partido");
    }
    public void dirigirEntrenamiento(){
        System.out.println("Dirige un entrenamiendo");
    }
    @Override
    public void entrenar(){
        System.out.println("El entrenador reimplementa el método entrenar() de la clase SeleccionFutbol");
    }
    @Override
    public void jugarPartido(){
        System.out.println("El entrenador reimplementa el método jugarPartido() de la clase SeleccionFutbol");
    }
}
