package ast.sentencia;

import java.util.List;

import ast.AbstractNodeAST;
import ast.expresion.Expresion;
import visitor.Visitor;

public class Escritura extends AbstractNodeAST implements Sentencia {

	List<Expresion> expresiones;
	
	public Escritura(int linea, int columna, List<Expresion> expresiones) {
		super(linea, columna);
		this.expresiones = expresiones;
	}
	
	public List<Expresion> getExpresiones() {
		return expresiones;
	}

	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
	
}
