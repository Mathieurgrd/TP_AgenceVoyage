package com.formation.greta.java.agencevoyage;

import java.io.IOException;
import java.io.PrintStream;

public class KoalaException extends RuntimeException {

	public KoalaException(String string) {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void printStackTrace(PrintStream arg0) {
				Utils u = new Utils();
				
				System.err.print(""
						+ "  CETTE PERSONNE EST UN KOALA ! LA KOALA EXCEPTION !!!! "
				+ "		        )    (   |\r\n" + 
				"               )    (  /    .-\r\n" + 
				"        _ ,---. _   ( /    /\r\n" + 
				"      (~-| . . |-~)  V    /\r\n" + 
				"       \\._  0  _,/       /\r\n" + 
				"        / `-^-'`-._     /\r\n" + 
				"       '           `-. (\r\n" + 
				"      :               )E\r\n" + 
				"      :          ,---' (\r\n" + 
				"       .            )E (\r\n" + 
				"        '._____,---'   (\r\n" + 
				"               )       (\r\n" + 
				"               )       (\r\n" + 
				"               )       (\r\n" + 
				"               )       (" + "\r\n " );
			
				try {
				u.printkoala();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	

}
