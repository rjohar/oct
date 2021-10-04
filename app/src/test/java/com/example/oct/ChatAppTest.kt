package com.example.oct

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Test

class ChatAppTest {

    var chatApp:ChatApp=ChatApp()


    @Test
    fun should_Receive_Response_From_ChatSend(){
        Assert.assertEquals(chatApp.getResponseOfChatSend(),"abc")
    }

}