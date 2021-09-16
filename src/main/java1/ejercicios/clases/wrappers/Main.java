package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte
		// primitivo
		byte datoByte = 2;
		// Wrapper
		Byte datoByteWrapper = 3;
		System.out.println("primitivo: " + datoByte);
		System.out.println("Wrapper: " + datoByteWrapper);
		// Conversiones
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("Byte convertido: " + datoConvertido);
		// Conversiones 2
		Byte datoConvertido2 = 6;
		byte datoByte2 = datoConvertido2.byteValue();
		System.out.println("byte convertido: " + datoByte2);

		// short
		// primitivo
		short datoShort = 1;
		// Wrapper
		Short datoShortWrapper = 1;
		System.out.println("primitivo: " + datoShort);
		System.out.println("Wrapper: " + datoShortWrapper);
		// Conversiones
		short datoShort1 = 4;
		Short shortConvertido = datoShort1;
		System.out.println("Short convertido: " + shortConvertido);
		// Conversiones 2
		Short shortConvertido2 = 4;
		short datoShort2 = shortConvertido2.shortValue();
		System.out.println("short convertido: " + datoShort2);

		// int
		// primitivo
		int edad = 45;
		// Wrapper
		Integer edadWrapper = 48;
		System.out.println("primitivo: " + edad);
		System.out.println("Wrapper: " + edadWrapper);
		// Conversiones
		int edad1 = 45;
		Integer integerConvertido = edad1;
		System.out.println("Integer convertido: " + integerConvertido);
		// Conversiones 2
		Integer integerConvertido2 = 23;
		int edad2 = integerConvertido2.intValue();
		System.out.println("int convertido: " + edad2);

		// long
		// primitivo
		long valorGrande = 12345L;
		// Wrapper
		Long valorGrandeWrapper = 123654L;
		System.out.println("primitivo: " + valorGrande);
		System.out.println("Wrapper: " + valorGrandeWrapper);
		// Conversiones
		long valorGrande1 = 123456L;
		Long valorConvertido = valorGrande1;
		System.out.println("Long convertido: " + valorConvertido);
		// Conversiones 2
		Long valorConvertido2 = 123456L;
		long valorGrande2 = valorConvertido2.longValue();
		System.out.println("long convertido: " + valorGrande2);

		// boolean
		// primitivo
		boolean resultado = true;
		// Wrapper
		Boolean resultadoWrapper = true;
		System.out.println("primitivo: " + resultado);
		System.out.println("Wrapper: " + resultadoWrapper);
		// Conversiones
		boolean resultado1 = true;
		Boolean resultadoConvertido = resultado1;
		System.out.println("Boolean convertido: " + resultadoConvertido);
		// Conversiones 2
		Boolean resultadoConvertido2 = false;
		boolean resultado2 = resultadoConvertido2.booleanValue();
		System.out.println("boolean convertido: " + resultado2);

		// float
		// primitivo
		float decimal = 45.10F;
		// Wrapper
		Float decimalWrapper = 50.05F;
		System.out.println("primitivo: " + decimal);
		System.out.println("Wrapper: " + decimalWrapper);
		// Conversiones
		float decimal1 = 10.25F;
		Float decimalConvertido = decimal1;
		System.out.println("Float convertido: " + decimalConvertido);
		// Conversiones 2
		Float decimalConvertido2 = 70.15F;
		float decimal2 = decimalConvertido2.floatValue();
		System.out.println("float convertido: " + decimal2);

		// double
		// primitivo
		double sueldo = 500.052;
		// Wrapper
		Double sueldoWrapper = 1000.020;
		System.out.println("primitivo: " + sueldo);
		System.out.println("Wrapper: " + sueldoWrapper);
		// Conversiones
		double sueldo1 = 1000.405;
		Double sueldoConvertido = sueldo1;
		System.out.println("Double convertido: " + sueldoConvertido);
		// Conversiones 2
		Double sueldoConvertido2 = 4000.502;
		double sueldo2 = sueldoConvertido2.doubleValue();
		System.out.println("double convertido: " + sueldo2);

		// char
		// primitivo
		char abecedario = 'A';
		// Wrapper
		Character abecedarioWrapper = 'Z';
		System.out.println("primitivo: " + abecedario);
		System.out.println("Wrapper: " + abecedarioWrapper);
		// Conversiones
		char abc1 = 'o';
		Character abcConvertido = abc1;
		System.out.println("Character convertido: " + abcConvertido);
		// Conversiones 2
		Character abcConvertido2 = 'p';
		char abc2 = abcConvertido2.charValue();
		System.out.println("char convertido: " + abc2);

	}

}
