import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {

	public static void main(String [] args) throws Exception{
		ChocoPyLexer lexer = new ChocoPyLexer(CharStreams.fromFileName("input/input.txt"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ChocoPyParser parser = new ChocoPyParser(tokens);
		ParseTree tree = parser.program();

		MyVisitor<Object> loader = new MyVisitor<Object>();
		loader.visit(tree);
	}
}
