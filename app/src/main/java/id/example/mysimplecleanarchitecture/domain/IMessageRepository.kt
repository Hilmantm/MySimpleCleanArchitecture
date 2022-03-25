package id.example.mysimplecleanarchitecture.domain

interface IMessageRepository {

    fun getWelcomeMessage(name: String): MessageEntity

}