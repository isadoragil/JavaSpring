package br.com.alura.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class StreamsELambdas {
    public static void main(String[] args) {
//        for(int i = 0; i < dadosSerie.totalTemporadas(); i++) {
//            List<DadosEpisodio> episodiosTeporada = temporadas.get(i).episodios();
//            for (int j = 0; j < episodiosTeporada.size(); j++) {
//                System.out.println("Temp. " + (i+1) + ", Ep. " + (j+1) + ": " +episodiosTeporada.get(j).titulo());
//            }

//            temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

//      (a, b) -> { return a + b; }

            List<String> series = Arrays.asList("Gilmore Girls", "Stranger Things", "Lost", "Riverdale");

            series.stream()
                    .sorted()
                    .limit(3)
                    .filter(n -> n.startsWith("Lo"))
                    .map(n -> n.toUpperCase())
                    .forEach(System.out::println);
    }
}
