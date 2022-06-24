package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobSeekersService;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekersDao;
import kodlama.io.hrms.entities.concretes.JobSeekers;

@Service
public class JobSeekersManager implements JobSeekersService{

	private JobSeekersDao jobSeekersDao;
	
	@Autowired
	public JobSeekersManager(JobSeekersDao jobSeekersDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
	}


	@Override
	public List<JobSeekers> getJobSeekers() {
		return this.jobSeekersDao.findAll();
	}

}
