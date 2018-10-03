package JieZhang;

public class JZhangLib {
    public static String dateStr(String input)
    {
        int i = 0;
        String output = "";

        while( i < input.length() )

        {
            if (!(input.substring(i,i+1).equals("/")))
            {
                output = output + input.substring(i,i+1);
                i++;
            }
            else
            {
                i++;
            }

        }
        return output;
    }
}

