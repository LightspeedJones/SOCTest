package org.SOCTest.action;

import org.SOCTest.dao.Database;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteExameAction extends ActionSupport{
	int id;
	String msg = "";
	Database db = new Database();
	
	public String execute() throws Exception{
		try {
			int affected = db.delete(id);
			if(affected > 0) {
				msg = "foi";
			}
			else {
				msg = "nao";
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return "DELETE";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
