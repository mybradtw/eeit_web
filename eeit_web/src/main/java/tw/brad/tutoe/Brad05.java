package tw.brad.tutoe;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Brad05 extends HttpServlet {
    public Brad05() {
    	// 建構式執行初始化一次
    	System.out.println("Brad05");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// URL => GET
		System.out.println("Brad05:doGet()");
		PrintWriter pw = response.getWriter();
		pw.append("doGet");
		
	}

}
