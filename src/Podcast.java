public class Podcast extends Musica implements CalculaTempo,MediaAvaliacoes{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double media() {
        return (double) avaliacoes /totalAvaliacoes;
    }

    @Override
    public int contaAvaliacoes() {
        for (int i = 0; i <= avaliacoes; i++) {
            totalAvaliacoes = i;
        }
        return totalAvaliacoes;
    }

    @Override
    public int tempoTotal() {
        return totalDeReproducoes * tempo;
    }
}
