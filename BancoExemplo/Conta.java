package BancoExemplo;

public class Conta {
    private double saldo;
    public Conta(){
        this.saldo = 0.00;
    }
    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
    public void saque(double valor){
        this.saldo = this.saldo - valor;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
