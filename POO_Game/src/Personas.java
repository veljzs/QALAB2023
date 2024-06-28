public class Personas {
    //atributos
    private String nombre;
    int anioNacimiento;
    String Pais;
    String tipoDocumento;
    String numDocumento;
    Corazon cor;


    //constructores (metodo que se ejecuta cuando se instancia)
    public Personas(){
        System.out.println("ejecutando desde constructor");
    }

    public Personas(String nombre){
        this.nombre = nombre;
    }

    //seter y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos (acciiones que desarrolla el objeto)
    void caminar (){
        System.out.println("caminando...");
    }
    void comer (){
        System.out.println("comiendo...");
    }
    void respirar (){
        System.out.println("comiendo...");
    }
    void hablar (){
        System.out.println("hablando...");
    }
    void saltar (){
        System.out.println("saltando...");
    }
}
