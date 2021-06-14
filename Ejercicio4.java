package exprogDiciembre1Ev;

public class Ejercicio4 {

	public static void main(String[] args) {
		int [][]m= {
				{1,5,5,2,4},
				{2,1,4,14,3},
				{3,7,11,2,8},
				{4,8,12,16,4},
		};
		System.out.println(max3x3sum(m));
	}

		static Integer max3x3sum(int [][] m) {
			if (m == null || m.length <= 3)
				return null;
			int c = m[0].length;
			if (c <= 3)
				return null;
			for (int i=1; i<m.length; i++)
				if (m[i].length != c)
					return null;
			
			int max = Integer.MIN_VALUE;
			
			for (int i=0; i<=m.length-3; i++)
				for (int j=0; j<=c-3; j++) {
					int resultado = 0;
					for (int k=i; k<i+3; k++)
						for(int l=j; l<j+3; l++)
							resultado += m[k][l];
					if (resultado > max)
						max = resultado;
				}
			return max;
		}
	}
	
