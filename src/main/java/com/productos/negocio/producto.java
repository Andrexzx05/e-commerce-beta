package com.productos.negocio;
import com.productos.datos.*;

import java.sql.ResultSet;
import java.sql.SQLException;


public class producto {
	public String consultarTodo() 
	{ 
		String sql="SELECT * FROM tb_producto ORDER BY id_pr"; 
		conection con=new conection(); 
		String tabla="<table border=2><th>ID</th><th>Producto</th><th>Cantidad</th><th>Precio</th>"; 
		ResultSet rs=null; 
		rs=con.Consulta(sql); 
		try { 
			while(rs.next()) 
			{ 
				if(rs!=null) {
					tabla+="<tr><td>"+rs.getInt(1)+"</td>" 
							+ "<td>"+rs.getString(3)+"</td>" 
							+ "<td>"+rs.getInt(4)+"</td>" 
							+ "<td>"+rs.getDouble(5)+"</td>" 
							+ "</td></tr>"; 
				}
			} 
		} catch (SQLException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
			System.out.print(e.getMessage()); 
		} 
		tabla+="</table>"; 
		return tabla; 
	}
	public String buscarProductoCategoria(int cat) 
	{ 
		String sentencia="SELECT nombre_pr, precio_pr FROM tb_producto WHERE id_cat="+cat; 
		conection con=new conection(); 
		ResultSet rs=null; 
		String resultado="<table border=3>"; 
		try 
		{ 
			rs=con.Consulta(sentencia); 
			while(rs.next()) 
			{ 
				resultado+="<tr><td>"+ rs.getString(1)+"</td>" 
						+ "<td>"+rs.getDouble(2)+"</td></tr>"; 
			} 
			resultado+="</table>"; 
		} 
		catch(SQLException e) 
		{ 
			System.out.print(e.getMessage());  
		} 
		System.out.print(resultado); 
		return resultado; 
	} 

}
