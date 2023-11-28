import java.util.Arrays;
import java.util.Scanner;

public class Practica3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        System.out.println(menu());
        do {
            System.out.println("\n-----------------------------------------------------------------------");
            System.out.print("\nQue ejercicio quieres probar?: ");
            menu = validaInt();
            sc.nextLine();
            switch (menu) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> System.out.println(menu());
                case 7 -> System.out.println("Has salido con exito.");
                default -> System.out.println("Ejercicio inexistente.");
            }
        }while(menu!=7);
    }

    // Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
    // del 1 al 25 y luego muestre la matriz por pantalla.
    public static void ejercicio1(){
        System.out.println("\n------------------------------EJERCICIO 1------------------------------\n");

        int[][] matriz = new int[5][5];
        int cont = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = cont;
                cont++;
            }
        }

        for (int i = 0; i < matriz.length; i++)
            System.out.println(Arrays.toString(matriz[i]));

        /* for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++)
                System.out.print(" "+matriz[i][j]+" ");
            System.out.println();
        }*/
    }

    // Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
    // de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
    // pantalla.
    public static void ejercicio2(){
        System.out.println("\n------------------------------EJERCICIO 2------------------------------\n");

        int[][] matriz = new int[10][10];
        int numero = 1, elemento=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = elemento;
                elemento += numero;
            }
            numero++;
            elemento = numero;
        }
        for (int i = 0; i < matriz.length; i++)
            System.out.println(Arrays.toString(matriz[i]));

        /*for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++)
                System.out.print(" "+matriz[i][j]+" ");
            System.out.println();
        }*/
    }

    // Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
    // teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
    // deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
    // que cero, cuántos son menores que cero y cuántos son igual a cero.
    public static void ejercicio3(){
        System.out.println("\n------------------------------EJERCICIO 3------------------------------\n");

        int f,c, num, contPos =0, contNeg=0, cont0=0;
        System.out.print("De cuantas filas y columnas desea la matriz?(Primero las filas): ");
        do {
            f = validaInt();
            if (f<=0) System.out.println("El numero de filas debe ser mayor que 0");
            c = validaInt();
            if (c<=0) System.out.println("El numero de columnas debe ser mayor que 0");
        }while(f<=0 || c<=0);
        int [][] matriz = new int[f][c];
        System.out.println("Escriba "+(f*c)+" numeros");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                num = validaInt();
                matriz[i][j] = num;
                if (num > 0) contPos++;
                else if (num < 0) contNeg++;
                else cont0++;
            }
        }
        for (int i = 0; i < matriz.length; i++)
            System.out.println(Arrays.toString(matriz[i]));
        System.out.println("Numeros positivos: "+contPos+"\nNumeros negativos: "+contNeg+"\nNumero de 0's: "+cont0);
    }

    // Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
    // “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
    // teclado y luego el programa mostrará la nota mínima, máxima y media de cada
    // alumno.
    public static void ejercicio4(){
        System.out.println("\n------------------------------EJERCICIO 4------------------------------\n");

        float[][] matriz = new float[4][5];
        float min =Integer.MAX_VALUE, max=Integer.MIN_VALUE, nota, media=0;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduzca las notas del alumno " + (i + 1));
            for (int j = 0; j < matriz[0].length; j++) {
                do {
                    System.out.print("\t- Asignatura " + (j + 1) + ": ");
                    nota = validaFloat();
                    if (nota < 0 || nota > 10) System.out.println("El numero debe estar entre 0 y 10");
                } while (nota < 0 || nota > 10);
                matriz[i][j] = nota;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (min>matriz[i][j]) min=matriz[i][j];
                else if (max<matriz[i][j]) max=matriz[i][j];
                media += matriz[i][j];
            }
            media = media / matriz[i].length;
            System.out.println("Alumno "+(i+1)+":"+"\n\tNota menor: "+min+"\n\tNota mayor: "+max+"\n\tNota media: "+media);
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            media=0;
        }
    }

    // Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
    // empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por
    // teclado la información de N personas distintas (valor también introducido por
    // teclado). Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su
    // sueldo. Esta información debe guardarse en una única matriz. Luego se mostrará por
    // pantalla el sueldo medio de cada género.
    public static void ejercicio5(){
        System.out.println("\n------------------------------EJERCICIO 5------------------------------\n");

        int filas,genero,sueldo, mediaMujeres=0, mediaHombres=0, contH=0, contM=0;
        System.out.print("De cuantas personas quieres almacenar informacion?: ");
        do {
            filas = validaInt();
            if (filas<0) System.out.print("El numero de personas almacenadas debe ser superior a 0: ");
        }while (filas<0);
        int[][] matriz = new int[filas][2];

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Genero del trabajador? (0 para varon y 1 para mujer): ");
            do {
                genero =validaInt();
                if (genero != 0 && genero != 1) System.out.println("Solo se puede 0 para varon y 1 para mujer.");
                if (genero == 0) contH++;
                else if (genero == 1) contM++;
            }while(genero != 0 && genero != 1);
            matriz[i][0] = genero;

            System.out.print("De cuanto es tu sueldo?: ");
            do {
                sueldo = validaInt();
                if (sueldo<0) System.out.println("El sueldo no puede ser negativo.");
            }while(sueldo<0);
            matriz[i][1] = sueldo;
        }

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == 0) mediaHombres += matriz[i][1];
            else if (matriz[i][0] == 1) mediaMujeres += matriz[i][1];
        }
        System.out.println("Sueldo medio de los hombres: "+(mediaHombres / contH)+"\nSueldo medio de las mujeres: "+(mediaMujeres / contM));
    }


    // Menu
    private static String menu() {
        return """
                ----------------------UNIDAD 5---------------
                ---------------------Practica 3--------------------
                
                1: Ejercicio 1
                2: Ejercicio 2
                3: Ejercicio 3
                4: Ejercicio 4
                5: Ejercicio 5
                6: Menu
                7: SALIR""";
    }


    // Función para comprobar que sea un numero entero
    public static int validaInt() {
        int num;
        while (!sc.hasNextInt()) {
            System.out.println("Eso no es un numero!");
            sc.next(); // IMPORTANTE!
        }
        num = sc.nextInt();
        return num;
    }

    // Función para comprobar que sea un numero float
    public static float validaFloat(){
        float num;
        while (!sc.hasNextFloat()){
            System.out.println("Eso no es un numero!");
            sc.next();
        }
        num = sc.nextFloat();
        return num;
    }

    public static double validaDouble(){
        double num;
        while(!sc.hasNextDouble()){
            System.out.println("Por favor, introduce un nomero valido");
            sc.nextLine();
        }
        num = sc.nextDouble();
        return num;
    }
}
