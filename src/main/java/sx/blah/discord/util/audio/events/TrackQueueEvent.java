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

package sx.blah.discord.util.audio.events;

import sx.blah.discord.util.audio.AudioPlayer;

/**
 * This is dispatched whenever a track is queued.
 */
public class TrackQueueEvent extends AudioPlayerEvent {

	private final AudioPlayer.Track track;

	public TrackQueueEvent(AudioPlayer player, AudioPlayer.Track track) {
		super(player);
		this.track = track;
	}

	/**
	 * This gets the {@link sx.blah.discord.util.audio.AudioPlayer.Track} instance queued.
	 *
	 * @return The track.
	 */
	public AudioPlayer.Track getTrack() {
		return track;
	}
}
