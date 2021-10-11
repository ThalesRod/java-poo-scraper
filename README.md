# Projetos JAVA POO e Scraper

## O que é?
2 projetos feitos em Java, um programa simples com principais fundamentos de POO e um scraper simples.

## Sobre o scraper
O scraper coleta dados do site da (wiki de jogos competitivos de League of Legends)["https://lol.fandom.com/wiki/LCK/2021_Season/Summer_Season/Match_History"], mais especificamente do histórico de partidas de determinada liga (no caso desse projeto da liga coreana, a LCK), armazena essas informações em um array de objetos Partida e fica pra pronto pra uso posterior. Feito utilizando a biblioteca de web scraping (Jsoup)["https://jsoup.org/"].

## Como está organizado?
Na pasta zoologico estão os arquivos relacionados ao projeto de POO e na pasta jscraper estão os arquivos relacionados ao scraper.

## Como rodar?
Ambos os programas foram compilados e executados num ambiente Linux (Debian) pelo terminal com o openjdk 11.0.6.

~~~bash
# para compilar o programa de POO do zoologico
javac zoologico/*.java
# para rodar o programa
java zoologico.Main
~~~

~~~bash
# para compilar o programa do scraper
javac -cp jscraper/jsoup-1.14.3.jar jscraper/*.java

# para rodar o programa
java -cp jscraper/jsoup-1.14.3.jar:. jscraper.Main

# a flag -cp é para adicionar a biblioteca do jsoup ao class path do java
~~~

## Como melhorar?
O scraper futuramente pode ser incrementando colocando a saída dos dados coletados em um arquivo CSV ou JSON.
