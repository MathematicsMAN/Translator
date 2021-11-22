package ru.android.mytranslator.interactor.history

import ru.android.mytranslator.*

class HistoryInteractor(
    private val repositoryLocal: RepositoryLocal<List<DataModel>>
) : IHistoryInteractor<AppState> {

    override suspend fun getData(): AppState {
        return AppState.Success(repositoryLocal.getData(""))
    }
}