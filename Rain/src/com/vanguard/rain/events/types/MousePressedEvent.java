package com.vanguard.rain.events.types;

import com.vanguard.rain.events.Event;

public class MousePressedEvent extends MouseButtonEvent {

	public MousePressedEvent(int button, int x, int y) {
		super(button, x, y, Event.Type.MOUSE_PRESSED);
	}

}
