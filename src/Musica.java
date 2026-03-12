public class Musica extends Audio implements CalculaTempo,MediaAvaliacoes{
    int avaliacoes;
    int nota;
    int totalAvaliacoes;

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setAvaliacoes(int avaliacoes) {
        this.avaliacoes = avaliacoes;
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
