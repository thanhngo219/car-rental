package edu.mum.domain;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "bank_account")
public class BankAccount implements Serializable {

	private static final long serialVersionUID = -6143479125286634502L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "cardNumber")
	private String cardNumber;

	@Temporal(TemporalType.DATE)
	@Column(name = "expiredDate")
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date expiredDate;

	@Column(name = "securityCode")
	private String securityCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((expiredDate == null) ? 0 : expiredDate.hashCode());
		result = prime * result + ((securityCode == null) ? 0 : securityCode.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		BankAccount other = (BankAccount) obj;
		if (cardNumber == null || !cardNumber.equals(other.cardNumber)) {
			return false;
		}
		if (expiredDate == null || !expiredDate.equals(other.expiredDate)) {
			return false;
		}
		if (securityCode == null || !securityCode.equals(other.securityCode)) {
			return false;
		}

		if (id != other.id) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("BankAccount [id=%s, Card Number=%s, Exprired Date=%s, Security Code=%s]", id, cardNumber,
				expiredDate.toString(), securityCode);
	}
}
