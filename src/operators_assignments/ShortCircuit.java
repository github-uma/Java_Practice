package operators_assignments;

public class ShortCircuit {

	public static void main(String[] args) {
		// Since first operand is false
        // and operator is &&,
        // Evaluation stops and
        // false is returned.
        if (false && true && true) {
            System.out.println("&&::This output will not be printed");
        }
        else {
 
            System.out.println("&&::This output got printed actually due to short circuit");
        }
 
        // Whole expression will be evaluated,
        // as no false is encountered
        // before last condition
        // Therefore no Short circuit
        if (true && true && true) {
            System.out.println("&&::This output gets print as there will be no Short circuit");
        }
        else {
 
            System.out.println("&&::This output will not be printed");
        }
     // Since first operand is true
        // and operator is ||,
        // Evaluation stops and
        // true is returned.
        if (true || false || false) {
            System.out.println("||::This output got printed actually due to short circuit");
        }
        else {
            System.out.println("||::This output will not be printed");
        }
 
        // Whole expression will be evaluated,
        // as no true is encountered
        // before last condition
        // Therefore no Short circuit
        if (false || false || true) {
            System.out.println("||::This output gets print as there will be no Short circuit");
        }
        else {
 
            System.out.println("||::This output will not be printed");
        }
	}

}
