package test3_web_project;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/FileUpServlet")
public class FileUpServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name = request.getParameter("name");
		MultipartRequest multi = null;
		String folder = "C:\\javaprogram\\workspace_web\\test\\WebContent\\uploadfolder";
		int maxSize=1024*1024*50; //10M
		String charset="utf-8";

		try {
//			System.out.println("출력");
			multi = new MultipartRequest
					(
					request, folder, maxSize,
					charset, new DefaultFileRenamePolicy());
			
//			String name = multi.getParameter("name");
			
			Enumeration files = multi.getFileNames();			
			
			while(files.hasMoreElements()) {
				String filename = (String) files.nextElement();
				String oriFileName = multi.getOriginalFileName(filename);
				String fileName1 = multi.getFilesystemName(filename);			
				
				System.out.println("원본파일명 : "+oriFileName);
				System.out.println("중복된 파일명 : "+fileName1);
				
//				File file = new File(filename);
//				System.out.println("파일크기"+file.length());
//				System.out.println("파일경로"+file.getAbsolutePath());
//				System.out.println("파일크기"+file.getName());
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}