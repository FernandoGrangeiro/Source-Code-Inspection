/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TicketMachine;
import View.Maquina;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import javax.swing.JOptionPane;
/**
 *
 * @author ggran
 */
public class Controller {
    
        public static void main(String args[]) throws PapelMoedaInvalidaException, InterruptedException{
               TicketMachine ticketMachine = new TicketMachine(20);

            switch(Maquina.opcoesTicketMachine()){
                case 0:
                  int nota = Maquina.valorInserir();
                  if(TicketMachine.validaNota(nota)){
                    ticketMachine.inserir(nota);
                      Maquina.resultadoInserir(true);
                  }else{
                      Maquina.resultadoInserir(false);
                  }
                    break;
            }
            
           //  Maquina.mostrarSaldo(ticketMachine.getSaldo());
            
            

               
        }
  
    
    
}
