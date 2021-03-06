package edu.mum.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.mum.validation.EmptyOrSize;

@Entity
@Table(name = "user_tb")
public class User implements Serializable {

	private static final long serialVersionUID = -6009119170548412103L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "username")
	@EmptyOrSize(min = 5, max = 16, message = "{size.string.validation}")
	private String username;

	@Column(name = "password")
	@EmptyOrSize(min = 5, max = 16, message = "{size.string.validation}")
	private String password;

	@Column(name = "is_admin")
	private Boolean admin = false;

	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private CarOwnerProfile carOwnerProfile;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "user_authority",
		joinColumns = { @JoinColumn(name = "user_id") },
		inverseJoinColumns = { @JoinColumn(name = "authority_id", unique = true) })
	List<Authority> authority = new ArrayList<Authority>();

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

	public List<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(List<Authority> authority) {
		this.authority = authority;
	}
}
