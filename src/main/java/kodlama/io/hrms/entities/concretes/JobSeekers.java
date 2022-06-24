package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name="jobseekers")
@EqualsAndHashCode(callSuper = false)
//@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")

public class JobSeekers extends Users {
	
	//@Id
	@GeneratedValue
	@Column(name="user_id")
	private int	userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String	lastName;
	
	@Column(name="identity_number")
	private String	identificationNo;
	
	@Column(name="birth_year")
	private int	birthYear;
	
	public JobSeekers() {
		super();
	}
	
	public JobSeekers(int userId, String firstName, String lastName, String identification, int birthYear) {
		super(birthYear, identification, identification);
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationNo = identification;
		this.birthYear = birthYear;
	}
}
