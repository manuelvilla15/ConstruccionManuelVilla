package tdea.construccion2.app.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.Models.Session;
import tdea.construccion2.app.dto.SessionDto;
import tdea.construccion2.app.dto.UserDto;
import tdea.construccion2.app.repository.SessionRepository;

@Service
public class LoginDaoImpl implements LoginDao{
	@Autowired
	private SessionRepository sessionRepository;
	
	@Override
	public SessionDto login(UserDto userDto) throws Exception {
		Session session = new Session();
		session.setUser(userDto.getUser());
		session.setRole(userDto.getRole());
		sessionRepository.save(session);
		return new SessionDto(session); 
	}

	@Override
	public SessionDto findSessionById(long sessionId) throws Exception {
		Session session = sessionRepository.findSessionById(sessionId);
		if (session == null) {
			return null;
		}
		return new SessionDto(session);
			
	}

	@Override
	public void logout(long sessionId) throws Exception {
		Session session = sessionRepository.findSessionById(sessionId);
		if (session != null) {
			sessionRepository.delete(session);
		}
	
	}

	public SessionRepository getSessionRepository() {
		return sessionRepository;
	}

	public void setSessionRepository(SessionRepository sessionRepository) {
		this.sessionRepository = sessionRepository;
	}

}
