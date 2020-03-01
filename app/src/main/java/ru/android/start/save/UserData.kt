package ru.android.start.save

object UserData {

    fun getUsers() = listOf(
        User("Мэрилин Монро", "Американская актриса, певица, модель"),
        User("Авраам Линкольн", "Президент США во время американской гражданской войны"),
        User("Mother Teresa", "Македонская католическая миссионерка"),
        User("John F. Kennedy", "Президент США 1961 - 1963")
    )

    fun getAnotherUsers() = listOf(
        User("Martin Luther King", "Американский участник кампании за гражданские права"),
        User("Nelson Mandela", "Президент Южной Африки, борющийся против апартеида"),
        User("Queen Elizabeth", "Британский монарх с 1954 года"),
        User("Winston Churchill", "Британский премьер-министр во время Второй мировой войны"),
        User("Donald Trump", "Бизнесмен, президент США."),
        User("Bill Gates", "Американский бизнесмен, основатель Microsoft"),
        User("Muhammad Ali", "Американский боксер и участник кампании за гражданские права"),
        User("Mahatma Gandhi", "Лидер индийского движения за независимость"),
        User("Margaret Thatcher", "Премьер-министр Великобритании 1979 - 1990"),
        User("Christopher Columbus", "Итальянский исследователь"),
        User("Charles Darwin", "Британский ученый, теория эволюции"),
        User("Elvis Presley", "Американский музыкант"),
        User("Albert Einstein", "Немецкий ученый, теория относительности"),
        User("Paul McCartney", "Британский музыкант, участник группы Beatles")
    )
}
