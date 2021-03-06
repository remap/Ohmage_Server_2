//
// Generated by JTB 1.3.2
//

package org.ohmage.config.grammar.visitor;
import org.ohmage.config.grammar.syntaxtree.Condition;
import org.ohmage.config.grammar.syntaxtree.Conjunction;
import org.ohmage.config.grammar.syntaxtree.Expr;
import org.ohmage.config.grammar.syntaxtree.Id;
import org.ohmage.config.grammar.syntaxtree.NodeList;
import org.ohmage.config.grammar.syntaxtree.NodeListOptional;
import org.ohmage.config.grammar.syntaxtree.NodeOptional;
import org.ohmage.config.grammar.syntaxtree.NodeSequence;
import org.ohmage.config.grammar.syntaxtree.NodeToken;
import org.ohmage.config.grammar.syntaxtree.Sentence;
import org.ohmage.config.grammar.syntaxtree.SentencePrime;
import org.ohmage.config.grammar.syntaxtree.Start;
import org.ohmage.config.grammar.syntaxtree.Value;

/**
 * All GJ void visitors must implement this interface.
 */

public interface GJVoidVisitor<A> {

	//
	// GJ void Auto class visitors
	//

	public void visit(NodeList n, A argu);
	public void visit(NodeListOptional n, A argu);
	public void visit(NodeOptional n, A argu);
	public void visit(NodeSequence n, A argu);
	public void visit(NodeToken n, A argu);

	//
	// User-generated visitor methods below
	//
	
	/**
	 * f0 -> Sentence()
	 * f1 -> <EOF>
	 */
	public void visit(Start n, A argu);
	
	/**
	 * f0 -> Expr() SentencePrime()
	 *       | "(" Sentence() ")" SentencePrime()
	 */
	public void visit(Sentence n, A argu);

	/**
	 * f0 -> ( Conjunction() Sentence() SentencePrime() )?
	 */
	public void visit(SentencePrime n, A argu);

	/**
	 * f0 -> Id()
	 * f1 -> Condition()
	 * f2 -> Value()
	 */
	public void visit(Expr n, A argu);

	/**
	 * f0 -> <TEXT>
	 */
	public void visit(Id n, A argu);

	/**
	 * f0 -> "=="
	 *       | "!="
	 *       | "<"
	 *       | ">"
	 *       | "<="
	 *       | ">="
	 */
	public void visit(Condition n, A argu);

	/**
	 * f0 -> <TEXT>
	 */
	public void visit(Value n, A argu);

	/**
	 * f0 -> "and"
	 *       | "or"
	 */
	public void visit(Conjunction n, A argu);
}