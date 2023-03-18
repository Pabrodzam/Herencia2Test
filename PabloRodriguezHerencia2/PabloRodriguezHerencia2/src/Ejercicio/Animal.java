package Ejercicio;

public abstract class Animal {
    private Sexo sexo;
    public Animal () {
        this.sexo = Sexo.MACHO;
    }
    public Animal (Sexo s) {
        this.sexo = s;
    }
    public Sexo getSexo() {
        return this.sexo;
    }
    public void duerme() {
        System.out.println("Duermo como un tronco");
    }
    public void come(String comida) {
        System.out.println("Estoy comiendo " + comida);
    }
}
