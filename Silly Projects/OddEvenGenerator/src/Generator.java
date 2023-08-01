import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Generator
{

    public static void create(int limit) throws FileNotFoundException, UnsupportedEncodingException
    {

        PrintWriter writer = new PrintWriter("Even"+limit+".java", "UTF-8");
        writer.println("public class Even" + limit + "(int num)");
        writer.println("{");
        writer.println("        public boolean isEven(int num)");
        writer.println("        {");
        writer.println("            if(num == 0) return true;");
        boolean even = false;
        for (int i = 1; i <= limit; i++)
        {
            String cond = (even)? "            else if (num == " + i + ") return true;" : "            else if (num == " + i + ") return false;";
            writer.println(cond);
            even = !even;
        }
        writer.println("            else return false;");
        writer.println("        }");
        writer.println("}");
        writer.close();
    }




    public static void main(String[] args)
    {
        try
        {
            create(10000);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
}
