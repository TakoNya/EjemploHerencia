package Atletas;

public interface Nadador {
    public default String nadar(){
        return "es un atleta que nada en aguas frías";
    }
    
}
