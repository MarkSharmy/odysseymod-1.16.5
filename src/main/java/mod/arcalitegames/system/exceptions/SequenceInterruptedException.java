package mod.arcalitegames.system.exceptions;

public class SequenceInterruptedException extends Exception
{

    @Override
    public String getMessage() {
        return this.toString();
    }

    @Override
    public String toString() {
        String str = "";
        str = "Animation Sequence was interrupted.";
        return str;
    }
}
