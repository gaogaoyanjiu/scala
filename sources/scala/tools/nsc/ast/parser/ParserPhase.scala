package scala.tools.nsc.ast.parser;

abstract class ParserPhase(prev: Phase)
	 extends StdPhase(prev)
            with Lexical
	    with Syntactic {
    def name = "parser";
    def apply(unit: global.CompilationUnit): unit = {
      unit.body = new Parser(unit).parse();
    }
}
