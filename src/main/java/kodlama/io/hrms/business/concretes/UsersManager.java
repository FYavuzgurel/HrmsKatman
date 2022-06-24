package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.UsersService;
import kodlama.io.hrms.dataAccess.abstracts.UsersDao;
import kodlama.io.hrms.entities.concretes.Users;

@Service
public class UsersManager implements UsersService{

	private UsersDao usersDao;
	
	@Autowired
	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}

	@Override
	public List<Users> getAll() {
		return this.usersDao.findAll();
	}

}
