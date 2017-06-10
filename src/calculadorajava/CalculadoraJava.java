/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson
 */
public class CalculadoraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a, b;
        a = Float.parseFloat(JOptionPane.showInputDialog(null, "insira o primeiro número: "));
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "insira o segundo número: "));
        
        Multiplcaçao m = new Multiplcaçao();
        System.out.println(m.mut(a, b));
        
        
        Subtraçao s = new Subtraçao();
        System.out.println(s.sub(a, b));
         
    }
    
}
