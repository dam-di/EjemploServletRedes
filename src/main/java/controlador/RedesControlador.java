package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/RedesControlador")
public class RedesControlador extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String opcion = request.getParameter("opcion");

		if (opcion.equals("inicio")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request, response);
		} else if (opcion.equals("cables")) {
			System.out.println("Usted ha presionado la opción cables");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/vistas/cables.jsp");
			requestDispatcher.forward(request, response);
		} else if (opcion.equals("adaptadores")) {
			System.out.println("Usted a presionado la opcion adaptadores");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/vistas/adaptadores.jsp");
			requestDispatcher.forward(request, response);
		} else if (opcion.equals("componentes")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/vistas/componentes.jsp");
			requestDispatcher.forward(request, response);
		}
	}
}
