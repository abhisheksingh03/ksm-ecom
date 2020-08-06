package com.ksm.ecom.configuration;

import java.io.File;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EcomInitializerApp extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.err.println("======================");
		// TODO Auto-generated method stub
		return new Class[] { AppEcomConfig.class }; 
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.err.println("======================-----------");
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
/*Set these variables for your project needs*/
	
	
	protected static String getDirectoryFormat() {
		String directoryName = "temp";
		String workingDir = System.getProperty("user.dir");
		String absoluteFilePath;
		String yourOs = System.getProperty("os.name").toLowerCase();
		
		if (yourOs.indexOf("win") >= 0) {

			//if windows
			absoluteFilePath = workingDir + "\\" + directoryName +"\\";

		} else if (yourOs.indexOf("nix") >= 0 ||
	                       yourOs.indexOf("nux") >= 0 ||
	                       yourOs.indexOf("mac") >= 0) {

			//if unix or mac
			absoluteFilePath = "/opt/tomcat" + "/" + directoryName +  "/";

		}else{

			//unknow os?
			absoluteFilePath = workingDir + "/" + directoryName +  "/";

		}
		File file = new File(absoluteFilePath);
		if(	file.isDirectory()) {
			return absoluteFilePath;
		}
		else {
			file.mkdir();
			return absoluteFilePath;
		}
		
		
		
	}
	

	/*private static final String Location = "/mytemp/";*/
}
