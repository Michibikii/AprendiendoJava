package poo.sanatorio;

public interface DeptClinica {
	String recetarRxAdulto(Adulto adulto);

	String recetarSangreAdulto(Adulto adulto);

	String recetarRxInternado(Internado internado);

	String recetarSangreInternado(Internado internado);
}
