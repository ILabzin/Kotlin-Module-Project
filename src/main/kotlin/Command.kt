class Command {
    companion object{
        const val ARH = "архив"
        const val NOTE = "заметку"

        fun addArhiv() {
            println("Введите имя нового архива")
            var nameOfArhiv: String
            val emptyArhiv: MutableList<Note> = mutableListOf()
            while (true) {
                nameOfArhiv = readln()
                if (nameOfArhiv.equals("")) {
                    println("Имя архива не может быть пустым. Введите название")
                } else {
                    break
                }
            }
            listOfArhiv.add(Arhiv(nameOfArhiv, emptyArhiv ))
        }

        fun addNote(list: MutableList<Note>) {
            println("Введите заголовок заметки")

            val input = readln()
            if (!input.equals("")) {
                println("Напишите заметку")
                val text = readln()
                list.add(Note(input, text))
            } else {
                println("Отмена создания заметки")
            }
        }
    }
}