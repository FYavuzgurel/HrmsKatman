package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployersService;
import kodlama.io.hrms.dataAccess.abstracts.EmployersDao;
import kodlama.io.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService{

	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}


	@Override
	public List<Employers> getEmployer() {
		return this.employersDao.findAll();
	}

}
