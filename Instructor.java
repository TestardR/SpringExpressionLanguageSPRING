package com.romain.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
//	@Value("#{T(java.lang.Math).abs(-99)}")
//	@Value("#{100+10}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	int id;

//	@Value("Romain Testard")
//	@Value("#{'Romain Testard'.toUpperCase()}")
	@Value("#{new java.lang.String('Romain Testard')}")
	String name;

	@Value("#{topics}")
	private List<String> topics;

//	@Value("#{(2+4)>5}")
	@Value("#{(2+4)>8?true:false}")
	private boolean active;

	@Autowired
	private Profile profile;

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

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", active=" + active + ", profile="
				+ profile + "]";
	}

}
