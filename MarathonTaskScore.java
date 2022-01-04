package arrays;

/*
 * 
 * In CodeSignal marathons, each task score is calculated independently. For a specific task, you get some amount of points if you solve it correctly, or you get a 0. Here is how the exact number of points is calculated:

    If you solve a task on your first attempt within the first minute, you get maxScore points.
    Each additional minute you spend on the task adds a penalty of (maxScore / 2) * (1 / marathonLength) to your final score.
    Each unsuccessful attempt adds a penalty of 10 to your final score.
    After all the penalties are deducted, if the score is less than maxScore / 2, you still get maxScore / 2 points.

Implement an algorithm that calculates this score given some initial parameters.

Example

    For
    marathonLength = 100,
    maxScore = 400,
    submissions = 4, and
    successfulSubmissionTime = 30, the output should be
    solution(marathonLength, maxScore, submissions, successfulSubmissionTime) = 310.

    Three unsuccessful attempts cost 10 * 3 = 30 points. 30 minutes adds 30 * (400 / 2) * (1 / 100) = 60 more points to the total penalty. So the final score is 400 - 30 - 60 = 310.

    For
    marathonLength = 100,
    maxScore = 400,
    submissions = 95, and
    successfulSubmissionTime = 30, the output should be
    solution(marathonLength, maxScore, submissions, successfulSubmissionTime) = 200.

    400 - 10 * 94 - 30 * (400 / 2) * (1 / 100) = -600. But the score for this task cannot be less than 400 / 2 = 200, so the final score is 200 points.

    For marathonLength = 100, maxScore = 400, submissions = 95, and successfulSubmissionTime = -1, the output should be
    solution(marathonLength, maxScore, submissions, successfulSubmissionTime) = 0.

    The task wasn't solved, so it doesn't give any points.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] integer marathonLength

    A positive integer representing the length of the marathon in minutes.

    Guaranteed constraints:
    100 ≤ marathonLength ≤ 1000.

    [input] integer maxScore

    A positive integer. It is guaranteed that maxScore is divisible by 2 * marathonLength.

    Guaranteed constraints:
    400 ≤ maxScore ≤ 2000.

    [input] integer submissions

    A positive integer equal to the number of submissions made by the user for the specific task.

    Guaranteed constraints:
    1 ≤ submissions ≤ 100.

    [input] integer successfulSubmissionTime

    An integer equal to the time of successful submission in minutes since the beginning of the marathon (for example, if a successful submission was made on the first minute then successfulSubmissionTime = 0). If all submissions were unsuccessful then successfulSubmissionTime = -1.

    Guaranteed constraints:
    -1 ≤ successfulSubmissionTime < marathonLength.

    [output] integer

    The final score for the task.

 */
public class MarathonTaskScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1.00 / 400);
		
	}

	int solution(int marathonLength, int maxScore, int submissions, int successfulSubmissionTime) {

		// edge case
		if (successfulSubmissionTime < 0)
			return 0;

		// If you solve a task on your first attempt within the first minute, you get
		// maxScore points.
		if (successfulSubmissionTime <= 1 && submissions == 1)
			return maxScore;

		int unsuccessful = (submissions - 1) * 10;

		//// note: use 1.00 instead of 1, as it will automatically convert the response to double with decimal points
		double penalty = successfulSubmissionTime * (maxScore / 2) * 1.00 / marathonLength;
		double score = maxScore - unsuccessful - penalty;

		//// case 3: after all the penalties are deducted, if the score is less than
		//// maxScore / 2, you still //get maxScore / 2 points.
		if (score <= maxScore / 2.00)
			score = maxScore / 2.00;

		return (int) score;
	}

}
