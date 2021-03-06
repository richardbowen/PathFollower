/*
 * Copyright 2020 WinT 3794 (Manuel Diaz Rojo and Alexis Obed Garcia Hernandez)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.wint3794.ftc.pathfollower.geometry

/**
 * A class that indicates the robot position
 */
data class Pose2d(var x: Double, var y: Double, var angle: Double) {

    override fun toString(): String {
        return "Pose2d{" +
                "x=" + x +
                ", y=" + y +
                ", angle=" + angle +
                '}'
    }
}