public class{

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
                int median = 0;

                  /*
                   Check if the sorted list size is odd or even
                 */
                if(sortingList.size()%2 == 0){
                     median = (sortingList.get(sortingList.size()/2) + sortingList.get((sortingList.size()/2) + 1) )/2;
                }else{
                    System.out.println(" -- Not Even");
                    median = sortingList.get(sortingList.size()/2);
                }
                 result.add(Double.parseDouble(String.valueOf(median)));
                System.out.println(sortingList.size() +" -- SortedListSize");
                System.out.println(median +" -- Median");

            }
            System.out.println("/////");
            currentArraylength --;
            counter++;
        }
        double[] myArray = new double[result.size()];
        result.toArray(new double[][]{myArray});
        return myArray;
        
    }

}