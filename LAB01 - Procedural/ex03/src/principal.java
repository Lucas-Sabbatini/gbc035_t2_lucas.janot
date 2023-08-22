import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor>>");
        int i;

        for(i=0;i<6;i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.printf("Os valores lidos em ordem inversa são: ");

        for(i=5;i>=0;i--){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");
        int i=0,aux;

        while(i<6){
            System.out.printf("Digite um numero %d: ",i+1);
            aux = sc.nextInt();

            if(aux%2==0){
                vet[i] = aux;
                i++;
            }
            else{
                System.out.println("Só aceitamos numeros pares");
            }
        }

        System.out.println("Os valores digitados foram: ");

        for(i=0;i<6;i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor>>");
        int i,maior=0,menor=0;
        float media=0;

        for(i=0;i<6;i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
            if(i==0){
                maior = vet[0];
                menor = vet[0];
            }
            else{
                if(maior<vet[i]){
                    maior = vet[i];
                }
                if(menor>vet[i]){
                    menor = vet[i];
                }
            }
            media+=vet[i];
        }

        media/=6f;
        System.out.printf("O maior valor digitado é: %d\n O menor valor digitado é: %d\nA media dos valores é: %f",maior,menor,media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor>>");
        int i,maior=0,menor=0,imaior=0,imenor=0;
        float media=0;

        for(i=0;i<6;i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = sc.nextInt();
            if(i==0){
                maior = vet[0];
                menor = vet[0];
            }
            else{
                if(maior<vet[i]){
                    maior = vet[i];
                    imaior = i;
                }
                if(menor>vet[i]){
                    menor = vet[i];
                    imenor = i;
                }
            }
            media+=vet[i];
        }

        media/=6f;
        System.out.printf("O maior valor digitado e o seu índice são: %d %d\n O menor valor digitado e o seu índice são: %d %d\nA media dos valores é: %f",maior,imaior,menor,imenor,media);
    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Normalizando as notas >>");
        int i,maior=0;
        float div;

        for(i=0;i<5;i++){
            System.out.printf("Nota do aluno %d: ",i+1);
            vet[i] = sc.nextInt();
            if(i==0){
                maior = vet[0];
            }
            else{
                if(maior<vet[i]){
                    maior = vet[i];
                }
            }
        }

        System.out.println("As notas normalizadas são: ");

        for(i=0;i<5;i++){
            div = (float) vet[i]/maior;
            vet[i] =  (int) (div *100);
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Calculando media e desvio padrão >>");
        int i,soma=0;
        double media,desv,somaf=0;

        for(i=0;i<5;i++){
            System.out.printf("Digite o valor: ");
            vet[i] = sc.nextInt();
            soma+=vet[i];
        }

        media = soma/5d;

        for(i=0;i<5;i++){
            somaf += Math.pow(vet[i]-media,2);
        }

        desv = Math.pow(somaf/4d,0.5);

        System.out.printf("A media é %f e o desvio padrão é %f",media,desv);
    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        int i,nAlunos;
        float soma=0,media;

        do{
            System.out.println("<< Media de n alunos. Máximo de 100 alunos >>\nEntre com o número de alunos: ");
            nAlunos = sc.nextInt();
            if(nAlunos > 100){
                System.out.println("Você digitou um valor maior do que 100, tente novamente");
            }
        }while(nAlunos >100);

        float[] vet = new float[nAlunos];

        for(i=0;i<nAlunos;i++){
            System.out.printf("Digite a nota do aluno %d: ",i+1);
            vet[i] = sc.nextInt();
            soma+=vet[i];
        }

        media = soma/nAlunos;

        System.out.println("\n<< Relatório de notas >>");
        for(i=0;i<nAlunos;i++){
            System.out.printf("A nota do aluno %d é: %f\n",i+1,vet[i]);
        }
        System.out.println("A media das notas da turma é: "+media);

    }
    public static void main(String[] args) {
        // ex01();
        // ex02();
        // ex03();
        // ex04();
        // ex05();
        // ex06();
        // ex07();
        //ex08();
        ex09();
    }


}
