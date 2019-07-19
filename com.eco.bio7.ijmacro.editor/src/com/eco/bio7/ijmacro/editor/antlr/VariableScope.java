package com.eco.bio7.ijmacro.editor.antlr;

import java.util.ArrayList;

public class VariableScope {

	private VariableScope parent;
	public ArrayList<String> vars = new ArrayList<String>();
	public ArrayList<String> list = new ArrayList<String>();

	public VariableScope(VariableScope parent) {
		this.parent = parent;
	}

	public VariableScope getParent() {
		return parent;
	}
    /*Here we collect all variables in the current function scope and of the global scope (ImageJ macro specific!)
     *Nested scopes (or parent functions) are not considered in the macro language!*/
	public ArrayList<String> getAllVariables(VariableScope current) {

		for (int i = 0; i < current.vars.size(); i++) {

			list.add(current.vars.get(i));

		}
		/*Add the global variables, too!*/
		getGlobaleVariables(current);

		return list;

	}

	private void getGlobaleVariables(VariableScope current) {
		if (current.getParent() == null) {
			for (int i = 0; i < current.vars.size(); i++) {
				list.add(current.vars.get(i));

			}

		} else {
			getGlobaleVariables(current.getParent());

		}

	}

	/*public ArrayList<String> getAllVariables(VariableScope current) {
	
		if (current.getParent() == null) {
			for (int i = 0; i < current.vars.size(); i++) {
				list.add(current.vars.get(i));
	
			}
			return list;
		} else {
			for (int i = 0; i < current.vars.size(); i++) {
	
				list.add(current.vars.get(i));
	
			}
			 Recursive call function for all parent variables of this scope! 
			getAllVariables(current.getParent());
	
		}
	
		return list;
	
	}*/

}
