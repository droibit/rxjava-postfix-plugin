package com.github.droibit.plugin.rxjava.postfix.utils

import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils
import com.intellij.openapi.util.Condition
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiExpression
import com.github.droibit.plugin.rxjava.postfix.utils.ImportUtils.hasImportStatic



object RxJavaPostfixTemplatesUtils {

    @JvmField
    val IS_ITERABLE: Condition<PsiElement> = Condition { element ->
        if (element is PsiExpression)
            JavaPostfixTemplatesUtils.isIterable(element.type)
        else
            false
    }

    fun getStaticPrefix(fqClassName: String, methodName: String, context: PsiElement): String {
        return if (hasImportStatic(fqClassName, methodName, context)) methodName else fqClassName + "." + methodName
    }
}
