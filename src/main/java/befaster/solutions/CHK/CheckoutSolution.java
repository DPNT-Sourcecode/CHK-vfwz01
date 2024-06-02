package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
        private static final Map<Character, int[]> specialOffers = new HashMap<>();
        private static final Map<Character, Integer> prices = new HashMap<>();

        static{
            //prices
            prices.put('A', 50);
            prices.put('B', 30);
            prices.put('C', 20);
            prices.put('D', 15);

            specialOffers.put('A', new int[]{3,130});
            specialOffers.put('B', new int[]{2,45});
        }



    public Integer checkout(String skus) {
        //   throw new SolutionNotImplementedException();
        if(skus == null || skus.isEmpty()){
            return 0;
        }
        Map<Character, Integer> itemConter = new HashMap<>();
        for(char sku: skus.toCharArray()){
            if(!prices.containsKey(sku)){
                return -1;
            }
            itemConter.put(sku,itemConter.getOrDefault(sku,0)+1);
        }
        return 0;
    }

}


