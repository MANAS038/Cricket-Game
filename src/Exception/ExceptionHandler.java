package Exception;

import java.io.IOException;

public class ExceptionHandler {
    public static IOException checker(String S)
    {
        try{
            if(S.length()>1 || S.length()==0)
                return new IOException();
            if(Integer.parseInt(S)>2)
                return new IOException();
        } catch (NumberFormatException e) {
           System.out.println(e.getStackTrace());
        }
        return null;
    }


}
