package com.codenjoy.dojo.icancode.client

/*-
 * #%L
 * iCanCode - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2018 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.common.services.Dice
import com.codenjoy.dojo.common.services.RandomDice

/**
 * Your AI
 */
class YourKotlinSolver : AbstractSolver {

    constructor(dice: Dice) : super(dice) {
        this.dice = dice;
    }

    override fun whatToDo(board: Board): Command {
        with(board) {
            if (!board.isMeAlive) return Command.doNothing()

            var goals = board.gold
            if (goals.isEmpty()) {
                goals = board.exits
            }

            // TODO your code here
            return Command.jump()
        }
    }
}
/**
 * Run this method for connect to the server and start the game
 */
fun main(args: Array<String>) {
    AbstractSolver.connectClient(
            // paste here board page url from browser after registration
            "http://localhost:8080/codenjoy-contest/board/player/y4czoxlry883wape55ql?code=5636182293488878774",
            // and solver here
            YourKotlinSolver(RandomDice()))
}
