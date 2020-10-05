package org.SOCTest.model;

public class Exame {
	private String paciente, doutor, tipo, data;
	int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public String toString() {
		return "<Exame: paciente=" + paciente + ", doutor=" + doutor + ", tipo=" + tipo + ", data=" + data + ">";
	}
}
