package br.com.rafaelmuzzi.opencsv;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rafaelmuzzi.opencsv.model.CsvFile;
import br.com.rafaelmuzzi.opencsv.service.OpenCsvService;

@SpringBootApplication
public class OpencsvApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OpencsvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		OpenCsvService service = new OpenCsvService();
		service.writeFile("arquivo", List.of(
				new CsvFile(new String[] { "1", "a" }),
				new CsvFile(new String[] { "2", "b" }),
				new CsvFile(new String[] { "3", "c" })
			));
	}

}
