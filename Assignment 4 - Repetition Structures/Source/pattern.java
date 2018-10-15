public class pattern
{
    public static void whittle(int[] pattern)
    {
        if(pattern.length > 0)
                printRightJustify(pattern);
        Arrays.copyOf(pattern, pattern.length-1);
        whittle(pattern);
    }

    public static void printRightJustify(int[] pattern)
    {
        for(i = 0; i < pattern.length; i++){
            if(i == 0)
                System.out.print
        }
    }

    public static void main(String[] args)
    {
        int pattern[6] = {1, 2, 3, 4, 5, 6};
        whittle(pattern);
    }
}