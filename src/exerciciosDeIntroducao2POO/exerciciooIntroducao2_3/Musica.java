package exerciciosDeIntroducao2POO.exerciciooIntroducao2_3;

public class Musica {

    public String titulo;
    public String artista;
    public String genero;

    public Musica(String titulo, String artista, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void reproduzir() {
        System.out.println("Música tocando!");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void exibirDescricao() {
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
        System.out.println("Titulo: " + titulo);
    }
}
