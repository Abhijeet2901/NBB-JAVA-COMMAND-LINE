package reqblood.model;

public class UserReg {

	private String id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String email;
	private String contactNumber;
	private String address;
	private String bloodgroup;
	private Integer unit;
	
	public UserReg() {}

	public UserReg(String id, String firstName, String lastName, Integer age, String gender, String email,
			String contactNumber, String address, String bloodgroup, Integer unit) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		this.bloodgroup = bloodgroup;
		this.unit = unit;
	}
	
	

	public UserReg(String firstName, String lastName, Integer age, String gender, String email, String contactNumber,
			String address, String bloodgroup, Integer unit) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		this.bloodgroup = bloodgroup;
		this.unit = unit;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "UserReg [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + ", contactNumber=" + contactNumber + ", address="
				+ address + ", bloodgroup=" + bloodgroup + ", unit=" + unit + "]";
	}
	
	
}
