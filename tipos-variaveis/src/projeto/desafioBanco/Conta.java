package projeto.desafioBanco;

public abstract class Conta implements Iconta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double valor) {
        
    }
    
    public void depositar(double valor) {
        
    }
    
    public void registrar(double valor, Conta contaDestino) {
        
    }
    
    
}
