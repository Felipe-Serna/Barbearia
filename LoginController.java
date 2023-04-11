/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author Acer
 */
public class LoginController {

    private final Login view;
    private final LoginHelper helper ; 

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view) ;
    }
    
    public void entrarNoSistema() {
    
        Usuario usuario = helper.obterModelo();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
    
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if (usuarioAutenticado != null){ 
            // navegar para menu principal
            MenuPrincipal menu = new MenuPrincipal() ;
            menu.setVisible(true);
            this.view.dispose();
            
        } else  {
            
                view.exibemensagem(" Usuario ou senha invalidos "); 
               
                }
    }
    
    public void fizTarefa() {
         System.out.println("busquei algo no banco de dados") ; 
         
         this.view.exibemensagem("Executei o fiz tarefa") ; 
        
        
    }
}
