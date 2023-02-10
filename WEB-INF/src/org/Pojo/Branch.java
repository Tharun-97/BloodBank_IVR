package org.Pojo;

import java.util.List;

public class Branch {
	private int id;
	private String branchLocation;
	private List<BloodGroup> bloodgroups;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public List<BloodGroup> getBloodgroups() {
		return bloodgroups;
	}

	public void setBloodgroups(List<BloodGroup> bloodgroups) {
		this.bloodgroups = bloodgroups;
	}
	

}
