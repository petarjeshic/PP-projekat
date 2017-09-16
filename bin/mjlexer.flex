package rs.ac.bg.etf.pp1;
import java_cup.runtime.Symbol;

%%

%{
	private Symbol	next_token(int type){
		return new Symbol(type,yyline+1,yycolumn);
	}
	private Symbol next_token(int type,Object value){
		return new Symbol(type,yyline+1,yycolumn,value);
	}

%}
%cup
%line
%column

%xstate COMMENT

%eofval{
	return next_token(sym.EOF);
%eofval}


%% 
  
" " {}
"\b" {}
"\t" {}
"\r\n" {}
"\f" {}

"program" { return next_token(sym.PROG,yytext());}
"print" { return next_token(sym.PRINT,yytext());}
"return" { return next_token(sym.RETURN,yytext());}
"void" { return next_token(sym.VOID,yytext());}
"+" { return next_token(sym.PLUS,yytext());}
"-" { return next_token(sym.MINUS,yytext());} 
"*" { return next_token(sym.MULI,yytext());}
"/" { return next_token(sym.DIVI,yytext());}
"%" { return next_token(sym.MODI,yytext());}
"&&" { return next_token(sym.AND,yytext());}
"||" { return next_token(sym.OR,yytext());} 
"=" { return next_token(sym.EQUAL,yytext());}
"+=" { return next_token(sym.PLUSEQ,yytext());} 
"-=" { return next_token(sym.MINUSEQ,yytext());}
"*=" { return next_token(sym.MULEQ,yytext());}
"/=" { return next_token(sym.DIVEQ,yytext());}
"%=" { return next_token(sym.MODEQ,yytext());}
"++" { return next_token(sym.PLUSPLUS,yytext());}
"--" { return next_token(sym.MINUSMINUS,yytext());} 
";" { return next_token(sym.SEMI,yytext());}
"," { return next_token(sym.COMMA,yytext());}
"(" { return next_token(sym.LPAREN,yytext());}
")" { return next_token(sym.RPAREN,yytext());}
"{" { return next_token(sym.LBRACE,yytext());}
"}" { return next_token(sym.RBRACE,yytext());}
"[" { return next_token(sym.LMEDBRACE,yytext());}
"]" { return next_token(sym.RMEDBRACE,yytext());}
"." { return next_token(sym.DOT,yytext());}
"<" { return next_token(sym.LOWER,yytext());}
">" { return next_token(sym.GREATER,yytext());}
">=" { return next_token(sym.GREATEQ,yytext());} 
"<=" { return next_token(sym.LOWEQ,yytext());}
"==" { return next_token(sym.EQEQ,yytext());}
"!=" { return next_token(sym.NOTEQ,yytext());} 
"break" {return next_token(sym.BREAK,yytext());}
"class" {return next_token(sym.CLASS,yytext());}
"else" {return next_token(sym.ELSE,yytext());}
"const" {return next_token(sym.CONST,yytext());}
"if" {return next_token(sym.IF,yytext());}
"new" {return next_token(sym.NEW,yytext());}
"read" {return next_token(sym.READ,yytext());}
"for" {return next_token(sym.FOR,yytext());}
"extends" {return next_token(sym.EXTENDS,yytext());}
"continue" {return next_token(sym.CONTINUE,yytext());}
"static" {return next_token(sym.STATIC,yytext());}
"$" {return next_token(sym.DOLAR,yytext());}
"#" {return next_token(sym.TARABA,yytext());}
":" {return next_token(sym.DVOTACKA,yytext());}


"//" {yybegin(COMMENT);}
<COMMENT> . {yybegin(COMMENT);}
<COMMENT> "\r\n" {yybegin(YYINITIAL);}

"true"|"false" { return next_token(sym.BOOL, new Boolean (yytext().equals("true") ? true : false)); }
([a-z]|[A-Z])[a-z|A-Z|0-9|_]* {return next_token(sym.IDENT,yytext());}
[0-9]+ {return next_token(sym.NUMBER,new Integer(yytext()));}
"'"."'" {return next_token(sym.CHAR, new Character (yytext().charAt(1)));}

. {System.err.println("Leksicka greska ("+yytext()+") u liniji: "+(yyline+1));}
