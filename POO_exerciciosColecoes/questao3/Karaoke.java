package questao3;

import java.util.*;

public class Karaoke{
    Set<Musica> conjuntoMusicas;
    ArrayDeque<Musica> filaMusicas;

    public Karaoke(){
        this.conjuntoMusicas = new HashSet<Musica>();
        this.filaMusicas = new ArrayDeque<Musica>();
    }

    public void adicionarMusica(Musica musica){
        this.conjuntoMusicas.add(musica);
    }

    public void consultarConjutoMusicas(String criterioDeOrdenacao){
        List<Musica> listaMusicas = new ArrayList<>(this.conjuntoMusicas);
        
        if (criterioDeOrdenacao.equals("nomeArtista")){
            System.out.println("MUSICAS ORDENADAS POR NOME DO ARTISTA:");
            Collections.sort(listaMusicas, Musica.comparadorNomeArtista);
        }
        else{
            System.out.println("MUSICAS ORDENADAS POR NOME:");
            Collections.sort(listaMusicas, Musica.comparadorNomeMusica);
        }

        for (Musica m : listaMusicas){
            m.printInfo();
            System.out.println("-----------------");
        }
    }

    public void adicionarMusicaNaFila(Musica musica){
        this.filaMusicas.addLast(musica);
    }

    public void consultarFilaMusicas(){
        System.out.println("MUSICAS QUE ESTÃO NA FILA:");
        for (Musica musica : this.filaMusicas){
            musica.printInfo();
            System.out.println("---------------");
        }
    }

    public Musica tocarProximaMusica(){
        return this.filaMusicas.pollFirst();
    }

    public static void main(String[] args) {
        Karaoke karaoke = new Karaoke();

        // criando duas musicas de teste
        // obs: a musica1 vem primeiro que a musica2 na ordenação por nome do arista
        // obs2: a musica2 vem primeiro no criterio de ordenação por nome
        Musica musica1 = new Musica("No time to die", "Billie Eilish");
        Musica musica2 = new Musica("Bohemian Rhapsody", "Queen");

        // adicionando a musica2 primeiro para testar o criterio de ordenacao
        // adicionando a musica1 duas vezes para ver se ha musicas duplicadas
        karaoke.adicionarMusica(musica2);
        karaoke.adicionarMusica(musica1);
        karaoke.adicionarMusica(musica1);

        karaoke.consultarConjutoMusicas("nomeArtista");
        System.out.println("\n-----------------------------------\n");
        karaoke.consultarConjutoMusicas("nome");

        System.out.println("\n-----------------------------------\n");

        karaoke.adicionarMusicaNaFila(musica1);
        karaoke.adicionarMusicaNaFila(musica2);
        karaoke.consultarFilaMusicas();

        System.out.println("\n-----------------------------------\n");

        Musica musicaTocandoAgr = karaoke.tocarProximaMusica();
        System.out.println("MUSICA TOCANDO AGR:");
        musicaTocandoAgr.printInfo();

        System.out.println("\nFILA MUSICAS ATUALIZADA:\n");
        karaoke.consultarFilaMusicas();
    }
}