package com.amigos.mongo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document
public class Student {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Gender gender;
	private Address address;
	private List<String> favouriteSubjects;
	private BigDecimal totalSpentOnBook;
	private LocalDateTime createdAt;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param gemder
	 * @param address
	 * @param favouriteSubjects
	 * @param totalSpentOnBook
	 * @param createdAt
	 */
	public Student(String firstName, String lastName, String email, Gender gender, Address address,
			List<String> favouriteSubjects, BigDecimal totalSpentOnBook, LocalDateTime createdAt) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.favouriteSubjects = favouriteSubjects;
		this.totalSpentOnBook = totalSpentOnBook;
		this.createdAt = createdAt;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the gemder
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gemder the gemder to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the favouriteSubjects
	 */
	public List<String> getFavouriteSubjects() {
		return favouriteSubjects;
	}
	/**
	 * @param favouriteSubjects the favouriteSubjects to set
	 */
	public void setFavouriteSubjects(List<String> favouriteSubjects) {
		this.favouriteSubjects = favouriteSubjects;
	}
	/**
	 * @return the totalSpentOnBook
	 */
	public BigDecimal getTotalSpentOnBook() {
		return totalSpentOnBook;
	}
	/**
	 * @param totalSpentOnBook the totalSpentOnBook to set
	 */
	public void setTotalSpentOnBook(BigDecimal totalSpentOnBook) {
		this.totalSpentOnBook = totalSpentOnBook;
	}
	/**
	 * @return the createdAt
	 */
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", gemder=" + gender
				+ ", address=" + address + ", favouriteSubjects=" + favouriteSubjects + ", totalSpentOnBook="
				+ totalSpentOnBook + ", createdAt=" + createdAt + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail() + ", getGemder()=" + getGender()
				+ ", getAddress()=" + getAddress() + ", getFavouriteSubjects()=" + getFavouriteSubjects()
				+ ", getTotalSpentOnBook()=" + getTotalSpentOnBook() + ", getCreatedAt()=" + getCreatedAt()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
