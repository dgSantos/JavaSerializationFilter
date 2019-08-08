package br.com.onew.rmi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Cliente c = new Cliente();
		
		c.setNome("Diego");
		
		gravaCliente(c);
		
		c = null;
		
		c = leCliente();
		
		System.out.println(c);
	}

	private static Cliente leCliente() throws Exception {
		try(FileInputStream fis = new FileInputStream(new File("object.dat"));
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			return (Cliente)ois.readObject();
		}
	}

	private static void gravaCliente(Cliente c) throws FileNotFoundException, IOException {
		try(FileOutputStream fos = new FileOutputStream(new File("object.dat"));
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(c);
		}
	}
}