package ru.netology




data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int?,
    val replyPostId: Int?,
    val friendsOnly: Boolean? = false,
    val comments: Comments?,
    val copyright: Copyright?,
    val likes: Likes?,
    val repost: Repost?,
    val views: Views?,
    val postType: PostType?,
    var attachments: Attachment,
    val signerId: Int = 0,
    val canPin: Boolean? = false,
    val canDelete: Boolean? = false,
    val canEdit: Boolean? = false,
    val isPinned: Boolean? = false,
    val markedAsAds: Boolean? = false,
    val donut: Donut?,
    val postponedId: Int?

) {

    data class Comments(
        val count: Int?,
        val canPost: Boolean = true,
        val groupsCanPost: Boolean = true,
        val canClose: Boolean = true,
        val canOpen: Boolean = true
    )

    data class Copyright(
        val id: Int = 0,
        val link: String = "",
        val name: String = "",
        val type: String = ""
    )

    data class Likes(
        val count: Int = 0,
        val userLikes: Boolean = false,
        val canLike: Boolean = true,
        val canPublish: Boolean = true
    )

    data class Repost(
        val count: Int = 0,
        val userReposted: Boolean = false
    )

    data class Views(
        val count: Int = 0
    )

    data class Donut(
        val isDonut: Boolean = false,
        val paidDuration: Int = 0,
        val placeholder: String = "",
        val canPublishFreeCopy: Boolean = false,
        val editMode: String = ""
    )


    enum class PostType { Post, Copy, Reply, Postpone, Suggest }

    sealed class Attachments(val type: String)

    data class Attachment(
        val type: String
    ){
        data class Video(val video: Video) : Attachments("video")
        data class Audio(val audio: Audio) : Attachments("audio")
        data class Photo(val photo: Photo) : Attachments("photo")
        data class Document(val document: Document) : Attachments("document")
    }
    fun goAttachments(att: Attachments): String = when (att) {
        is Attachment.Video -> "video \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
        is Attachment.Audio -> "audio \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
        is Attachment.Photo -> "photo \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
        is Attachment.Document -> "document \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"


    }

}
