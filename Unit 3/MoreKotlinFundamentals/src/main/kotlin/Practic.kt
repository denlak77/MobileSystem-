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

// Создание экземпляра Event с тестовыми данными
val studyEvent = Event(
    title = "Study Kotlin",
    description = "Commit to studying Kotlin at least 15 minutes per day.",
    daypart = Daypart.EVENING,  // Используем enum значение
    durationInMinutes = 15
)