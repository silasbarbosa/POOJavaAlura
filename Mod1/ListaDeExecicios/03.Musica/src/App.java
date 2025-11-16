public class App {
    public static void main(String[] args) throws Exception {
        Music m1 = new Music();

        m1.titulo = "Back in Black";
        m1.anoLancamento = 1979;
        m1.artista = "AC/DC";
        m1.numAvaliacoes = 5;

        m1.rate(6);
        m1.rate(1);
        m1.rate(9);
        m1.rate(8);
        m1.rate(6);

        m1.technicalSheet();
        System.out.println("Media " + m1.Calcmedia());
    }
}
