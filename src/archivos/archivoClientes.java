package archivos;

import java.io.EOFException;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import listas.ListadoClientes;

public class archivoClientes implements Serializable{
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String archivoDeClientes = "clientes.dat";

	public static void grabarClientes(ListadoClientes clientes) {

		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {

			fileOutputStream = new FileOutputStream(archivoDeClientes);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(clientes);

			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ListadoClientes leerClientes() {

		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		ListadoClientes aux = new ListadoClientes();

		try {
			fileInputStream = new FileInputStream(archivoDeClientes);
			objectInputStream = new ObjectInputStream(fileInputStream);

			aux = (ListadoClientes) objectInputStream.readObject();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				objectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return aux;
	}
}
