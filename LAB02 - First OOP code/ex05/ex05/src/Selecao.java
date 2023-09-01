import java.util.Scanner;

public class Selecao {
    public Figurinha[] jogadoresTitulares;
    String tecnico;
    String nomeDaSelecao;

    public Selecao(String tecnico,String nomeDaSelecao){
        this.tecnico = tecnico;
        this.nomeDaSelecao = nomeDaSelecao;
        jogadoresTitulares = new Figurinha[11];
        int i,dia,mes,ano;
        float altura,peso;
        Scanner sc = new Scanner(System.in);
        String nome,posicao,pais;

        for(i=0;i<11;i++){
            System.out.println("Digite o nome do jogador: ");
            nome = sc.nextLine();
            System.out.println("Digite a sua altura: ");
            altura = sc.nextFloat();
            clearBuffer(sc);
            System.out.println("Digite o seu peso: ");
            peso = sc.nextFloat();
            clearBuffer(sc);
            System.out.println("Digite a sua posicao (atacante/meia/volante): ");
            posicao = sc.nextLine();
            System.out.println("Digite o seu país: ");
            pais = sc.nextLine();
            System.out.println("Digite a sua data de nascimento: dd/MM/yyyy");
            dia = sc.nextInt();
            mes = sc.nextInt();
            ano = sc.nextInt();
            clearBuffer(sc);

            jogadoresTitulares[i] = new Figurinha(nome,altura,peso,posicao,pais,dia,mes,ano);
        }

        System.out.println("Digite o nome do Técnico");
    }

    public void mostrarSelecao(){
        int i;
        System.out.printf("%s, seleção do técnico %s: \n",nomeDaSelecao,tecnico);
        for(i=0;i<11;i++){
            jogadoresTitulares[i].imprimeFigurinha();
        }
    }

    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}


