import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {

	public static void main(String [] args) throws Exception{
		GrogtalkLexer lexer = new GrogtalkLexer(CharStreams.fromFileName("input/input.txt"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GrogtalkParser parser = new GrogtalkParser(tokens);
		ParseTree tree = parser.creature();

		MyVisitor<Object> loader = new MyVisitor<Object>();
		loader.visit(tree);
	}
}
