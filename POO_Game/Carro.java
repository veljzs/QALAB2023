public class Carro {
    //atributos
    private String color;
    private String marca;
    private String matricula;

    //metodos
    void arrancar () {
        System.out.println("arrancando..");
    }
    void acelerar () {
        System.out.println("acelerando..");
    }
    void parar () {
        System.out.println("parando..");
    }

    //setters y getters
    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    //Constructor
    public Carro(String color) {
        this.color = color;
    }


}
