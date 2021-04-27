package com.tms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PackagePojo")
public class PackagePojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "packageid_pk")
	int packageId;
	@Column(name = "packagename")
	String packageName;
	@Column(name = "packagedescription")
	String packageDescription;
	@Column(name = "packagetype")
	String packageType;
	@Column(name = "packagecost")
	double packageCost;
	@Column(name = "payment")
	String payment;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "packageid_fk", referencedColumnName = "packageid_pk")
	List<Route> routes;

	public PackagePojo() {
		super();
	}

	public PackagePojo(String packageName, String packageDescription, String packageType, double packageCost,
			String payment, List<Route> routes) {
		super();
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.payment = payment;
		this.routes = routes;
	}

	public PackagePojo(int packageId, String packageName, String packageDescription, String packageType,
			double packageCost, String payment, List<Route> routes) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.payment = payment;
		this.routes = routes;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
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
		return "PackagePojo [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", packageType=" + packageType + ", packageCost=" + packageCost + ", payment="
				+ payment + ", routes=" + routes + "]";
	}

}
