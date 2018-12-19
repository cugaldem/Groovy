package WriteFile

class Write {
	public void write() {
		
		File f = new File('C:\\Users\\Carlos Ekaitz Ugalde\\Desktop','leer.txt');
		for (int i = 1; i < 1000; i++)
		f.append(id + ',Hola,Mundo,10/12/2018\r\n');
	}
}
