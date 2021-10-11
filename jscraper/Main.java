package jscraper;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://lol.fandom.com/wiki/LCK/2021_Season/Summer_Season/Match_History";
        System.out.println("Lendo " + url);

        Document doc = Jsoup.connect(url).get();
        Element tabelaPartidas = doc.select("tbody").get(4);
        // Elements partidas = doc.select("div.table-wide-inner > table > tbody > tr");

        Elements partidas = tabelaPartidas.select("tr");

        ArrayList<Partida> Partidas = new ArrayList<Partida>();

        for (Element partida : partidas.subList(3, partidas.size())) {
            Partida novaPartida = new Partida();

            String[] time1Escolhas = new String[5];
            String[] time2Escolhas = new String[5];;
            String[] time1Jogadores = new String[5];;
            String[] time2Jogadores = new String[5];;

            novaPartida.setData(partida.select("td").get(0).text());
            novaPartida.setPatch(partida.select("td").get(1).select("a").text());
            novaPartida.setTime1(partida.select("td").get(2).select("a").attr("title"));
            novaPartida.setTime2(partida.select("td").get(3).select("a").attr("title"));
            novaPartida.setTimeVencedor(partida.select("td").get(4).select("a").attr("title"));

            for(int i = 0; i < 5; i++) {
                time1Escolhas[i] = partida.select("td").get(7).select("span").get(i).attr("title");
                time2Escolhas[i] = partida.select("td").get(8).select("span").get(i).attr("title");
                time1Jogadores[i] = partida.select("td").get(9).select("a").get(i).text();
                time2Jogadores[i] = partida.select("td").get(10).select("a").get(i).text();
            }

            novaPartida.setTime1Escolhas(time1Escolhas);
            novaPartida.setTime2Escolhas(time2Escolhas);
            novaPartida.setTime1Jogadores(time1Jogadores);
            novaPartida.setTime2Jogadores(time2Jogadores);

            novaPartida.setUrlPartida(partida.select("td").get(12).select("a").attr("href"));

            Partidas.add(novaPartida);
        }
        System.out.println("\nTotal partidas: " + Partidas.size());

        int Npartida = 1;
        System.out.println("Mostrando dados da partida " + Npartida);

        System.out.println("Data: " + Partidas.get(Npartida).getData());
        System.out.println("Patch: " + Partidas.get(Npartida).getPatch());
        System.out.println("Time 1: " + Partidas.get(Npartida).getTime1());
        System.out.println("Time 2: " + Partidas.get(Npartida).getTime2());
        System.out.println("Time Vencedor: " + Partidas.get(Npartida).getTimeVencedor());
        System.out.println("Time 1 Escolhas: " + Arrays.toString(Partidas.get(Npartida).getTime1Escolhas()));
        System.out.println("Time 2 Escolhas: " + Arrays.toString(Partidas.get(Npartida).getTime2Escolhas()));
        System.out.println("Time 1 Elenco: " + Arrays.toString(Partidas.get(Npartida).getTime1Jogadores()));
        System.out.println("Time 2 Elenco: " + Arrays.toString(Partidas.get(Npartida).getTime2Jogadores()));
        System.out.println("URL da partida: " + Partidas.get(Npartida).getUrlPartida());
    }

}
