package test.paragraph2.kdoc.methods

class KdocMethodsFull {
    fun test1() {
        // this function does nothing
    }

    /**
     * This function is described
     * partially.
     */
    fun test2(a: Int): Int {
        return 2 * a
    }

    companion object {
        fun test3(a: Int) {
            throw IllegalStateException("Lorem ipsum")
        }
    }

    private class Nested {
        fun test4(a: Int, b: Int): Int = 42
    }
}
