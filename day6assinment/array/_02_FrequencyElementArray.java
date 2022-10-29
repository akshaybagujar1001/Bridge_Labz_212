package bzday6logicalProgramming.arrayproblem;

public class _02_FrequencyElementArray {
    public static void main(String[] args) {

        int a[] = {2,4,6,2,6,6,3,6};
        int[] visitorArr = new int[a.length];
        int visited=1;

        for (int i = 0; i < a.length; i++) {
            int count = -1;

            for (int j = i+1; j > a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                    visitorArr[j]= visited;

                }
            }

            if(visitorArr[i]!=visited){
                visitorArr[i]=count;

            }
        }

        for(int i =0; i<visitorArr.length;i++){
            if (visitorArr[i]!=visited){

                System.out.println("Frequency of "+ a[i] + " : "+ visitorArr[i]);

            }
        }
    }
}