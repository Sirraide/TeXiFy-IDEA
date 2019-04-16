package nl.rubensten.texifyidea.util

import com.intellij.openapi.project.Project
import nl.rubensten.texifyidea.index.LatexDefinitionIndex
import nl.rubensten.texifyidea.psi.LatexCommands

/**
 * Finds all environemnt definition commands within the project.
 *
 * @return The found definition commands.
 */
fun Project.findEnvironmentDefinitions(): Collection<LatexCommands> {
    return LatexDefinitionIndex.getItems(this).filter {
        it.name in Magic.Command.environmentDefinitions
    }
}