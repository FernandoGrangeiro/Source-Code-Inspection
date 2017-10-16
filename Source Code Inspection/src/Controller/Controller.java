/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bilhete;
import Model.PapelMoeda;
import Model.TicketMachine;
import Model.Troco;
import View.Maquina;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;

/**
 *
 * @author ggran e Lucas
 */
public class Controller {

    public static void main(String args[]) throws PapelMoedaInvalidaException, InterruptedException {
        TicketMachine ticketMachine = new TicketMachine();
        Bilhete bilhete = new Bilhete(3);

        int op;

        do {
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
                    if (ticketMachine.getSaldo() < bilhete.getValor()) {
                        Maquina.valorInsuficiente();
                    } else {
                        ticketMachine.imprimir(bilhete.getValor());
                        Maquina.retiradaBilhete(ticketMachine.getSaldo());
                    }

                    break;

                //troco
                case 2:
                    if (ticketMachine.getSaldo() == 0) {
                        Maquina.valorInsuficiente();
                    } else {

                        Troco troco = new Troco(ticketMachine.getSaldo());
                        List<PapelMoeda> papel = troco.getValorQtd();
                        for (PapelMoeda p : papel) {
                            if (p.getQuantidade() > 0) {
                                Maquina.retiradaTroco("Senhor o valor do seu troco é "+ p.getValor()+ "\nA quantidade é "+p.getQuantidade());                                
                            }
                        }

                    }
                    break;

            }

        } while (op != 3);
    }

}
