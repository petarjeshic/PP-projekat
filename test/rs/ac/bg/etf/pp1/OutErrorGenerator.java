package rs.ac.bg.etf.pp1;


import java.io.IOException;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

import java_cup.runtime.Symbol;
import rs.ac.bg.etf.pp1.util.MyTab;
import rs.etf.pp1.mj.runtime.Code;

import java.util.Scanner;

import org.apache.log4j.Logger;
public class OutErrorGenerator {

	public static void main(String[] args) {
		Reader br = null;
		String prog="";
		File izlazFile=null;
		FileReader fr=null;
		FileWriter fw=null;
		try {
			MJParserTest.main(new String[0]);
			Scanner in = new Scanner(System.in);
			System.out.println("Naziv fajla u koji se ispisuje obrada (bez ekstenzije)?");
			prog = in.next();
			File ulaz=new File("logs/mj-test.log");	
			if(args.length==0){
				izlazFile=new File("test/"+prog+".out");
			}
			else if (args[0].equals("2")){
				izlazFile=new File("test/"+prog+".err");
				}
			else{
				System.out.println("Pogresni parametri main funkciji u ovom generatoru!");
				return;
				}
			fr=new FileReader(ulaz);
            fw=new FileWriter(izlazFile);
            int c=fr.read();
            while(c!=-1){
                fw.write(c);
                c = fr.read();
            	}
			System.out.println("Fajl: "+izlazFile.getAbsolutePath()+" je uspesno generisan!");
			}
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        finally {   
	            try {
					if(fr!=null)fr.close();
		            if(fw!=null)fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
	}

}
