package com.alvinalexander.utils

object StringUtils {
	implicit class StringImprovements(val: String) {
		def increment = s.map(c => (c + 1).toChar)
	}
}