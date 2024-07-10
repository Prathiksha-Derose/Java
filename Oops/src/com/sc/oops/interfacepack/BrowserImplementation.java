package com.sc.oops.interfacepack;

public class BrowserImplementation implements Browser,App {
    public void google() {
		System.out.println("google");
	}
    
   public void firefox() {
		System.out.println("firefox");
	}

	public void internetexplorer() {
		System.out.println("internetexplorer");
	}
	
	public void youtube() {
		System.out.println("Youtube");
	}

	public void instagram() {
		System.out.println("instagram");
	}

	public void whatsapp() {
		System.out.println("whatsapp");
	}
	
	public static void main(String[] args) {
		
		BrowserImplementation bi = new BrowserImplementation();
			bi.google();
			bi.firefox();
			bi.internetexplorer();
			bi.youtube();
			bi.instagram();
			bi.whatsapp();
	
	}
}
	

