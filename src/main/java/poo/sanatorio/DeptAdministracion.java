package poo.sanatorio;

public interface DeptAdministracion {
	String obtenerCobertura(Paciente paciente);

	double obtenerDescuento(Paciente paciente);

	String obtenerVademecum(Paciente paciente);
}
