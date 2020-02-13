package nl.hannahsten.texifyidea.inspections.latex

import com.intellij.codeInspection.InspectionManager
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.psi.PsiFile
import nl.hannahsten.texifyidea.index.LatexDefinitionIndex
import nl.hannahsten.texifyidea.insight.InsightGroup
import nl.hannahsten.texifyidea.inspections.TexifyInspectionBase
import nl.hannahsten.texifyidea.psi.LatexCommands
import nl.hannahsten.texifyidea.util.*

class LatexPackageCouldNotBeFound : TexifyInspectionBase() {
    override val inspectionGroup: InsightGroup = InsightGroup.LATEX

    override val inspectionId: String =
            "PackageCouldNotBeFound"

    override fun getDisplayName(): String {
        return "Package may not exist"
    }

    override fun inspectFile(file: PsiFile, manager: InspectionManager, isOntheFly: Boolean): List<ProblemDescriptor> {
        val descriptors = descriptorList()
        val ctanPackages = PackageUtils.CTAN_PACKAGE_NAMES.map { it.toLowerCase() }
        val customPackages = LatexDefinitionIndex.getCommandsByName("\\ProvidesPackage", file.project, file.project.projectSearchScope)
                .map { it.requiredParameter(0) }
                .map { it?.toLowerCase() }
        val packages = ctanPackages + customPackages

        val commands = file.childrenOfType(LatexCommands::class)
                .filter { it.name == "\\usepackage" || it.name == "\\RequirePackage" }

        for (command in commands) {
            val `package` = command.requiredParameters.first().toLowerCase()
            if (!packages.contains(`package`)) {
                descriptors.add(manager.createProblemDescriptor(
                        command,
                        "Package could not be found",
                        Magic.General.noQuickFix,
                        ProblemHighlightType.WARNING,
                        isOntheFly
                ))
            }
        }

        return descriptors
    }
}