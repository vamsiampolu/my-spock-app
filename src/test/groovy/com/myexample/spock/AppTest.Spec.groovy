import spock.lang.*

class AppTest extends Specification {
  def "it should say Hello, World"() {
    given: "The string Hello, World is provide"
      def String expected = "Hello, World"

    when: "Another string of Hello, World is provided"
      def String actual = "Hello, World"

    then: "They should be equal"
      actual == expected
  }
}
