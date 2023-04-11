/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author Acer
 */
public class AgendaController {
  
    private final Agenda view ; 
    
    private final AgendaHelper helper ; 
   
    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    // método
    public void atualizaTabela() {
    
    // buscar lista com agendamentos no banco de dados
    
    // instanciou um objeto
    AgendamentoDAO agendamentoDAO = new AgendamentoDAO(); 
    
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
    // exibir essa lista na view
    helper.preencherTabela(agendamentos) ; 
    
    view.getTabela();
    
    }
    
    public void atualizaCliente() {
    
        // buscar clientes no banco
        
        ClienteDAO clienteDAO = new ClienteDAO(); 
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
                //exibir no combobox clientes
                helper.preencherClientes(clientes);
    } 
    
    public void atualizaServico() {
    
        ServicoDAO servicoDAO = new ServicoDAO() ; 
        
        ArrayList<Servico> servicos = servicoDAO.selectAll();
    
        helper.preencherServicos(servicos); 
    }
    
    public void atualizaValor() {
    
   Servico servico = helper.obterServico(); 
   helper.setarValor(servico.getValor());
    }
    
    public void agendar() {
    // buscar objeto agendamento na tela
    Agendamento agendamento = (Agendamento) helper.obterModelo();
    
    // salvar objeto no banco de dados
    
    new AgendamentoDAO().insert(agendamento);
    
    atualizaTabela();
    
    helper.limparTela();
    }
}
