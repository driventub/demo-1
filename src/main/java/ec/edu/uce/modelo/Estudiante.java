package ec.edu.uce.modelo;

import org.springframework.stereotype.Service;

@Service
public class Estudiante {	
private String nombre, apellido, universidad;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getUniversidad() {
	return universidad;
}

public void setUniversidad(String universidad) {
	this.universidad = universidad;
}

@Override
public String toString() {
	return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", universidad=" + universidad + "]";
}






}
