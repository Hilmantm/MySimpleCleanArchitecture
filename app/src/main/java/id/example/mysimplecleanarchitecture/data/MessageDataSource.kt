package id.example.mysimplecleanarchitecture.data

import id.example.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity(welcomeMessage = "Hello $name! Welcome to Clean Architecture")
    }
}