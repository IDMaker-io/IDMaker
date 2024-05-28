package IDMaker.project.sample.entity;

import IDMaker.project.annotation.IDMaker;
import IDMaker.project.listener.IDMakerEntityListener;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;

@Entity
@EntityListeners(IDMakerEntityListener.class)
public class TestClass {

	@Id
	@IDMaker(length = 10)
	private String id;

	@IDMaker
	private String randomField;

	public String getIdField() {
		return id;
	}

	public String getRandomField() {
		return randomField;
	}
}
