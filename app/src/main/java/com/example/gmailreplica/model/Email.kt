package com.example.gmailreplica.model

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build() : Email = Email(user, subject, preview, date, stared, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails():MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "Veja nossas três principais dicas para voce conseguir ..."
        preview = "Olá Ewelyn, você precisa ver esse site para"
        date = "18 mai"
        stared = false
    },

    email {
        user = "Youtube"
        subject = "Arinna Grande acabou de enviar um vídeo"
        preview = "Arianna Grande enviou: No tears to left cry"
        date = "23 ago"
        stared = false
    },
     email {
         user = "Facebook"
         subject = "Alguem curtiu sua foto"
         preview = "Olá Ewelyn, seu amigo curtiu sua foto"
         date = "31 set"
         stared =  true
         unread = true
     },

    email {
        user = "Youtube"
        subject = "Dua Lipa acabou de enviar um video"
        preview = "Dua Lipa enviou: Star now"
        date = "08 jan"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "Alguem compartilhou uma foto contigo"
        preview = "Artur compartilhou uma foto com voce da pagina oficial"
        date = "16 abril"
        stared = false
    },

    email {
        user = "Youtube"
        subject = "Arinna Grande acabou de enviar um vídeo"
        preview = "Arianna Grande enviou: No tears to left cry"
        date = "23 ago"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Alguem curtiu sua foto"
        preview = "Olá Ewelyn, seu amigo curtiu sua foto"
        date = "31 set"
        stared =  false
    },

    email {
        user = "Youtube"
        subject = "Dua Lipa acabou de enviar um video"
        preview = "Dua Lipa enviou: Star now"
        date = "08 jan"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "Alguem compartilhou uma foto contigo"
        preview = "Artur compartilhou uma foto com voce da pagina oficial"
        date = "16 abril"
        stared = false
    },

    email {
        user = "Youtube"
        subject = "Arinna Grande acabou de enviar um vídeo"
        preview = "Arianna Grande enviou: No tears to left cry"
        date = "23 ago"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Alguem curtiu sua foto"
        preview = "Olá Ewelyn, seu amigo curtiu sua foto"
        date = "31 set"
        stared =  false
    },

    email {
        user = "Youtube"
        subject = "Dua Lipa acabou de enviar um video"
        preview = "Dua Lipa enviou: Star now"
        date = "08 jan"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "Alguem compartilhou uma foto contigo"
        preview = "Artur compartilhou uma foto com voce da pagina oficial"
        date = "16 abril"
        stared = false
    }
)
