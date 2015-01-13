package com.jfinal.demo;

import com.jfinal.core.Controller;

public class HelloController extends Controller {

	public void index() {
		renderText("Hello Jfinal world !");
	}

	public void query() {
		renderText("query Jfinal world !");
	}
}
