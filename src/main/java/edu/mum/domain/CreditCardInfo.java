package edu.mum.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import edu.mum.validation.EmptyOrSize;

@Entity
@Table(name = "credit_card_info")
public class CreditCardInfo implements Serializable {

	private static final long serialVersionUID = -3384856498553402625L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "creditCardNum")
	@EmptyOrSize(min = 16, max = 16, message = "{credit.card.validation}")
	private String creditCardNum;

	@Column(name = "fullName")
	@NotBlank(message = "{not.blank}")
	private String fullName;

	@Column(name = "csv")
	@NotBlank(message = "{not.blank}")
	private String csv;

	@Column(name = "expiredDate")
	@NotBlank(message = "{not.blank}")
	private String expDate;

	@OneToOne
	private Rental rental;

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public Long getId() {
		return id;
	}

	public String getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCsv() {
		return csv;
	}

	public void setCsv(String csv) {
		this.csv = csv;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
