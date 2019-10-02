package net.atos.rest_evaluation.user.dto;

import java.io.Serializable;

public class CreateUserDTO implements Serializable {

	private final String name;

	public CreateUserDTO(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "CreateUserDTO{" +
				"name='" + name + '\'' +
				'}';
	}
}
