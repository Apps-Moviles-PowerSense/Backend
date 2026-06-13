package com.powersense.analytics.reports.interfaces.rest.resources;

public class DepartmentMetricResponse {
	private String departmentId;
	private String departmentName;
	private String metric;
	private double currentPeriod;
	private double previousPeriod;

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public double getCurrentPeriod() {
		return currentPeriod;
	}

	public void setCurrentPeriod(double currentPeriod) {
		this.currentPeriod = currentPeriod;
	}

	public double getPreviousPeriod() {
		return previousPeriod;
	}

	public void setPreviousPeriod(double previousPeriod) {
		this.previousPeriod = previousPeriod;
	}
}
