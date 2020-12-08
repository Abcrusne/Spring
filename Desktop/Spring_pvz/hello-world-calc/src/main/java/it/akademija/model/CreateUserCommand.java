package it.akademija.model;

public final class CreateUserCommand {

	private Long id;

//	@NotNull
//	@Length(min = 1, max = 30)
	private String username;
//	@NotNull
//	@Length(min = 1, max = 100)
	private String firstName;
//	@NotNull
//	@Length(min = 1, max = 100)
	private String lastName;
//	@NotNull
//	@Length(min = 1, max = 200)
	private String email;

// toliau - get ir set metodai
	public String getUsername() {
		return username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
