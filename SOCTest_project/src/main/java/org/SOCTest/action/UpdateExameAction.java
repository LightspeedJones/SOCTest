package org.SOCTest.action;

import java.sql.ResultSet;

import org.SOCTest.dao.Database;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateExameAction {
	private String paciente = "";
	private String doutor = "";
	private String tipo = "";
	private String data = "";
	private int id = 0;
	
	private String msg = "";
	    
	ResultSet result = null;
	Database db = new Database();
	String submitType;
	int affected = 0;
    
    public String execute() throws Exception{
    	try {
			if (submitType.equals("updatedata")) {
				result = db.returnExameDetails(id);
				if (result != null) {
					while (result.next()) {
						paciente = result.getString("paciente");
						doutor = result.getString("doutor");
						tipo = result.getString("tipo");
						data = result.getDate("dataExame").toString();
					}
				}
			} else {
				affected = db.updateExame(paciente, doutor, tipo, id, data);
				if (affected > 0) {
					msg = "Dados atualizados com sucesso!";
				} else {
					msg = "error";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UPDATE";
		
	}
    
    public String getPaciente() {
		return paciente;
    }
	
	public void setPaciente(String paciente) {
		this.paciente = paciente;
    }
	
	public String getDoutor() {
		return doutor;
    }
	
	public void setDoutor(String doutor) {
		this.doutor = doutor;
    }
	
	public String getTipo() {
		return tipo;
    }
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	public String getSubmitType() {
		return submitType;
	}

	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}
	
	public String getData() {
    	return data;
    }
    
    public void setData(String data) {
    	this.data = data;
    }
    
    public int getAffected() {
    	return affected;
    }
    
    public void setAffected(int affected) {
    	this.affected = affected;
    }
}