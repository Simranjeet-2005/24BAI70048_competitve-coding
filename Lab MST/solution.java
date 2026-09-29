class solution {
    public static int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums ,target);
        int last=findLast(nums ,target);       
        return new int[]{first, last};
    }
    public static int findFirst(int nums[],int target){     //using binary search
        int left=0;  
        int right=nums.length-1;
        int ans=-1;          // initalising start of range with -1        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;         // target found
                right=mid-1;     // finding start of range from left
            }
            else if(nums[mid]>target){   //searching in left half
                right=mid-1;
            }
            else{         //searching in right half
                left=mid+1;
            }
        }
        return ans;
    }
    public static int findLast(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;             // target found
                left=mid+1;          // finding end of range
            }
            else if(nums[mid]>target){
                right=mid-1;         // searching in left half
            }
            else{
                left=mid+1;          // searching in right half
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        searchRange(nums, target);
    }
}