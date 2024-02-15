package com.example.composition.domain.usecase

import com.example.composition.domain.entity.GameSetting
import com.example.composition.domain.entity.Level
import com.example.composition.domain.repository.GameRepository

class GetSettingsUseCase (private  val repository: GameRepository) {
    operator  fun invoke (level: Level): GameSetting {
      return  repository.getGameSettings(level)
    }
}