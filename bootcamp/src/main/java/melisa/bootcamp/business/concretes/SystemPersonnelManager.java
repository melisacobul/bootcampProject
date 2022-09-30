package melisa.bootcamp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import melisa.bootcamp.business.abstracts.SystemPersonnelService;
import melisa.bootcamp.core.utilities.DataResult;
import melisa.bootcamp.core.utilities.SuccessDataResult;
import melisa.bootcamp.core.utilities.SuccessResult;
import melisa.bootcamp.dataAccess.SystemPersonnelDao;
import melisa.bootcamp.entities.SystemPersonnel;

@Service
public class SystemPersonnelManager implements SystemPersonnelService{
	private SystemPersonnelDao systemPersonnelDao;
	
	@Autowired
	public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
		super();
		this.systemPersonnelDao = systemPersonnelDao;
	}

	@Override
	public DataResult<List<SystemPersonnel>> getAll() {
		return new SuccessDataResult<List<SystemPersonnel>>(this.systemPersonnelDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(SystemPersonnel systemPersonnel) {
		this.systemPersonnelDao.save(systemPersonnel);
		return new SuccessResult("Personel Eklendi");
	}

	@Override
	public Result delete(SystemPersonnel systemPersonnel) {
		this.systemPersonnelDao.delete(systemPersonnel);
		return new SuccessResult("Personel Silindi");
	}

}