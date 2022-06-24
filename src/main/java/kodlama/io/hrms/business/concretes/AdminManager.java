package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.AdminService;
import kodlama.io.hrms.dataAccess.abstracts.AdminDao;
import kodlama.io.hrms.entities.concretes.Admin;

@Service
public class AdminManager implements AdminService{

	private AdminDao adminDao;
	
	@Autowired
	public AdminManager(AdminDao adminDao) {
		super();
		this.adminDao = adminDao;
	}

	@Override
	public List<Admin> getAdmin() {	
		return this.adminDao.findAll();
	}

}
