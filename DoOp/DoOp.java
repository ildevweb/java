package DoOp;

public class DoOp {
    public static String operate(String[] args) {
        int result;

        if (args.length == 0) {
            return "it depend on the input.";
        }
        
        int first_part = Integer.parseInt(args[0]);
        int second_part = Integer.parseInt(args[2]);

        if (args[1] == "+") {
            result = first_part+second_part;
        } else if (args[1] == "-") {
            result = first_part-second_part;
        } else if (args[1] == "*") {
            result = first_part*second_part;
        } else if (args[1] == "/") {
            if (second_part == 0) {
                return "Error";
            }
            result = first_part/second_part;
        } else if (args[1] == "%") {
            if (second_part == 0) {
                return "Error";
            }
            result = first_part%second_part;
        } else {
            result = 0;
        }


        return String.valueOf(result);

    }
}