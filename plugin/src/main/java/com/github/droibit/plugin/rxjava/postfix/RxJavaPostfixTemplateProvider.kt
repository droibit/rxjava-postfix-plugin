package com.github.droibit.plugin.rxjava.postfix

import com.github.droibit.plugin.rxjava.postfix.templates.*
import com.intellij.codeInsight.template.postfix.templates.JavaPostfixTemplateProvider

class RxJavaPostfixTemplateProvider : JavaPostfixTemplateProvider() {

    private val templates = hashSetOf(
            ObservableFromIterableOrArrayTemplate(),
            ObservableJustTemplate(),
            ObservableErrorTemplate(),
            SingleJustTemplate(),
            SingleErrorTemplate()
    )

    override fun getTemplates() = templates
}