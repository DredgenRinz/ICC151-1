package TestPersonasUFRO;
import java.io.*;
import pckgUfro.Alumno;

public class Archivo{
    
Alumno cab;
File f =new File("notas.bin");

void cargar()throws Exception {
    if(f.exists()) {
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        cab=(Alumno)ois.readObject(); //cargamos el archivo al objeto alumno
        fis.close();
        ois.close();
    }
    else{
        f.createNewFile();
    }
}

void guardar()throws Exception{
    FileOutputStream fos=new FileOutputStream(f);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(cab); //guardamos el objeto en el archivo
    //se guarda los cambios realizados en la lista
    fos.close();
    oos.close();
    }
}
