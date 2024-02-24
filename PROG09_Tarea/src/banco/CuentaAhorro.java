/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author varov
 */
public class CuentaAhorro extends CuentaBancaria{
    

    @Override
    public double getSaldo() {
        return super.getSaldo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    private int interes;
    private int e;
    private double remuneracion = (interes*100)*getSaldo();
    public CuentaAhorro() {
        this.interes = 0;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public void remuneracion(){
        return 
    }
    
}
