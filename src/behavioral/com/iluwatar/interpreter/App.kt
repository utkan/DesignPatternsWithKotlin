/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package behavioral.com.iluwatar.interpreter

import org.apache.log4j.BasicConfigurator
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.util.Stack

/**
 *
 * The Interpreter pattern is a design pattern that specifies how to evaluate sentences in a
 * language. The basic idea is to have a class for each symbol (terminal or nonterminal) in a
 * specialized computer language. The syntax tree of a sentence in the language is an instance of
 * the composite pattern and is used to evaluate (interpret) the sentence for a client.
 *
 *
 * In this example we use the Interpreter pattern to break sentences into expressions (
 * [Expression]) that can be evaluated and as a whole form the result.
 *
 */
object App {

    private val LOGGER = LoggerFactory.getLogger(App::class.java)

    /**
     *
     * Program entry point.
     *
     *
     * Expressions can be evaluated using prefix, infix or postfix notations This sample uses postfix,
     * where operator comes after the operands
     *
     * @param args command line args
     */
    @JvmStatic
    fun main(args: Array<String>) {

        BasicConfigurator.configure()

        val stack = Stack<Expression>()

        val tokenList = "4 3 2 - 1 + *"
                .split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

        var rightExpression: Expression
        var leftExpression: Expression
        var operator: Expression

        tokenList.forEach { token ->
            if (token.isOperator()) {
                rightExpression = stack.pop()
                leftExpression = stack.pop()
                LOGGER.info("popped from stack left: {} right: {}", leftExpression.interpret(), rightExpression.interpret())

                operator = token.toExpression(leftExpression, rightExpression)
                operator.log()
                stack.push(NumberExpression(operator.interpret()))
                LOGGER.info("push result to stack: {}", stack.peek().interpret())
            } else {
                stack.push(NumberExpression(token))
                LOGGER.info("push to stack: {}", stack.peek().interpret())
            }
        }
        LOGGER.info("result: {}", stack.pop().interpret())
    }

    private fun Expression.log(): Unit {
        LOGGER.info("operator: {}", this)
    }

    private fun String.isOperator(): Boolean {
        return this == "+" || this == "-" || this == "*"
    }

    /**
     * Get expression for string
     */
    private fun String.toExpression(left: Expression, right: Expression): Expression {
        return when (this) {
            "+" -> PlusExpression(left, right)
            "-" -> MinusExpression(left, right)
            "*" -> MultiplyExpression(left, right)
            else -> MultiplyExpression(left, right)
        }
    }
}