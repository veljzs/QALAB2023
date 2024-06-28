
public class Main {
    public static void main(String[] args) {
    System.out.println("hello word");

    Personas jose;

    System.out.println("#######");

    jose = new Personas("Jose Perez");
    System.out.println("#######");

    jose.caminar();
    jose.comer();
    jose.saltar();
    jose.setNombre("Pepito martinez");

    System.out.println(jose.getNombre());

    //intanciar contructor Carro(color)
        Carro mazda = new Carro("Rojo");
        mazda.setColor("amarillo");
        System.out.println(mazda.getColor());
    }

}