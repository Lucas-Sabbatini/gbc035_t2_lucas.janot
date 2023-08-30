public class Main {
    public static void main(String[] args) {
        Figurinha Neymar = new Figurinha("Neymar",1.80f,65.5f,"Atacante","Brasil",1970,4,12);
        Figurinha Gabriel = new Figurinha("Gabriel",1.76f,69.5f,"Atacante","Brasil",1999,6,12);
        Figurinha Fred = new Figurinha("Fred",1.84f,77.5f,"Zagueiro","Brasil",1980,9,19);

        Neymar.imprimeFigurinha();
        Gabriel.imprimeFigurinha();
        Fred.imprimeFigurinha();
    }
}