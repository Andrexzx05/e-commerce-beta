package com.productos.seguridad;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.productos.datos.conection;

public class Pagina {

	public String mostrarMenu(Integer nperfil)
	{
		String menu="";
		String sql="SELECT * FROM tb_pagina pag, tb_perfil per, "
				+ "tb_perfilpagina pper " +
				"WHERE pag.id_pag=pper.id_pag AND pper.id_per=per.id_per "
				+ "AND pper.id_per= "+nperfil;
		conection con = new conection();
		ResultSet rs=null;
		try
		{
			rs=con.Consulta(sql);
			while(rs.next())
			{
				menu+="<a href="+rs.getString(3)+" class=\"link-button\">"+rs.getString(2)+"</a>";
			}
		}
		catch(SQLException e)
		{
			System.out.print(e.getMessage());
		}
		return menu;
	}

}
