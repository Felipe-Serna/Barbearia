/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import view.Login;

/**
 *
 * @author Acer
 */
public class LoginHelper implements IHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo() {
        
          // pegar um usuario da view    
    String nome = view.getTextUsuario().getText(); 
    
    String senha = view.getTextSenha().getText();
    
    Usuario modelo = new Usuario (0, nome,  senha) ;
    
    return modelo;
        
       }
    
    public void setarModelo(Usuario modelo){
    
        String nome = modelo.getNome(); 
        String senha = modelo.getSenha();
    
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha); 
    }
    
    /**
     *
     */
    @Override
    public void limparTela () {
       
        view.getTextUsuario().setText("");
        view.getTextSenha().setText(""); 
        
    }
}
