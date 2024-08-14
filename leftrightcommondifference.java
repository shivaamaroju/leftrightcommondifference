class Main{
    public static void main(String[] args) {
        int a[] = {1, 2,3,4};
        int n = a.length;
        int b[]=new int[n+1];
        int sum=0;
        for(int i=0;i<a.length;i++){
            b[i]=sum;
            sum=sum+a[i];

        }
        b[n]=sum;
        for(var s:b){
            System.out.print(s+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            a[i]=b[i]-(b[b.length-1]-b[i+1]);
        }
        for(var s: a){
         System.out.print(Math.abs(s)+" ");
        }
    
    
    
    }
