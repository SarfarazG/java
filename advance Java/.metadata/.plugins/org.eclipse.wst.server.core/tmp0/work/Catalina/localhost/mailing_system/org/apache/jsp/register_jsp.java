package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#abc\").change(function(){\r\n");
      out.write("\t\t\tvar em = $(\"#abc\").val();\r\n");
      out.write("\t\t\talert(\"hello\"+em);\r\n");
      out.write("\t\t\t$.post(\"ajax\",{saf:em},function(response,status){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#response\").html(response);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body align=\"center\">\r\n");
      out.write("<form method=\"post\" action=\"reg\" >\r\n");
      out.write("<h1 >Student Registration form</h1>\r\n");
      out.write("<table  align=\"center\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td><h3>NAME:</h3></td>\r\n");
      out.write("\t<td> <input type=\"text\" name=\"name\" placeholder=\"Enter your Name HERE\"></td>\r\n");
      out.write("\t<td>");
 String msg1=(String) request.getAttribute("k1");
	if(msg1!=null) 
	{ 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(msg1 );
      out.write('\r');
      out.write('\n');
      out.write('	');
}
      out.write("</td></br>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>ENROLLMENT NO:</td>\r\n");
      out.write("\t<td> <input type=\"number\" name=\"eno\" placeholder=\"Enter your EN.no HERE\"></td><br>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>ADDRESS:</td>\r\n");
      out.write("\t<td> <input type=\"text\" name=\"add\" placeholder=\"Enter your add HERE\"></td><br>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>MOBILE NO:</td>\r\n");
      out.write("\t<td> <input type=\"number\" name=\"mno\" placeholder=\"Enter your Mob.no HERE\"></td><br>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>BRANCH:</td>\r\n");
      out.write("\t <td><input type=\"text\" name=\"branch\" placeholder=\"Enter your Branch HERE\"></td><br>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t <tr>\r\n");
      out.write("\t <td>EMAIL: </td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"email\" placeholder=\"enter your email id here\" id=\"abc\"></td>\r\n");
      out.write("\t<td><div id=\"response\" ></div></td>\r\n");
      out.write("\t<td>");
 String msg2=(String) request.getAttribute("k2");
	 if(msg2!=null) 
	{ 
      out.write("\r\n");
      out.write("\t<h3>");
      out.print(msg2 );
      out.write("</h3>\r\n");
      out.write("\t");
}
      out.write("</td><br>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>PASSWORD:</td>\r\n");
      out.write("\t<td><input type=\"password\" name=\"pass\" placeholder=\"Enter your Password here\"></td><br>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>REGISTER:</td> \r\n");
      out.write("\t <td><input type=\"submit\"></td>\r\n");
      out.write("\t </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
