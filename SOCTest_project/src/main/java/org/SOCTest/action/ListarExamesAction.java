package org.SOCTest.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.SOCTest.model.Exame;
import org.SOCTest.dao.Database;

import com.opensymphony.xwork2.ActionSupport;

public class ListarExamesAction extends ActionSupport{
	Database db = new Database();
	private List<Exame> exameList = null;
	Exame exame = null;
	ResultSet result = null;
	boolean noData = false;
	Exame teste = null;
	
	public String execute() throws Exception{
		try {
			exameList = new ArrayList<Exame>();
			result = db.returnAllExames();
			int i = 0;
			
			if(result != null) {
				while(result.next()) {
					i++;
					exame = new Exame();
					exame.setId(result.getInt("id"));
					exame.setPaciente(result.getString("paciente"));
					exame.setDoutor(result.getString("doutor"));
					exame.setTipo(result.getString("tipo"));
					exameList.add(exame);
				}
			}
			if(i == 0) {
				noData = false;
			}
			else {
				noData = true;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return "REPORT";
	}
	
	
	public boolean isNoData() {
		return noData;
	}
	
	public void setNoData(boolean noData) {
		this.noData = noData;
	}
	
	public List<Exame> getExameList(){
		return exameList;
	}
	
	public void setExameList(ArrayList<Exame> exameList) {
		this.exameList = exameList;
	}
	
}
