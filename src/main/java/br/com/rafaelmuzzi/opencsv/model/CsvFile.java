package br.com.rafaelmuzzi.opencsv.model;

import java.util.Arrays;

public class CsvFile {

	private String[] content;

	public CsvFile() {
	}

	public CsvFile(String[] content) {
		this.content = content;
	}

	public String[] getContent() {
		return content;
	}

	public void setContent(String[] content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "FileContent [content=" + Arrays.toString(content) + "]";
	}

}
