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
                Post.Comments(),
                Post.Copyright(),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.post,
                1,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(),
                1

            )
        )
        assertEquals(0, result.id)

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
                Post.Comments(),
                Post.Copyright(),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.post,
                1,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(),
                1
            )
        )
        WallService.add(
            Post(
                2,
                1,
                1,
                1,
                15052022,
                "пока",
                1,
                1,
                false,
                Post.Comments(),
                Post.Copyright(),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.post,
                1,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(),
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
                15052022,
                "пока",
                1,
                1,
                false,
                Post.Comments(),
                Post.Copyright(),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.post,
                1,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(),
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
                15052022,
                "Добрый день",
                1,
                1,
                false,
                Post.Comments(),
                Post.Copyright(),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.post,
                1,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(),
                1
            )
        )
        //act
        val result = WallService.update(
            Post(
                2,
                55555,
                1,
                1,
                22222222,
                "пока",
                1,
                1,
                false,
                Post.Comments(),
                Post.Copyright(),
                Post.Likes(),
                Post.Repost(),
                Post.Views(),
                Post.PostType.post,
                1,
                false,
                false,
                false,
                false,
                false,
                false,
                Post.Donut(),
                1
            ))
        assertFalse(result)
    }
}