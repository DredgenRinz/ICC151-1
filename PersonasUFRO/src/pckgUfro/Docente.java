package pckgUfro;
public class Docente extends Trabajador{

	private String nombreDep;
	private String Acronim;
	private String Especialidad;
	private String TituloProf;
	private String especializacion;
	private boolean IsDirector;

    public Docente(String nomb, String apel, int ru, int tel, String dir, String cum, String af, String is, String dep,String acro, String esp, String titulo, String espec, boolean direc) {
        super(nomb, apel, ru, tel, dir, cum, af, is);
        this.nombreDep = dep;
        this.Acronim = acro;
        this.Especialidad = esp;
        this.TituloProf = titulo;
        this.especializacion = espec;
        this.IsDirector = direc;
    }

	public String getNombreDep() {
		return nombreDep;
	}

	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}

	public String getAcronim() {
		return Acronim;
	}

	public void setAcronim(String acro) {
		this.Acronim = acro;
	}

	public String getEspecialidad() {
                return Especialidad;
	}

	public void setEspecialidad(String esp) {
                this.Especialidad = esp;
	}

	public String getTituloProf() {
		return TituloProf;
	}

	public void setTituloProf(String titulo) {
		this.TituloProf = titulo;
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public boolean getIsDirector() {
		return IsDirector;
	}

	public void setIsDirector(boolean direc) {
		this.IsDirector = direc;
	}

}