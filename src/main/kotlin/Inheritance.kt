

        open class Animal(private val name: String) {
            fun speak() {
                println("Hello I'm $name")
            }
        }


        // Kotlin
        interface Animalable {
            fun eat()
        }

        class Cat(name: String) : Animal(name), Animalable {
            override fun eat() {

            }
        }

        // but class Animal must have keyword "open"













