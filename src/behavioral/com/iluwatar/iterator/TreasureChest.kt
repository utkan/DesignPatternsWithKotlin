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

import java.util.ArrayList

/**
 *
 * TreasureChest, the collection class.
 *
 */
class TreasureChest {

    internal val items: List<Item> = listOf(
            Item(ItemType.POTION, "Potion of courage"),
            Item(ItemType.RING, "Ring of shadows"),
            Item(ItemType.POTION, "Potion of wisdom"),
            Item(ItemType.POTION, "Potion of blood"),
            Item(ItemType.WEAPON, "Sword of silver +1"),
            Item(ItemType.POTION, "Potion of rust"),
            Item(ItemType.POTION, "Potion of healing"),
            Item(ItemType.RING, "Ring of armor"),
            Item(ItemType.WEAPON, "Steel halberd"),
            Item(ItemType.WEAPON, "Dagger of poison"))

    internal fun iterator(itemType: ItemType): ItemIterator {
        return TreasureChestItemIterator(this, itemType)
    }

    /**
     * Get all items
     */
    fun getItems(): List<Item> {
        return ArrayList<Item>(items)
    }
}