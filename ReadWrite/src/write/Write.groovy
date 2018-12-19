package write

import pojo.Objeto
import read.Read

class Write {
	Read r = new Read();
	Objeto o = new Objeto();
	/**
	 * Metodo para grabar en txt. Recibe un objeto desde el metodo leer  en Read.
	 * @param o
	 */
	public void escribir(o) {
		File f = new File('C:\\Users\\Carlos Ekaitz Ugalde\\Desktop','guardar.txt');
		f.append(o.getId() + ',' + o.getUno() +',' + o.getDos() + ',' + o.getTres() + '\r\n');
	}
}
