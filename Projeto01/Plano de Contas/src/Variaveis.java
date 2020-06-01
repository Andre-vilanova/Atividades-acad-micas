/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class Variaveis extends Despesas {
    public double compras;
    public static double comissoes= 0.5 ;
    
    public Especie especie; // referenciando a classe Especie 
//    public double E_D = especie.dinheiro; // referenciando o dinheiro da classe especie
 
    public static double valorcomissao(double E_D){
        double vlc = Variaveis.comissoes * E_D;
        return vlc;
        // vlc = comissões * dinheiro da classe especie  
    }
    
            
    public double fretes;
    public double descarregos;
    public double devolucoes_vendas;
    public double deveolucoes_compras;
    public double materia_prima;
    public double Divulgacao;
    
    public double TotalDespesasVariaveis(){
        double TRV = this.compras + this.descarregos + this.deveolucoes_compras + this.devolucoes_vendas + this.fretes + this.materia_prima + this.Divulgacao;
            return TRV;

    }
  
     
}
