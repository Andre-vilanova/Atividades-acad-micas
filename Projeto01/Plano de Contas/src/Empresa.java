/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class Empresa {
    private long cnpj;
    private String razao_social;
    private String telefone;
    
    public Empresa (long cnpj){
        this.cnpj = cnpj;
    }
    public Empresa (long cnpj, String razao_social){
        this.razao_social = razao_social;
    }

    public long getCnpj() {
        return cnpj;
    }
    public String getRazao_social() {
        return razao_social;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public PlanodeContas PlanodeContas;
    
}
