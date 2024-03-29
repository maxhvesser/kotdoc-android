package no.mhl.markdownparser

// region Base Block
open class Block(
    open var content: String,
    open var indented: Boolean = false
)
// endregion

// region Markdown Blocks
data class Heading(
    override var content: String,
    val level: Int = 1
) : Block(content)

data class Alert(
    override var content: String,
    var type: AlertType = AlertType.Note,
    var inlineContent: List<InlineBlock> = listOf()
) : Block(content) {
    enum class AlertType {
        Note,
        Warning;

        companion object {
            fun fromString(type: String): AlertType {
                return when (type) {
                    "note" -> Note
                    "warning" -> Warning
                    else -> Note
                }
            }
        }

    }
}

data class FencedCode(
    override var content: String
) : Block(content)

data class Paragraph(
    override var content: String,
    var inlineContent: List<InlineBlock> = listOf()
) : Block(content)

data class NewLine(
    override var content: String
) : Block(content)

data class BulletGroup(
    override var content: String,
    var bullets: List<BulletedText>
) : Block(content) {
    data class BulletedText(val inlineContent: List<InlineBlock>)
}
// endregion