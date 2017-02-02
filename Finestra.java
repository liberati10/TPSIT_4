        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finestra;
import java.awt.*;
/**
 *
 * @author studente_2
 */
public class Finestra 
{
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Frame f= new Frame();
    Panel p= new Panel();
    Label l= new Label("Etichetta");
    Button b=new Button("Bottone");
    p.add(l);
    p.add(b);
    
    f.add(p);
    f.setSize(300,200);
    f.setVisible(true);   // TODO code application logic here
    }
    
}
 