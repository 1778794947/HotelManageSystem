package com.ecjtu.hotel.pojo;

public class Staff {
	
	private Integer id;
	private String name;
	private String idnum;
	private String department;
	private String post;
	private Integer salary;
	private String remark;
	
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

	public String getIdnum() {
		return idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Staff(Integer id, String name, String idnum, String department, String post, Integer salary, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.idnum = idnum;
		this.department = department;
		this.post = post;
		this.salary = salary;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", idnum=" + idnum + ", department=" + department + ", post="
				+ post + ", salary=" + salary + ", remark=" + remark + "]";
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

}
