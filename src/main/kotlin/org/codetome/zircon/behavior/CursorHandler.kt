package org.codetome.zircon.behavior

import org.codetome.zircon.Position
import org.codetome.zircon.Size

interface CursorHandler : Dirtiable {

    /**
     * Returns the position of the cursor, as reported by the terminal.
     */
    fun getCursorPosition(): Position

    /**
     * Moves the text cursor to a new location on the terminal.
     */
    fun putCursorAt(cursorPosition: Position)

    /**
     * Moves the cursor one [Position] to the right. If the [Position] would be out
     * of bound regards to columns, the cursor will be moved the the 0th position
     * in the next row.
     */
    fun advanceCursor()

    /**
     * Checks if the terminal cursor is visible or not.
     */
    fun isCursorVisible(): Boolean

    /**
     * Hides or shows the text cursor.
     */
    fun setCursorVisible(cursorVisible: Boolean)

    /**
     * Sets the 2d space which bounds the cursor.
     * For example in the case of a [org.codetome.zircon.terminal.Terminal]
     * it will be the terminal's size.
     */
    fun resizeCursorSpace(size: Size)
}