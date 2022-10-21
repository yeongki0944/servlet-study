import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

// 컴파일방법
// cmd -> javac PrimitiveServlet2.java
public class PrimitiveServlet2 implements Servlet {
    public PrimitiveServlet2() {
    }

    public void init(ServletConfig var1) throws ServletException {
        System.out.println("init");
    }

    public void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException {
        StringBuffer sb = new StringBuffer();

        // HTTP1.1 Header
        sb.append("HTTP/1.1 200 OK\r\n");
        sb.append("Content-Type: text/html\n");
        sb.append("\r\n");
        System.out.println("append HTTP1.1 Header");


        System.out.println("from service");
        PrintWriter var3 = var2.getWriter();
        String msg1 = "Hello. Roses are red.";

        sb.append(msg1);
        System.out.println("[Response]");
        System.out.println(sb.toString());

        var3.println(sb.toString());
        var3.print("Violets are blue.");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }
}
