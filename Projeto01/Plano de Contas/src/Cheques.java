
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class Cheques extends Receitas  {
    private int numero;
    private String data;
    private ContasBancarias conta;
    // Referencia se a conta bancaria tiver saldo liberar cheque
    public double ValorCHQ;
    public int getNumero() {
        return numero;
    }
    public String getData() {
        return data;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setData(String data) {
        this.data = data;
    }
    
}
