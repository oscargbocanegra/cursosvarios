package poo;

public class Punto1 {
	
	public int metodoQueHaceAlgo(int valor){
		if(valor<3){
			return valor;
		}else
			return metodoQueHaceAlgo(valor -1) * metodoQueHaceAlgo(valor -2);
	}
	
	public void dos(){
		
		int arreglo[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arreglo[arreglo[arreglo[5]]]);
	}
	
	public String strangeMethod(){
		int [] list = {8,9,3};
	    int n = list.length;
	    String[] symbol = new String[n];
	    int i,j,aux,left,right,m;
	   
	   
	   
	    for (i=1; i<n; i++)
	    {
	        aux = list[i]; left = 0; right = i-1;
	        while (left <= right)
	        {
	            m = ((left + right)/2);
	            if (aux < list[m])
	            {
	                right = m-1;
	                symbol[i-1] = "-";
	            } else 
	            {
	              left = m+1;
	              symbol[i-1] = "+";
	            }
	        }
	      
	        j = i-1;
	        
	   
	        while (j>= left)
	        {
	            list [j+1] = list [j];
	            j = j-1;
	        }
	      
	        list[left] = aux;
	    }
	   
	   
	    symbol[i-1] = "$";
	   
	    String output = "";
	   
	    for (i = 0; i < n; i++)
	    {
	        output += list[i] + symbol[i];
	    }
	    
	   //String output = "Hola giovanni";
	        
	    return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = 5;
		Punto1 obj = new Punto1();
		//obj.metodoQueHaceAlgo(valor);
		obj.dos();
		String salida = obj.strangeMethod();
       	System.out.println("Resultado " + salida);

		
	}
}
