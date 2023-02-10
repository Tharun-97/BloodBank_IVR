package org.Pojo;

public class BloodUnits {
	private int id;
	private BloodGroup bg_id;
	private int availableUnits;
	private Branch branch_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BloodGroup getBg_id() {
		return bg_id;
	}

	public void setBg_id(BloodGroup bg_id) {
		this.bg_id = bg_id;
	}

	public int getAvailableUnits() {
		return availableUnits;
	}

	public void setAvailableUnits(int availableUnits) {
		this.availableUnits = availableUnits;
	}

	public Branch getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Branch branch_id) {
		this.branch_id = branch_id;
	}
}
