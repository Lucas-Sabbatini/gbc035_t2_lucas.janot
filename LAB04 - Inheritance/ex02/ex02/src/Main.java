public class Main {
    public static void main(String[] args) {
        Figurinha figurinha = new Figurinha("lucas",1.87f,65.4f,"Atacante","Brasil",11,11,2003);
        FigurinhaEspecial figurinha2 = new FigurinhaEspecial("lucas",1.87f,65.4f,"Atacante","Brasil",11,11,2003,"bordo","super raro");

        figurinha.imprimeFigurinha();
        figurinha2.imprimeFigurinha();
    }
}