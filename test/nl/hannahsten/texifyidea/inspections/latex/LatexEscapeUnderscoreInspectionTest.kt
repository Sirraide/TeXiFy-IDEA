package nl.hannahsten.texifyidea.inspections.latex

import nl.hannahsten.texifyidea.file.LatexFileType
import nl.hannahsten.texifyidea.inspections.TexifyInspectionTestBase

internal class LatexEscapeUnderscoreInspectionTest : TexifyInspectionTestBase(LatexEscapeUnderscoreInspection()) {

    fun `test unescaped _ character warning`() {
        myFixture.configureByText(LatexFileType, """
            \begin{document}
                some text <warning descr="Escape character \ expected">_</warning> with unescaped special character
            \end{document}
        """.trimIndent())
        myFixture.checkHighlighting(true, false, false, false)
    }

    fun `test unescaped _ character triggers no warning in new command`() {
        myFixture.configureByText(LatexFileType, """
            \usepackage{xparse}
            \begin{document}
                \newcommand{\test}{a_2}
                $\test$
                \NewDocumentCommand{\test}{}{a_b}
            \end{document}
        """.trimIndent())
        myFixture.checkHighlighting(true, false, false, false)
    }

    fun `test unescaped _ character triggers no warning in math`() {
        myFixture.configureByText(LatexFileType, """
            \begin{document}
                \[ a_b \]
                $ a_b $
            \end{document}
        """.trimIndent())
        myFixture.checkHighlighting(true, false, false, false)
    }

    fun `test unescaped _ character triggers no warning in label`() {
        myFixture.configureByText(LatexFileType, """
            \begin{document}
                \label{l_1}
            \end{document}
        """.trimIndent())
        myFixture.checkHighlighting(true, false, false, false)
    }

    fun `test unescaped _ character triggers no warning in input-like commands`() {
        myFixture.configureByText(LatexFileType, """
            \begin{document}
                \input{chapter_1}
                \ProvidesPackage{my_package}
                \ProvidesClass{my_class}
                \documentclass[my_option]{my_class}
                \usepackage[my_option]{my_package}
            \end{document}
        """.trimIndent())
        myFixture.checkHighlighting(true, false, false, false)
    }

    fun `test unescaped _ character triggers no warning in url environment`() {
        myFixture.configureByText(LatexFileType, """
            \begin{document}
                \url{web_site}
            \end{document}
        """.trimIndent())
        myFixture.checkHighlighting(true, false, false, false)
    }

    fun `test unescaped _ character quick fix`() {
        testQuickFix("""
            \begin{document}
                some _ text
            \end{document}
        """.trimIndent(), """
            \begin{document}
                some \_ text
            \end{document}
        """.trimIndent())
    }
}
