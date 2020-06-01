/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class Pessoal extends Fixas {
    public double partipacao_lucros;
    private double VLFGTS;
    @Override
    public double aumentarS(double valor ){
        this.salario += valor;
        this.salario+= this.partipacao_lucros;
        return this.salario;}
    
    public double salario13(){
        return this.salario + salario;
    
    }
    
    public double ferias( ){
        return this.salario + this.salario/3;
    }
    
    public double FGTS(){
        double VLFGTS = this.salario;
        this.salario = this.salario-0.8;
        return this.VLFGTS;
    }
    
    
    public double TotalPessoal(){
        double TP= this.salario13()+ this.VLFGTS;
                return TP;

    }   
}
