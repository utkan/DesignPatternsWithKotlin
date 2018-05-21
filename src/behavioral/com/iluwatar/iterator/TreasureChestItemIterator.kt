/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package behavioral.com.iluwatar.iterator

/**
 *
 * TreasureChestItemIterator
 *
 */
class TreasureChestItemIterator(private val chest: TreasureChest, private val type: ItemType) : ItemIterator {
    private var idx: Int = -1

    override fun hasNext(): Boolean {
        return findNextIdx() != -1
    }

    override fun next(): Item? {
        idx = findNextIdx()
        return idx.takeIf { it != -1 }?.let { chest.items[it] }
    }

    private fun findNextIdx(): Int {
        val items = chest.items
        var tempIdx = idx
        while (true) {
            tempIdx = tempIdx.inc()
            if (tempIdx >= items.size) {
                tempIdx = -1
                break
            }
            if (ItemType.ANY == type || items[tempIdx].type == type) {
                break
            }
        }
        return tempIdx
    }
}