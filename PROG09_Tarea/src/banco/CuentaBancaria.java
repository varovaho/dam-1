package banco;

import Principal.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author varov
 */
public class CuentaBancaria {

    private final int maxCuentas = 100; //Se podría utilizar perfectamente byte pero en un supuesto real, el máximo de byte sería muy fácil pasarlo a medida que la aplicación necesitase más demanda// 
    private Persona[] titular; //utilizamos la clase persona, con sus atributos para la creación de los arrays y guardar aquí los datos
    private double saldo; //aunque se pueda utilizar float, no cuento con ningún usuario, double es más preciso// 
    private String iban; //utilizamos String, necesitamos una cadena de caracteres, ya que el iban empieza por dos letras, en este caso "ES"//

    public CuentaBancaria() {
        this.titular = new Persona[maxCuentas];
        this.saldo = 0;
        this.iban = "";

    }

    public Persona[] getTitular() {
        return titular;
    }

    public void setTitular(Persona[] titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

}
