package model;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class MyLibrary {
	
	public static ArrayList<Auto> leggi(String file){
		
		ArrayList<Auto> elenco = new ArrayList<Auto>();
		
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
	
	public static void scrivi(String file, ArrayList<Auto> elenco){
		
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
	
	public static void append(String file, Auto auto){
		
		ArrayList<Auto> elenco = leggi(file);
		elenco.add(auto);
		scrivi(file,elenco);
	}
	
	public static int cerca(String file, ArrayList<Auto> elenco, Auto auto){
		
		
		for(int i =0;i<elenco.size();i++)
                {
                    if(auto.equals(elenco.get(i)))
                        return i;
                }

		return -1;
	}
	public static boolean elimina(String file, ArrayList<Auto> elenco, Auto auto){
		
		if(elenco.remove(auto)){
			scrivi(file,elenco);
			return true;
		}
		return false;
	}
        public static void scrivitxt(String file, Auto auto){
                
		String testo =auto.toString() ;
		
		//accesso alla risorsa
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(testo);
			bw.flush();
			bw.close();
			fw.close();
			
			System.out.println("Dati salvati con successo!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

        }

}
