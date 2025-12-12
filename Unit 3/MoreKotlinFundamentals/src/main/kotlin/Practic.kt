// Enum class для ограничения возможных значений времени дня
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

// Data class для хранения информации о событии
data class Event(
    val title: String,
    val description: String?,
    val daypart: Daypart,  // Теперь используем enum вместо String
    val durationInMinutes: Int
)

fun main() {
    // Создание списка событий
    val events = mutableListOf<Event>()

// Добавление всех событий в список
    events.add(Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0))
    events.add(Event(title = "Eat breakfast", description = null, daypart = Daypart.MORNING, durationInMinutes = 15))
    events.add(Event(title = "Learn about Kotlin", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 30))
    events.add(Event(title = "Practice Compose", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 60))
    events.add(Event(title = "Watch latest DevBytes video", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 10))
    events.add(Event(title = "Check out latest Android Jetpack library", description = null, daypart = Daypart.EVENING, durationInMinutes = 45))

    // Текущий способ коллеги - использование индекса
    println("Способ коллеги (через индекс):")
    println("Last event of the day: ${events[events.size - 1].title}")

    // Улучшенный способ - использование функции last()
    println("\nУлучшенный способ (через last()):")
    println("Last event of the day: ${events.last().title}")

    println("Результат через индекс: ${events[events.size - 1].title}")
    println("Результат через last(): ${events.last().title}")


    // Дополнительно

    // last() с условием
    val lastShortEvent = events.last { it.durationInMinutes < 60 }
    println("Последнее короткое событие: ${lastShortEvent.title}")

    // lastOrNull() для безопасного доступа
    val emptyList = emptyList<Event>()
    val lastEventOrNull = emptyList.lastOrNull()
    println("Последнее событие в пустом списке: ${lastEventOrNull?.title ?: "Список пуст"}")
}