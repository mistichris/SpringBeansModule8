package module8.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
@Entity
public class Company {
	@Id
	@GeneratedValue
	public long id;
	public String companyName;
	public int size;
	public boolean healthCare;
	public boolean retirement;
	public int pto;
	@Autowired
	public JobOpenings jobOpenings;

	public Company() {
		super();
	}

	public Company(String companyName, int size, boolean healthCare, boolean retirement, int pto,
			JobOpenings jobOpenings) {
		super();
		this.companyName = companyName;
		this.size = size;
		this.healthCare = healthCare;
		this.retirement = retirement;
		this.pto = pto;
		this.jobOpenings = jobOpenings;
	}
	
	public Company(String companyName, int size, JobOpenings jobOpenings) {
		super();
		this.companyName = companyName;
		this.size = size;
		this.jobOpenings = jobOpenings;
	}

	public Company(String companyName, JobOpenings jobOpenings) {
		super();
		this.companyName = companyName;
		this.jobOpenings = jobOpenings;
	}
	
	public long getId() {
		return id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isHealthCare() {
		return healthCare;
	}

	public void setHealthCare(boolean healthCare) {
		this.healthCare = healthCare;
	}

	public boolean isRetirement() {
		return retirement;
	}

	public void setRetirement(boolean retirement) {
		this.retirement = retirement;
	}

	public int getPto() {
		return pto;
	}

	public void setPto(int pto) {
		this.pto = pto;
	}

	public JobOpenings getJobOpenings() {
		return jobOpenings;
	}
	public void setJobOpenings(JobOpenings jobOpenings) {
		this.jobOpenings = jobOpenings;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", size=" + size + ", healthCare=" + healthCare
				+ ", retirement=" + retirement + ", pto=" + pto + ", jobOpenings=" + jobOpenings + "]";
	}
	
}
