/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class App {

    public static final int N1 = 1;

    public static final int N2 = 7;

    public static final Random RND = new Random();

    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

    public static void app() {
        
        int rnd = RND.nextInt(N2 - N1 + 1) + N1;
        double n1 = 1.5;
        double n2 = 4;
        System.out.println("OPERACIÓN NUMÉRICA");
        System.out.println("==================");
        System.out.println("Número 1 ....: " + n1);
        System.out.println("Número 2 ....: " + n2);
        System.out.println("---");
        operar(n1, n2, rnd);
        
    }

    public static final double operar(double n1, double n2, int rnd) {
        double resultado = 0;

        switch (rnd) {
            case OP_SUM:
                resultado = n1 + n2;
                System.out.println("La suma de los numeros es: " + resultado);
                break;
            case OP_RES:
                resultado = n1 - n2;
                System.out.println("La resta de los numeros es: " + resultado);
                break;
            case OP_MUL:
                resultado = n1 * n2;
                System.out.println("La mutliplicacion de los numeros es: " + resultado);
                break;
            case OP_DIV:
                resultado = n1 / n2;
                System.out.println("La division de los numeros es: " + resultado);
                break;
            case OP_MOD:
                resultado = n1 % n2;
                System.out.println("El resto de los nuemros es: " + resultado);
                break;
            case OP_MED:
                resultado = n1 + n2 / 2;
                System.out.println("La media de los numeros es:" + resultado);
                break;
            case OP_MAY:
                if (n1 < n2) {
            System.out.println("El mayor es: "+n1);
            } else if (n1 > n2) {
            System.out.println(n2);

            } else {
            System.out.println("Iguales");
            }
            case OP_MEN:  
                 if (n1 > n2) {
            System.out.println("El menor es: "+n1);
            } else if (n1 < n2) {
            System.out.println(n2);

            } else {
            System.out.println("Iguales");
            }   

        }
        return resultado;

    }

}
