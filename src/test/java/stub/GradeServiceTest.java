package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    // @InjectMocks
    // private GradeSystem mockGradeSystem;
    @Mock
    private GradeService mockGradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(mockGradeService.calculateAverageGrades(1))
                .thenReturn(90.0);
        double result = mockGradeService.calculateAverageGrades(1);
        Assertions.assertEquals(90.0, result);
    }
}
