import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) throws Exception {
       
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(8);

        System.out.println(sum(numbers));

    }

    
    public static int sum(ArrayList<Integer> numbers) {
        int totalSum=0;
        for(int i=0;i<numbers.size();i++){

           totalSum= totalSum + numbers.get(i);   
        }
        
        return totalSum;

    }


    

}
