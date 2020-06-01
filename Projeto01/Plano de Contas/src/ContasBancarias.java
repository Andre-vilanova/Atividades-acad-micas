/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class ContasBancarias extends Agencia {
    public Agencia  agencia;
    private int numero;
    private double saldo;
    public double VD;

    public Agencia getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Depositar(double valor){
        VD = valor;
        this.saldo+=valor;
    }
    
    
   
}
