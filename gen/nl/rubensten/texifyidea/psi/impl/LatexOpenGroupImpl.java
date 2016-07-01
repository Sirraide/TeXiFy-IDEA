// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.psi.impl;

import java.util.List;

import nl.rubensten.texifyidea.psi.LatexContent;
import nl.rubensten.texifyidea.psi.LatexOpenGroup;
import nl.rubensten.texifyidea.psi.LatexVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class LatexOpenGroupImpl extends ASTWrapperPsiElement implements LatexOpenGroup {

  public LatexOpenGroupImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitOpenGroup(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) accept((LatexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LatexContent> getContentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LatexContent.class);
  }

}
