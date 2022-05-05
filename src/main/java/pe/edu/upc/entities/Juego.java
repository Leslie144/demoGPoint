package pe.edu.upc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Juego {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idJuego;
}
