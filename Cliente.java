/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class Cliente extends Pessoa {
    
    protected String endereco ; 
    protected String cep ; 

    public Cliente(int id, String nome, char sexo, String dataNascimento, String telefone,String email, String RG, String endereco, String cep ) {
        super(id, nome, sexo, dataNascimento, telefone, email, RG);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
      

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

//sobrescreve o método para aparecer o nome escrito na combobox em vez da referencia    
@Override
   public String toString(){
   
       return getNome() ; 
   
   } 

    
}
