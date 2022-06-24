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
@Table(name="admin")
@EqualsAndHashCode(callSuper = false)
//@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Admin extends Users{
	
	//@Id
	@GeneratedValue
	@Column(name="user_id")
	private int	userId;
	
	@Column(name="first_name")
	private String 	firstName;
	
	@Column(name="last_name")
	private String	lastName;
	
	public Admin() {
		super();
	}
	
	public Admin(int userId, String firstName, String lastName) {
		super(userId, lastName, lastName);
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}


}
