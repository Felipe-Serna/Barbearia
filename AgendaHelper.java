/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author Acer
 */
public class AgendaHelper implements IHelper {
    
    private final Agenda view ; 
    
   
    // construtor
    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
      
    DefaultTableModel tableModel  =  (DefaultTableModel) view.getTabela().getModel();
    
    tableModel.setNumRows(0);
    
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[] {
            
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
              
                    
            
            });
            
            
        }
    
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
       
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCliente().getModel();
       
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);
        }
        
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
       
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }

    public Cliente obterCliente() {
      return (Cliente) view.getCliente().getSelectedItem();
     
    }
    
    public Servico obterServico() {
      return (Servico) view.getServico().getSelectedItem();
     
    }

    public void setarValor(float valor) {
      
      //classe - pega o nome do campo - pega o que está escrito dentro dele
        view.getTextValor().setText(valor+"");
    }

    /**
     *
     * @return
     */
    @Override
    public Object obterModelo() {
        
       String idString = view.getText_ID().getText();
       
       int id = Integer.parseInt(idString);
       
       Cliente cliente = obterCliente();
       
       Servico servico = obterServico();
       
       String valorString = view.getTextValor().getText();
       
       float valor = Float.parseFloat(valorString);
       
   
       
       Agendamento agendamento = new Agendamento(id, cliente, servico , valor );
 
       return agendamento ; 
    }

    @Override
    public void limparTela() {
    
        view.getText_ID().setText("0");
        
    }
   
}
