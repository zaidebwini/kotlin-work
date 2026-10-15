
fun redact(
    document: String,
    text: String,
    replacement: Char = 'X'
): String {
    return document.replace(text, replacement.toString())
}
