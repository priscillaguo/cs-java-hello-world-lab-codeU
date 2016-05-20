package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
        String version = System.getProperty ("java.version");
        int vnum = version.indexOf('.');
        vnum = version.indexOf('.', vnum+1);
        return Double.parseDouble (version.substring(0, vnum));
    }
    
    public static void main(String[] args) {
	    // you can test the output of getVersion() here
    }
}
