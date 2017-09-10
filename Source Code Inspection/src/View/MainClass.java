package View;


import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import javax.swing.JOptionPane;


public class MainClass {
    
    public static void main(String args[]) throws PapelMoedaInvalidaException{
        
        TicketMachine ticketMachine = new TicketMachine(56);
        int op = Integer.parseInt(JOptionPane.showInputDialog("Teste "));
        switch (op){
            
            case 1:
                break;
            case 2:
                
                
                break;
            case 3:
                break;
            case 4:
                break;
             
               
        }
        
        
        
        
        
        
    
    }
        
    
}
