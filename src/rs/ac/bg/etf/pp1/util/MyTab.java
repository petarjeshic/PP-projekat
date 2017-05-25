package rs.ac.bg.etf.pp1.util;

import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.ac.bg.etf.pp1.util.MyStruct;

public class MyTab extends Tab {
		
	public static final MyStruct boolType = new MyStruct(MyStruct.Bool);
	public static final MyStruct referenceType=new MyStruct(MyStruct.Class);
	 public static void init() {
	                Tab.init();
	                Tab.currentScope().addToLocals(new Obj(Obj.Type, "bool", boolType));
	                Tab.currentScope().addToLocals(new Obj(Obj.Type, "reference",referenceType));
	 }
}
