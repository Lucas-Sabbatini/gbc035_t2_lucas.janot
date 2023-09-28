public class Carro {
    public int ano;
    protected int velocidade;
    private int preco;

    public Carro(){
        ano  = 2003;
        velocidade = 67;
        preco = 30000;
    }

    public Carro(int ano,int velocidade,int preco){
        this.velocidade = velocidade;
        this.ano = ano;
        this.preco = preco;
    }
}
