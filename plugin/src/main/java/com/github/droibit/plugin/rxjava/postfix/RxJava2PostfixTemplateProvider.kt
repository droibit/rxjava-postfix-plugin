package com.github.droibit.plugin.rxjava.postfix

import com.github.droibit.plugin.rxjava.postfix.templates.ObservableFromIterableTemplate
import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider

class RxJava2PostfixTemplateProvider : JavaPostfixTemplateProvider() {

    private val templates = hashSetOf(
            ObservableFromIterableTemplate()
    )

    override fun getTemplates() = templates
}