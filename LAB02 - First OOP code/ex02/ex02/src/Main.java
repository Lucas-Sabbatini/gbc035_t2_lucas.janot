public class Main {
    public static void main(String[] args) {
        Figurinha Neymar = new Figurinha("Neymar",1.80f,65.5f,"Atacante","Brasil",14,4,1992);
        Figurinha Gabriel = new Figurinha("Gabriel",1.76f,69.5f,"Atacante","Brasil",12,6,1999);
        Figurinha Fred = new Figurinha("Fred",1.84f,77.5f,"Zagueiro","Brasil",19,9,1998);

        Neymar.imprimeFigurinha();
        Gabriel.imprimeFigurinha();
        Fred.imprimeFigurinha();
    }
}