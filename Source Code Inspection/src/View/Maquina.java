package View;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import javax.swing.JOptionPane;
import java.awt.*;

public class Maquina {

    public static int opcoesTicketMachine() {
        String[] options = new String[]{"Inserir", "No", "Maybe", "Cancel"};
        return JOptionPane.showOptionDialog(null, "Message", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    }

    public static int valorInserir() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que será inserido"));
     

    }

    public static void mostrarSaldo(int valor) {
        JOptionPane.showMessageDialog(null, valor);
    }

    public static void resultadoInserir(boolean resul) throws InterruptedException {
        if (resul) {
              JOptionPane.showMessageDialog(null, "Nota Valida");
              Thread.sleep (4000); 
              JOptionPane.showMessageDialog(null, "Valor Inserido");


        } else {
            JOptionPane.showMessageDialog(null, "Nota Invalida");
        }
    }

}
