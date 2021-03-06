package com.github.vlsi.mat.calcite.editor;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import java.util.ArrayList;
import java.util.List;

public class StringScanner extends RuleBasedScanner {
  public StringScanner() {
    List<IRule> rules = new ArrayList<>();

    Token stringToken = new Token(new TextAttribute(new Color(
        Display.getCurrent(), new RGB(42, 0, 255))));
    rules.add(new SingleLineRule("'", "'", stringToken));
    rules.add(new SingleLineRule("\"", "\"", stringToken));

    setRules(rules.toArray(new IRule[0]));
  }
}
