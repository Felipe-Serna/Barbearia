package view;


import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;


public class Main {
    
    public static void main(String[] args) {
        
     Servico servico = new Servico (1 , "barba" , 30)   ;
        
     Cliente cliente = new Cliente  ( 1 , "tiago" , "rua teste" , "123456"   ) ; 
        
     Usuario usuario = new Usuario ( 1 , "barbeiro" , "senha" ) ;
    
     Agendamento agendamento = new Agendamento(1 , cliente , servico , 30 , "16/02/2023 12:18", "16/02/2023 12:18");  
        
       /* System.out.println(servico.getId() +" "+ servico.getDescricao() +" "+ servico.getValor());
     
        System.out.println(usuario.getNome());
        
        System.out.println(cliente.getNome());*/
        
System.out.println(servico.getDescricao());
    

               
       
  
    }
}