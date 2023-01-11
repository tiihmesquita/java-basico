package projeto.desafioBanco;

public interface Iconta {
    void sacar(double valor);
    void depositar(double valor);
    void registrar(double valor,Conta contaDestino);


}
