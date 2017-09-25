package View;

import javax.swing.JOptionPane;

public class Maquina {

    public static int opcoesTicketMachine() {
        String[] options = new String[]{"Inserir", "Emitir", "Troco", "Sair"};
        return JOptionPane.showOptionDialog(null, "Message", "Sitema de Emissão de Passagens", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    }

    public static int valorInserir() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que será inserido"));

    }

    public static void mostrarSaldo(int valor) {
        JOptionPane.showMessageDialog(null, valor);
    }

    public static void valorInsuficiente() {
        JOptionPane.showMessageDialog(null, "Saldo Insuficiente");

    }

    public static  void retiradaBilhete(int saldo) {
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        JOptionPane.showMessageDialog(null, result);
    }

    public static void resultadoInserir(boolean resul) throws InterruptedException {
        if (resul) {
            JOptionPane.showMessageDialog(null, "Nota Valida");
            Thread.sleep(4000);
            JOptionPane.showMessageDialog(null, "Valor Inserido");

        } else {
            JOptionPane.showMessageDialog(null, "Nota Invalida");
        }
    }
    public static  void retiradaTroco(int saldo) {
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        JOptionPane.showMessageDialog(null, result);
    }

}
