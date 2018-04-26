package ej6;

public class Auto {
private String modelo = "";
private String patente = "";
public Auto(String model, String pat) {
	this.modelo = model;
	this.patente = pat;
}

public String toString() {
	return patente;
}

}
