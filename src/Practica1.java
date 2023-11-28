import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;

public class Practica1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        System.out.println(menu());
        do {
            System.out.println("\n-----------------------------------------------------------------------");
            System.out.print("\nQue ejercicio quieres probar?: ");
            menu = validaInt();
            switch (menu) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 14 -> ejercicio14();
                case 15 -> ejercicio15();
                case 16 -> ejercicio16();
                case 17 -> ejercicio17();
                case 18 -> ejercicio18();
                case 19 -> ejercicio19();
                case 20 -> ejercicio20();
                case 21 -> System.out.println(menu());
                case 22 -> System.out.println("Has salido con exito");
                default -> System.out.println("Ejercicio inexistente");
            }
        } while (menu != 22);
    }


    // Crea un programa que pida diez números reales por teclado, los almacene en un
    // array, y luego muestre todos sus valores.
    public static void ejercicio1(){
        System.out.println("\n------------------------------EJERCICIO 1------------------------------\n");

        int[] numeros = new int[20];
        int num;
        System.out.println("Introduzca veinte numeros");
        for (int i = 0; i < numeros.length; i++) {
            do {
                num = validaInt();
                if (num<0) System.out.println("No se admiten numeros negativos");
            }while(num<0);
            numeros[i] = num;
        }
        System.out.println(Arrays.toString(numeros));
    }

    // Crea un programa que pida diez números reales por teclado, los almacene en un
    // array, y luego muestre la suma de todos los valores.
    public static void ejercicio2(){
        System.out.println("\n------------------------------EJERCICIO 2------------------------------\n");

        int[] numeros = new int[10];
        int num, total=0;
        System.out.println("Introduzca diez numeros");
        for (int i = 0; i < numeros.length; i++) {
            do {
                num = validaInt();
                if (num<0) System.out.println("No se admiten numeros negativos");
            }while(num<0);
            numeros[i] = num;
            total +=num;
        }
        System.out.println("Suma: "+total);
    }

    // Crea un programa que pida diez números reales por teclado, los almacene en un
    // array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
    // pantalla.
    public static void ejercicio3(){
        System.out.println("\n------------------------------EJERCICIO 3------------------------------\n");

        int[] numeros = new int[10];
        int num, max=0, min=Integer.MAX_VALUE;
        System.out.println("Introduzca diez numeros");
        for (int i = 0; i < numeros.length; i++) {
            do {
                num = validaInt();
                if (num<0) System.out.println("No se admiten numeros negativos");
            }while(num<0);
            numeros[i] = num;
            if (max<num) max = num;
            if (min>num) min = num;
        }
        System.out.println("Maximo: "+max+"\nMinimo: "+min);
    }

    // Crea un programa que pida veinte números enteros por teclado, los almacene
    // en un array y luego muestre por separado la suma de todos los valores positivos
    // y negativos.
    public static void ejercicio4(){
        System.out.println("\n------------------------------EJERCICIO 4------------------------------\n");

        int[] numeros = new int[20];
        int num, sumaPositivo=0, sumaNegativo=0;
        System.out.println("Introduzca veinte numeros");
        for (int i = 0; i < numeros.length; i++) {
            num = validaInt();
            numeros[i] = num;
            if (num>0) sumaPositivo += num;
            if (num<0) sumaNegativo += num;
        }
        System.out.println("Positivos: "+sumaPositivo+"\nNegativos: "+sumaNegativo);
    }

    // Crea un programa que pida veinte números reales por teclado, los almacene en
    // un array y luego lo recorra para calcular y mostrar la media: (suma de valores) /
    // nº de valores.
    public static void ejercicio5(){
        System.out.println("\n------------------------------EJERCICIO 5------------------------------\n");

        int[] numeros = new int[20];
        int num, total=0;
        float media;
        System.out.println("Introduzca veinte numeros");
        for (int i = 0; i < numeros.length; i++) {
            do {
                num = validaInt();
                if (num<0) System.out.println("No se admiten numeros negativos");
            }while(num<0);
            numeros[i] = num;
            total +=num;
        }
        media = (float) total / numeros.length;
        System.out.println("Media: "+media);
    }

    // Crea un programa que pida dos valores enteros N y M, luego cree un array de
    // tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla
    public static void ejercicio6(){
        System.out.println("\n------------------------------EJERCICIO 6------------------------------\n");

        int N, M;
        System.out.println("Escriba dos numeros");
        System.out.print("Primer numero: ");
        do {
            N = validaInt();
            if (N<1) System.out.println("El numero debe ser mayor o igual que 1");
        }while(N<1);
        int[] array = new int[N];
        System.out.print("Segundo numero: ");
        M = validaInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = M;
        }
        System.out.println(Arrays.toString(array));
    }

    // Crea un programa que pida dos valores enteros P y Q, luego cree un array que
    // contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
    public static void ejercicio7(){
        System.out.println("\n------------------------------EJERCICIO 7------------------------------\n");

        int P, Q, longitudArray;
        System.out.println("Escriba dos numeros");
        System.out.print("Primer numero: ");
        P = validaInt();
        System.out.print("Segundo numero: ");
        do {
            Q=validaInt();
            if (P==Q) System.out.print("Deben ser numeros diferentes: ");
        }while (P==Q);
        if (P<Q)longitudArray = Q-(P-1);
        else longitudArray = P-(Q-1);
        int[] array = new int[longitudArray];
        if (P<Q){
            for (int i = 0; i < array.length; i++) {
                array[i] = P;
                P++;
            }
        }else{
            for (int i = 0; i < array.length; i++) {
                array[i] = P;
                P--;
            }
        }
        System.out.println(Arrays.toString(array));
    }


    // Crea un programa que cree un array con 100 números reales aleatorios entre 0.0
    // y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por
    // último, mostrará cuántos valores del array son igual o superiores a R.
    public static void ejercicio8(){
        System.out.println("\n------------------------------EJERCICIO 8------------------------------\n");

        int cont=0;
        float[] random = new float[100];
        float R;
        for (int i = 0; i < random.length; i++)
            random[i] = (float) Math.random();

        System.out.print("Introduce un numero entre 0 y 1: ");
        do {
            R=validaFloat();
            if (R<=0 || R>=1) System.out.print("El numero debe estar entre 0 y 1: ");
        }while (R<=0 || R>=1);
        for (int i = 0; i < random.length; i++)
            if (R<=random[i]) cont++;

        System.out.println("Cantidad de numeros del array iguales o mayores que R: "+cont);
    }


    // Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
    // valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego
    // pedirá un valor N y mostrará en qué posiciones del array aparece N.
    public static void ejercicio9(){
        System.out.println("\n------------------------------EJERCICIO 9------------------------------\n");

        int N;
        int[] random = new int[100];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (1 + Math.random()*10);
        }
        System.out.print("Introduce un numero entre 1 y 10: ");
        do {
            N=validaInt();
            if (N<1 || N>10) System.out.print("El numero debe estar entre 1 y 10: ");
        }while (N<1 || N>10);
        System.out.print("El numero "+N+" se encuentra en las siguientes posiciones: ");
        for (int i = 0; i < random.length; i++) {
            if (random[i]==N){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    // Crea un programa para realizar cálculos relacionados con la altura (en metros)
    // de personas. Pedirá un valor N y luego almacenará en un array N alturas
    // introducidas por teclado. Luego mostrará la altura media, máxima y mínima, así
    // como cuántas personas miden por encima y por debajo de la media.
    public static void ejercicio10(){
        System.out.println("\n------------------------------EJERCICIO 10------------------------------\n");

        int num, contSuperior=0, contInferior=0;
        float altura, total=0, max=0, min=3, media;
        System.out.print("Cuantas alturas quieres almacenar?: ");
        do {
            num=validaInt();
            if (num<=0) System.out.print("El numero debe ser mayor que 0: ");
        }while (num<=0);
        float[] alturas = new float[num];
        System.out.println("Introduce las alturas en metros (EJ: 1,72)");
        for (int i = 0; i < alturas.length; i++) {
            do {
                altura = validaFloat();
                if (altura<=0) System.out.print("Debe ser mayor que 0: ");
            }while(altura<=0);
            alturas[i] = altura;
            total += altura;
            if (max<altura) max = altura;
            if (min>altura) min = altura;
        }
        media = total / alturas.length;

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i]>media) contSuperior++;
            if (alturas[i]<media) contInferior++;
        }
        System.out.println("Altura media: "+media+"\nAltura maxima: "+max+"\nAltura minima: "+min+"\nSuperiores a la media: "+contSuperior+"\nInferiores a la media: "+contInferior);
    }


    // Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
    // introducirá en el primer array todos los valores del 1 al 100. Por último, deberá
    // copiar todos los valores del primer array al segundo array en orden inverso, y
    // mostrar ambos por pantalla
    public static void ejercicio11(){
        System.out.println("\n------------------------------EJERCICIO 11------------------------------\n");

        int[] array1 = new int[100];
        int[] array2 = new int[100];
        int j=0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i+1;
        }
        for (int i = 99; i >= 0; i--) {
            array2[i] = array1[j];
            j++;
        }
        System.out.println("Array numero 1: \n"+Arrays.toString(array1)+"\nArray numero 2: \n"+Arrays.toString(array2));
    }


    // Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
    // menú con distintas opciones:
    //      a. Mostrar valores.
    //      b. Introducir valor.
    //      c. Salir.
    // La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un
    // valor V y una posición P, luego escribirá V en la posición P del array. El menú
    // se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que
    // terminará el programa.
    public static void ejercicio12(){
        System.out.println("\n------------------------------EJERCICIO 12------------------------------\n");

        char menu;
        int[] array = new int[10];
        do {
            System.out.println(menuEjercicio12());
            menu = sc.next().charAt(0);
            switch (menu){
                case 'a' -> System.out.println(Arrays.toString(array));
                case 'b' -> asignar(array);
                case 'c' -> System.out.println("Has salido con exito");
                default -> System.out.println("Opcion inexistente");
            }
        }while(menu!='c');
    }

    // Asignamos un valor del array del ejercicio 12
    public static void asignar(int[] array){
        System.out.print("Introduzca un numero positivo del 1 al 10: ");
        int P, V;
        do {
            P = validaInt();
            if (P<1 || P>10) System.out.print("Numero entre el 1 y el 10: ");
        }while(P<1 || P>10);
        System.out.print("Escriba un numero: ");
        V = validaInt();
        array[P-1] = V;
    }

    // Submenu del ejercicio12
    private static String menuEjercicio12(){
        return """

                 a. Mostrar valores.
                 b. Introducir valor.
                 c. Salir""";
    }


    // Crea un programa que permita al usuario almacenar una secuencia aritmética en
    // un array y luego mostrarla. Una secuencia aritmética es una serie de números
    // que comienza por un valor inicial V, y continúa con incrementos de I. Por
    // ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la
    // secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I además de N
    // (nº de valores a crear).
    public static void ejercicio13(){
        System.out.println("\n------------------------------EJERCICIO 13------------------------------\n");

        int N, V, I;
        System.out.print("Numero de valores a crear?: ");
        do {
            N=validaInt();
            if (N<=0) System.out.print("Debe ser mayor que 0: ");
        }while(N<=0);
        int[] array = new int[N];
        System.out.print("Valor inicial: ");
        V = validaInt();
        System.out.print("Incremento: ");
        I=validaInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = V;
            V += I;
        }
        System.out.println(Arrays.toString(array));
    }


    // Crea un programa que cree un array de enteros e introduzca la siguiente
    // secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10
    // diez veces, y luego la muestre por pantalla.
    public static void ejercicio14(){
        System.out.println("\n------------------------------EJERCICIO 14------------------------------\n");

        int posicion=0, total=0;
        for (int i = 0; i < 10; i++) {
            total += (i+1);
        }
        int[] array = new int[total]; // Como hago para no tener que poner 55
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                array[posicion] = i;
                posicion++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // Crea un programa que pida al usuario dos valores N y M y luego cree un array de
    // tamaño N que contenga M en todas sus posiciones. Luego muestra el array por
    // pantalla.
    public static void ejercicio15(){
        System.out.println("\n------------------------------EJERCICIO 15------------------------------\n");

        int N, M;
        System.out.println("Escriba dos numeros");
        System.out.print("Primer numero: ");
        do {
            N = validaInt();
            if (N<1) System.out.println("El numero debe ser mayor o igual que 1");
        }while(N<1);
        int[] array = new int[N];
        System.out.print("Segundo numero: ");
        M = validaInt();
        Arrays.fill(array, M);
        System.out.println(Arrays.toString(array));
    }


    // Crea un programa que cree un array de enteros e introduzca la siguiente
    // secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10
    // diez veces, y luego la muestre por pantalla. En esta ocasión has de utilizar
    // Arrays.fill().
    public static void ejercicio16(){
        System.out.println("\n------------------------------EJERCICIO 16------------------------------\n");

        int posicion=0, total = 0;
        for (int i = 0; i < 10; i++) {
            total += (i+1);
        }
        int[] array = new int[total]; // Como hago para no tener que poner 55
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                Arrays.fill(array,posicion,55, i);
                posicion++;
            }
        }
        System.out.println(Arrays.toString(array));
    }


    // Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
    // primeros en un array y los 10 últimos en otro array. Por último, comparará ambos
    // arrays y le dirá al usuario si son iguales o no.
    public static void ejercicio17(){
        System.out.println("\n------------------------------EJERCICIO 17------------------------------\n");

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int num, j=0;
        System.out.println("Escriba veinte numeros");
        for (int i = 0; i < (array1.length + array2.length); i++) {
            num = validaInt();
            if (i<10) array1[i] = num;
            else {
                array2[j] = num;
                j++;
            }
        }
        if (Arrays.equals(array1,array2)) System.out.println("Las dos listas son IGUALES.");
        else System.out.println("Las dos listas son DIFERENTES");
    }

    // Crea un programa que cree un array de tamaño 30 y lo rellene con valores
    // aleatorios entre 0 y 9 (utiliza Math.random()*10). Luego ordena los valores del
    // array y los mostrará por pantalla.
    public static void ejercicio18(){
        System.out.println("\n------------------------------EJERCICIO 18------------------------------\n");

        int[] random = new int[30];
        for (int i = 0; i < random.length; i++) {
            // random[i] = (int) (0 + Math.random()*10); --> Es lo mismo
            Arrays.fill(random, i, i+1, (int) (0 + Math.random()*10));
        }
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));
    }


    // Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
    // torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
    // puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
    // de tipo entero) y luego muestre las puntuaciones en orden descendente (de la
    // más alta a la más baja).
    public static void ejercicio19(){
        System.out.println("\n------------------------------EJERCICIO 19------------------------------\n");

        Integer[] ranking = new Integer[8];
        System.out.println("Introduzca la puntuacion de cada jugador");
        for (int i = 0; i < ranking.length; i++) {
            int puntuacion = validaInt();
            ranking[i] = puntuacion;
        }
        Arrays.sort(ranking, Collections.reverseOrder());
        System.out.println(Arrays.toString(ranking));
    }

    // Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
    // enteros aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por
    // teclado un valor N y se mostrará por pantalla si N existe en el array, además de
    // cuantas veces.
    public static void ejercicio20(){
        System.out.println("\n------------------------------EJERCICIO 19------------------------------\n");

        int[] random = new int[1000];
        int num, cont=0;
        System.out.print("Escriba un numero del 0 al 99: ");
        do {
            num=validaInt();
            if (num<0 || num>99) System.out.print("Escriba un numero del 0 al 99: ");
        }while(num<0 || num>99);
        for (int i = 0; i < random.length; i++) {
            Arrays.fill(random, i, i+1, (int) (0 + Math.random()*100));
            if (random[i] == num) cont++;
        }
        if (cont == 0) System.out.println("El numero "+num+" no existe en la lista.");
        else {
            if (cont!=1)System.out.println("El numero "+num+" aparece "+cont+" veces.");
            else System.out.println("El numero "+num+" aparece una vez");
        }

    }

    // Menu
    private static String menu() {
        return """
                ----------------------UNIDAD 5---------------
                ---------------------Practica 1--------------------

                1: Ejercicio 1
                2: Ejercicio 2
                3: Ejercicio 3
                4: Ejercicio 4
                5: Ejercicio 5
                6: Ejercicio 6
                7: Ejercicio 7
                8: Ejercicio 8
                9: Ejercicio 9
                10: Ejercicio 10
                11: Ejercicio 11
                12: Ejercicio 12
                13: Ejercicio 13
                14: Ejercicio 14
                15: Ejercicio 15
                16: Ejercicio 16
                17: Ejercicio 17
                18: Ejercicio 18
                19: Ejercicio 19
                20: Ejercicio 20
                21: Menu
                22: SALIR""";
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
}
