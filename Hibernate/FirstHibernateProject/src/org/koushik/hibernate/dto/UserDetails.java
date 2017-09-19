package org.koushik.hibernate.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails{

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="USER_ID")
	private int userId;
	
	//@Column(name="USER_NAME")
	private String userName;
	
	@Temporal(TemporalType.DATE)
	//@Transient
	private Date joinDate;
	
	@Lob
	private String description;
	
	/*@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="HOME_STREET_NAME")),
		@AttributeOverride(name="city", column=@Column(name="HOME_CITY_NAME")),
		@AttributeOverride(name="state", column=@Column(name="HOME_STATE_NAME")),
		@AttributeOverride(name="pin", column=@Column(name="HOME_PIN_CODE")),
		})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="OFFICE_STREET_NAME")),
		@AttributeOverride(name="city", column=@Column(name="OFFICE_CITY_NAME")),
		@AttributeOverride(name="state", column=@Column(name="OFFICE_STATE_NAME")),
		@AttributeOverride(name="pin", column=@Column(name="OFFICE_PIN_CODE")),
		})
	private Address officeAddress;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@JoinTable(name="USER_ADDRESS",
			   joinColumns=@JoinColumn(name="USER_ID"))
	//@GenericGenerator(name="hilo-gen", strategy = "hilo")
	//@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address> listOfAddresses = new ArrayList<Address>();*/
	
	@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;
	
	@OneToMany
	@JoinTable(joinColumns=@JoinColumn(name="USER_ID"),
			   inverseJoinColumns=@JoinColumn(name="ACCOUNT_ID"))
	private Collection<Account> account = new ArrayList<Account>();
	
	
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinTable(joinColumns=@JoinColumn(name="USER_ID"),
	   		   inverseJoinColumns=@JoinColumn(name="BOOK_ID"))
	private Collection<Book> book = new ArrayList<>();
	
	public Collection<Account> getAccount() {
		return account;
	}
	public void setAccount(Collection<Account> account) {
		this.account = account;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	/*public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}*/
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Collection<Book> getBook() {
		return book;
	}
	public void setBook(Collection<Book> book) {
		this.book = book;
	}
	
	
}
