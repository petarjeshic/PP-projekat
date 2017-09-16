package rs.ac.bg.etf.pp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java_cup.runtime.Symbol;
import rs.ac.bg.etf.pp1.util.Log4JUtils;
import rs.ac.bg.etf.pp1.util.MyTab;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;

public class MJParserTest {
	static {
		DOMConfigurator.configure(Log4JUtils.instance().findLoggerConfigFile());
		Log4JUtils.instance().prepareLogFile(Logger.getRootLogger());
	}
	public static void main(String[] args) throws Exception{
		Logger log=Logger.getLogger(MJParserTest.class);
		Reader br=null;
		try {
			File sourceCode=new File("test/program.mj");
			log.info("Kompilacija izvornog fajla"+ sourceCode.getAbsolutePath());
			br=new BufferedReader(new FileReader(sourceCode));
			Yylex lexer=new Yylex(br);
			MJParser p=new MJParser(lexer);
			Symbol s=p.parse();
			if(!p.errorDetected){
				File objFile=new File("test/program.obj");
				if(objFile.exists()) objFile.delete();
				Code.write(new FileOutputStream(objFile));
				MyTab.dump();
				log.info("Parsiranje uspesno zavrseno!");

			}
			else
				log.error("Parsiranje NIJE uspesno zavrseno. Postoje greske u kodu!");
		}
		finally{
			if(br!=null) try{br.close();} catch(IOException e1){log.error(e1.getMessage(),e1);}
		}
	}
}
