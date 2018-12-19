package readandwrite

import pojo.Gato

class WriteMultipleLines {
	static void main(String[] args) {
		Integer id = 1;
		String nombre = "gato";
		String raza = "raza";
		boolean masVidas = false;
		int vidas = 9;
		String line;
		File f = new File('C:\\Users\\Carlos Ekaitz Ugalde\\Desktop','Example3.txt');
		
		//f.append("\r\n" +id + ", " + nombre + ", " + raza + ", " + vidas);
		for (int i = 1; i < 2454; i++) {
			id = i;
			nombre = "gato" + i;
			raza = "raza" + i;
			if(masVidas == false) {
				if (vidas == 0) {
					masVidas = true;
				}
				vidas = vidas - 1;
			}else if (masVidas == true){
				if (vidas == 9) {
					masVidas = false;
				}
				vidas = vidas + 1;
			}
			line = "\r\n" +id + ", " + nombre + ", " + raza + ", " + vidas;
			f.append("\r\n" +id + ", " + nombre + ", " + raza + ", " + vidas);
			println "$line";
			//leer numero de lineas
			
		}
	}
}
