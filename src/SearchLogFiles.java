import java.io.File;

public class SearchLogFiles {
	
	File f;
    public SearchLogFiles() {
    	 f = new File("C:\\");
    	 findLogFile(f);
	}
	    
    public void findLogFile(File f){
	  if(f != null){
		  File[] files = f.listFiles();
		  if(files==null) return;
		 for(File f1 : files){			 
			 if(f1.isFile() && f1.getName().endsWith(".log") && f1.getName().startsWith("c")){
				 System.out.println(f1);
				 }
			 if(f1.isDirectory()){
			 findLogFile(f1);
			 }
		 }
			 
	   }
   }
}

