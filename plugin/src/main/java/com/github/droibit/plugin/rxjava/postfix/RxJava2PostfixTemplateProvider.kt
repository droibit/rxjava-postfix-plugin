package com.github.droibit.plugin.rxjava.postfix

import com.github.droibit.plugin.rxjava.postfix.templates.ObservableFromIterableOrArrayTemplate
import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider

class RxJava2PostfixTemplateProvider : JavaPostfixTemplateProvider() {

    private val templates = hashSetOf(
            ObservableFromIterableOrArrayTemplate()
    )

    override fun getTemplates() = templates
}