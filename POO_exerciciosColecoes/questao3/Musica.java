package questao3;

import java.util.Comparator;

public class Musica {
    private String nome;
    private String nomeArtista;

    public Musica(String nome, String nomeArtista){
        this.nome = nome;
        this.nomeArtista = nomeArtista;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNomeArtista(){
        return this.nomeArtista;
    }

    public void printInfo(){
        System.out.println("nome: " + this.getNome());
        System.out.println("artista/banda: " + this.getNomeArtista());
    }

    public static Comparator<Musica> comparadorNomeMusica = new Comparator<Musica>(){
        public int compare(Musica m1, Musica m2){
            return m1.getNome().compareTo(m2.getNome());
        }
    };

    public static Comparator<Musica> comparadorNomeArtista = new Comparator<Musica>(){
        public int compare(Musica m1, Musica m2){
            return m1.getNomeArtista().compareTo(m2.getNomeArtista());
        }
    };
}
