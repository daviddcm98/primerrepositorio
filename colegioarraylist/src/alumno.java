
/**
 * 
 * @author David
 * @version 0.9
 * 
 */

public class alumno {
	String nombre;
	String apellido1;
	String apellido2;
	int clase;
	
	
/**
 * Getter
 * @return nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * Setter
 * @param name
 */
public void setNombre(String name) {
	this.nombre=name;
	
}
/**
 * Getter
 * @return apellido1
 */
public String getApellido1() {
	return apellido1;
}
/**
 * Getter
 * @return clase
 */
public int getClase() {
	return clase;
}
/**
 * Setter
 * @param definida
 */
public void setClase(int definida) {
	this.clase = definida;
}
/**
 * Setter
 * @param surname1
 */
public void setApellido1(String surname1) {
	this.apellido1 = surname1;
}
/**
 * Getter
 * @return apellido2
 */
public String getApellido2() {
	return apellido2;
}
/**
 * Setter
 * @param surname2
 */
public void setApellido2(String surname2) {
	this.apellido2 = surname2;
}
/**
 * 
 * Constructor
 * @param name
 * @param apel1
 * @param apel2
 * @param clas
 */
public alumno(String name, String apel1, String apel2, int clas) {
	this.nombre=name;
	this.apellido1=apel1;
	this.apellido2=apel2;
	this.clase=clas;
}
}