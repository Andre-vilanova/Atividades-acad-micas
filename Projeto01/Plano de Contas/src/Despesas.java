/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class Despesas {
    
    public Variaveis variaveis;
    //public double DespesasVariaveis = this.variaveis.TRV;
    
    public Fixas fixas;
    
        
    
    //public double DespesasFixas=this.fixas.TF;
    
    
    public Pessoal pessoal;
    
    public double TotalDespesas(){
        double TD = this.fixas.TotalDespesasFixas() + this.variaveis.TotalDespesasVariaveis() + this.pessoal.TotalPessoal();
            return TD;
        
    }
   
    
}

