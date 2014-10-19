package model;

public class User {
	String name, pWord, email;
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpWord() {
		return pWord;
	}

	public void setpWord(String pWord) {
		this.pWord = pWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
