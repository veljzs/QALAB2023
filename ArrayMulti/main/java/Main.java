import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //Declaración de variables
//        int edad;
//        int diasSemana;
//
//        //Inicializacion
//        edad = 30;
//
//        //Asignacion o cambio de valor
//        edad = 20;
//
//        //Declaracion + Inicializacion
//        int dias = 30;
//        System.out.println( "Edad : " + edad);

        //Uso subString y while
 //       String nombre = "Jose Martinez Guerrero. Hola como estas?";
//        System.out.println(nombre.substring(5)); //Corta desde posicion 5
//        System.out.println(nombre.substring(5, 13)); //Corta desde posicion 5 hasta una antes de la 13

//        //Imprimir palabras una bajo otra
//            //Recortar y que se guarde en varibles.
//        int posicion;
//        int contador = 0;
//        String a, b;
//        b = nombre + " ";
//        posicion = b.indexOf(" ");
//        while (posicion>0){
//            a = b.substring(0, posicion);
//            b = b.substring(posicion+1);
//            posicion = b.indexOf(" ");
//            System.out.println(a);
//            contador ++;
//        }
//        System.out.println("Cantidad de palabras: " + contador);

          // Capturar un input y grafico de piramide.
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        int number = scanner.nextInt();
        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }for (int i=number; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
//        //Arrays y  for
//        int num[] = {201, 2, 23, 3, 30, 20, 4, 9, 88};
//
//        System.out.println("Valor: " + num[8]); //es igual a:
//        System.out.println("longitud: " + num[num.length-1]);
//
//        for(int i=0; i<= num.length-1; i++){
//            System.out.println("Valor: " + num[i]);
//        }

        //Array de array
       /* int datos [][] = {{1,2,3}, {10,20,30},{-1,-2,-3}};

        System.out.println(datos[2][1]);

        for(int i=0; i<datos.length;i++){
            for(int j=0; j<datos[i].length; j++){
                System.out.println(datos[i][j]);
            }
        }*/

        //ejercicio array con for e if
        int lista []= {6, 9, -8, 23, 3, 100, 3};

        int nNum1 = lista[0];
        int nNum2 = lista[0];
        for (int i=1; i<lista.length; i++){
            if(lista[i] < nNum1){
                nNum1 = lista[i];
            }
            if(lista[i] < nNum2){
                nNum2 = lista[i];
            }
        }
        System.out.println("nNum1: "+nNum1+", nNum2: "+nNum2);

/*        int num[]= {10, 2, 1, 30};
        int i;
        int temp;
        for (int j=0; 0<num.length-1; j++){
            for (i=0; i<num.length -1; i++ ){
                if(num[i] < num[i + 1]){
                    temp = num[i];
                    num[i] = num[i+1];
                    num[i+1]=temp;
                }
            }

        }
        System.out.println(num[0]+"&"+num[num.length-1]);*/
    }
}