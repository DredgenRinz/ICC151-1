package pckgUfro;
public class Alumno extends Persona{

	private String carrera;
	private int codigo;
	private String descripcion;
	private int añoIngreso;
	private int Matricula;

    public Alumno(String nomb, String apel, int ru, int tel, String dir, String cum, String car, int cod,String des, int año) {
        super(nomb, apel, ru, tel, dir, cum);
        this.carrera = car;
        this.codigo = cod;
        this.descripcion = des;
        this.añoIngreso = año;
        this.Matricula = generarMatricula(ru,año);
    }
    
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String car) {
		this.carrera = car;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String desc) {
		this.descripcion = desc;
	}

	public int getAñoIngreso() {
		return añoIngreso;
	}

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}

	public int getMatricula() {
		return Matricula;
	}

	private int generarMatricula(int rut, int año) {
            String mat = "";
            mat = Integer.toString(rut) + Integer.toString(año);
            int matricula = Integer.parseInt(mat);
            return matricula;    
	}
}