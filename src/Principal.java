import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversor convertir = new Conversor();
        int opcion=0;
        double cantidad=0;
        String menu= """
                    
                    \t\t***CONVERSOR DE MONEDAS***
                    ************************************************
                    Digite el numero de la opcion que desea ejecutar
                    Nuestras monedas principales
                    
                    1. Dólar =>> Peso Argentino
                    2. Peso Argentino =>> Dólar
                    3. Dólar =>> Real Brasileño
                    4. Real Brasileño =>> Dólar
                    5. Dólar =>> Peso Colombiano
                    6. Peso Colombiano =>> Dólar
                    7. Otro tipo de cambio
                    8. Salir
                    ************************************************
                    """;
        while (opcion != 8){
            System.out.println(menu);
            try{
                opcion = Integer.valueOf(sc.nextLine());
                switch(opcion){
                    case 1:
                        System.out.println("Digite el monto a convertir");
                        cantidad = Double.valueOf(sc.nextLine());
                        ConversosRecord conversorUsdArs = convertir.conexionConversion("USD","ARS", cantidad);
                        System.out.println("Moneda Base: \t\t\t"+conversorUsdArs.base_code());
                        System.out.println("Moneda A Convertir: \t"+conversorUsdArs.target_code());
                        System.out.println("Cantidad Convertida: \t"+conversorUsdArs.conversion_result());
                        convertir.setTotalConvertido(conversorUsdArs);
                        convertir.registrarConversion("USD","ARS",cantidad);
                        System.out.println("******************************");
                        break;

                    case 2:
                        System.out.println("Digite el monto a convertir");
                        cantidad = Double.valueOf(sc.nextLine());
                        ConversosRecord conversorArsUsd = convertir.conexionConversion("ARS","USD", cantidad);
                        System.out.println("Moneda Base: \t\t\t"+conversorArsUsd.base_code());
                        System.out.println("Moneda A Convertir: \t"+conversorArsUsd.target_code());
                        System.out.println("Cantidad Convertida: \t"+conversorArsUsd.conversion_result());
                        convertir.setTotalConvertido(conversorArsUsd);
                        convertir.registrarConversion("ARS","USD",cantidad);
                        System.out.println("******************************");
                        break;
                    case 3:
                        System.out.println("Digite el monto a convertir");
                        cantidad = Double.valueOf(sc.nextLine());
                        ConversosRecord conversorUsdBrl = convertir.conexionConversion("USD","BRL", cantidad);
                        System.out.println("Moneda Base: \t\t\t"+conversorUsdBrl.base_code());
                        System.out.println("Moneda A Convertir: \t"+conversorUsdBrl.target_code());
                        System.out.println("Cantidad Convertida: \t"+conversorUsdBrl.conversion_result());
                        convertir.setTotalConvertido(conversorUsdBrl);
                        convertir.registrarConversion("USD","BRL",cantidad);
                        System.out.println("******************************");
                        break;

                    case 4:
                        System.out.println("Digite el monto a convertir");
                        cantidad = Double.valueOf(sc.nextLine());
                        ConversosRecord conversorBrlUsd = convertir.conexionConversion("BRL","USD", cantidad);
                        System.out.println("Moneda Base: \t\t\t"+conversorBrlUsd.base_code());
                        System.out.println("Moneda A Convertir: \t"+conversorBrlUsd.target_code());
                        System.out.println("Cantidad Convertida: \t"+conversorBrlUsd.conversion_result());
                        convertir.setTotalConvertido(conversorBrlUsd);
                        convertir.registrarConversion("BRL","USD",cantidad);
                        System.out.println("******************************");
                        break;

                    case 5:
                        System.out.println("Digite el monto a convertir");
                        cantidad = Double.valueOf(sc.nextLine());
                        ConversosRecord conversorUsdCop = convertir.conexionConversion("USD","COP", cantidad);
                        System.out.println("Moneda Base: \t\t\t"+conversorUsdCop.base_code());
                        System.out.println("Moneda A Convertir: \t"+conversorUsdCop.target_code());
                        System.out.println("Cantidad Convertida: \t"+conversorUsdCop.conversion_result());
                        convertir.setTotalConvertido(conversorUsdCop);
                        convertir.registrarConversion("USD","COP",cantidad);
                        System.out.println("******************************");
                        break;

                    case 6:
                        System.out.println("Digite el monto a convertir");
                        cantidad = Double.valueOf(sc.nextLine());
                        ConversosRecord conversorCopUsd = convertir.conexionConversion("COP","USD", cantidad);
                        System.out.println("Moneda Base: \t\t\t"+conversorCopUsd.base_code());
                        System.out.println("Moneda A Convertir: \t"+conversorCopUsd.target_code());
                        System.out.println("Cantidad Convertida: \t"+conversorCopUsd.conversion_result());
                        convertir.setTotalConvertido(conversorCopUsd);
                        convertir.registrarConversion("COP","USD",cantidad);
                        System.out.println("******************************");
                        break;

                    case 7:
                        System.out.println("Ingrese la divisa base en formato ISO 4217 (COP)");
                        String divisaBase = sc.nextLine().toUpperCase();

                        System.out.println("Ingrese la divisa a la cual quiere conocer la conversion\n" +
                                " en formato ISO 4217 (USD)");
                        String divisaTarget = sc.nextLine().toUpperCase();
                        System.out.println("Digite el monto a convertir");
                        cantidad = Double.valueOf(sc.nextLine());
                        ConversosRecord conversorGeneral = convertir.conexionConversion(divisaBase,divisaTarget, cantidad);
                        System.out.println("Moneda Base: \t\t\t"+conversorGeneral.base_code());
                        System.out.println("Moneda A Convertir: \t"+conversorGeneral.target_code());
                        System.out.println("Cantidad Convertida: \t"+conversorGeneral.conversion_result());
                        convertir.setTotalConvertido(conversorGeneral);
                        convertir.registrarConversion(divisaBase,divisaTarget,cantidad);
                        System.out.println("******************************");
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;

                    case 8:
                        System.out.println("GRACIAS POR UTILIZAR NUESTROS SERVICIOS" +
                                "\n\t**HASTA LA PROXIMA**");
                        break;

                }
            }catch (NumberFormatException e){
                System.out.println("Entrada no valida por favor ingrese un numero entero");
            }

        }
        System.out.println("************************************************************************************" +
                "\n\t\t\t\t**SUS MOVIMIENTOS FUERON**\n");
        System.out.println(convertir.toString()+"" +
                "\n************************************************************************************");

    }
}
