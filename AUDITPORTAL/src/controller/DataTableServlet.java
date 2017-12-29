package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import beans.User;
import dataTable.DataTableParameters;
import service.BusinessService;

public class DataTableServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("application/json");
		List<User> listOfName = BusinessService.getNameList();
		//System.out.println(listOfName);
		//System.out.println("data table servlet outside catch---> try is working");
	    DataTableParameters dataTableParam = new DataTableParameters();
	    dataTableParam.setAaData(listOfName);
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    String json = gson.toJson(dataTableParam);
	    response.getWriter().print(json);
	 }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
      doGet(request, response);
    }

}
