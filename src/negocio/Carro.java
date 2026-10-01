package negocio;

public class Carro {
    int potencia;
    public double velocidad;

    void acelerar(){
        velocidad += potencia;

    }
    void frenar(){
        velocidad /= 2;
    }
}
