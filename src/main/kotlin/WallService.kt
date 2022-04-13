package ru.netology

object WallService {
    private var posts = emptyArray<Post>()


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
                    date = updPost.date)
                println(posts[index])
                return true
            }

        return false
    }
}









