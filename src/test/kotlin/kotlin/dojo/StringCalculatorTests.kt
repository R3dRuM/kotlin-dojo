
package kotling.dojo

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class StringCalculatorTests {
    @Test fun `Add zero as string will return 0`() {
        // Arrange

        val sut = StringCalculator()

        // Act
        val result = sut.Add("0")

        // Assert
        assertThat(result).isEqualTo(0)
    }
}
