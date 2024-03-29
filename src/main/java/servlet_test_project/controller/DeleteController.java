package servlet_test_project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_test_project.service.StudentService;
@WebServlet(value = "/deletecontroller")
public class DeleteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService service = new StudentService();
		int studentId=Integer.parseInt(req.getParameter("id")) ;
		service.deleteStudentByIdService(studentId);
		
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}

}
