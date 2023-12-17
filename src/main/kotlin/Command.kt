class Command {
    companion object{
        const val ARH = "архив"
        const val NOTE = "заметку"

        fun addArhiv() {
            println("Введите имя нового ${ARH}а")
            var nameOfArhiv: String
            val emptyArhiv: MutableList<Note> = mutableListOf()
            while (true) {
                nameOfArhiv = readln()
                if (nameOfArhiv.isBlank()) {
                    println("Имя ${ARH}а не может быть пустым. Введите название")
                } else {
                    break
                }
            }
            listOfArhiv.add(Arhiv(nameOfArhiv, emptyArhiv ))
        }

        fun addNote(list: MutableList<Note>) {
            println("Введите заголовок заметки")

            val input = readln()
            if (!input.isBlank()) {
                var text :String

                while (true){
                    println("Напишите $NOTE")
                    text = readln()
                    if (text.isBlank()){
                        println("Заметка не может быть пустой")
                    } else break
                }
                list.add(Note(input, text))
            } else {
                println("Отмена создания заметки")
            }
        }
    }
}