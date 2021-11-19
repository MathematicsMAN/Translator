package ru.android.mytranslator.domain.state

sealed interface StopwatchState {
    data class Paused(
        val elapsedTime: Long
    ) : StopwatchState

    data class Running(
        val startTime: Long,
        val elapsedTime: Long
    ) : StopwatchState
}