package com.romain.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("Professeur de Sciences Economiques et Sociales")
	private String title;
	@Value("Education Nationale")
	private String compagny;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompagny() {
		return compagny;
	}

	public void setCompagny(String compagny) {
		this.compagny = compagny;
	}

	@Override
	public String toString() {
		return "Profile [title=" + title + ", compagny=" + compagny + "]";
	}

}
