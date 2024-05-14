/*
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.pokegoapi.api.inventory;

import POGOProtos.Inventory.Item.ItemIdOuterClass.ItemId;
import lombok.Getter;

public enum Pokeball {
	POKEBALL(ItemId.ITEM_POKE_BALL, 1.0),
	GREATBALL(ItemId.ITEM_GREAT_BALL, 0.4),
	ULTRABALL(ItemId.ITEM_ULTRA_BALL, 0.2),
	MASTERBALL(ItemId.ITEM_MASTER_BALL, 0.0);

	@Getter
	public final ItemId ballType;
	@Getter
	public final double captureProbability;

	Pokeball(ItemId type, double probability) {
		ballType = type;
		captureProbability = probability;
	}
}
