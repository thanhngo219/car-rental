package edu.mum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_tb")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "is_admin")
	private Boolean admin = false;

	@OneToOne(mappedBy = "user")
	private CarOwnerProfile carOwnerProfile;

	public User() {
	}

	public User(String username, String password, Boolean admin, CarOwnerProfile carOwnerProfile) {
		this.username = username;
		this.password = password;
		this.admin = admin;
		this.carOwnerProfile = carOwnerProfile;
	}

	public User(User user) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.admin = user.getAdmin();
		this.carOwnerProfile = user.getCarOwnerProfile();
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public CarOwnerProfile getCarOwnerProfile() {
		return carOwnerProfile;
	}

	public void setCarOwnerProfile(CarOwnerProfile carOwnerProfile) {
		this.carOwnerProfile = carOwnerProfile;
	}
}
