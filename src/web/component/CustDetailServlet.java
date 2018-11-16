package web.component;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cust.Cust;
import com.cust.CustBiz;

@WebServlet({ "/CustDetailServlet", "/cdetail" })
public class CustDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustBiz biz;
	public CustDetailServlet() {
        super();
        biz = new CustBiz();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
	Cust cust = new Cust(id, pwd, name, Integer.parseInt(age));
	response.setCharacterEncoding("EUC-KR");
	PrintWriter out 
	= response.getWriter();
	String result = "";
	
	try {
		cust = biz.get("id");
		result += "<table border='1'>";
		result += "<thead><tr><th>ID</th><th>PWD</th><th>NAME</th><th>AGE</th></tr></thead>";
		result += "<tbody>";
		result += "<tr>";
		result += "<td>"+cust.getId()+"</td>";
		result += "<td>"+cust.getPwd()+"</td>";
		result += "<td>"+cust.getName()+"</td>";
		result += "<td>"+cust.getAge()+"</td>";
		result += "</tr>";
		result += "</tbody>";
		result += "</table>";
		
	} catch (Exception e) {
		e.printStackTrace();
		result += "<h1>Detailing Fail</h1>";
	}
		out.println(result);
		out.close();
	
	}

}
