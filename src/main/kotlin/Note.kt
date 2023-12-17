data class Note(override val name: String, val insideNote : String) : ArhAndNoteName {
    override fun toString(): String {

        return "$name \n*********************\n$insideNote\n"
    }
}
