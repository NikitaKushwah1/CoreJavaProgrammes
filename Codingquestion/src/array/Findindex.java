package array;

public class Findindex {
	public int index(int a[] ,int e) {
		for(int i = 0;i<a.length;i++) {
			if(a[i]== e)
				return i ;
		}
		return -1;
		
	}

}
