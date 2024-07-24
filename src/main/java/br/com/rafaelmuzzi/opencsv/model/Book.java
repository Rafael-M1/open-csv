package br.com.rafaelmuzzi.opencsv.model;

public class Book {

	private Long id;
	private String name;
	private String authorName;
	private Long numberPages;

	public Book() {
	}

	public Book(Long id, String name, String authorName, Long numberPages) {
		this.id = id;
		this.name = name;
		this.authorName = authorName;
		this.numberPages = numberPages;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Long getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(Long numberPages) {
		this.numberPages = numberPages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorName=" + authorName + ", numberPages=" + numberPages
				+ "]";
	}

}
