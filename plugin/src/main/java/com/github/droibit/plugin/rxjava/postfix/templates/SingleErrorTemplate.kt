package com.github.droibit.plugin.rxjava.postfix.templates

import com.github.droibit.plugin.rxjava.postfix.utils.RxJavaClassName.SINGLE
import com.github.droibit.plugin.rxjava.postfix.utils.RxJavaPostfixTemplatesUtils.getStaticPrefix
import com.intellij.codeInsight.template.Template
import com.intellij.codeInsight.template.Template.Property.USE_STATIC_IMPORT_IF_POSSIBLE
import com.intellij.codeInsight.template.TemplateManager
import com.intellij.codeInsight.template.postfix.templates.StringBasedPostfixTemplate
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils.IS_THROWABLE
import com.intellij.codeInsight.template.postfix.util.JavaPostfixTemplatesUtils.selectorTopmost
import com.intellij.psi.PsiElement

class SingleErrorTemplate : StringBasedPostfixTemplate(
        "serror",
        "Single.error(expr)",
        selectorTopmost(IS_THROWABLE)) {

    override fun createTemplate(manager: TemplateManager, templateString: String): Template {
        return super.createTemplate(manager, templateString).apply {
            isToReformat = shouldReformat()
            setValue(USE_STATIC_IMPORT_IF_POSSIBLE, false)
        }
    }

    override fun getTemplateString(element: PsiElement): String? {
        val fqMethod = getStaticPrefix(SINGLE.className, "error", element)
        return "$fqMethod(\$expr\$)\$END\$"
    }
}