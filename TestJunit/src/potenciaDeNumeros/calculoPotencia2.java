package potenciaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class calculoPotencia2 {
	
	public static String potencia(int exp){
	
		if(exp == 0){
			return "0";
		}
		List<Integer> digitos = new ArrayList<Integer>();
		digitos.add(1);
		int size= 1;
		int temp =0;
		int actual = 0;
		
		for(int i = 0; i<exp; i++){
			for(int c = 0; c<size; c++){
				temp = digitos.get(c);
				temp *= 2;
				temp += actual;
				actual = 0;
				
				if(temp > 9){
					temp -= 10;
					actual = 1;
				}
				digitos.set(c, temp);
				
			}
			if(actual == 1){
				digitos.add(actual);
				size++;
				actual = 0;
			}
		}
		String s = "";
		for(int i = digitos.size()-1; i >=0; i++){
			s += digitos.get(i);
		}
		
		return s;	
	}

}
