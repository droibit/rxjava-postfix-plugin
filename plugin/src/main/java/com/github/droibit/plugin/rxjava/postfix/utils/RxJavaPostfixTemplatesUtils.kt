package com.github.droibit.plugin.rxjava.postfix.utils

import com.github.droibit.plugin.rxjava.postfix.utils.ImportUtils.hasImportStatic
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils.isNonVoid
import com.intellij.openapi.util.Condition
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiExpression
import com.intellij.psi.PsiType
import org.jetbrains.annotations.Contract


object RxJavaPostfixTemplatesUtils {

    @JvmField
    val IS_NON_NULL: Condition<PsiElement> = Condition { element ->
        element is PsiExpression && isNonNull(element.type)
    }

    fun getStaticPrefix(fqClassName: String, methodName: String, context: PsiElement): String {
        return if (hasImportStatic(fqClassName, methodName, context)) methodName else fqClassName + "." + methodName
    }

    @Contract("null -> false")
    fun isNonNull(type: PsiType?): Boolean {
        return type != null && PsiType.NULL != type
    }
}
