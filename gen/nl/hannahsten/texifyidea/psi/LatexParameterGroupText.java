// This is a generated file. Not intended for manual editing.
package nl.hannahsten.texifyidea.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface LatexParameterGroupText extends PsiNameIdentifierOwner {

  @NotNull
  List<LatexContent> getContentList();

  PsiElement getNameIdentifier();

  String getName();

  PsiElement setName(String name);

}