// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 ){
            System.out.println("El número "+numero+" es par");
        }else{
            System.out.println("El número "+numero+" es impar");
        }
        scanner.close();
         */

        //Ejercicio 2
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 10 == 0 ){
            System.out.println("El número "+numero+" es multiplo de 10");
        }else {
            System.out.println("El número " + numero + " no es multiplo de 10");

            scanner.close();
        }*/

        //Ejercicio 3
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letra = scanner.next();

        boolean condition = letra.equals(letra.toUpperCase());
        if (condition){
            System.out.println("La letra "+letra+" esta en mayuscula");
        }else {
            System.out.println("La letra "+letra+" no esta en mayuscula");
        }
        scanner.close();
         */
        //Ejercicio 4
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2){
            System.out.println("El primer número es igual al segundo "+num1+" = "+num2);
        }else {
            System.out.println("El primer número no es igual al segundo "+num1+" = "+num2);
        }
        scanner.close();
        */
        //Ejercicio 5
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("El primer número es mayor al segundo "+num1+" > "+num2);
        }else if (num2 > num1) {
            System.out.println("El segundo número es mayor al primero "+num1+" < "+num2);
        }else{
            System.out.println("Los números son iguales "+num1+" = "+num2);
        }
        scanner.close();
         */
        //Ejercicio 6
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("El primer número es mayor al segundo "+num1+" > "+num2);
        }else if (num2 > num1) {
            System.out.println("El segundo número es mayor al primero "+num1+" < "+num2);
        }else{
            System.out.println("Los números son iguales "+num1+" = "+num2);
        }
        scanner.close();

         */
        //Ejercicio 7
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();

        if (num % 3 == 0 & num % 5 == 0) {
            System.out.println("El número " + num + " es multiplo de 3 y de  5");
        }else{
            System.out.println("El número " + num + " no es multiplo de 3 y de  5");
        }
        scanner.close();
         */

        //Ejercicio 8
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("El número " + num + " es multiplo de 2 o de  3");
        }else{
            System.out.println("El número " + num + " no es multiplo de 2 o de  3");
        }
        scanner.close();

         */

        //Ejercicio 9
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un letra: ");
        String letra_1 = scanner.next().toLowerCase();

        System.out.print("Ingrese otra letra: ");
        String letra_2 = scanner.next().toLowerCase();

        boolean condition = letra_1.equals(letra_2);
        if (condition){
            System.out.println("Las letras ingresadas son iguales "+letra_1+" = "+letra_2);
        }else{
            System.out.println("Las letras ingresadas no son iguales "+letra_1+" != "+letra_2);
        }
        scanner.close();
        */

        //Ejercicio 10
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un letra: ");
        String letra_1 = scanner.next();

        System.out.print("Ingrese otra letra: ");
        String letra_2 = scanner.next();

        boolean condition_1 = letra_1.equals(letra_1.toLowerCase());

        if (condition_1){
            System.out.println("La primera letra ingresada si esta en minusculas");
        }else{
            System.out.println("La primera letra ingresada no esta en minusculas");
        }

        if (letra_2.equals(letra_2.toLowerCase())){
            System.out.println("La segunda letra ingresada si esta en minusculas");
        }else {
            System.out.println("La segunda letra ingresada no esta en minusculas");
        }
        scanner.close();

         */
        //Ejercicio 11 REVISAR
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un caracterer: ");
        String carac = scanner.next();

        boolean condition = carac.equals(ParseInt(carac));

        if (condition){
            if (ParseInt(carac) >= 0 & ParseInt(carac) <= 9 ){
                System.out.println("El caracter ingresado es un número y esta entre 0 y 9 ");
            }else{
                System.out.println("El caracter ingresado es un número pero no esta entre 0 y 9 ");
            }
        }else{
            System.out.println("El caracter ingresado no es un número ");
        }
        scanner.close()
         */
        //Ejercicio 12
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num2 != 0){
            double division = (double)num1 / num2;
            System.out.println(num1+" / "+num2+" = "+division);
        }else{
            System.out.println("El divisor no puede ser 0");
        }
        scanner.close();
        */

        //Ejercicio 13
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año para saber si es bisiesto o no: ");

        int anio = scanner.nextInt();

        if (anio % 4 == 0 & anio % 100 != 0){
            System.out.println(anio+" es un año bisiesto ");
        }else if(anio % 400 == 0){
            System.out.println(anio+" es un año bisiesto ");
        }else{
            System.out.println(anio+" no es un año bisiesto ");
        }
        scanner.close();
         */
        //Ejercicio 14
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de tres dígitos: ");
        String num = scanner.next();

        if ((num.length()) == 3){
            if (num.charAt(0) == num.charAt(2)){
                System.out.println("El número "+num+" es capicúa ");
            }else{
                System.out.println("El número "+num+" no es capicúa ");
            }
        }else{
            System.out.println("El número debe contener 3 cifras ");
        }
        scanner.close();
        */

        //Ejercicio 15
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas: ");
        int h = scanner.nextInt();

        System.out.print("Ingrese las minutos: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese las segundos: ");
        int s = scanner.nextInt();

        if(h >= 0 & h < 24){
            System.out.print(h+":");
            if(m >= 0 & m<= 59){
                System.out.print(m+":");
                if (s >= 0 & s <= 59){
                    System.out.println(s);
                }else{
                    System.out.println("Los segundo ingresados no son válidos");
                }
            }else{
                System.out.println("Los minutos ingresados no son válidos");
            }
        }else{
            System.out.println("La hora ingresada no es válida");
        }
        scanner.close();
        */

        //Ejercicio 16
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de un mes: ");
        int mes = scanner.nextInt();

        if (mes >0 & mes <= 12){
            switch (mes){
                case 1,3,5,7,8,10,12:
                    System.out.println("El mes tiene 31 días");
                case 4,6,9,11:
                    System.out.println("El mes tiene 30 días");
                default:
                    System.out.println("El mes tiene 28 días");
            }
        }else{
            System.out.println("El número de mes no es válido ");
        }
        scanner.close();
         */

        //Ejercicio 17
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un nota: ");
        int  nota = scanner.nextInt();

        if (nota >= 0 & nota <=10){
            if (nota >= 0 & nota < 5){
                System.out.println("Insuficiente");
            } else if (nota >= 5 & nota < 6){
                System.out.println("Suficiente");
            } else if (nota >= 6 & nota < 7){
                System.out.println("Bien");
            } else if (nota >= 7 & nota < 9){
                System.out.println("Notable");
            } else{
                System.out.println("Sobresaliente");
            }
        }else{
            System.out.println("La nota ingresada no es válida");
        }
        scanner.close();
        */

        //Ejercicio18
        /*
        int num = 1;
        while(num <= 100){
            System.out.println(num);
            num ++;
        }
         */

        //Ejercicio 19
        /*
        int num = 1;
        do{
            System.out.println(num);
            num ++;
        }while(num <= 100);

         */

        //Ejercicio 20
        /*
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
         */

        //Ejercicio 21
        /*
        int num = 100;
        while (num >= 1){
            System.out.println(num);
            num --;
        }

         */

        //Ejercicio 22
        /*
        int num = 100;
        do{
            System.out.println(num);
            num --;
        }while(num >= 1);
         */

        //Ejercicio 23
        /*
        for (int i = 100; i >= 1 ; i--) {
            System.out.println(i);
        }

         */

        //Ejercicio 24
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        //2)
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i ++;
        }

        //3)
        int i = 1;
        do{
            System.out.println(i);
            i ++;
        }while(i <= num);
        */

        //Ejercicio 25
        //1)
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");

        int num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }

        //2)
        while(num >= 1){
            System.out.println(num);
            num --;
        }


        //3)
        do{
            System.out.println(num);
            num --;
        }while(num >=1);

        */

        //Ejercicio 26
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num_1 = scanner.nextInt();

        System.out.print("Ingrese otro número: ");
        int num_2 = scanner.nextInt();

        if (num_1 == num_2) {
            boolean condition = true;
            while (condition) {
                System.out.print("Ingrese otro número: ");
                num_2 = scanner.nextInt();
                if (num_1 != num_2) {
                    condition = false;
                }
            }
            if (num_1 > num_2) {
                for (int i = num_2; i <= num_1; i++) {
                    System.out.println(i);
                }
            }else{
                for (int i = num_1; i <= num_2; i++) {
                    System.out.println(i);
                }
            }
        } else {
            if (num_1 > num_2) {
                for (int i = num_2; i <= num_1; i++) {
                    System.out.println(i);
                }
            }else{
                for (int i = num_1; i <= num_2; i++) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
        */

        //Ejercicio 27
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese otro número: ");
        int b = scanner.nextInt();

        if (a > b) {
            boolean condition = true;
            while (condition) {
                System.out.print("Ingrese otro número: ");
                b = scanner.nextInt();
                if (a != b) {
                    condition = false;
                }
            }
            for (int i = a; i <= b; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        }else{
            for (int i = a; i <= b; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
        scanner.close();
          */

        //Ejercicio 28
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese otro número: ");
        int n = scanner.nextInt();

        if (n > m) {
            boolean condition = true;
            while (condition) {
                System.out.print("Ingrese otro número(el segundo número debe ser menor que el primero): ");
                n = scanner.nextInt();
                if (m > n) {
                    condition = false;
                }
            }
            for (int i = 1; i <= m; i++){
                if (n % i == 0){
                    System.out.println(i);
                }
            }
        }else{
            for (int i = 1; i <= m; i++){
                if (n % i == 0){
                    System.out.println(i);
                }
            }
        }
        scanner.close();
         */
        //Ejercicio 29
        Scanner scanner = new Scanner(System.in);

        double millas;
        double kilometros;

        do {
            System.out.print("Introduce la cantidad de millas (0 para salir): ");
            millas = scanner.nextDouble();

            if (millas != 0) {
                kilometros = millas * 1.6093;
                System.out.printf("%.2f millas equivalen a %.2f kilómetros.%n", millas, kilometros);
            }
        } while (millas != 0);
        scanner.close();
    }
}
