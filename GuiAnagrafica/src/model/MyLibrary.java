package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class MyLibrary {
	
	public static ArrayList<Persona> leggi(String file){
		
		ArrayList<Persona> elenco = new ArrayList<Persona>();
		
		//lettura da file
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			if(obj instanceof ArrayList){
				elenco = (ArrayList) obj;
			}
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally {
			if(fis!=null){
				fis=null;
			}if(ois!=null){
				ois=null;
			}
		}
		return elenco;	
	}
	
	public static void scrivi(String file, ArrayList<Persona> elenco){
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try{
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(elenco);
			oos.flush();
			oos.close();
			fos.close();
				
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static void append(String file, Persona persona){
		
		ArrayList<Persona> elenco = leggi(file);
		elenco.add(persona);
		scrivi(file,elenco);
	}
	
	public static int cerca(String file, ArrayList<Persona> elenco, Persona persona){
		
		
		for(int i =0;i<elenco.size();i++)
                {
                    if(persona.equals(elenco.get(i)))
                        return i;
                }

		return -1;
	}
	public static boolean elimina(String file, ArrayList<Persona> elenco, Persona persona){
		
		if(elenco.remove(persona)){
			scrivi(file,elenco);
			return true;
		}
		return false;
	}

}
