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

	public ArrayList<String> getAllVariables(VariableScope current) {

		if (current.getParent() == null) {
			for (int i = 0; i < vars.size(); i++) {
				list.add(current.vars.get(i));
			}
			return list;
		} else {
			for (int i = 0; i < vars.size(); i++) {
				list.add(current.vars.get(i));
			}
			/* Recursive call function for all parent variables of this scope! */
			getAllVariables(current.getParent());

		}

		return list;

	}

}
