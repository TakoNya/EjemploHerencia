package Seleccion;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    public SeleccionFutbol(){
    }
    
    public SeleccionFutbol(int id, String nombre, String apellidos, int edad){
        this.id =id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void concentrarse(){
        System.out.println("SeleccionFutbol implementa el método concentrarse() de la interface");
    }
    public void viajar(){
        System.out.println("SeleccionFutbol implementa el método viajar() de la interface");
    }
    public void entrenar(){
        System.out.println("SeleccionFutbol implementa el método entrenar() de la interface");
    }
    
    public void jugarPartido(){
        System.out.println("SeleccionFutbol implementa el método jugarPartido() de la interface");
    }
    
}
