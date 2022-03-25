package id.example.mysimplecleanarchitecture.data

import id.example.mysimplecleanarchitecture.domain.IMessageRepository
import id.example.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}