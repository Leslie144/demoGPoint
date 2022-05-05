package pe.edu.upc.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Review")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idReview;
	
	@Column(name = "publicationDate", nullable = false)
	private Date publicationDate;

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(int idReview, Date publicationDate) {
		super();
		this.idReview = idReview;
		this.publicationDate = publicationDate;
	}

	public int getIdReview() {
		return idReview;
	}

	public void setIdReview(int idReview) {
		this.idReview = idReview;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idReview);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		return idReview == other.idReview;
	}
	
	
}
