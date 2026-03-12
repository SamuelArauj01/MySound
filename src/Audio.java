public class Audio{
    protected String titulo;
    protected String autor;
    protected String tipo;
    protected int totalDeReproducoes;
    protected int tempo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Invalido");
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            System.out.println("Invalido");
        } else {
            this.autor = autor;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            System.out.println("Invalido");
        } else {
            this.tipo = tipo;
        }
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        if (totalDeReproducoes <= 0) {
            System.out.println("Invalido");
        } else {
            this.totalDeReproducoes= totalDeReproducoes;
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        if (tempo <= 0) {
            System.out.println("Invalido");
        } else {
            this.tempo = tempo;
        }
    }
}