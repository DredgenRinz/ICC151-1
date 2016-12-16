package pckgUfro;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.*;

public class Persona implements Serializable{

	private String nombre;
	private int rut;
	private int telefono;
	private String direccion;
	private String apellido;
	private String cumpleaños;

        Persona(String nomb, String apel, int ru, int tel, String dir, String cum){
            this.nombre = nomb;
            this.apellido = apel;
            this.rut = ru;
            this.telefono = tel;
            this.direccion = dir;
            this.cumpleaños = cum;
        }
        
        public String getNombre(){
            return nombre;
        }
        
        public void setNombre(String nomb){
            this.nombre = nomb;
        }
        
        public int getRut(){
            return rut;
        }
        
        public void setRut(int rut){
            this.rut = rut;
        }  
        
        public int getTelefono(){
            return telefono;
        }
        
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }        
        
        public String getDireccion(){
            return direccion;
        }
        
        public void setDireccion(String direc){
            this.direccion = direc;
        }        
        
        public String getApellido(){
            return apellido;
        }
        
        public void setApellido(String apel){
            this.apellido = apel;
        }

        public String getCumpleaños(){
            return cumpleaños;
        }
        
        public void setCumpleaños(String cum){
            this.cumpleaños = cum;
        }        
	public void edad() {
		
	}

	public void mostrarDatos() {
		// TODO - implement Persona.mostrarDatos
		throw new UnsupportedOperationException();
	}
        
        public Integer calcularEdad(String cumpleaños){
            Date fechaNac=null;
            try {
                fechaNac = new SimpleDateFormat("dd-MM-yyyy").parse(cumpleaños);
            } catch (Exception ex) {
                System.out.println("Error:"+ex);
            }
            Calendar fechaNacimiento = Calendar.getInstance();
        //Se crea un objeto con la fecha actual
            Calendar fechaActual = Calendar.getInstance();
        //Se asigna la fecha recibida a la fecha de nacimiento.
            fechaNacimiento.setTime(fechaNac);
        //Se restan la fecha actual y la fecha de nacimiento
            int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
            int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
            int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);

            if(mes<0 || (mes==0 && dia<0)){
                año--;
            }
            return año;
        }
}

