/*
 * generated by Xtext 2.24.0
 */
package xtext.magicSHACL.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SimpleAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("xtext/magicSHACL/parser/antlr/internal/InternalSimple.tokens");
	}
}
