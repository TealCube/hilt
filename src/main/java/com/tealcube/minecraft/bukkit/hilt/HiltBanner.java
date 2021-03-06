/**
 * This file is part of hilt, licensed under the ISC License.
 *
 * Copyright (c) 2015-2016 Teal Cube Games <tealcubegames@gmail.com>
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted,
 * provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF
 * THIS SOFTWARE.
 */
package com.tealcube.minecraft.bukkit.hilt;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.ArrayList;
import java.util.Collection;

public class HiltBanner extends HiltItemStack {

    public HiltBanner(Collection<Pattern> patterns, DyeColor color) {
        super(Material.BANNER);
        setPatterns(patterns);
        setColor(color);
    }

    public Collection<Pattern> getPatterns() {
        createItemMeta();
        if (getItemMeta() instanceof BannerMeta) {
            return ((BannerMeta) getItemMeta()).getPatterns();
        }
        return new ArrayList<>();
    }

    public HiltBanner setPatterns(Collection<Pattern> patterns) {
        createItemMeta();
        if (getItemMeta() instanceof BannerMeta) {
            ((BannerMeta) getItemMeta()).setPatterns(new ArrayList<>(patterns));
        }
        return this;
    }

    public DyeColor getColor() {
        createItemMeta();
        if (getItemMeta() instanceof BannerMeta) {
            return ((BannerMeta) getItemMeta()).getBaseColor();
        }
        return null;
    }

    public HiltBanner setColor(DyeColor color) {
        createItemMeta();
        if (getItemMeta() instanceof BannerMeta) {
            ((BannerMeta) getItemMeta()).setBaseColor(color);
        }
        return this;
    }

}
