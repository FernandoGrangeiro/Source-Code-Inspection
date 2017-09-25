/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bilhete;
import Model.PapelMoeda;
import Model.TicketMachine;

import View.Maquina;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;

/**
 *
 * @author ggran e Lucas
 */
public class Controller {

    public static void main(String args[]) throws PapelMoedaInvalidaException, InterruptedException {
        TicketMachine ticketMachine = new TicketMachine();
        Bilhete bilhete = new Bilhete (3);
        
        int op ;

        do{
           op = Maquina.opcoesTicketMachine();
        switch (op) {
            case 0:
                PapelMoeda papelMoeda = new PapelMoeda(Maquina.valorInserir(), 1);

                if (TicketMachine.validaNota(papelMoeda.getValor())) {
                    ticketMachine.inserir(papelMoeda.getValor());
                    Maquina.resultadoInserir(true);

                } else {

                    Maquina.resultadoInserir(false);
                }
                Maquina.mostrarSaldo(ticketMachine.getSaldo());
                break;
            case 1:
                if(ticketMachine.getSaldo() < bilhete.getValor()){
                    Maquina.valorInsuficiente();
                }else{
                    ticketMachine.imprimir(bilhete.getValor());
                    Maquina.retiradaBilhete(ticketMachine.getSaldo());
                }
                    
                break;
                
            //troco
            case 2:
                if(ticketMachine.getSaldo() ==  0){
                    Maquina.valorInsuficiente();
                }else{    
                    ticketMachine.retirar(bilhete.getValor());
                    Maquina.retiradaTroco(ticketMachine.getSaldo());
                }
                break;
                    
                
        }

    }while(op != 3);
        }

}
