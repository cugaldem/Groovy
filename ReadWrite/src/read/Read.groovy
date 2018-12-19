package read

import pojo.Objeto
import write.Write

class Read {
	public void leer(){
		Integer id;
		String uno;
		String dos;
		String tres;
		String [] linea;
		Write w = new Write();
		Objeto o = new Objeto();
		Integer numLineas = 0;
		File readFile = new File("C:\\Users\\Carlos Ekaitz Ugalde\\Desktop\\Leer.txt");
		
		/**
		 * separamos cada linea usando line.split()
		 * y guardamos la linea "cortado en el Array de String linea."
		 */
		new File("C:\\Users\\Carlos Ekaitz Ugalde\\Desktop\\Leer.txt").eachLine {
			line -> 
			/*
			 *TODO: trim empty lines 
			 *l = line.trim();
			 *l = line.replaceAll("(?m)^\\s", "");
			*/
			linea = line.split(',');
		   }
		   
		   /**
		    * I have decided to write the lines in blocks of 65, for the example,
		    * should give me 15 blocks and an incomplete one
		    * I have to do it as if I didn't know that how many lines are.
		    * For Big numbers to avoid slowdowns it should be done in batches of a 1000
		    */
		   println readFile.readLines().size();
		   def block = ((readFile.readLines().size())/65).doubleValue().round().next();
		   def totalLines =readFile.readLines().size();
		   println block;
		   Integer numberOfBlocks
		   for (numberOfBlocks = 0; numberOfBlocks < block; numberOfBlocks++) {
			   for (int i = 1; i <= 65; i++) {
				   def currentLine = i + 65*numberOfBlocks;
				   if(currentLine > totalLines) {
					   println "No más lineas";
				   }else {
					   o.setId(i + 65*numberOfBlocks);
					   o.setUno(linea[1]);
					   o.setDos( linea[2]);
					   o.setTres(linea[3]);
					   w.escribir(o);
				   }
				   
			   }
			   println "Bloque $numberOfBlocks Completado";
		   }
	}
}
