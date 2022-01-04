package arrays;

import java.util.LinkedList;

/*
 * 
 * CodeSignal supports different challenge types. One of them asks you to find a bug on a single line of the given code, usually referred to as a DEBUGGING challenge. Behind the scenes, we correctly implement each challenge ourselves and then use special comments with specific prefixes to introduce the buggy lines. Here is an image to help you visualize what that looks like:

As you can see, each of the special comments looks like this:

<spaces>//DB <id>//<buggy line>

where <spaces> is a string consisting of zero or more spaces (for indentation), DB indicates that this comment is for a DEBUGGING challenge (let's assume this is the only type we support), id is a positive integer that helps us enumerate these and <buggy line> is some code that's almost identical to the line to be replaced but with an inserted bug (that is guaranteed not to contain any '/' symbols).

When importing these to our database, each of the special comments is used to create a debugging challenge. The importing script looks for the last non-special-comment line above the special comment and replaces it with "<spaces><buggy line>" while removing all the other special comments from the code. Examples below can help clarify this process further.

Your task is to produce DEBUGGING challenges given source code that includes the special comments and the id of the desired DEBUGGING challenge.
 
 */
public class CodeDebuggerTaskMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] source = { "ans = 0", "for i in range(n):", "    for j in range(n):",
				"    //DB 3//for j in range(1, n):", "    //DB 2//for j in range(n + 1):", "        ans += 1",
				"return ans" };

		int challengeId = 3;

		System.out.println(solution(source, challengeId));
	}

	static String[] solution(String[] source, int challengeId) {

		LinkedList<String> solList = new LinkedList();
		String line = "";

		for (int i = 0; i < source.length; i++) {
			line = source[i];

			if (line.contains("//DB " + challengeId)) {
				solList.removeLast();
				line = line.replace("//DB " + challengeId + "//", "");

				solList.add(line);
			} else if (!line.contains("//DB ")) {
				solList.add(line);

			}

		}

		return solList.toArray(new String[0]);

	}

}
