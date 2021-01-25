package fr.formation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value= "/home")
public class HomeServlet extends HttpServlet {

	//la commande GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String monUsername = req.getParameter("username");
		
		req.setAttribute("utilisateur", monUsername);
		//délégation de la requete vers une vue jsp pour eviter le resp.getWritter()
		this.getServletContext() // on recup le 
			.getRequestDispatcher("/WEB-INF/views/home.jsp")//on recup le dispatcher
			.forward(req, resp); //on trnasfere avec req et resp
		
		//type de contenu
		//resp.setContentType("text/html");
		
		//contenu
		//resp.getWriter().println("Bienvenue sur formation JEE");
		//resp.getWriter().println("Bonjour " + monUsername);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String monUsername = req.getParameter("username");
		System.out.println(monUsername);
		
		resp.sendRedirect("home");
	}
	
}