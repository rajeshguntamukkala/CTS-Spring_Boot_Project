package com.example.finalprojectdemo2.model;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="BikeService")
public class BikeService {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 

 
	private int id;
 
	@NotBlank(message="Please enter the bikemake")
 
	private String bikemake;
 
 
	@NotBlank(message="Please enter the bikemake")
	private String registrationNumber;
 
 
	@NotNull
 
	private int bikechassisNumber;
 
 
	@NotBlank
 
	private String knownissues;
 
	@NotNull
 
	private int cost;
 
 	private LocalDate givendate;
 	private LocalDate expecteddeliverydate;
	private LocalDate createddatetime;
	private LocalDate updateddatetime;
 
	@NotBlank
 	private String  phonenumber;
	
	@Valid
	@Embedded
    Address adr;

	public BikeService() {
		super();
		
	}

	public BikeService(int id, @NotBlank(message = "Please enter the bikemake") String bikemake,
			@NotBlank(message = "Please enter the bikemake") String registrationNumber, @NotNull int bikechassisNumber,
			@NotBlank String knownissues, @NotNull int cost, LocalDate givendate, LocalDate expecteddeliverydate,
			LocalDate createddatetime, LocalDate updateddatetime, @NotBlank String phonenumber, Address adr) {
		super();
		this.id = id;
		this.bikemake = bikemake;
		this.registrationNumber = registrationNumber;
		this.bikechassisNumber = bikechassisNumber;
		this.knownissues = knownissues;
		this.cost = cost;
		this.givendate = givendate;
		this.expecteddeliverydate = expecteddeliverydate;
		this.createddatetime = createddatetime;
		this.updateddatetime = updateddatetime;
		this.phonenumber = phonenumber;
		this.adr = adr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBikemake() {
		return bikemake;
	}

	public void setBikemake(String bikemake) {
		this.bikemake = bikemake;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getBikechassisNumber() {
		return bikechassisNumber;
	}

	public void setBikechassisNumber(int bikechassisNumber) {
		this.bikechassisNumber = bikechassisNumber;
	}

	public String getKnownissues() {
		return knownissues;
	}

	public void setKnownissues(String knownissues) {
		this.knownissues = knownissues;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public LocalDate getGivendate() {
		return givendate;
	}

	public void setGivendate(LocalDate givendate) {
		this.givendate = givendate;
	}

	public LocalDate getExpecteddeliverydate() {
		return expecteddeliverydate;
	}

	public void setExpecteddeliverydate(LocalDate expecteddeliverydate) {
		this.expecteddeliverydate = expecteddeliverydate;
	}

	public LocalDate getCreateddatetime() {
		return createddatetime;
	}

	public void setCreateddatetime(LocalDate createddatetime) {
		this.createddatetime = createddatetime;
	}

	public LocalDate getUpdateddatetime() {
		return updateddatetime;
	}

	public void setUpdateddatetime(LocalDate updateddatetime) {
		this.updateddatetime = updateddatetime;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "BikeService [id=" + id + ", bikemake=" + bikemake + ", registrationNumber=" + registrationNumber
				+ ", bikechassisNumber=" + bikechassisNumber + ", knownissues=" + knownissues + ", cost=" + cost
				+ ", givendate=" + givendate + ", expecteddeliverydate=" + expecteddeliverydate + ", createddatetime="
				+ createddatetime + ", updateddatetime=" + updateddatetime + ", phonenumber=" + phonenumber + ", adr="
				+ adr + "]";
	}

	}