/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class Fixas {
    public double agua;
    public double energia_eletrica;
    public double telefone;
    public double aluguel;
    public double honorarios_contabeis;
    public double material_escritorio;
    public double material_limpeza;
    public double licenca_software;
    
    public double salario;
    
    public double aumentarS(double valor ){
        this.salario += valor;
        return this.salario;
    }
    public double TotalDespesasFixas(){
        double TF= this.agua+this.aluguel+this.energia_eletrica+this.honorarios_contabeis+this.licenca_software+this.material_escritorio+this.material_limpeza+this.material_limpeza+this.material_limpeza+this.salario;
        return TF;
    }
    
    
    
}
