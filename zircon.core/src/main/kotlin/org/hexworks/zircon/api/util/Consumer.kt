package org.hexworks.zircon.api.util

interface Consumer<in T> {

    fun accept(value: T)
}
