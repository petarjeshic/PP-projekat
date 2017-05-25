package rs.ac.bg.etf.pp1.util;

import rs.etf.pp1.symboltable.concepts.Struct;
import rs.etf.pp1.symboltable.structure.SymbolDataStructure;

public class MyStruct extends Struct {

	public MyStruct(int kind) {
		super(kind);
	}
	public MyStruct(int kind, Struct elemType) {
		super(kind,elemType);
	}

	public MyStruct(int kind, SymbolDataStructure members) {
		super(kind,members);
	}
	public String typeName(int kind) {
		String result=""; // None, Int, Char, Array, Class, Bool
		switch(kind){
		case 0: result="None"; break;
		case 1: result="Int"; break;
		case 2: result="Char"; break;
		case 3: result="Array"; break;
		case 4: result="Class"; break;
		case 5: result="Bool"; break;
		default: break;
		}
		return result;
	}
}
