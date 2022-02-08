package algorithms;

public class Platforms {

    public static void main(String[] args) {
    
    int arr[] = { 900, 915,920 };
    int dep[] = { 920, 920,925 };
    
    int nPReq =0;
    int maxNPReq = 0;
    int arrCounter =0;
    int depCounter =0;

    while(arrCounter<arr.length){
           if(arr[arrCounter]<dep[depCounter]){
                  nPReq++;
                  arrCounter++;
                  if(maxNPReq<nPReq){
                        maxNPReq = nPReq;
                  }
           }
           else{
                  nPReq--;
                  depCounter++;
           }
    }
    System.out.println(maxNPReq);
    }
}
