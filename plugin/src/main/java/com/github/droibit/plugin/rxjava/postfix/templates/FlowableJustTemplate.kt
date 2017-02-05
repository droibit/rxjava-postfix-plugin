package com.github.droibit.plugin.rxjava.postfix.templates

import com.github.droibit.plugin.rxjava.postfix.utils.RxJavaClassName.FLOWABLE
import com.github.droibit.plugin.rxjava.postfix.utils.RxJavaPostfixTemplatesUtils.IS_NON_NULL
import com.github.droibit.plugin.rxjava.postfix.utils.RxJavaPostfixTemplatesUtils.getStaticPrefix
import com.intellij.codeInsight.template.Template
import com.intellij.codeInsight.template.Template.Property.USE_STATIC_IMPORT_IF_POSSIBLE
import com.intellij.codeInsight.template.TemplateManager
import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils.IS_NON_VOID
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils.selectorAllExpressionsWithCurrentOffset
import com.intellij.openapi.util.Conditions.and
import com.intellij.psi.PsiElement

class FlowableJustTemplate : StringBasedPostfixTemplate(
        "fjust",
        "Flowable.just(expr)",
        selectorAllExpressionsWithCurrentOffset(and(IS_NON_NULL, IS_NON_VOID))) {

    override fun createTemplate(manager: TemplateManager, templateString: String): Template {
        return super.createTemplate(manager, templateString).apply {
            isToReformat = shouldReformat()
            setValue(USE_STATIC_IMPORT_IF_POSSIBLE, false)
        }
    }

    override fun getTemplateString(element: PsiElement): String? {
        val fqMethod = getStaticPrefix(FLOWABLE.className, "just", element)
        return "$fqMethod(\$expr\$)\$END\$"
    }
}