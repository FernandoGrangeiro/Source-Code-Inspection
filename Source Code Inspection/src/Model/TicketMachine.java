package Model;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int saldo;
    protected  static int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine() {
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        this.saldo += quantia;
    }
   
    

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        return null;
    }
    
    public static   boolean validaNota( final int quantia){
        
       for(int i = 0; i<papelMoeda.length; i++){
           if (papelMoeda[i] ==  quantia)
               return true;

       }
       return false;
        
        
    }


    public void imprimir(int valor) {
       this.saldo = this.saldo - valor;
        
    }
    public void retirar(int quantia) throws PapelMoedaInvalidaException {
        this.saldo = 0;
    }
    
}
