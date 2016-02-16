package br.com.treinaweb.jee.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ServletLeitorIdade
 */
@WebServlet(
		name = "ServletLeitorIdade",
		urlPatterns = {	"/LerIdade"}
		)
public class ServletLeitorIdade extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServletContext contexto;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLeitorIdade() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		contexto = config.getServletContext();
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idade =Integer.parseInt(request.getParameter("idade"));
		contexto.setAttribute("idadeUsuario", idade);
		response.getWriter().println("<html>");
		response.getWriter().println("	<head>");
		response.getWriter().println("		<title>Verifique sua idade</title>");
		response.getWriter().println("	</head>");
		response.getWriter().println("	<body>");
		response.getWriter().println("	  <form method='post' action='ConfirmaIdade'>");
		response.getWriter().println("		<table>");
		response.getWriter().println("			<tr>");
		response.getWriter().println("				<td>Confirme sua Idade: </td>");
		response.getWriter().println("				<td><input type='text' name='idadeConfirmada'/></td> ");
		response.getWriter().println("			</tr>");
		response.getWriter().println("			<tr>");
		response.getWriter().println("				<td colspan='2'><input type='submit' value='Confirmar'/> </td>");
		response.getWriter().println("			</tr>");
		response.getWriter().println("		</table>");
		response.getWriter().println("	  </form>");
		response.getWriter().println("	</body>");
		response.getWriter().println("</html>");
		contexto.removeAttribute("idade");
	}
}











