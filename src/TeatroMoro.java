
import java.util.Scanner;


public class TeatroMoro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean salir = false;
        int op;
        int continuarCompra;
        int entradaTeatro;
        int edadCliente;
        int clienteEst;
        int precioZonaA = 20000;
        int precioZonaB = 15000;
        int precioZonaC = 10000;
        int descEst = 10;
        int descTerEdad = 15;
        
        for (;!salir;){
            try{
                System.out.println("[1] Comprar Entrada.");
                System.out.println("[0] Salir.");
                System.out.println("Ingresar opcion: ");
                op = scanner.nextInt(); 

                if (op == 1){
                    System.out.println("Seleccione la entrada:");
                    System.out.println("[1] Asiento en Zona A | Precio: " + precioZonaA + "$"); //precio 20000
                    System.out.println("[2] Asiento en Zona B | Precio: " + precioZonaB + "$"); //precio 15000
                    System.out.println("[3] Asiento en Zona C | Precio: " + precioZonaC + "$"); // precio 10000
                    entradaTeatro = scanner.nextInt();
                    if (entradaTeatro == 1){
                        System.out.println("Ha seleccionado asiento en la Zona A");                
                        System.out.println("Ingrese la edad del cliente: ");
                        edadCliente = scanner.nextInt();
                        if (edadCliente >= 65){
                            System.out.println("Cliente de tercera edad, se considera descuento del 15% al total de la entrada");
                            while (edadCliente >= 65){
                            System.out.println("Resumen transaccion:");
                            System.out.println("Ubicación del asiento: Zona A ");
                            System.out.println("Precio Base: " + precioZonaA + "$" );
                            System.out.println("Descuento Aplicado: "  + descTerEdad + "%" );
                            int PrecioFinal= precioZonaA - (descTerEdad*precioZonaA) / 100;
                            System.out.println("Precio final: " + PrecioFinal);
                            System.out.println("############################");
                            System.out.println("Realizar otra compra [1]");
                            System.out.println("Salir del sistema [0]");
                            continuarCompra = scanner.nextInt();
                            if (continuarCompra == 0){
                                salir = true;
                                break; //salir del sistema completo 
                            }else if (continuarCompra == 1){
                                break;
                            }     
                        } //end while tercera edad final
                        } else {
                            System.out.println("Cliente no cumple los requisitos para descuento por tercera edad");
                            System.out.println("Cliente es estudiante? Si[1] || No[2]");
                            clienteEst = scanner.nextInt();
                            if (clienteEst == 1){
                                System.out.println("Cliente cumple con la condicion de estudiante, se aplica un descuento del 10%");                           
                            }else if (clienteEst == 2){
                                System.out.println("Cliente no cumple con los requisitos de estudiante");
                            }
                            else{
                                System.out.println("Ingrese una opcion que corresponda a lo mostrado en pantalla!");
                            }                       
                            while (clienteEst == 1){
                                System.out.println("Resumen transaccion:");
                                System.out.println("Ubicación del asiento: Zona A ");
                                System.out.println("Precio Base: " + precioZonaA + "$" );
                                System.out.println("Descuento Aplicado: "  + descEst + "%" );
                                int PrecioFinal= precioZonaA - (descEst*precioZonaA) / 100;
                                System.out.println("Precio final: " + PrecioFinal);
                                System.out.println("############################");
                                System.out.println("Realizar otra compra [1]");
                                System.out.println("Salir del sistema [0]");
                                continuarCompra = scanner.nextInt();
                                if (continuarCompra == 0){
                                    salir = true;
                                    break; //salir del sistema completo 
                                }else if (continuarCompra == 1){
                                    break;
                                }                        
                            }//end while precio final a mostrar para estudiante
                            while (clienteEst == 2) {
                                System.out.println("Resumen transaccion:");
                                System.out.println("Ubicación del asiento: Zona A ");
                                System.out.println("Precio Base: " + precioZonaA + "$" );
                                System.out.println("Descuento Aplicado: No Aplica");                           
                                System.out.println("Precio final: " + precioZonaA + "$");
                                System.out.println("############################");
                                System.out.println("Realizar otra compra [1]");
                                System.out.println("Salir del sistema [0]");
                                continuarCompra = scanner.nextInt();
                                if (continuarCompra == 0){
                                    salir = true;
                                    break; //salir del sistema completo 
                                }else if (continuarCompra == 1){
                                    break;
                                }         
                            } //end while cliente normal no tercera edad ni estudiante                  
                        }//end if edad cliente
                    } //end if entrada teatro zona A
                    else if (entradaTeatro == 2){
                        System.out.println("Ha seleccionado asiento en la Zona B");
                        System.out.println("Ingrese la edad del cliente: ");
                        edadCliente = scanner.nextInt();
                        if (edadCliente >= 65){
                            System.out.println("Cliente de tercera edad, se considera descuento del 15% al total de la entrada");
                            while (edadCliente >= 65){
                            System.out.println("Resumen transaccion:");
                            System.out.println("Ubicación del asiento: Zona B ");
                            System.out.println("Precio Base: " + precioZonaB + "$" );
                            System.out.println("Descuento Aplicado: "  + descTerEdad + "%" );
                            int PrecioFinal= precioZonaA - (descTerEdad*precioZonaB) / 100;
                            System.out.println("Precio final: " + PrecioFinal);
                            System.out.println("############################");
                            System.out.println("Realizar otra compra [1]");
                            System.out.println("Salir del sistema [0]");
                            continuarCompra = scanner.nextInt();
                            if (continuarCompra == 0){
                                salir = true;
                                break; //salir del sistema completo 
                            }else if (continuarCompra == 1){
                                break;
                            }     
                        } //end while tercera edad final
                        } else {
                            System.out.println("Cliente no cumple los requisitos para descuento por tercera edad");
                            System.out.println("Cliente es estudiante? Si[1] || No[2]");
                            clienteEst = scanner.nextInt();
                            if (clienteEst == 1){
                                System.out.println("Cliente cumple con la condicion de estudiante, se aplica un descuento del 10%");                           
                            }else if (clienteEst == 2){
                                System.out.println("Cliente no cumple con los requisitos de estudiante");
                            }
                            else{
                                System.out.println("Ingrese una opcion que corresponda a lo mostrado en pantalla!");
                            }                       
                            while (clienteEst == 1){
                                System.out.println("Resumen transaccion:");
                                System.out.println("Ubicación del asiento: Zona B ");
                                System.out.println("Precio Base: " + precioZonaB + "$" );
                                System.out.println("Descuento Aplicado: "  + descEst + "%" );
                                int PrecioFinal= precioZonaA - (descEst*precioZonaB) / 100;
                                System.out.println("Precio final: " + PrecioFinal);
                                System.out.println("############################");
                                System.out.println("Realizar otra compra [1]");
                                System.out.println("Salir del sistema [0]");
                                continuarCompra = scanner.nextInt();
                                if (continuarCompra == 0){
                                    salir = true;
                                    break; //salir del sistema completo 
                                }else if (continuarCompra == 1){
                                    break;
                                }                        
                            }//end while precio final a mostrar para estudiante
                            while (clienteEst == 2) {
                                System.out.println("Resumen transaccion:");
                                System.out.println("Ubicación del asiento: Zona B ");
                                System.out.println("Precio Base: " + precioZonaB + "$" );
                                System.out.println("Descuento Aplicado: No Aplica");                           
                                System.out.println("Precio final: " + precioZonaB + "$");
                                System.out.println("############################");
                                System.out.println("Realizar otra compra [1]");
                                System.out.println("Salir del sistema [0]");
                                continuarCompra = scanner.nextInt();
                                if (continuarCompra == 0){
                                    salir = true;
                                    break; //salir del sistema completo 
                                }else if (continuarCompra == 1){
                                    break;
                                }         
                            } //end while cliente normal no tercera edad ni estudiante                  
                        }//end if edad cliente 
                    }else if (entradaTeatro == 3){
                        System.out.println("Ha seleccionado asiento en la Zona C");
                        System.out.println("Ingrese la edad del cliente: ");
                        edadCliente = scanner.nextInt();
                        if (edadCliente >= 65){
                            System.out.println("Cliente de tercera edad, se considera descuento del 15% al total de la entrada");
                            while (edadCliente >= 65){
                            System.out.println("Resumen transaccion:");
                            System.out.println("Ubicación del asiento: Zona C ");
                            System.out.println("Precio Base: " + precioZonaC + "$" );
                            System.out.println("Descuento Aplicado: "  + descTerEdad + "%" );
                            int PrecioFinal= precioZonaA - (descTerEdad*precioZonaC) / 100;
                            System.out.println("Precio final: " + PrecioFinal);
                            System.out.println("############################");
                            System.out.println("Realizar otra compra [1]");
                            System.out.println("Salir del sistema [0]");
                            continuarCompra = scanner.nextInt();
                            if (continuarCompra == 0){
                                salir = true;
                                break; //salir del sistema completo 
                            }else if (continuarCompra == 1){
                                break;
                            }     
                        } //end while tercera edad final
                        } else {
                            System.out.println("Cliente no cumple los requisitos para descuento por tercera edad");
                            System.out.println("Cliente es estudiante? Si[1] || No[2]");
                            clienteEst = scanner.nextInt();
                            if (clienteEst == 1){
                                System.out.println("Cliente cumple con la condicion de estudiante, se aplica un descuento del 10%");                           
                            }else if (clienteEst == 'N' || clienteEst == 'n'){
                                System.out.println("Cliente no cumple con los requisitos de estudiante");
                            }
                            else{
                                System.out.println("Ingrese una opcion que corresponda a lo mostrado en pantalla!");
                            }                       
                            while (clienteEst == 1){
                                System.out.println("Resumen transaccion:");
                                System.out.println("Ubicación del asiento: Zona C ");
                                System.out.println("Precio Base: " + precioZonaC + "$" );
                                System.out.println("Descuento Aplicado: "  + descEst + "%" );
                                int PrecioFinal= precioZonaA - (descEst*precioZonaC) / 100;
                                System.out.println("Precio final: " + PrecioFinal);
                                System.out.println("############################");
                                System.out.println("Realizar otra compra [1]");
                                System.out.println("Salir del sistema [0]");
                                continuarCompra = scanner.nextInt();
                                if (continuarCompra == 0){
                                    salir = true;
                                    break; //salir del sistema completo 
                                }else if (continuarCompra == 1){
                                    break;
                                }                        
                            }//end while precio final a mostrar para estudiante
                            while (clienteEst == 2) {
                                System.out.println("Resumen transaccion:");
                                System.out.println("Ubicación del asiento: Zona C ");
                                System.out.println("Precio Base: " + precioZonaC + "$" );
                                System.out.println("Descuento Aplicado: No Aplica");                           
                                System.out.println("Precio final: " + precioZonaC + "$");
                                System.out.println("############################");
                                System.out.println("Realizar otra compra [1]");
                                System.out.println("Salir del sistema [0]");
                                continuarCompra = scanner.nextInt();
                                if (continuarCompra == 0){
                                    salir = true;
                                    break; //salir del sistema completo 
                                }else if (continuarCompra == 1){
                                    break;
                                }         
                            } //end while cliente normal no tercera edad ni estudiante                  
                        }//end if edad cliente 
                    }else {
                        System.out.println("Dato ingresado invalido, ingrese un dato que corresponda a lo mostrado en pantalla!");
                    }   
                }//end if op1
                else if (op == 0){
                    salir = true;
                    scanner.close();
                }//end else if op salir del sistema  

                }catch (Exception e){
                    System.out.println("Ingrese una opcion valida...");
                    scanner.next();
                }//end try catch
              
        }//end for  
    }//end main
    
}//end class
