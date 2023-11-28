import java.util.Arrays;
import java.util.Scanner;

public class PrimerContactoArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cuantos alumnos hay?");
        int nAlumnos = validaInt();
        float notas[] = new float[nAlumnos];
        float nota, notaMedia=0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota del alumno "+(i+1));
            do {
                nota = validaFloat();
                if (nota<0 || nota>10){
                    System.out.println("La nota debe ser entre 0 y 10");
                }
            }while(nota<0 || nota>10);
            notas[i] = nota;
            notaMedia += nota;
        }

        System.out.print("[");
        for (int i = 0; i < notas.length; i++) {
            if (i == notas.length-1)
                System.out.print(notas[i]);
            else
                System.out.print(notas[i]+", ");
        }
        System.out.println("]");

        System.out.println(Arrays.toString(notas));

        System.out.println("Nota media: "+(notaMedia / nAlumnos));
    }

    public static float validaFloat(){
        float num;
        while (!sc.hasNextFloat()){
            System.out.println("Eso no es un numero!");
            sc.next();
        }
        num = sc.nextFloat();
        return num;
    }

    public static int validaInt() {
        int num;
        while (!sc.hasNextInt()) {
            System.out.println("Eso no es un numero!");
            sc.next(); // IMPORTANTE!
        }
        num = sc.nextInt();
        return num;
    }
}
