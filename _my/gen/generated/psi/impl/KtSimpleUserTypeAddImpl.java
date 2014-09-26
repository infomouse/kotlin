// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.KotlinTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class KtSimpleUserTypeAddImpl extends ASTWrapperPsiElement implements KtSimpleUserTypeAdd {

  public KtSimpleUserTypeAddImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KtVisitor) ((KtVisitor)visitor).visitSimpleUserTypeAdd(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KtReferenceExpression getReferenceExpression() {
    return findNotNullChildByClass(KtReferenceExpression.class);
  }

  @Override
  @Nullable
  public KtSimpleUserType getSimpleUserType() {
    return findChildByClass(KtSimpleUserType.class);
  }

  @Override
  @Nullable
  public KtSimpleUserTypeAdd getSimpleUserTypeAdd() {
    return findChildByClass(KtSimpleUserTypeAdd.class);
  }

  @Override
  @Nullable
  public KtTypeArgumentList getTypeArgumentList() {
    return findChildByClass(KtTypeArgumentList.class);
  }

}
