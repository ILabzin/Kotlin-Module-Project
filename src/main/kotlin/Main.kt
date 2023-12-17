fun main() {
    construct.constructMenu(
            Command.ARH,
            listOfArhiv,
            onCreate = {Command.addArhiv()},
            onSelect = {folder :ArhAndNoteName -> showAllNote(folder as Arhiv)},
            onExit = {end -> println(end) } )
}
var listOfArhiv: MutableList<Arhiv> = mutableListOf()
val construct = Construct()


fun showAllNote(oneOfArhive: Arhiv) {
    construct.constructMenu(
            Command.NOTE,
            oneOfArhive.listofNote,
            onCreate = {Command.addNote(oneOfArhive.listofNote) },
            onSelect ={ note -> println((note as Note)) },
            onExit ={ println("Возврат в главное меню \n") })

}