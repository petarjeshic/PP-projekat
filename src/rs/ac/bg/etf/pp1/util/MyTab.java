package rs.ac.bg.etf.pp1.util;

import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.*;

public class MyTab extends Tab {
		
	public static final Struct boolType = new Struct(Struct.Bool);
	 public static void init() {
	                Tab.init();
	                Tab.currentScope().addToLocals(new Obj(Obj.Type, "bool", boolType));
	 }
}
