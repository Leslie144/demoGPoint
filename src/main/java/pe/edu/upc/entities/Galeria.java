package pe.edu.upc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Galeria")
public class Galeria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

}
