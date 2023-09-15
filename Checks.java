public class Checks{

    public int wordCountCheck(String[] arr) {
        if(arr.length < 6) {
            return -1;
        }
        if(arr.length > 6) {
            return -2;
        }
        return arr.length;
    }

    public boolean isNumeric(String arg) {
        return arg.matches("[0-9]+");
    }

    public boolean isAtphabet(String arg) {
        if(arg.length() > 1) {
            return arg.matches("[a-zA-z]+");
        }
        return false;
    }
    public boolean isDate(String arg) {
        return arg.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}");
    }

    public boolean isFMChar(String arg) {
        return arg.matches("[fm]");    
    }
}