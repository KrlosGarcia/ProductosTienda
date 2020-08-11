package Tienda;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;


public class Main {

    public static Fecha f1 = new Fecha();
    public static Scanner in = new Scanner(System.in);
    
    public static void definirFecha(){
        f1.setDia(15);
        f1.setMes(7);
        f1.setAnio(2020);
    }
    
    public static void Adelantar(){
        int diaActual = f1.getDia();
        int mesActual = f1.getMes();
        int anioActual = f1.getA�o();
        
        Calendar oFecha = Calendar.getInstance();
        oFecha.set(anioActual, mesActual, diaActual);
        
       
        oFecha.add(Calendar.DAY_OF_MONTH, f1.getDia());
        oFecha.add(Calendar.MONTH, f1.getMes());
        oFecha.add(Calendar.YEAR, f1.getA�o());
        
        f1.setAnio(oFecha.get(Calendar.YEAR));
        f1.setMes(oFecha.get(Calendar.MONTH));
        f1.setDia(oFecha.get(Calendar.DAY_OF_MONTH)+5);
        
        
    }
    
    public static String imprimirFecha(){
        return "\nDia: "+f1.getDia()+
                "\nMes: "+f1.getMes()+
                "\nA�o: "+f1.getA�o();
    }
    
    public static void main(String[] args) {
        
        Producto p1 = new Producto();
        
        LocalDate date = LocalDate.of(2020, 8, 10);
        LocalDate newDate = date.plusDays(10);
        
        
        char opc = 0;
        String respuesta;
        p1.setIVA(0.09f);
        p1.setPrecio(10.0f); //valor fijo para cualquier producto
        do{
            System.out.print("\nIngrese nombre del producto: "); p1.setNombreProducto(in.next());
            
            System.out.println("\n\nGenerando c�digo del producto...");
            System.out.println("\nEl c�digo del "+p1.getNombreProducto()+" es: "+p1.codigoProducto());
            
            System.out.println("La fecha de elaboraci�n del "+p1.getNombreProducto()+" es: ");
             
            if(opc == 's' || opc == 'S'){
                System.out.println(newDate);
            }
            else{
                System.out.println(date);
            }
            
            System.out.println("\n\nEl IVA segun la decisi�n del gobierno es del "+p1.getIVA()+"%");
            
            System.out.println("\n\nMostrando precio ... ");
            System.out.println("\nEl precio del "+p1.getNombreProducto() +" sin IVA es de: "+p1.getPrecio()+"$");
            System.out.println("\nEl precio total del "+p1.getNombreProducto()+" es (incluyendo el IVA): "+p1.precioTotal()+"$");
            
            System.out.print("\n\nDesea comprar este producto? " + " (si/no)"); respuesta = in.next();
            
            if("si".equals(respuesta)){
                System.out.println("\nGracias por su compra, vuelva pronto ... ");
            }
            else{
                System.out.println("\nUsted ha decisido no comprar el producto ");
            }
            
            System.out.print("\n\nDesear�a comprar otro producto? (si/no): "); opc = in.next().charAt(0);
        }while(opc == 's' || opc == 'S');
        
        
    }
    
}