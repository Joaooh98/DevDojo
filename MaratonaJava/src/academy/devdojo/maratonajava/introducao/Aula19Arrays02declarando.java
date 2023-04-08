package academy.devdojo.maratonajava.introducao;

public class Aula19Arrays02declarando {
	// char ch; // no initialization
	public static void main(String[] args) {
		// INICIALIZADO OS VALORES DA VARIAVEL
		// char valorinicializadochar = char.Min_value
		System.out.println("Tipos de dados em Java: \n" +
				"\n Menor Byte: " + Byte.MIN_VALUE +
				"\n Maior Byte: " + Byte.MAX_VALUE +
				"\n Menor Short Int: " + Short.MIN_VALUE +
				"\n Maior Short Int: " + Short.MAX_VALUE +
				"\n Menor Int: " + Integer.MIN_VALUE +
				"\n Maior Int: " + Integer.MAX_VALUE +
				"\n Menor Long: " + Long.MIN_VALUE +
				"\n Maior Long: " + Long.MAX_VALUE +
				"\n Menor Float: " + Float.MIN_VALUE +
				"\n Maior Float: " + Float.MAX_VALUE +
				"\n Menor Double: " + Double.MIN_VALUE +
				"\n Maior Double: " + Double.MAX_VALUE);
		System.out.println("\n-------------------------------------------------------------");
		System.out.println(" tipo char" +
				"\n Em Java, uma variável do tipo char pode armazenar um único caractere de 16 bits\n Que pode ser representado por um valor numérico na faixa de 0 a 65.535.\nSegue exemplo abaixo\n"
				+ "\n Menor char : " + "'\u0000'" +
				"\n Maior chat : " + '~');

		System.out.println("\n--------------------------------------------------------------");
		System.out.println(" TIPO String \n Menor String: " + null +
				"\n Maximo String:  2.147.483.647 caracteres. ");

				System.out.println("\n------------declarando o array----byte--------\n");

		byte[] idadebyte = new byte[4];

		idadebyte[0] = Byte.MIN_VALUE;
		idadebyte[1] = Byte.MAX_VALUE;
		idadebyte[2] = Byte.MIN_VALUE;
		idadebyte[3] = Byte.MAX_VALUE;

		System.out.println("Menor Byte:" + idadebyte[0]);
		System.out.println("Maior Byte:" + idadebyte[1]);
		System.out.println("Menor Byte:" + idadebyte[2]);
		System.out.println("Maior Byte:" + idadebyte[3]);
		System.out.println(idadebyte.length);

				System.out.println("\n------------declarando o array----short--------\n");

		short[] idadeshort = new short[4];

		idadeshort[0] = Short.MIN_VALUE;
		idadeshort[1] = Short.MAX_VALUE;
		idadeshort[2] = Short.MIN_VALUE;
		idadeshort[3] = Short.MAX_VALUE;

			System.out.println("Menor short:" + idadeshort[0]);
			System.out.println("Maior short:" + idadeshort[1]);
			System.out.println("Menor short:" + idadeshort[2]);
			System.out.println("Maior short:" + idadeshort[3]);
			System.out.println(idadeshort.length);

				System.out.println("\n------------declarando o array-----int-------\n");

		int[] idadeint = new int[4];

		idadeint[0] = Integer.MIN_VALUE;
		idadeint[1] = Integer.MAX_VALUE;
		idadeint[2] = Integer.MIN_VALUE;
		idadeint[3] = Integer.MAX_VALUE;

			System.out.println("Menor int:" + idadeint[0]);
			System.out.println("Maior int:" + idadeint[1]);
			System.out.println("Menor int:" + idadeint[2]);
			System.out.println("Maior int:" + idadeint[3]);
			System.out.println(idadeint.length);

				System.out.println("\n------------declarando o array-----long-------\n");

		long[] idadelong = new long[4];

		idadelong[0] = Long.MIN_VALUE;
		idadelong[1] = Long.MAX_VALUE;
		idadelong[2] = Long.MIN_VALUE;
		idadelong[3] = Long.MAX_VALUE;

			System.out.println("Menor long:" + idadelong[0]);
			System.out.println("Maior long:" + idadelong[1]);
			System.out.println("Menor long:" + idadelong[2]);
			System.out.println("Maior long:" + idadelong[3]);
			System.out.println(idadelong.length);

				System.out.println("\n------------declarando o array-----float-------\n");

		float[] idadefloat = new float[4];

		idadefloat[0] = Float.MIN_VALUE;
		idadefloat[1] = Float.MAX_VALUE;
		idadefloat[2] = Float.MIN_VALUE;
		idadefloat[3] = Float.MAX_VALUE;

			System.out.println("Menor float:" + idadefloat[0]);
			System.out.println("Maior float:" + idadefloat[1]);
			System.out.println("Menor float:" + idadefloat[2]);
			System.out.println("Maior float:" + idadefloat[3]);
			System.out.println(idadefloat.length);

				System.out.println("\n------------declarando o array-----double------\n");

		double[] idadedouble = new double[4];

		idadedouble[0] = Double.MIN_VALUE;
		idadedouble[1] = Double.MAX_VALUE;
		idadedouble[2] = Double.MIN_VALUE;
		idadedouble[3] = Double.MAX_VALUE;

			System.out.println("Menor double:" + idadedouble[0]);
			System.out.println("Maior double:" + idadedouble[1]);
			System.out.println("Menor double:" + idadedouble[2]);
			System.out.println("Maior double:" + idadedouble[3]);
			System.out.println(idadedouble.length);

				System.out.println("\n----------------declarando--Array----String----------\n");
		
		String[] nomes = new String[4];

		nomes[0] = "joao";
		nomes[1] = "mayety";
		nomes[2] = "joao pai";
		nomes[3] = "lucas";

			System.out.println(nomes[0]);
			System.out.println(nomes[1]);
			System.out.println(nomes[2]);
			System.out.println(nomes[3]);
			System.out.println(nomes.length);

				System.out.println("\n----------------declarando--Array----char-------------\n");

		char[] caracter = new char[4];

		caracter[0] = '+';
		caracter[1] = '-';
		caracter[2] = ' ';
		caracter[3] = '$';

			System.out.println(caracter[0]);
			System.out.println(caracter[1]);
			System.out.println(caracter[2]);
			System.out.println(caracter[3]);
			System.out.println(caracter.length);

	}
}
