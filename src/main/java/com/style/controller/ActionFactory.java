package com.style.controller;

import com.style.controller.action.Action;
import com.style.controller.action.NotionListAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory :" + command);

		if (command.equals("notion_list")) {

			System.out.println("작동");

			action = new NotionListAction();
		}
		return action;
	}
}
