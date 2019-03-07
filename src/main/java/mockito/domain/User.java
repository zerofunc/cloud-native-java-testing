package mockito.domain;

import java.io.Serializable;

public class User implements Serializable{
	private Long id;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private Long createdAt;
	private Long lasmodified;
	public User() {
	}
	
	public User(long id, String usernmae, String firstName, String lastName) {
		this.id = id;
		this.username = usernmae;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String username, String firstname, String lastName, String email) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
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
	
	public Long getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	
	public Long getLasmodified() {
		return lasmodified;
	}
	
	public void setLasmodified(Long lasmodified) {
		this.lasmodified = lasmodified;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
