/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.Agenda;
import view.MenuPrincipal;

/**
 *
 * @author Acer
 */
public class MenuPrincipalController {
    

    public MenuPrincipalController(MenuPrincipal view) {
    }
    
    public void navegarParaAgenda() {
    
        Agenda agenda = new Agenda(); 
        agenda.setVisible(true) ; 
    }
    
}
