
/*
A simple class to throw customized exception methods
Thomas Fulmer (lost)
tfulmer1@gmail.com
Last modified: 4 Sept 2016
*/

package hasher;

public class MyException extends Exception
{
    public MyException(String exceptionText)
    {
        super(exceptionText);
    }
}
