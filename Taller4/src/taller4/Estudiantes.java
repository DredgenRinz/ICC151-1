/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

/**
 *
 * @author Okumura Rinzler
 */
public class Estudiantes {
    
    private String matricula;
    private String rut;
    private String nombre;
    private String apellido;
    private String mail;
    
    Estudiantes(){}
    
    Estudiantes (String mat, String Nom, String ape, String ma){
        this.matricula = mat;
        this.rut = mat;
        this.nombre = Nom;
        this.apellido = ape;
        this.mail = ma;
    }
    
    public void setName(String nom){
        this.nombre = nom;
    }
    
    public String getName(){
        return this.nombre;
    }
    public void setMat(String nom){
        this.matricula = nom;
    }
    
    public String getMat(){
        return this.matricula;
    }
    public void setRut(String nom){

            this.rut = nom.substring(0, 9);

    }
    
    public String getRut(){
        return this.rut;
    }
    public void setName2(String nom){
        this.apellido = nom;
    }
    
    public String getName2(){
        return this.apellido;
    }
    public void setMail(String nom){
        this.mail = nom;
    }
    
    public String getMail(){
        return this.mail;
    } 
    
public static boolean validarRut(String rut) {
 
boolean validacion = false;
try {
rut =  rut.toUpperCase();
rut = rut.replace(".", "");
rut = rut.replace("-", "");
int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
 
char dv = rut.charAt(rut.length() - 1);
 
int m = 0, s = 1;
for (; rutAux != 0; rutAux /= 10) {
s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
}
if (dv == (char) (s != 0 ? s + 47 : 75)) {
validacion = true;
}
 
} catch (java.lang.NumberFormatException e) {
} catch (Exception e) {
}
return validacion;
}
}
