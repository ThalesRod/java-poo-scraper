package jscraper;

public class Partida {
    private String data;
    private String patch;
    private String time1;
    private String time2;
    private String timeVencedor;
    private String[] time1Escolhas;
    private String[] time2Escolhas;
    private String[] time1Jogadores;
    private String[] time2Jogadores;
    private String urlPartida;

    // Getters e Setters
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPatch() {
		return this.patch;
	}

	public void setPatch(String patch) {
		this.patch = patch;
	}

	public String getTime1() {
		return this.time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getTime2() {
		return this.time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public String getTimeVencedor() {
		return this.timeVencedor;
	}

	public void setTimeVencedor(String timeVencedor) {
		this.timeVencedor = timeVencedor;
	}

	public String[] getTime1Escolhas() {
		return this.time1Escolhas;
	}

	public void setTime1Escolhas(String[] time1Escolhas) {
		this.time1Escolhas = time1Escolhas;
	}

	public String[] getTime2Escolhas() {
		return this.time2Escolhas;
	}

	public void setTime2Escolhas(String[] time2Escolhas) {
		this.time2Escolhas = time2Escolhas;
	}

	public String[] getTime1Jogadores() {
		return this.time1Jogadores;
	}

	public void setTime1Jogadores(String[] time1Jogadores) {
		this.time1Jogadores = time1Jogadores;
	}

	public String[] getTime2Jogadores() {
		return this.time2Jogadores;
	}

	public void setTime2Jogadores(String[] time2Jogadores) {
		this.time2Jogadores = time2Jogadores;
	}

	public String getUrlPartida() {
		return this.urlPartida;
	}

	public void setUrlPartida(String urlPartida) {
		this.urlPartida = urlPartida;
	}

}