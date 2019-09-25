package com.cheshizh.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XZC
 * @date 2019/9/252:38 PM
 * @页面名称：
 */
public class ActivityCollector {

	public static List<Activity> activities = new ArrayList<>();

	public static void addActivity(Activity activity) {
		activities.add(activity);
	}

	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}

	public static void finishAll() {
		for (Activity activity : activities) {
			activity.finish();
		}
		activities.clear();
	}
}
