fun main(){
val quest = Quest()
    println("Введите название: ")
    val title = readln()
    println("введите время выполенения (в часах)")
    val duration = readln().toInt()
    println("Введите награду (в моентах)")
    val reward = readln().toInt()
    println("Введите уровень сложности: ")
    val difficulty = readln()
    quest.title = title
    quest.duration = duration
    quest.reward = reward
    quest.difficulty = difficulty

//    println("Название: ${quest.title} Время выполнения: ${quest.duration} Награда: ${quest.reward} золотых Уровень сложности:  ${quest.difficulty}")

quest.printInfo()
    quest.init(title,duration,reward,difficulty)
    quest.init("охота на тролля",3,500, "Средний")
    quest.init(title = "Драка с ведьмаком", reward=500, duration = 3, difficulty = "Сложный")

    val quests = mutableListOf<Quest>()
    for (i in 1..3){
        println("Добавим квест $i")
        val q = Quest()
        println("Название: ")
        val title = readln()
        println("Время:")
        val duration = readln().toInt()
        println("Введите награду (в моентах)")
        val reward = readln().toInt()
        println("Введите уровень сложности: ")
        val difficulty = readln()
        q.init(title,duration,reward,difficulty)
        quests.add(q)
        println()

    }
    println("Все доступные квесты: ")
    for (q in quests) q.printInfo()
}