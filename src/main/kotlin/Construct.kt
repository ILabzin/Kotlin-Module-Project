class Construct {
    fun <T : ArhAndNoteName> constructMenu (
            typeMenu: String,
            anyList: MutableList<T>,
            onCreate: (MutableList<Note>) -> Unit,
            onSelect: (ArhAndNoteName) -> Unit,
            onExit: (String) -> Unit,
    ) {
        while (true) {
            if (typeMenu.equals(Command.ARH)) {
                println("0. Создать новый ${Command.ARH}")
            } else {
                println("0. Создать новую ${Command.NOTE}")
            }
            anyList.forEachIndexed { index, element -> println("${index + 1}. ${element.name}") }
            println("${anyList.size+1}. Выход")



            val input : Int? = readln().toIntOrNull()
            if(input==null || input !in 0..anyList.size+1) {
                println("Неверная команда")
            } else {
                when (input) {
                    0 -> onCreate(anyList as MutableList<Note>)
                    (anyList.size + 1) -> {
                        onExit("Программа завершена")
                        break
                    }
                    else -> {
                        onSelect(anyList[input - 1])
                    }
                }
            }


        }
    }
}
