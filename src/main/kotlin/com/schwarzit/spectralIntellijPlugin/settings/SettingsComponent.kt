package com.schwarzit.spectralIntellijPlugin.settings

import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBTextArea
import com.intellij.ui.components.JBTextField
import com.intellij.util.ui.FormBuilder
import javax.swing.JPanel

class SettingsComponent {

    val mainPanel: JPanel
    val rulesetInput = JBTextField()
    val includedFilesInput = JBTextArea()

    init {
        mainPanel =
            FormBuilder.createFormBuilder()
                .addLabeledComponent(JBLabel("Ruleset"), rulesetInput)
                .addLabeledComponent(JBLabel("Included files"), includedFilesInput)
                .addComponentFillVertically(JPanel(), 0)
                .panel
    }


}
