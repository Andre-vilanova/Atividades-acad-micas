/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class Testarpessoal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Receitas r = new Receitas();
        Especie e = new Especie();
        Cartoes c = new Cartoes();
        Cheques ch=new Cheques();
        ContasBancarias cb=new ContasBancarias();
        Agencia Ag=new Agencia();
        Variaveis Vr=new Variaveis();
        Despesas Dp=new Despesas();
        Pessoal ps=new Pessoal();
        PlanodeContas pl=new PlanodeContas();
        Empresa ep=new Empresa(123);
        Fixas f=new Fixas();
        Dp.variaveis=Vr;
        Dp.variaveis.compras=67.0;
        Dp.variaveis.descarregos=700.0;
        Dp.variaveis.deveolucoes_compras=80.0;
        Dp.variaveis.devolucoes_vendas=600.0;
        Dp.variaveis.fretes=200.0;
        Dp.variaveis.materia_prima=89.0;
        Dp.variaveis.Divulgacao = 60;
        
        Dp.fixas = f;
        Dp.fixas.agua=20.0;
        Dp.fixas.aluguel=200;
        Dp.fixas.energia_eletrica=50.0;
        Dp.fixas.honorarios_contabeis=100.0;
        Dp.fixas.licenca_software=56.0;
        Dp.fixas.material_limpeza=10.0;
        Dp.fixas.telefone=100.0;
        Dp.fixas.salario=5000.0;
        
        Dp.pessoal = ps;
        ps.aumentarS(1000.0);
        
        //valores de cartões
        r.cartoes = c;
        r.cartoes.credito = 1000.0;
        r.cartoes.credito_parcelado= 5000.0;
        r.cartoes.debito = 6000.0;
        System.out.println(r.cartoes.credito);
        //valor de especie
        r.especie = e;
        r.especie.dinheiro = 10000.0;
        System.out.println(r.especie.dinheiro);
        
        r.cheques = ch;
        r.cheques.setNumero(123);
        r.cheques.setData("10/03/2019");
        r.cheques.ValorCHQ= 3000.0;
        System.out.println(r.cheques.ValorCHQ);
        
        cb.agencia = Ag;
        r.contasBancarias = cb;
        r.contasBancarias.agencia.setCidade("cumbe");
        r.contasBancarias.agencia.setNumero(123);
        r.contasBancarias.Depositar(2000.);
        System.out.println(r.contasBancarias.VD);
        
        ep.PlanodeContas = pl;
        ep.setCnpj(1234568);
        ep.setRazao_social("J Dantas Viana");
        ep.setTelefone("75 99248468");
        
       System.out.println("Nome da Empresa: " +ep.getCnpj()+ "Razão Social: " + ep.getRazao_social()+ "Telefone da Empresa: " + ep.getTelefone()+"\n");
       System.out.println("Total receitas: "+ r.TotalRceitas());
       System.out.println("Total de despesas fixas: "+Dp.fixas.TotalDespesasFixas() );
       System.out.println("Total de despesas Variaveis: "+Dp.variaveis.TotalDespesasVariaveis() );
       System.out.println("Total de despesas com pessoal: "+Dp.pessoal.TotalPessoal()+"\n");
       System.out.println("Despesas Totais: " + Dp.TotalDespesas()+"\n");
       double TR = r.TotalRceitas();
       double TD = Dp.TotalDespesas();
       double SD = TR - TD;
       System.out.println("Saldo Disponivel: " +  SD);
       
    
       
       
       
        
        

       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
       
      
        
 
        
        
        
        
        
        
        
    }
    
}
