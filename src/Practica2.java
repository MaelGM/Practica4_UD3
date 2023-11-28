import java.util.Scanner;

public class Practica2 {
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


    // Crea un programa que pida una cadena de texto por teclado y luego muestre cada
    // palabra de la cadena en una línea distinta
    public static void ejercicio1(){
        System.out.println("\n------------------------------EJERCICIO 1------------------------------\n");

        System.out.println("Escriba una frase.");
        String cadena = sc.nextLine();
        String[] palabras = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }


    // Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
    // iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
    public static void ejercicio2(){
        System.out.println("\n------------------------------EJERCICIO 2------------------------------\n");

        System.out.println("Escriba una frase.");
        String cad1 = sc.nextLine();
        System.out.println("Escriba una segunda frase.");
        String cad2 = sc.nextLine();
        if (cad1.equals(cad2)) System.out.println("Ambas cadenas son EXACTAMENTE iguales");
        else if (cad1.equalsIgnoreCase(cad2)) System.out.println("Ambas cadenas son iguales, pero ignorando mayusculas.");
        else System.out.println("No son iguales");
    }


    // Crea un programa que pida por teclado tres cadenas de texto: nombre y dos
    // apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
    // concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo, si se
    // introduce “Alberto”, “Alemany” y “Navarro” mostrará “ALBALENAV”.
    public static void ejercicio3(){
        System.out.println("\n------------------------------EJERCICIO 3------------------------------\n");

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su primer apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Ingrese su segundo apellido: ");
        String apellido2 = sc.nextLine();
        String codigo = nombre.substring(0,3)+apellido1.substring(0,3)+apellido2.substring(0,3);
        System.out.println("El codigo es: "+codigo.toUpperCase());
    }


    // Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
    // (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
    // diferenciar entre mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me
    // mima” dirá que hay:
    //  Nº de A's: 3
    //  Nº de E's: 1
    //  Nº de I's: 2
    //  Nº de O's: 0
    //  Nº de U's: 0
    public static void ejercicio4(){
        System.out.println("\n------------------------------EJERCICIO 4------------------------------\n");

        int contA=0, contE=0, contI=0, contO=0, contU=0;
        System.out.println("Escriba una frase cualquiera.");
        String cad = sc.nextLine();
        cad = cad.toLowerCase();
        char[] frase = cad.toCharArray();
        for (int i = 0; i < frase.length; i++) {
            if (frase[i]=='a') contA++;
            if (frase[i]=='e') contE++;
            if (frase[i]=='i') contI++;
            if (frase[i]=='o') contO++;
            if (frase[i]=='u') contU++;
        }
        System.out.println("Numero de A's: "+contA+"\nNumero de E's: "+contE+"\nNumero de I's: "+contI+
                           "\nNumero de O's: "+contO+"\nNumero de U's: "+contU);
    }


    // Realiza un programa que lea una frase por teclado e indique si la frase es un
    // palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y
    // minúsculas). Supondremos que el usuario solo introducirá letras y espacios (ni
    // comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto que se lee igual de
    // izquierda a derecha que de derecha a izquierda.
    public  static void ejercicio5(){
        System.out.println("\n------------------------------EJERCICIO 5------------------------------\n");

        boolean palindromo = true;
        System.out.print("Escriba una frase: ");

        String cadena;
        do {
            cadena = sc.nextLine();
            cadena = cadena.replace(" ","");
            if (!cadena.matches("[a-zA-Z]*"))
                System.out.println("No se permiten caracteres especiales o numeros.");
        }while (!cadena.matches("[a-zA-Z]*"));
        cadena = cadena.toLowerCase();
        int longitudCadena = cadena.length() - 1;

        for (int i = 0; i <= (cadena.length() / 2) && palindromo; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitudCadena-i)) palindromo = false;
        }
        if (palindromo) System.out.println("La frase SI es un palindromo.");
        else System.out.println("La frase NO es un palindromo.");
    }

    // Menu
    private static String menu() {
        return """
                ----------------------UNIDAD 5---------------
                ---------------------Practica 2--------------------
                
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
}
