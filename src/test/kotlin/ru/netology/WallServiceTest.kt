package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        //arrange
        var addId = 0
        //act
        val result = WallService.add(
            Post(
                0,
                1,
                1,
                1,
                13042022,
                "привет",
                1,
                1,
                false,
                Post.Comments(11),
                Post.Copyright(4, "jj", "jj", "kkk"),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.Post,
                Post.Attachment("video"),
                1,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, "Stop", false, "all"),
                1

            )
        )
        assertNotEquals(0, result.id)

    }

    @Test
    fun updateTrue() {
        //arrange
        var addId = 0
        WallService.add(
            Post(
                0,
                1,
                1,
                1,
                13042022,
                "привет",
                1,
                1,
                false,
                Post.Comments(11),
                Post.Copyright(4, "jj", "jj", "kkk"),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.Post,
                Post.Attachment("video"),
                1,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, "Stop", false, "all"),
                1
            )
        )
        WallService.add(
            Post(
                2,
                1,
                1,
                1,
                13042022,
                "привет",
                1,
                1,
                false,
                Post.Comments(11),
                Post.Copyright(4, "jj", "jj", "kkk"),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.Post,
                Post.Attachment("video"),
                1,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, "Stop", false, "all"),
                1
            )
        )
        //act
        val result = WallService.update(
            Post(
                1,
                1,
                1,
                1,
                13042022,
                "привет",
                1,
                1,
                false,
                Post.Comments(11),
                Post.Copyright(4, "jj", "jj", "kkk"),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.Post,
                Post.Attachment("video"),
                1,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, "Stop", false, "all"),
                1
            )
        )
        assertTrue(result)

    }

    @Test
    fun updateFalse() {
        //arrange
        var addId = 0
        WallService.add(
            Post(
                1,
                1,
                1,
                1,
                13042022,
                "привет",
                1,
                1,
                false,
                Post.Comments(11),
                Post.Copyright(4, "jj", "jj", "kkk"),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.Post,
                Post.Attachment("video"),
                1,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, "Stop", false, "all"),
                1
            )
        )
        //act
        val result = WallService.update(
            Post(
                2,
                1,
                1,
                1,
                13042022,
                "привет",
                1,
                1,
                false,
                Post.Comments(11),
                Post.Copyright(4, "jj", "jj", "kkk"),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.Post,
                Post.Attachment("video"),
                1,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(false, 1, "Stop", false, "all"),
                1
            ))
        assertFalse(result)
    }
}