package Seleccion;

public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;
    public Futbolista(){
        super();
            }
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
    super(id, nombre, apellidos,edad);
    this.dorsal=dorsal;
    this.demarcacion=demarcacion;
}

    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     * @return the demarcacion
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     * @param demarcacion the demarcacion to set
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    @Override
    public void jugarPartido(){
        System.out.println("El futbolista reimplementa el método jugarPartido() de la clase SeleccionFutbol");
        
    }
    @Override
    public void entrenar(){
        System.out.println("El futbolista reimplementa el método entrenar() de la clase SeleccionFutbol");
    }
    public void entrevista(){
        System.out.println("El futbolista da una entrevista");
    }
}
