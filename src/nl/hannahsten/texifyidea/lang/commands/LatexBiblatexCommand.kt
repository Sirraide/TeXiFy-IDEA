package nl.hannahsten.texifyidea.lang.commands

import nl.hannahsten.texifyidea.lang.LatexPackage
import nl.hannahsten.texifyidea.lang.LatexPackage.Companion.BIBLATEX

/**
 * @author Hannah Schellekens
 */
enum class LatexBiblatexCommand(
    override val command: String,
    override vararg val arguments: Argument = emptyArray(),
    override val dependency: LatexPackage = LatexPackage.DEFAULT,
    override val display: String? = null,
    override val isMathMode: Boolean = false,
    val collapse: Boolean = false
) : LatexCommand {

    CITE_CAPITALIZED("Cite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PARENCITE("parencite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PARENCITE_CAPITALIZED("Parencite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FOOTCITE("footcite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FOOTCITETEXT("footcitetext", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    TEXTCITE("textcite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    TEXTCITE_CAPITALIZED("Textcite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SMARTCITE("smartcite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SMARTCITE_CAPITALIZED("Smartcite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    CITE_STAR("cite*", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PARENCITE_STAR("parencite*", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SUPERCITE("supercite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    CITES("cites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    CITES_CAPITALIZED("Cites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PARENCITES("parencites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PARENCITES_CAPITALIZED("Parencites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FOOTCITES("footcites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FOOTCITETEXTS("footcitetexts", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SMARTCITES("smartcites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SMARTCITES_CAPITALIZED("Smartcites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    TEXTCITES("textcites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    TEXTCITES_CAPITALIZED("Textcites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SUPERCITES("supercites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AUTOCITE("autocite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AUTOCITE_CAPITALIZED("Autocite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AUTOCITE_STAR("autocite*", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AUTOCITE_STAR_CAPITALIZED("Autocite*", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AUTOCITES("autocites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AUTOCITES_CAPITALIZED("Autocites", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    BIBLATEX_CITEAUTHOR("citeauthor", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    BIBLATEX_CITEAUTHOR_STAR("citeauthor*", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    BIBLATEX_CITEAUTHOR_CAPITALIZED("Citeauthor", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    BIBLATEX_CITEAUTHOR_STAR_CAPITALIZED("Citeauthor*", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    BIBLATEX_CITETITLE("citetitle", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    BIBLATEX_CITETITLE_STAR("citetitle*", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    BIBLATEX_CITEYEAR("citeyear", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    BIBLATEX_CITEYEAR_STAR("citeyear*", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    CITEDATE("citedate", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    CITEDATE_STAR("citedate*", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    CITEURL("citeurl", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    VOLCITE("volcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    VOLCITE_CAPITALIZED("Volcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    VOLCITES("volcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    VOLCITES_CAPITALIZED("Volcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PVOLCITE("pvolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PVOLCITE_CAPITALIZED("Pvolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PVOLCITES("pvolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PVOLCITES_CAPITALIZED("Pvolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FVOLCITE("fvolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FVOLCITE_CAPITALIZED("Fvolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FTVOLCITE("ftvolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FTVOLCITE_CAPITALIZED("Ftvolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FVOLCITES("fvolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FVOLCITES_CAPITALIZED("Fvolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FTVOLCITES("ftvolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SVOLCITE("svolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SVOLCITE_CAPITALIZED("Svolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SVOLCITES("svolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    SVOLCITES_CAPITALIZED("Svolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    TVOLCITE("tvolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    TVOLCITE_CAPITALIZED("Tvolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    TVOLCITES("tvolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    TVOLCITES_CAPITALIZED("Tvolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AVOLCITE("avolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AVOLCITE_CAPITALIZED("Avolcite", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AVOLCITES("avolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    AVOLCITES_CAPITALIZED("Avolcites", "prenote".asOptional(), "volume".asRequired(), "page".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FULLCITE("fullcite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FOOTFULLCITE("footfullcite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    BIBLATEX_NOCITE("nocite", "key".asRequired(), dependency = BIBLATEX),
    NOTECITE("notecite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    NOTECITE_CAPITALIZED("Notecite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PNOTECITE("pnotecite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PNOTECITE_CAPITALIZED("Pnotecite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    FNOTECITE("fnotecite", "prenote".asOptional(), "postnote".asOptional(), "key".asRequired(), dependency = BIBLATEX),
    PARENTTEXT("parenttext", "text".asRequired(Argument.Type.TEXT), dependency = BIBLATEX),
    BRACKETTEXT("brackettext", "text".asRequired(Argument.Type.TEXT), dependency = BIBLATEX),
    ;

    override val identifier: String
        get() = name
}