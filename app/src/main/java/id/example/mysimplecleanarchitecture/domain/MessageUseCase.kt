package id.example.mysimplecleanarchitecture.domain

interface MessageUseCase {

    fun getMessage(name: String): MessageEntity

}