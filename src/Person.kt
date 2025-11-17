
fun main() {
    val naruto: Hero = Hero()
    println("name: ${naruto.name}, gender: ${naruto.gender}, class: ${naruto.role}, hp: ${naruto.hp}, mana: ${naruto.mp}")

    naruto.name = "Naruto"
    naruto.gender = "Man"
    naruto.role = "Hokage"
    naruto.hp = 200
    naruto.mp = 150

    val sasuke = Hero()
    sasuke.name = "Саске учиха"
    sasuke.gender = "Мужской"
    sasuke.role = "Шиноби-отступник"
    sasuke.hp = 120
    sasuke.mp =180

    println("name: ${sasuke.name}, gender: ${sasuke.gender}, class: ${sasuke.role}, hp: ${sasuke.hp}, mana: ${sasuke.mp}")

val hero = Hero()
    println("ВВедите имя")
    hero.name = readln()
    println("Введите пол (м; Ж)")
    hero.gender = readln()
    println("Введите класс:")
    hero.role = readln()
    println("Введите Здоровье")
    hero.hp = readln().toInt()
    println("Введите ману:" )
    hero.mp = readln().toInt()

    println("name: ${hero.name}, gender: ${hero.gender}, class: ${hero.role}, hp: ${hero.hp}, mana: ${hero.mp}")
    /*val oruchimaru = Enemy()
    oruchimaru.name = "Оручимару"
    oruchimaru.element = "Ветер"
*/
val oruchimaru = Enemy()
    oruchimaru.name = "Oruchimaru"
    naruto.status()
    println("Наруто увидел врага ${oruchimaru.name}! Его здоровье - ${oruchimaru.hp}")
    naruto.attack(oruchimaru,23)
}