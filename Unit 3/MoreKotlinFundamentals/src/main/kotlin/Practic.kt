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

    // Шаг 1: Группировка событий по daypart
    val eventsByDaypart = events.groupBy { event ->
        event.daypart
    }
    // Шаг 2: Вывод сводки по времени дня
    eventsByDaypart.forEach { (daypart, eventList) ->
        println("${daypart.name.lowercase().replaceFirstChar { it.uppercase() }}: ${eventList.size} events")
    }
}