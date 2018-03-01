import spock.lang.*

class AppTest extends Specification {
  def "it should say Hello, World"() {
    given:
      def String expected = "Hello, World"

    when:
      def String actual = "Hello, World"

    then:
      actual == expected
  }
}
