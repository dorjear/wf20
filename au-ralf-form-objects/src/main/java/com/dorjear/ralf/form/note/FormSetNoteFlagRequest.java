package com.dorjear.ralf.form.note;

public class FormSetNoteFlagRequest extends FormNoteIdRequestBase{

	private boolean importantFlag;

	public boolean getImportantFlag() {
		return importantFlag;
	}

	public void setImportantFlag(boolean importantFlag) {
		this.importantFlag = importantFlag;
	}
	
	
}
