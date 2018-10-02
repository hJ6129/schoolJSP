package unit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><link rel='stylesheet' href='./css/main.css'/>");
		out.print("</head><body><div id='wrap'><div class='header'>");
		out.print("쇼핑몰 회원관리 ver 1.0</div><ul class='nav'>");
		out.print("<li><a href='#'>회원등록</a></li><li><a href='#'>회원목록조회/수정</a></li><li><a href='#'>회원매출조회</a></li><li><a href='#'>홈으로.</a></li></ul><div class='section'>");
		out.print("<h4>홈쇼핑 회원 등록</h4><form method='post' action=''><table><colgroup><col style='width:330px'><col style='width:370px'></colgroup><tbody>");
		out.print("<tr><td>회원번호(자동발생)</td><td class='td_input'><input type='text' name='user_num' style='width:120px'></td></tr>");
		out.print("<tr><td>회원성명</td><td class='td_input'><input type='text' name='user_name' style='width:120px'/></td></tr>");
		out.print("<tr><td>회원전화</td><td class='td_input'><input type='text' name='user_phone' style='width:190px' /></td></tr>");
		out.print("<tr><td>회원주소</td><td class='td_input'><input type='text' name='user_address' style='width:230px' /></td></tr>");
		out.print("<tr><td>가입일자</td><td class='td_input'><input type='text' name='user_date' style='width:120px' /></td></tr>");
		out.print("<tr><td>고객등급[A:VIP,B:일반,C:직원]</td><td class='td_input'><input type='text' name='user_rank' style='width:120px' /></td></tr>");
		out.print("<tr><td>도시코드</td><td class='td_input'><input type='text' name='user_city' style='width:120px' /></td></tr>");
		out.print("<tr><td colspan='2' class='td_btn'><button id='add'>등록</button><button id='search'>조회</button></td></tr></tbody></table></form></div>");
		out.print("</div></body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
