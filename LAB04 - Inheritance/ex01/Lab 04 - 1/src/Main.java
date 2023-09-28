import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j;
        String nomeDoTecnico,nomeDaSelecao;
        Scanner sc = new Scanner(System.in);
        Selecao[] selecao = new Selecao[2];

        for(j=0;j<2;j++){
            System.out.println("Digite o nome da seleção: ");
            nomeDaSelecao = sc.nextLine();
            System.out.println("Digite o nome do tecnico: ");
            nomeDoTecnico = sc.nextLine();
            selecao[j] = new Selecao(nomeDoTecnico,nomeDaSelecao);
        }

        selecao[0].mostrarSelecao();
        selecao[1].mostrarSelecao();
    }


}