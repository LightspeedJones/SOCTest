package org.SOCTest.action;

import com.opensymphony.xwork2.ActionSupport;
import org.SOCTest.dao.Database;

public class SaveAction extends ActionSupport{
	int affected = 0;
    Database db = null;
    private String paciente;
    private String doutor;
    private String tipo;
    private String data;
    private String msg = "";
    
    public String execute() throws Exception {
        db = new Database();
    	
    	try {
        	affected = db.SaveExame(paciente, doutor, tipo, data);
        	if (affected > 0) {
        		msg = "Dados salvos com sucesso!";
        	}
        	else {
        		msg = "nao";
        	}
        }
    	catch(Exception ex) {
    		ex.printStackTrace();
    	}
    	
        return SUCCESS;
    }
    
    public String getMsg() {
    	return msg;
    }
    
    public void setMsg(String msg) {
    	this.msg = msg;
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
