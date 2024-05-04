package br.com.fmmcba.RestApiAlura;

import br.com.fmmcba.RestApiAlura.model.DadosSerie;
import br.com.fmmcba.RestApiAlura.service.ConsumoApi;
import br.com.fmmcba.RestApiAlura.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApiAluraApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
