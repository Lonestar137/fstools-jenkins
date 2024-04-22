package org.foo

class Util {
  def steps
  Util(steps) {this.steps = steps}
  def test() {
    println "HELLO WORLD"
  }
}

class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
  def test() {
    println "HELLO WORLD"
  }
}
