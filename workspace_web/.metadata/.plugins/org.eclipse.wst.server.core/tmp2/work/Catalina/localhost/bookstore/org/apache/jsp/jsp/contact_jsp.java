/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.47
 * Generated at: 2019-11-14 11:59:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/jsp/../includes/header.jsp", Long.valueOf(1573731971552L));
    _jspx_dependants.put("/jsp/../includes/footer.jsp", Long.valueOf(1573610626000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1573525388000L));
    _jspx_dependants.put("jar:file:/C:/javaprogram/workspace_web/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/bookstore/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/jsp/../includes/css.jsp", Long.valueOf(1573623400000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write(" ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Home One || Witter Multipage Responsive Template</title>\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!-- favicon -->\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/favicon.ico\">\r\n");
      out.write("        <!-- Place favicon.ico in the root directory -->\r\n");
      out.write("        <!-- Google Fonts -->\r\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Poppins:400,700,600,500,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- all css here -->\r\n");
      out.write("\t\t<!-- bootstrap v3.3.6 css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<!-- animate css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/animate.css\">\r\n");
      out.write("\t\t<!-- jquery-ui.min css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/jquery-ui.min.css\">\r\n");
      out.write("\t\t<!-- meanmenu css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/meanmenu.min.css\">\r\n");
      out.write("\t\t<!-- Font-Awesome css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<!-- pe-icon-7-stroke css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/pe-icon-7-stroke.css\">\r\n");
      out.write("\t\t<!-- Flaticon css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/flaticon.css\">\r\n");
      out.write("\t\t<!-- venobox css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/venobox/venobox.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<!-- nivo slider css -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/lib/css/nivo-slider.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/lib/css/preview.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<!-- owl.carousel css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/owl.carousel.css\">\r\n");
      out.write("\t\t<!-- style css -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/style.css\">\r\n");
      out.write("\t\t<!-- responsive css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/responsive.css\">\r\n");
      out.write("\t\t<!-- modernizr css -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/vendor/modernizr-2.8.3.min.js\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--Header Area Start-->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");

   String id = (String) session.getAttribute("id");

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function btnClick(path){\r\n");
      out.write("   document.location.href =path;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write(".header-right li {\r\n");
      out.write("    padding: 5px 4px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("   <div class=\"header-area\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-2 col-sm-6 col-xs-6\">\r\n");
      out.write("               <div class=\"header-logo\">\r\n");
      out.write("                  <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/BookController\"> <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/logo.PNG\" alt=\"\">\r\n");
      out.write("                  </a>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-1 col-sm-6 visible-sm  col-xs-6\">\r\n");
      out.write("               <div class=\"header-right\">\r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("                  <ul>  \r\n");
      out.write("                     <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/account.do\"><i class=\"flaticon-people\"></i></a>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li><button href=\"");
      out.print(request.getContextPath() );
      out.write("/LogoutController\" name=\"submitcreate\" id=\"submitcreate\" type=\"submit\" class=\"flaticon-people\"> LOGOUT</li>\r\n");
      out.write("                     <li class=\"shoping-cart\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/cart.do\"> <i\r\n");
      out.write("                           class=\"flaticon-shop\"></i> <span>2</span>\r\n");
      out.write("                     </a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-9 col-sm-12 hidden-xs\">\r\n");
      out.write("               <div class=\"mainmenu text-center\">\r\n");
      out.write("                  <nav>\r\n");
      out.write("                     <ul id=\"nav\">\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/BookController\">HOME</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/MembersSelectAllController\">MEMBERS</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/contact.do\">CONTACT</a></li>\r\n");
      out.write("                     </ul>\r\n");
      out.write("                     \r\n");
      out.write("                  </nav> \r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"col-md-1 hidden-sm\">\r\n");
      out.write("               <div class=\"header-right\">  \r\n");
      out.write("                  <ul>\r\n");
      out.write("                     <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/my-account.do\"><i class=\"flaticon-people\"></i></a>\r\n");
      out.write("                     <li class=\"shoping-cart\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/cart.do\"> <i\r\n");
      out.write("                           class=\"flaticon-shop\"></i> <span>2</span> \r\n");
      out.write("                     </a></li>\r\n");
      out.write("                  <li>");

                     if (id != null) {
                  
      out.write("\r\n");
      out.write("                     ");
      out.print(id);
      out.write("\r\n");
      out.write("                     님 환영합니다.<br>\r\n");
      out.write("                     <button  name=\"submitcreate\" id=\"submitcreate\" type=\"submit\" class=\"btn-default\" onclick=\"btnClick('");
      out.print(request.getContextPath() );
      out.write("/LogoutController');\">\r\n");
      out.write("                     <span> \r\n");
      out.write("                        <i class=\"fa fa-user left\"> LOGOUT</i>\r\n");
      out.write("                     </span>\r\n");
      out.write("                     </button>\r\n");
      out.write("                     ");

                     } else {
                  
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                  <button  name=\"submitcreate\" id=\"submitcreate\" type=\"submit\" class=\"btn-default\" onclick=\"btnClick('");
      out.print(request.getContextPath() );
      out.write("/LoginController');\">\r\n");
      out.write("                     <span> \r\n");
      out.write("                        <i class=\"fa fa-user left\"> LOGIN</i>\r\n");
      out.write("                     </span>\r\n");
      out.write("                  </button>\r\n");
      out.write("<!--                   </a> -->\r\n");
      out.write("                  ");
} 
      out.write("\r\n");
      out.write("                  </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("<!--                      id=\"submitcreate\" type=\"submit\" class=\"btn-default\"> -->\r\n");
      out.write("<!--                      <span> <i class=\"fa fa-user left\"></i> LOGOUT -->\r\n");
      out.write("<!--                      </span> -->\r\n");
      out.write("                  \r\n");
      out.write("<!--                   <form active=\"/LoginController\" method=\"get\"> -->\r\n");
      out.write("                  \r\n");
      out.write("<!--                   </form> -->\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <!--Header Area End-->\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("      <!-- Map Area Start -->\r\n");
      out.write("      <div class=\"map-area\">\r\n");
      out.write("         <div id=\"googleMap\" style=\"width:100%;height:445px;\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Map Area End -->   \r\n");
      out.write("      <!-- Address Information Area Start -->\r\n");
      out.write("      <div class=\"address-info-area section-padding\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-md-4 hidden-sm\">\r\n");
      out.write("                  <div class=\"address-single\">\r\n");
      out.write("                     <div class=\"all-adress-info\">\r\n");
      out.write("                        <div class=\"icon\">\r\n");
      out.write("                           <span><i class=\"fa fa-user-plus\"></i></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"info\">\r\n");
      out.write("                           <h3>PHONE</h3>\r\n");
      out.write("                           <p>+(02)-12345-6789-55</p>\r\n");
      out.write("                           <p>+(05)-15689-5698-44</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>                  \r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                  <div class=\"address-single\">\r\n");
      out.write("                     <div class=\"all-adress-info\">\r\n");
      out.write("                        <div class=\"icon\">\r\n");
      out.write("                           <span><i class=\"fa fa-map-marker\"></i></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"info\">\r\n");
      out.write("                           <h3>ADDRESS</h3>\r\n");
      out.write("                           <p>Mhilara Street 205,</p>\r\n");
      out.write("                           <p>Roitan city, USA.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>                  \r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-md-4 col-sm-6\">\r\n");
      out.write("                  <div class=\"address-single no-margin\">\r\n");
      out.write("                     <div class=\"all-adress-info\">\r\n");
      out.write("                        <div class=\"icon\">\r\n");
      out.write("                           <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"info\">\r\n");
      out.write("                           <h3>E-MAIL</h3>\r\n");
      out.write("                           <p>info123@gmail.com</p>\r\n");
      out.write("                           <p>www.companyweb.com</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>               \r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Address Information Area End -->\r\n");
      out.write("      <!-- Contact Form Area Start -->\r\n");
      out.write("      <div class=\"contact-form-area\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <div class=\"about-title\">\r\n");
      out.write("               <h3>LEAVE A MESSAGE</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               <div class=\"col-md-12\">\r\n");
      out.write("                  <form action=\"#\" method=\"POST\">\r\n");
      out.write("                     <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-5\">\r\n");
      out.write("                           <div class=\"contact-form-left\">\r\n");
      out.write("                              <input type=\"text\" placeholder=\"Your Name\" name=\"name\" id=\"name\" />\r\n");
      out.write("                              <input type=\"email\" placeholder=\"Your Email\" name=\"email\" id=\"email\" />\r\n");
      out.write("                              <input type=\"text\" placeholder=\"Your phone\" name=\"phone\" id=\"phone\" />\r\n");
      out.write("                           </div>                        \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-7\">\r\n");
      out.write("                           <div class=\"contact-form-right\">\r\n");
      out.write("                              <div class=\"input-message\">\r\n");
      out.write("                                 <textarea name=\"message\" id=\"message\" placeholder=\"Your Message\"></textarea>\r\n");
      out.write("                                 <input class=\"btn btn-default\" type=\"submit\" value=\"SEND\" name=\"submit\" id=\"submit\">\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </form>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Contact Form Area End -->\r\n");
      out.write("      \r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("<!-- Footer Area Start -->\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t    <div class=\"footer-top-area\">\r\n");
      out.write("\t\t        <div class=\"container\">\r\n");
      out.write("\t\t            <div class=\"row\">\r\n");
      out.write("\t\t                <div class=\"col-md-3 col-sm-8\">\r\n");
      out.write("\t\t                    <div class=\"footer-left\">\r\n");
      out.write("\t\t                        <p>옥돌이라도 갈고 다듬지 않으면 그릇을 이룰 수 없고, 사람이 배우지 않으면 지식을 알지 못하느니라.</p>\r\n");
      out.write("\t\t                        <ul class=\"footer-contact\">\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <i class=\"flaticon-location\"></i>\r\n");
      out.write("\t\t                                                                       서울특별시 강서구 화곡역\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <i class=\"flaticon-technology\"></i>\r\n");
      out.write("\t\t                                (+82) 123-4567-8910\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                            <li>\r\n");
      out.write("\t\t                                <i class=\"flaticon-web\"></i>\r\n");
      out.write("\t\t                                info@bookstore.com\r\n");
      out.write("\t\t                            </li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div class=\"col-md-2 hidden-sm\">\r\n");
      out.write("\t\t                    <div class=\"single-footer\">\r\n");
      out.write("\t\t                        <h2 class=\"footer-title\">My Account</h2>\r\n");
      out.write("\t\t                        <ul class=\"footer-list\">\r\n");
      out.write("\t\t                            <li><a href=\"my-account.jsp\">My Account</a></li>\r\n");
      out.write("\t\t                            <li><a href=\"account.jsp\">Login</a></li>\r\n");
      out.write("\t\t                            <li><a href=\"cart.jsp\">My Cart</a></li>\r\n");
      out.write("\t\t                            <li><a href=\"wishlist.jsp\">Wishlist</a></li>\r\n");
      out.write("\t\t                            <li><a href=\"checkout.jsp\">Checkout</a></li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div class=\"col-md-3 col-sm-8\">\r\n");
      out.write("\t\t                    <div class=\"single-footer footer-newsletter\">\r\n");
      out.write("\t\t                        <h2 class=\"footer-title\">Our Newsletter</h2>\r\n");
      out.write("\t\t                        <p></p>\r\n");
      out.write("\t\t                        <form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t                            <div>\r\n");
      out.write("\t\t                                <input type=\"text\" placeholder=\"email address\">\r\n");
      out.write("\t\t                            </div>\r\n");
      out.write("\t\t                            <button class=\"btn btn-search btn-small\" type=\"submit\">SUBSCRIBE</button>\r\n");
      out.write("\t\t                            <i class=\"flaticon-networking\"></i>\r\n");
      out.write("\t\t                        </form>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div class=\"col-md-2 col-sm-4 visible-sm\">\r\n");
      out.write("\t\t                    <div class=\"single-footer\">\r\n");
      out.write("\t\t                        <h2 class=\"footer-title\">Shop</h2>\r\n");
      out.write("\t\t                        <ul class=\"footer-list\">\r\n");
      out.write("\t\t                            <li><a href=\"#\">Orders & Returns</a></li>\r\n");
      out.write("\t\t                            <li><a href=\"#\">Search Terms</a></li>\r\n");
      out.write("\t\t                            <li><a href=\"#\">Advance Search</a></li>\r\n");
      out.write("\t\t                            <li><a href=\"#\">Affiliates</a></li>\r\n");
      out.write("\t\t                            <li><a href=\"#\">Group Sales</a></li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div class=\"footer-bottom\">\r\n");
      out.write("\t\t        <div class=\"container\">\r\n");
      out.write("\t\t            <div class=\"row\">\r\n");
      out.write("\t\t                <div class=\"col-md-6\">\r\n");
      out.write("                            <div class=\"footer-bottom-left pull-left\">\r\n");
      out.write("                                <p>Copyright &copy; 2019 <span><a href=\"#\">상공Items</a></span>. All Right Reserved.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div class=\"col-md-6\">\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t<!-- Footer Area End -->\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <!-- all js here -->\r\n");
      out.write("      <!-- jquery latest version -->\r\n");
      out.write("        <script src=\"js/vendor/jquery-1.12.0.min.js\"></script>\r\n");
      out.write("      <!-- bootstrap js -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("      <!-- owl.carousel js -->\r\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("      <!-- jquery-ui js -->\r\n");
      out.write("        <script src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("      <!-- jquery Counterup js -->\r\n");
      out.write("        <script src=\"js/jquery.counterup.min.js\"></script>\r\n");
      out.write("        <script src=\"js/waypoints.min.js\"></script>   \r\n");
      out.write("      <!-- jquery countdown js -->\r\n");
      out.write("        <script src=\"js/jquery.countdown.min.js\"></script>\r\n");
      out.write("      <!-- jquery countdown js -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"venobox/venobox.min.js\"></script>\r\n");
      out.write("      <!-- jquery Meanmenu js -->\r\n");
      out.write("        <script src=\"js/jquery.meanmenu.js\"></script>\r\n");
      out.write("      <!-- wow js -->\r\n");
      out.write("        <script src=\"js/wow.min.js\"></script>   \r\n");
      out.write("      <script>\r\n");
      out.write("         new WOW().init();\r\n");
      out.write("      </script>\r\n");
      out.write("      <!-- scrollUp JS -->      \r\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("      <!-- plugins js -->\r\n");
      out.write("        <script src=\"js/plugins.js\"></script>\r\n");
      out.write("      <!-- Nivo slider js -->\r\n");
      out.write("      <script src=\"lib/js/jquery.nivo.slider.js\" type=\"text/javascript\"></script>\r\n");
      out.write("      <script src=\"lib/home.js\" type=\"text/javascript\"></script>\r\n");
      out.write("      <!-- Google Map js -->\r\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js\"></script>\r\n");
      out.write("          \r\n");
      out.write("      <script>\r\n");
      out.write("         function initialize() {\r\n");
      out.write("           var mapOptions = {\r\n");
      out.write("            zoom: 16,\r\n");
      out.write("            scrollwheel: false,\r\n");
      out.write("            draggable : true,\r\n");
      out.write("             center: new google.maps.LatLng(37.542276, 126.841328)   \r\n");
      out.write("            };\r\n");
      out.write("                 \r\n");
      out.write("           var map = new google.maps.Map(document.getElementById('googleMap'),\r\n");
      out.write("              mapOptions);\r\n");
      out.write("           var marker = new google.maps.Marker({\r\n");
      out.write("            position: map.getCenter(),\r\n");
      out.write("            animation:google.maps.Animation.BOUNCE,\r\n");
      out.write("            icon: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/map-icon.png',\r\n");
      out.write("            map: map\r\n");
      out.write("           });\r\n");
      out.write("         }\r\n");
      out.write("         google.maps.event.addDomListener(window, 'load', initialize);\r\n");
      out.write("      </script>      \r\n");
      out.write("      <!-- main js -->\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /jsp/../includes/css.jsp(4,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path");
      // /jsp/../includes/css.jsp(4,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/jsp/../includes/css.jsp(4,1) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
