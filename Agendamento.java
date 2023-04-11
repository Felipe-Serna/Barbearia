/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class Agendamento {
    
    private int id ;
    private Cliente cliente ; 
    private Servico servico ; 
    private float valor ; 

    public Agendamento(int id, Cliente cliente, Servico servico, float valor) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
     
    }
    
    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data, String observacao) {
    
    this(id, cliente, servico, valor) ; 
    
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
