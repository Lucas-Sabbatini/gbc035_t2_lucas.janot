import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j,dia,mes,ano;
        String nome,posicao,pais,nomeDoTecnico;
        float altura,peso;
        Scanner sc = new Scanner(System.in);
        Figurinha[] jogadores = new Figurinha[11];
        Selecao[] selecao = new Selecao[2];
        for(j=0;j<2;j++){
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

                jogadores[i] = new Figurinha(nome,altura,peso,posicao,pais,dia,mes,ano);
            }

            System.out.println("Digite o nome do Técnico");
            nomeDoTecnico = sc.nextLine();

            selecao[j] = new Selecao(nomeDoTecnico,jogadores);
        }

        selecao[0].mostrarSelecao();
        selecao[1].mostrarSelecao();
    }

    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}