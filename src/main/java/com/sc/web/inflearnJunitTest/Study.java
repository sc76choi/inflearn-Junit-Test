package com.sc.web.inflearnJunitTest;

public class Study {
	
	private StudyStatus status = StudyStatus.DRAFT;
	private int limit = -1;
	
	public Study(int limit) {
		if(limit < 0) {
			throw new IllegalArgumentException("limit는 0 보다 커야 한다.");
		}
		this.limit = limit;
	}
	
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public Object getStatus() {
		return this.status;
	}
	
	
	
	 

}
