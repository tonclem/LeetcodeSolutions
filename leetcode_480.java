class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        
        int currentArraylength = nums.length;
        int counter = 0;
        List<Double> result = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            /*
            Check if the length of the array is greater the target k
             */
            if(currentArraylength >= k){

                /*
                    Add the elements into a list and sort it
                 */
                List<Integer> sortingList = new ArrayList<>();
                for(int j = counter; j<counter + k; j++){
                    System.out.println(nums[j] +" -- ");
                    sortingList.add(nums[j]);
                }
                Collections.sort(sortingList);
                double median = 0;

                  /*
                   Check if the sorted list size is odd or even
                 */
                if(sortingList.size()%2 == 0){
                      System.out.println(sortingList.get((sortingList.size()/2)-1) +" -- Letter");
                 int mid = sortingList.size()/2;
                    double mid1 = sortingList.get(mid-1);
                    double mid2 = sortingList.get(mid);
                    median = (mid1 + mid2)/2.0;
                }else{
                    System.out.println(" -- Not Even");
                    median = sortingList.get(sortingList.size()/2);
                }
                
                double res = median;
                result.add(res);
                
                System.out.println(sortingList.size() +" -- SortedListSize");
                System.out.println(median +" -- Median");

            }
            System.out.println("/////");
            currentArraylength --;
            counter++;
        }
        
         double[] myArray = new double[result.size()];
        for(int i = 0; i < result.size(); i++) myArray[i] = result.get(i);
        return myArray;
        
    }
}