public class Selecao {
    public Figurinha[] jogadoresTitulares;
    String tecnico;

    public Selecao(String tecnico,Figurinha[] jogadores){
        this.tecnico = tecnico;
        jogadoresTitulares =jogadores;
    }

    public void mostrarSelecao(){
        int i;
        System.out.printf("Seleção do técnico %s: \n",tecnico);
        for(i=0;i<11;i++){
            jogadoresTitulares[i].imprimeFigurinha();
        }
    }
}
