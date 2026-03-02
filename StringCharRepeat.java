public class StringCharRepeat {
    public static void main(String[] args)
    {
        String str = "racecar";
        int count =0;
        String target = "r";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == target.charAt(0))
            {
                count++;
            }
        }
           System.out.println(count); 
        
    }
}
