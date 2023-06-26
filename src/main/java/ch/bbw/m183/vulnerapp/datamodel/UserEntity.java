package ch.bbw.m183.vulnerapp.datamodel;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Collection;

@Getter
@Setter
@Accessors(chain = true)
@Table(name = "users")
@Entity
public class UserEntity {

	@Id
	String username;

	@Column
	@NotBlank(message = "name is mandatory")
	String fullname;

	@Column
	@Email
	private String email;

	@Column
	@NotBlank(message = "Password is mandatory")
	private String password;

	@Column
	private String role;
}
