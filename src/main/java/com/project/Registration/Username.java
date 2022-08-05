package com.project.Registration;

public class Username {

	public Integer id;
	public String name;
	public String last_Name;
	public String gender;
	public Integer age;
	public String email;
	public Integer phone;
	public String direction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Username(Integer id, String name, String last_Name, String gender, Integer age, String email, Integer phone,
			String direction) {
		super();
		this.id = id;
		this.name = name;
		this.last_Name = last_Name;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.direction = direction;
	}

}
