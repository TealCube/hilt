/**
 * The MIT License
 * Copyright (c) 2015 Teal Cube Games
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
package com.tealcube.minecraft.bukkit.hilt;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class HiltLeatherArmor extends HiltItemStack {

    public HiltLeatherArmor(LeatherArmorType type, Color color) {
        super(type.getMat());
        setColor(color);
    }

    public Color getColor() {
        createItemMeta();
        if (getItemMeta() instanceof LeatherArmorMeta) {
            return ((LeatherArmorMeta) getItemMeta()).getColor();
        }
        return null;
    }

    public HiltLeatherArmor setColor(Color color) {
        createItemMeta();
        if (getItemMeta() instanceof LeatherArmorMeta) {
            ((LeatherArmorMeta) getItemMeta()).setColor(color);
        }
        return this;
    }

    enum LeatherArmorType {
        HELMET(Material.LEATHER_HELMET),
        CHESTPLATE(Material.LEATHER_CHESTPLATE),
        LEGGINGS(Material.LEATHER_LEGGINGS),
        BOOTS(Material.LEATHER_BOOTS);

        private final Material mat;

        private LeatherArmorType(Material mat) {
            this.mat = mat;
        }

        public Material getMat() {
            return mat;
        }
    }

}
