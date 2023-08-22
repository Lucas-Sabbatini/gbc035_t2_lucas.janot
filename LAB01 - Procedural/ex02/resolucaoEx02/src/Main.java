import java.util.Scanner;

class Produto {
    private String nome;
    private float preco;
    private int qtEstoque;

    public Produto(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInforme o nome, o preco e a qtd. em estoque do produto 1:\n");
        String nome = sc.nextLine();
        float preco = sc.nextFloat();
        int qtEstoque = sc.nextInt();

        this.nome = nome;
        this.preco = preco>0 ? preco:0;
        this.qtEstoque = Math.max(qtEstoque, 0);
    }

    public void mostrarProduto(){
        System.out.printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome,preco,qtEstoque);
    }

    int alteraPreco(float porcentagem){
        float temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem/100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95
            preco = (preco)*temp;  // preço modificado
            return 0;
        } else {
            return -1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[4];

        for (int i = 0; i < 4; i++)
        {
            produtos[i] = new Produto();
        }

        System.out.print("\nAumentando o preco em 10%% do produto 1 e 3");
        produtos[0].alteraPreco(-110);
        produtos[2].alteraPreco(10);

        System.out.print("\nReduzindo o preco em 5%% do produto 2");
        if (produtos[1].alteraPreco(-5) == -1){
            System.out.print("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        }
        else {

            System.out.print("\n\n Preco alterado com sucesso");
        }

        System.out.print("\nAlterando o preco do prod. 3");
        if (produtos[3].alteraPreco(-110) == -1){
            System.out.print("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        }

        System.out.print("\nProdutos Cadastrados:\n");

        for (int i = 0; i < 4; i++){
            produtos[i].mostrarProduto();
        }
    }
}