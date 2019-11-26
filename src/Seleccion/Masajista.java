package Seleccion;

public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int aniosExperiencia;
    public Masajista(){
        
    }
    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia){
        super(id, nombre, apellidos, edad);
        this.titulacion=titulacion;
        this.aniosExperiencia=aniosExperiencia;
    }

    /**
     * @return the titulacion
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * @param titulacion the titulacion to set
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     * @return the aniosExperiencia
     */
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    /**
     * @param aniosExperiencia the aniosExperiencia to set
     */
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public void darMasaje(){
        System.out.println("Da un masaje");
        
    }
    @Override
    public void entrenar(){
        System.out.println("El masajista reimplementa el método entrenar() de la clase SeleccionFutbol");
    }
    
}
