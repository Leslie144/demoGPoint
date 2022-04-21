package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Review;

public interface IReviewService {
	public void insert(Review r);

	public List<Review> list();

	public void delete(int id);

	public void update(Review id);
}
