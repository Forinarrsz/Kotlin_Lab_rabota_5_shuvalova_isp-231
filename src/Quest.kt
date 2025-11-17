import kotlin.time.Duration

class Quest {
    var title: String = "Безымянное Задание"
    var duration: Int = 1
    var reward: Int = 100
    var difficulty: String = "Easy"

    fun init(title: String, duration: Int, reward: Int, difficulty: String) {
        this.title = title
        this.duration =duration
        this.reward = reward
        this.difficulty = difficulty

    }
    fun printInfo(){
        println("Название: ${this.title} Время выполнения: ${this.duration} Награда: ${this.reward} золотых Уровень сложности:  ${this.difficulty}")
    }

}