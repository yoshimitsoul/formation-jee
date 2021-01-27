package fr.formation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Annotation pour déclarer la servlet et la mapper
@WebServlet(value = "/home", loadOnStartup = 1)
public class HomeServlet extends HttpServlet {
	// GET / POST / PUT / DELETE / ...

	// La commande GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Dans l'objet HttpServletRequest, on a tout ce qui concerne la requête HTTP :
		// -> Les paramètres URL, paramètres dans le corps de la requête
		// -> Les cookies
		// -> La session utilisateur

		// Dans l'objet HttpServletResponse, on a tout ce qui va concerner la réponse
		// HTTP :
		// -> Contenu (HTML, CSS, blabla)
		// -> Status particulier ? (redirection ... 30x)

		if (req.getSession().getAttribute("usrSession") == null) {
			resp.sendRedirect("login");
			return;
		}

		String monUsername = req.getParameter("username");

		req.setAttribute("utilisateur", monUsername);

		// Ici, on cherche à déléguer la requête vers une vue JSP (pour éviter le
		// resp.getWriter())
		this.getServletContext() // On récupère le contexte de Servlet
				.getRequestDispatcher("/WEB-INF/views/home.jsp") // On récupère le dispatcher
				.forward(req, resp); // On transfert avec request et response

//		//Type de contenu
//		resp.setContentType("text/html");
//		
//		//Contenu
//		resp.getWriter().println("<p>Allô le monde ?!</p>");
//		resp.getWriter().println("<p>Bonjour " + monUsername + "</p>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String monUsername = req.getParameter("username");

		System.out.println(monUsername);

		resp.sendRedirect("home");
	}

	// La méthode "service" qui prend n'importe quelle commande HTTP
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//	}

}