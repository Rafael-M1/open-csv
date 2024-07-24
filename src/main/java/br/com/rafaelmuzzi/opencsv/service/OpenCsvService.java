package br.com.rafaelmuzzi.opencsv.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import com.opencsv.CSVWriter;

import br.com.rafaelmuzzi.opencsv.model.CsvFile;

public class OpenCsvService {

	public void writeFile(String fileName, List<CsvFile> fileContent) {
		try (Writer writer = new FileWriter(fileName + ".csv");) {
			CSVWriter csvWriter = new CSVWriter(writer,
				    CSVWriter.DEFAULT_SEPARATOR,
				    CSVWriter.NO_QUOTE_CHARACTER,
				    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
				    CSVWriter.RFC4180_LINE_END);
			csvWriter.writeNext(getHeader());
			for (CsvFile content : fileContent) {				
				csvWriter.writeNext(content.getContent());
			}
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private String[] getHeader() {
		return new String[] {"id", "name"};
	}
}
