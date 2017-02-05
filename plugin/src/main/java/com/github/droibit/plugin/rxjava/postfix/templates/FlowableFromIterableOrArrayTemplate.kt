package com.github.droibit.plugin.rxjava.postfix.templates

import com.github.droibit.plugin.rxjava.postfix.utils.RxJavaClassName.FLOWABLE
import com.github.droibit.plugin.rxjava.postfix.utils.RxJavaPostfixTemplatesUtils.getStaticPrefix
import com.intellij.codeInsight.template.Template
import com.intellij.codeInsight.template.Template.Property.USE_STATIC_IMPORT_IF_POSSIBLE
import com.intellij.codeInsight.template.TemplateManager
import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils.*
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiExpression

class FlowableFromIterableOrArrayTemplate : StringBasedPostfixTemplate(
        "ffrom",
        "Flowable.fromIterable/Array(expr)",
        selectorTopmost(IS_ITERABLE_OR_ARRAY)) {

    override fun createTemplate(manager: TemplateManager, templateString: String): Template {
        return super.createTemplate(manager, templateString).apply {
            isToReformat = shouldReformat()
            setValue(USE_STATIC_IMPORT_IF_POSSIBLE, false)
        }
    }

    override fun getTemplateString(element: PsiElement): String? {
        if (element !is PsiExpression) {
            return null
        }

        val methodName = if (isArray(element.type)) "fromArray" else "fromIterable"
        val fqMethod = getStaticPrefix(FLOWABLE.className, methodName, element)
        return "$fqMethod(\$expr\$)\$END\$"
    }
}