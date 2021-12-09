package personajes;

import java.util.ArrayList;
import artefactos.Objeto;
import complementario.Clases;
import complementario.Habilidad;
import personajes.Totem;

public class Peleador {

	
	private final Clases clase;
	private int fragmentos = 0;
	private int vida;
	private final String nombre;
	private int ataqueFisico;
	private int ataqueMagico;
	private int defensaFisica;
	private int defensaMagica;
	private Objeto arma;
	private Objeto armadura;
	private Objeto anillo; 
 	private ArrayList<Objeto> inventario = new ArrayList<Objeto>();
	private int oro;
	private Totem totem;
	private ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>(5);
	
}	