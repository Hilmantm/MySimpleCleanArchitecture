package id.example.mysimplecleanarchitecture.di

import id.example.mysimplecleanarchitecture.data.IMessageDataSource
import id.example.mysimplecleanarchitecture.data.MessageDataSource
import id.example.mysimplecleanarchitecture.data.MessageRepository
import id.example.mysimplecleanarchitecture.domain.IMessageRepository
import id.example.mysimplecleanarchitecture.domain.MessageInteractor
import id.example.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideUseCase(): MessageUseCase {
        return MessageInteractor(provideRepository())
    }

    private fun provideRepository(): IMessageRepository {
        return MessageRepository(provideDataSource())
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }

}