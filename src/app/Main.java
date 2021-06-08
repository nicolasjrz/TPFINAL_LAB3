package app;

import java.util.Date;

import caja.CarritoCompra;
import caja.Venta;
import colecciones.Inventario;
import modelos.Cliente;
import producto.High_top;
import producto.Low_top;

public class Main {

	public static void main(String[] args) {
		
		
		
		High_top z1 = new High_top(1, "nike" ,"", 32, 600);
		High_top z2 = new High_top(2, "adidas","", 32, 600);
		High_top z3 = new High_top(3, "reekon","", 32, 600);
		High_top z4 = new High_top(4, "fila","", 32, 600);
		
		
		
		
		Cliente cl = new Cliente("luis", "tools", 2185122, 223504523, "chaco 332");
		Cliente c2= new Cliente("luis", "tools", 2185122, 223504523, "chaco 332");
		Cliente c3 = new Cliente("luis", "tools", 2185122, 223504523, "chaco 332");
		
		
		CarritoCompra carrito = new CarritoCompra();
		carrito.agregarAlCarrito(z1);
		carrito.agregarAlCarrito(z2);
		
		
		
		Venta venta = new Venta(new Date(), cl, carrito);
		System.out.println(venta.toString());
		
		
	}

}