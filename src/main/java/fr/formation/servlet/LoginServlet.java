package fr.formation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//AFFICHAGE DU FORMULAIRE DE CONNEXION
		
		if (req.getParameter("error") != null) {
			req.setAttribute("messageErreur", "Nom d'utilisateur ou mot de passe incorrect.");
		}
		
		this.getServletContext()
			.getRequestDispatcher("/WEB-INF/views/login.jsp")
			.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//TRAITEMENT DE LA CONNEXION (DES INFOS RECUES PAR L'UTILISATEUR ...)
		
		String monUsername = req.getParameter("username");
		String monPassword = req.getParameter("password");
		
		if (monUsername.equals("toto") && monPassword.equals("123")) {
			resp.sendRedirect("home");
		}
		
		else {
			resp.sendRedirect("login?error=true");
		}
	}
}