
public class lamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		doit(n);
	}
	
	public static int doit(int n){
		//int a[]={1,1,1,1,1,1,1,1,1,1};//1��������0������
		
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) { 
			a[i] = 1 ;           
		}
		
		int j;
		for(int i=1;i<=n;i++){
			j=i-1;
			while(j<n){
				a[j] = changeState(a[j]);
				j=j+i;
			}
			
			//һ��ͬѧ�����˵ƣ�Ŀǰ�Ƶ�״̬
			for(int k=0;k<n;k++)
			System.out.print(a[k]);
			System.out.println();
		}
		
		int r=0;
		for(int i=0;i<n;i++){
			if(a[i] == 1){
				r++;
			}
		}
		System.out.println("r="+r);
		return r;
	}
	
	public static int changeState(int in){
		if(in == 0) return 1;
		else return 0;
	}

}
  