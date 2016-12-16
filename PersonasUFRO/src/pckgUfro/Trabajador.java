package pckgUfro;
public class Trabajador extends Persona{

	private String AFP;
	private String Isapre;

        public Trabajador(String nomb, String apel, int ru, int tel, String dir, String cum, String af, String is){
            super(nomb, apel, ru, tel, dir, cum);
            this.AFP = af;
            this.Isapre = is; 
        }
	public String getAFP() {
		// TODO - implement Trabajador.getAFP
		return AFP;
	}

	public void setAFP(String AFP) {
            this.AFP = AFP;
	}

	public String getIsapre() {
            return Isapre;
	}

	public void setIsapre(String Isapre) {
            this.Isapre = Isapre;
	}

}