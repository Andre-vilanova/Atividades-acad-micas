/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class Receitas  {
    public Especie especie;
    
    //public double d;//= this.especie.dinheiro;
    
    public Cartoes cartoes;
    
    
    
    
    public ContasBancarias contasBancarias;
    
  //  public double ValorDeposito = this.ContasBancarias.VD;//chamando o valor  
    
    public Cheques cheques;
   // public double vlcheques= this.cheques.valor;
    
    public double TotalRceitas (){
       double TR = this.cheques.ValorCHQ + this.cartoes.credito + this.cartoes.debito + this.cartoes.credito_parcelado + this.especie.dinheiro + this.contasBancarias.VD;
           return TR;
       
  
    }
    
  
    
}
