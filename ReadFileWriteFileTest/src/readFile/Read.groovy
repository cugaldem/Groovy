package readFile

class Read {
	   static void main(String[] args) { 
		   new File("C:\\Users\\Carlos Ekaitz Ugalde\\Desktop\\Example3.txt").eachLine {  
			   line -> println "line : $line"; 
		   } 
	   }
}
