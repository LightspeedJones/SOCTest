package org.SOCTest.service;

import org.SOCTest.model.Exame;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReturnExames implements ReturnExamesService{
	
	public String returnData(int id) {
		
		ResultSet result = null;
		Exame exame = null;
		String x = "";
		
		try 
		{
			String query = "SELECT paciente, doutor, tipo, dataExame FROM exame where id = " + id;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/soctest?useTimezone=true&serverTimezone=UTC", "root", "password");	
			Statement st = conn.createStatement();
			
			ResultSet rs;
			exame = new Exame();
			
			result = st.executeQuery(query);
			
			while(result.next()) {
				//x = result.getString("paciente");
				exame.setPaciente(result.getString("paciente"));
				exame.setDoutor(result.getString("doutor"));
				exame.setTipo(result.getString("tipo"));
				exame.setData(result.getDate("dataExame").toString());
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return exame.toString();
		
	}
	
}
