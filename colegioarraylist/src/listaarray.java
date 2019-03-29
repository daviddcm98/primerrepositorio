import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author David
 * @version 0.9
 *
 */
public class listaarray {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int clase, ganado, clas, elegir;
		String name, apel1, apel2;
		System.out.println("Bienvenido");
		System.out.println("Introduzca el numero de clases");
		clase = e.nextInt();
		System.out.println("Introduzca el numero de alumnos por clase");
		ganado=e.nextInt();
		ArrayList<alumno>colegioxd= new ArrayList<alumno>();
		for(int i=0; i<(clase*ganado); i++) {
			System.out.println("Introduzca la clase del alumno");
			clas = e.nextInt();
			e.nextLine();
			System.out.println("Introduzca el nombre del alumno");
			name = e.nextLine();
			System.out.println("Introduzca el primer apellido del alumno");
			apel1 = e.nextLine();
			System.out.println("Introduzca el segundo apellido del alumno");
			apel2 = e.nextLine();
			colegioxd.add(new alumno(name, apel1, apel2, clas));
			
		}
		System.out.println("Seleccione que desea hacer");
		System.out.println("1 - Mostrar alumnos de una clase");
		System.out.println("2 - Elija un alumno y muestra su clase");
		System.out.println("3 - Muestra cuantos alumnos tienen el mismo apellido");
		System.out.println("4 - Numero total de alumnos");
		System.out.println("5 - Orden alfabetico");
		System.out.println("Proceda a introducir la eleccion");
		elegir= e.nextInt();
		switch (elegir) {
		case 1:
			e.nextLine();
			int clasico;
			System.out.println("Introduzca la clase de la que desea ver los alumnos");
			clasico=e.nextInt();
			for(int i=0; i<colegioxd.size(); i++) {
				
				if(colegioxd.get(i).getClase() == clasico) {
				System.out.print(colegioxd.get(i).getNombre()+ " ");
				System.out.print(colegioxd.get(i).getApellido1()+ " ");
				System.out.println(colegioxd.get(i).getApellido2());
				
				System.out.println(" ");
				}
			}
			break;
		case 2:
			e.nextLine();
			System.out.println("Introduzca el nombre del alumno del que desea ver la clase");
			name=e.nextLine();
			for(int i=0; i<colegioxd.size(); i++) {
				if(colegioxd.get(i).getNombre().equals(name)) {
					System.out.println("Este alumno pertenece a la clase: "+colegioxd.get(i).getClase());
				}
			}
			break;
		case 3:
			int cuentador=0;
			e.nextLine();
			System.out.println("Introduzca el primer");
			apel1=e.nextLine();
			for(int i=0; i<colegioxd.size(); i++) {
				if(colegioxd.get(i).getApellido1().equals(apel1)) {
					cuentador++;
				}
			}
			System.out.println("El numero de alumnos con ese apellido es : " +cuentador);
			break;
		case 4:
			int total=clase*ganado;
			System.out.println("El numero de alumnos del centro es: " +colegioxd.size());
			break;
		case 5:
			String [] almacenar = new String [colegioxd.size()];
			for(int i=0; i<colegioxd.size(); i++) {
				almacenar[i]=colegioxd.get(i).getApellido1()+ ""  +colegioxd.get(i).getApellido2()+ " "+colegioxd.get(i).getNombre();
			}
			Arrays.sort(almacenar);
			for (String  b : almacenar ) {
				System.out.print(b + ", ");
			}
			break;
		default:
			break;
			}

	}
}
