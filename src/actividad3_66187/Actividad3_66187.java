/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3_66187;

import java.util.Scanner;

/**
 *
 * @author Alondra Palma
 */
public class Actividad3_66187 {
    public static void datos() {
        System.out.println("UNIVERSIDAD AUTONOMA DE CAMPECHE");
        System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
        System.out.println("ALONDRA SARAI PALMA PACHECO");
    }
    public static void separador() {
        System.out.println("--------------------------------------------------");
    }
    
    public static void ejer1() {
        separador();
        System.out.println("-----------------[ejercicio 1]--------------------");
        int suma = 0;
   
        for (int i = 0; i <= 10; i++) {
            suma = suma + i;
            System.out.println("Suma del " + (i) + " es: " + suma);
        }
    }
    
    public static void ejer2() {
        separador();
        System.out.println("-----------------[ejercicio 2]--------------------");
        int factorial = 1;
   
        for (int i = 1; i <= 10; i++) {
            factorial = factorial * i;
            System.out.println("El factorial de " + i + " es " + factorial);  
        }
    }
    
    public static void ejer3() {
        separador();
        System.out.println("-----------------[ejercicio 3]--------------------");
        Scanner Entrada = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Ingrese un numero");
        int num = Entrada.nextInt();
    
        for (int i = num ; i > 0 ; i--) {
            factorial = factorial * i;  
        }
         System.out.println("El factorial de " + num + " es " + factorial);
    }
    
    public static void ejer4() {
        separador();
        System.out.println("-----------------[ejercicio 4]--------------------");
        Scanner Entrada = new Scanner(System.in);
        double promedio;
        int suma = 0;

        System.out.println("Ingrese un numero");
        int num = Entrada.nextInt();

        for (int i = 0; i <= num; i++) {
            suma = suma + i;
        }
        promedio = suma / num;
        System.out.println("El promedio de " + num + " es " + promedio);
    }
    
    public static void ejer5() {
        separador();
        System.out.println("-----------------[ejercicio 5]--------------------");
        Scanner Entrada = new Scanner(System.in);
        int n,mayor = 0;
        double promedio;
        int suma = 0;
        int menor = 10000;
                
        System.out.println("Ingrese el numero de datos");
        int num = Entrada.nextInt();
        separador();
        for (int i = 1; i <= num; i++) {
            System.out.println("Ingrese el numero " + i );
            n = Entrada.nextInt();

            if (n > mayor) {
                mayor = n;
            }
            if (n < menor) {
                menor = n;
            }
            
            suma = suma + n;
        }
            promedio = suma / num;
        int distancia = mayor - menor;    
            
        System.out.println("Suma de los numeros es: " + suma);
        System.out.println("El promedio de es " + promedio);
        System.out.println("El numero " + mayor + " es el mayor");
        System.out.println("El numero " + menor + " es el menor");
        System.out.println("La distancia es de " + distancia);
    }
    
    public static void ejer6() {
        separador();
        System.out.println("-----------------[ejercicio 6]--------------------");
        String diasSem []= {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        System.out.println("Los " + diasSem.length + " Dias de la semana son: ");
        
        System.out.println(diasSem[0]);
        System.out.println(diasSem[1]);
        System.out.println(diasSem[2]);
        System.out.println(diasSem[3]);
        System.out.println(diasSem[4]);
        System.out.println(diasSem[5]);
        System.out.println(diasSem[6]);
    }  
    
    public static void ejer7() {
        separador();
        System.out.println("-----------------[ejercicio 7]--------------------");
        String[][]  aPersonajes;
        aPersonajes = new String [16][3];
        aPersonajes[0][0] = "Luke Skywalker ";
        aPersonajes[0][1] = "172 ";
        aPersonajes[0][2] = "male ";
        
        aPersonajes[1][0] = "R2-D2 ";
        aPersonajes[1][1] = "96 ";
        aPersonajes[1][2] = "n/a ";
        
        aPersonajes[2][0] = "C-3PO ";
        aPersonajes[2][1] = "167 ";
        aPersonajes[2][2] = "n/a ";
        
        aPersonajes[3][0] = "Darth Vader ";
        aPersonajes[3][1] = "202 ";
        aPersonajes[3][2] = "male ";
        
        aPersonajes[4][0] = "Leia Organa ";
        aPersonajes[4][1] = "150 ";
        aPersonajes[4][2] = "female ";
        
        aPersonajes[5][0] = "Owen Lars ";
        aPersonajes[5][1] = "178 ";
        aPersonajes[5][2] = "male ";
        
        aPersonajes[6][0] = "Beru Whitesun lars ";
        aPersonajes[6][1] = "165 ";
        aPersonajes[6][2] = "female ";
        
        aPersonajes[7][0] = "R5-D4 ";
        aPersonajes[7][1] = "97 ";
        aPersonajes[7][2] = "n/a ";
        
        aPersonajes[8][0] = "Biggs Darklighter ";
        aPersonajes[8][1] = "183 ";
        aPersonajes[8][2] = "male ";
        
        aPersonajes[9][0] = "Obi-Wan Kenobi ";
        aPersonajes[9][1] = "182 ";
        aPersonajes[9][2] = "male ";
        
        aPersonajes[10][0] = "Yoda ";
        aPersonajes[10][1] = "66 ";
        aPersonajes[10][2] = "male ";
        
        aPersonajes[11][0] = "Jek Tono Porkins ";
        aPersonajes[11][1] = "180 ";
        aPersonajes[11][2] = "male ";
        
        aPersonajes[12][0] = "Jabba Desilijic Tiure ";
        aPersonajes[12][1] = "175 ";
        aPersonajes[12][2] = "hermaphrodite ";
        
        aPersonajes[13][0] = "Han Solo ";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = " male";
        
        aPersonajes[14][0] = "Chewbacca ";
        aPersonajes[14][1] = "228 ";
        aPersonajes[14][2] = "male ";
        
        aPersonajes[15][0] = "Anakin Skywalker ";
        aPersonajes[15][1] = "188 ";
        aPersonajes[15][2] = "male ";
        

        for( int i = 0; i < 16; i++ ) {
            for( int j = 0; j < 3; j++ ) {
                System.out.print( aPersonajes [ i ] [ j ] );
            }
           System.out.println(  );
        }
    }
    
    public static void ejer8() {
        separador();
        System.out.println("-----------------[ejercicio 8]--------------------");
        String[][]  gato;
        gato = new String [3][3];
       
        gato[0][0] = "__";
        gato[0][1] = "|_x_|";
        gato[0][2] = "__";
        
        gato[1][0] = "__";
        gato[1][1] = "|_x_|";
        gato[1][2] = "__";
        
        gato[2][0] = "  ";
        gato[2][1] = "| x |";
        gato[2][2] = "  ";
        
        for( int i = 0; i < 3; i++ ) {

            for( int j = 0; j < 3; j++ ) {
                System.out.print(gato [ i ] [ j ]);
            }
            System.out.println( );
           
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
     
        datos();  
        ejer1();
        ejer2();
        ejer3();
        ejer4();
        ejer5();
        ejer6();
        ejer7();
        ejer8();
         
    }
}
