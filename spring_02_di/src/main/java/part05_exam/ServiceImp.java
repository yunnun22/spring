package part05_exam;

public class ServiceImp implements Service {

	private MemDaoImp memDao;

	public ServiceImp() {

	}

	public void setMemDao(MemDaoImp memDao) {
		this.memDao = memDao;
	}

	@Override
	public void prn() {
		memDao.selectMethod();

	}

}
