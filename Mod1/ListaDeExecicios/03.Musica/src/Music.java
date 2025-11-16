public class Music {
    public String titulo;
    public  String artista;
    public int anoLancamento;
    public double avaliacao;
    public int numAvaliacoes;

    public void technicalSheet(){
        System.out.println("Title: " + this.titulo);
        System.out.println("Artist: " + this.artista);
        System.out.println("Year: " + this.anoLancamento);
    }

    public void rate(double aval){
        avaliacao+=aval;
    }

    public double Calcmedia(){
        double media  = this.avaliacao/ numAvaliacoes;

        return media;
    }
}
