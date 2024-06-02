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
            prices.put('E', 40);
            specialOffers.put('A', new int[]{3,130});
            specialOffers.put('A', new int[]{5,200});
            specialOffers.put('B', new int[]{2,45});

            specialOffers.put('E', new int[]{2,80});
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
        int total =0;
        int eCount = itemConter.getOrDefault('E',0);
        int bCount = itemConter.getOrDefault('B',0);

        if(eCount>=2 ){
            int freeBCount = Math.min(eCount/2,bCount);
            itemConter.put('B',bCount-freeBCount);
        }
        for(Map.Entry<Character,Integer> entry: itemConter.entrySet()){
            char sku = entry.getKey();
            int count = entry.getValue();

            if(specialOffers.containsKey(sku)){
                int[] offer = specialOffers.get(sku);
                int offerCount = offer[0];
                int offerPrice = offer[1];

                while(count>=offerCount){
                    total += offerPrice;
                    count -=offerCount;

                }
//                total += (count/offerCount)*offerPrice;
//                total += (count%offerCount)*prices.get(sku);
            }
            total += count*prices.get(sku);

        }

        return total;
    }

}

