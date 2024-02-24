package Principal;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author varov
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Bienvenido al menú");
        System.out.println("1. Abrir una nueva cuenta\n2. Ver un lista de las cuentas disponibles\n3. Obtener los datos de una cuenta concreta. Realizar un ingreso en una cuenta"
                + "\n4. Retirar efectivo de una cuenta.\n5. Consultar el saldo actual de una cuenta.\n6. Salir de la aplicación");

        int tecla = sc.nextInt();
        
            switch (tecla) {
                case 1 -> {
                    System.out.println("Ha solicitado abrir una nueva cuenta");

                    break;
                }
                case 2 -> {
                    System.out.println("A continuación se mostrarán las cuentas disponibles.");

                    break;
                }
                case 3 -> {
                    System.out.println("Dame los datos para acceder a la cuenta.");

                    break;
                }
                case 4 -> {
                    System.out.println("Has solicitado retirar efectivo");

                    break;
                }

                case 5 -> {
                    System.out.println("Ha solicitado consultar el saldo de una cuenta");

                    break;
                }

                case 6 -> {
                    System.exit(0);
                }
            }
        }
    }
}
