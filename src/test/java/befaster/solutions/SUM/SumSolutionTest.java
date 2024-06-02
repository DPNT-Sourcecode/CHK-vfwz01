package befaster.solutions.SUM;

import befaster.solutions.HLO.HelloSolution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;
    private HelloSolution hell;


    @BeforeEach
    public void setUp() {
        sum = new SumSolution();
        hell = new HelloSolution();
    }

    @Test
    public void compute_sum() {
//        assertThat(sum.compute(1, 1), equalTo(2));
    }
}
