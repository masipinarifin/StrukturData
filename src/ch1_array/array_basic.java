package ch1_array;

/**
 *
 * @author nurularifin 19MI0016
 */
public class array_basic {
    public static void main(String[] args){
        int[] arr = new int[100];
        int nElems = 0;
        
        //Operasi Insert pada array
        arr[0] = 77;
        nElems++;
        arr[1] = 99;
        nElems++;
        arr[2] = 44;
        nElems++;
        arr[3] = 55;
        nElems++;
        arr[4] = 22;
        nElems++;
        
        //Display elemens
        for(int j=0; j<nElems; j++){
            System.out.print(arr[j]+" ");
        }
        
        System.out.println("");
        
        //Linier search
        //Sequential Search
        int searchKey = 56;
        boolean found = false;
        for(int j=0; j<nElems; j++){
            if(arr[j] == searchKey){
                found = true;
                break;
            }
            
        }            
            if(found)
                System.out.println(searchKey + " Found !!");
            else
                System.out.println(searchKey + " Not Found :(");
            
            int deleteKey = 99;
            int j;
            for(j=0; j<nElems; j++){
                if(arr[j] == deleteKey)
                    break;
            }
                for(int k=j; k<nElems-1; k++)
                    arr[k] = arr[k+1];
       
                nElems--;
                
                //Display Elemens
                for(j=0; j<nElems; j++){
                    System.out.print(arr[j]+" ");
                }
    }
}
