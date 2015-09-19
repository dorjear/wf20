package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.FormHomeLoanBoardData;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormManagerHomeLoanDashboardResponse extends FormResponseBase {
	FormHomeLoanBoardData[] boardData;

	public FormHomeLoanBoardData[] getBoardData() {
		return boardData;
	}

	public void setBoardData(FormHomeLoanBoardData[] boardData) {
		this.boardData = boardData;
	}

}
