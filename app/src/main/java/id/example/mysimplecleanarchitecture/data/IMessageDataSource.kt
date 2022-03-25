package id.example.mysimplecleanarchitecture.data

import id.example.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {

    fun getMessageFromSource(name: String): MessageEntity

}