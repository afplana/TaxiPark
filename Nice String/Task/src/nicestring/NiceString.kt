package nicestring

fun String.isNice(): Boolean {
    var sum = 0;

    if (!this.hasInvalidSubStr()) sum++
    if (this.contains3PlusVowels()) sum++
    if (this.hasDoubleLetters()) sum ++
    return sum > 1
}

fun String.hasInvalidSubStr(): Boolean = contains("bu") || contains("ba") || contains("be")


fun String.contains3PlusVowels(): Boolean = this.count { c ->  c.isVowel()} > 2
fun Char.isVowel(): Boolean = this in "aeiou"

fun String.hasDoubleLetters(): Boolean = zipWithNext().any { it.first == it.second }