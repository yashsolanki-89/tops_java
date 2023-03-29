<%
	session.removeAttribute("u");
	session.invalidate();
	request.setAttribute("msg", "User Logged Out Sccessfully");
	request.getRequestDispatcher("account.jsp").forward(request, response);
%>