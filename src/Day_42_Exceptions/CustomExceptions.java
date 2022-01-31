package Day_42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(){
        super("Time to short break");
    }
public FadyException(String message){
  super(message);
}
}

class NoBreakException extends Exception{
    public  NoBreakException(){}
}

public class CustomExceptions {

    public static void main(String[] args) {

        throw new FadyException("It's time for lunch break");

      /*  try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
        ...
       */
    }

}