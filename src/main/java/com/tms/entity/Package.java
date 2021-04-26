package com.tms.entity;

import java.util.List;

import javax.persistence.*;

import com.tms.entity.Package;

@Entity
@Table(name = "Package")
public class Package {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "packageId_pk")
	int packageId;
	String packageName;
	String packageDescription;
	String packageType;
	double packageCost;
	String payment;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "packageId_fk", referencedColumnName = "packageId")
	List<Route> routes;

	public Package() {
		super();
	}

	public Package(String packageName, String packageDescription, String packageType, double packageCost,
			String payment, List<Route> routes) {
		super();
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.payment = payment;
		this.routes = routes;
	}

	public Package(int packageId, String packageName, String packageDescription, String packageType, double packageCost,
			String payment, List<Route> routes) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.payment = payment;
		this.routes = routes;
	}

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageDescription() {
		return packageDescription;
	}

	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public double getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", packageType=" + packageType + ", packageCost=" + packageCost + ", payment="
				+ payment + ", routes=" + routes + "]";
	}

}
