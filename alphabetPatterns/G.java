public class G {
    
    
        public static void main(String[] args) {
            int n = 10; //valid only for n =10
            for(int i = 0; i< n;i++){
                for (int j = 0; j<n ;j++){
                    if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<=((n-1)/2)+1 || i==n-1 && j>0 && j<=((n-1)/2)-2 || j==((n-1)/2)+1 && i>(n-1)/2  || j==((n-1)/2)-1 && i>(n-1)/2 || i==(n-1)/2 && j>1 && j<=((n-1)/2)+1){
                    System.out.print("*");
                    }
                    else 
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    





