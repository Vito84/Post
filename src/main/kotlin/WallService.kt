package ru.netology

object WallService {
    var posts = emptyArray<Post>()


    fun add(post: Post): Post {
        var addId = if (posts.isNotEmpty()) posts.last().id + 1 else 1
        posts += post.copy(id = addId)
        return posts.last()

    }

    fun update(post: Post): Boolean {
        for ((index, updPost) in posts.withIndex())
            if (post.id == updPost.id) {
                posts[index] = post.copy(
                    ownerId = updPost.ownerId,
                    fromId = updPost.fromId,
                    createdBy = updPost.createdBy,
                    date = updPost.date,
                    text = updPost.text
                )

                return true
            }

        return false
    }
}









