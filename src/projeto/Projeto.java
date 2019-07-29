/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import Formularios.Login;
import Formularios.Principal;

/**
 *
 * @author claitoncorrea
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal form = new Principal();
        form.setVisible(true);
        form.setExtendedState(Principal.MAXIMIZED_BOTH);
       /* Login janelalogin = new Login();
        janelalogin.setVisible(true);
        janelalogin.setLocationRelativeTo(null);
        */
        
    }
    
}
