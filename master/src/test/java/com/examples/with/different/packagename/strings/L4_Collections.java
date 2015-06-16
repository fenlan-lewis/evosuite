package com.examples.with.different.packagename.strings;

/*
 * SETTE - Symbolic Execution based Test Tool Evaluator
 *
 * SETTE is a tool to help the evaluation and comparison of symbolic execution
 * based test input generator tools.
 *
 * Budapest University of Technology and Economics (BME)
 *
 * Authors: Lajos Cseppentő <lajos.cseppento@inf.mit.bme.hu>, Zoltán Micskei
 * <micskeiz@mit.bme.hu>
 *
 * Copyright 2014
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public final class L4_Collections {
	private L4_Collections() {
		throw new UnsupportedOperationException("Static class");
	}

	public static boolean guessSize(int s) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);

		if (list.size() == s) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessElements(int a, int b) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);

		if (list.get(0) == a && list.get(1) == b) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessSizeAndElements(int s, int a, int b) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);

		if (list.size() == s && list.get(0) == a && list.get(1) == b) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessIndices(int a, int b) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		if (list.get(a) == 20 && list.get(b) == 30) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessElementAndIndex(int a, int i) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		if (list.get(i) == a) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessVectorWithSize(
			@SuppressWarnings("rawtypes") Vector v) {
		if (v.size() == 3) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessGenericVectorWithSize(Vector<Integer> v) {
		if (v.size() == 3) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessGenericVectorWithElement(Vector<Integer> v) {
		if (v.size() == 3 && v.get(0).equals(new Integer(5))) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessListWithSize(@SuppressWarnings("rawtypes") List l) {
		if (l.size() == 3) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessGenericListWithSize(List<Integer> l) {
		if (l.size() == 3) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean guessGenericListWithElement(List<Integer> l) {
		if (l.size() == 3 && l.get(0).equals(new Integer(5))) {
			return true;
		} else {
			return false;
		}
	}
}