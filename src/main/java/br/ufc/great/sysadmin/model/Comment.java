package br.ufc.great.sysadmin.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Comment extends AbstractModel<Long>{
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Person person;
	private String description;
	
	public Comment() {
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}