package com.cg.capbook.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.capbook.beans.Status;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.daoservices.StatusDao;
import com.cg.capbook.daoservices.UserProfileDao;
import com.cg.capbook.exceptions.InvalidEmailException;

@Component("statusServices")
public class StatusServiceImpl implements StatusService {
	@Autowired
	private StatusDao statusDao;
	@Autowired
	private UserProfileDao userProfileDao;
	private Status status;
	
	@Override
	public Status saveStatus(Status status, UserProfile user) throws InvalidEmailException {
		System.out.println("\n\n"+user);
		user=userProfileDao.findById(user.getEmailId()).orElseThrow(()->new InvalidEmailException("EmailId is Invalid"));
		
		status.setUser(user);
		return statusDao.save(status);
	}

	@Override
	public List<Status> getAllStatus() {
		return statusDao.findAll();
	}
}
