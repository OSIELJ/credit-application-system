package dev.osiel.requestcreditsystem.exception

data class BusinessException(override val message: String?) : RuntimeException(message)