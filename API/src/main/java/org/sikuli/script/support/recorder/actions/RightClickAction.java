package org.sikuli.script.support.recorder.actions;

import org.sikuli.script.Pattern;
import org.sikuli.script.support.generators.ICodeGenerator;

public class RightClickAction extends ClickAction {

  public RightClickAction(Pattern pattern, String[] modifiers) {
    super(pattern, modifiers);
  }

  @Override
  public String generate(ICodeGenerator generator) {
    return generator.rightClick(getPattern(), getModifiers());
  }
}
