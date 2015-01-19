package CWD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Group {
	private String group;
	private String spec;
	
	
	public Group(String group, String spec) {
		super();
		this.group = group;
		this.spec = spec;
	}


	public String getGroup() {
		return group;
	}


	public String getSpec() {
		return spec;
	}


	
}
