package kodlama.io.hrms.business.abstracts;

import java.util.List;
import kodlama.io.hrms.entities.concretes.JobSeekers;

public interface JobSeekersService {
	List<JobSeekers> getJobSeekers();
}
