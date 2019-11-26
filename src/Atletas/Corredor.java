package Atletas;

public interface Corredor {
    public default String correr(){
        return "es un atleta que corre.";
    }
}
