package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.AdminService;
import kodlama.io.hrms.business.abstracts.EmployersService;
import kodlama.io.hrms.business.abstracts.JobSeekersService;
import kodlama.io.hrms.business.abstracts.UsersService;
import kodlama.io.hrms.entities.concretes.Admin;
import kodlama.io.hrms.entities.concretes.Employers;
import kodlama.io.hrms.entities.concretes.JobSeekers;
import kodlama.io.hrms.entities.concretes.Users;

@RestController
@RequestMapping("/api/users")
public class UsersControllers {

	private UsersService usersService;
	private AdminService adminService;
	private EmployersService employersService;
	private JobSeekersService jobSeekersService;
	
	@Autowired
	public UsersControllers(JobSeekersService jobSeekersService) {
		super();
		this.jobSeekersService = jobSeekersService;
	}

	@Autowired
	public UsersControllers(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}

	@Autowired
	public UsersControllers(AdminService adminService) {
		super();
		this.adminService = adminService;
	}

	@Autowired
	public UsersControllers(UsersService usersService) {
		super();
		this.usersService = usersService;
	}

	@GetMapping("/getall")	
	public List<Users> getAll(){
		return this.usersService.getAll();
	}
	
	@GetMapping("/getadmin")	
	public List<Admin> getAdmin(){
		return this.adminService.getAdmin();
	}
	
	@GetMapping("/getemployers")	// Tüm kullanıcı verileri dışa aktarılacak
	public List<Employers> getEmployers(){
		return this.employersService.getEmployer();
	}
	
	@GetMapping("/getjobseeker")	// Tüm kullanıcı verileri dışa aktarılacak
	public List<JobSeekers> getJobSeekers(){
		return this.jobSeekersService.getJobSeekers();
	}
	
}
