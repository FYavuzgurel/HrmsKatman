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
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
//@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Employers extends Users {
	
	//@Id
	@GeneratedValue
	@Column(name="user_id")
	private int	userId;
	
	@Column(name="company_name")
	private String 	companyName;
	
	@Column(name="web_address")
	private String	webSite;
	
	@Column(name="phone_number")
	private String	phoneNumber;
	
	public Employers() {
		super();
	}
	
	public Employers(int userId, String companyName, String webSite, String phoneNumber) {
		super(userId, phoneNumber, phoneNumber);
		this.userId = userId;
		this.companyName = companyName;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
	}
}


