class Hero {
    var name: String = "Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
    fun hello() {
        println("i`m $name, My journey is just beginning.")
    }

    fun status() {
        println("name - $name, class - $role, hp - $hp, mp $mp")
    }

    fun meditate() {
        println("$name медитирует")
        mp += 20
        println("мана восстановлена, текущая  = $mp")
    }

    fun dead() {
        if (hp == 0) {
            println("hero dead")
        }
    }

    fun takedamage(amount: Int) {
        println("$name получил урон $amount")
        hp -= amount
        if (hp > 0)
            println("текущее здоровье $hp")
        if (hp == 0) {
            dead()
        }
    }
    fun attack(enemy: Enemy,Damage: Int){
        println("$name атакует врага ${enemy.name}")
        enemy.takeDamage(30)
    }

    fun CastSpellOn(enemy: Enemy, spellname: String, damage: Int) {
        println("$name использует заклинание $spellname против ${enemy.name}")
    }
}

