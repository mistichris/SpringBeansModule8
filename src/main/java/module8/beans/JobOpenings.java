package module8.beans;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
@Embeddable
public class JobOpenings {
	public String title;
	public int salary;
	public int hoursPerWeek;

	public JobOpenings() {
		super();
	}

	public JobOpenings(String title, int salary) {
		super();
		this.title = title;
		this.salary = salary;
	}

	public JobOpenings(String title, int salary, int hoursPerWeek) {
		super();
		this.title = title;
		this.salary = salary;
		this.hoursPerWeek = hoursPerWeek;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return "JobOpenings [title=" + title + ", salary=" + salary + ", hoursPerWeek=" + hoursPerWeek + "]";
	}
	
}
