class Solution
{
    public int[] twoSums(int nums[] , int target)
    {
        int i = 0 , j=0;
        for(i=0 ; i<nums.length ; i++)
        {
            for(j = i+1 ; j<nums.length ; j++)
            {
                if(nums[i] + nums[i+1]==target)
                {
                    return new int[]{i,j};
                }
            }
            
        }
        return null;
         
    }
}

class lbpractice
{
    public static void main(String args[])
    {
        int target = 0;

        int nums[] = {2 , 7 , 11 , 15};
        target = 9;

        Solution sobj = new Solution();
        int [] iRet = sobj.twoSums(nums , target);
        
        if(iRet!=null)
        {
            System.out.println(iRet[0]+" ," +iRet[1]);
        }
        else
        {
            System.out.println("No solution");
        }
    }
}