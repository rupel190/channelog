/*
 *     This file is part of Discord4J.
 *
 *     Discord4J is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Discord4J is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */

package sx.blah.discord.handle.impl.events.user;

import sx.blah.discord.api.events.Event;
import sx.blah.discord.handle.obj.IUser;

/**
 * This represents a generic user event.
 */
public abstract class UserEvent extends Event {
	
	private final IUser user;
	
	public UserEvent(IUser user) {
		this.user = user;
	}
	
	/**
	 * This gets the user involved in this event.
	 *
	 * @return The user.
	 */
	public IUser getUser() {
		return user;
	}
}
