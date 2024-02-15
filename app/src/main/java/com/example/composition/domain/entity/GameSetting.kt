package com.example.composition.domain.entity

data class GameSetting (
    val maxSumValue:Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
        )