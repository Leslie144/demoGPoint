package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IReviewDao;
import pe.edu.upc.entities.Review;
import pe.edu.upc.service.IReviewService;

@Named
public class ReviewServiceImpl implements IReviewService {
	@Inject
	private IReviewDao rDao;

	@Override
	public void insert(Review r) {
		rDao.insert(r);
	}

	@Override
	public List<Review> list() {
		// TODO Auto-generated method stub
		return rDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rDao.delete(id);
	}

	@Override
	public void update(Review id) {
		// TODO Auto-generated method stub

	}
}
