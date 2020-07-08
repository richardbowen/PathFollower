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
package org.wint3794.pathfollower.debug

/**
 * A class with some static functions to log.
 */
object Log {
    private var builder = StringBuilder()
    private var telemetry: Telemetry? = null
    private var debug = true

    /**
     * Initialize the Log class.
     */
    fun init() {
        telemetry!!.init()
    }

    /**
     * Add log to StringBuilder.
     * @param log String to append.
     * @param origin The origin of the log.
     */
    fun println(log: String?, origin: String?) {
        builder.append("[").append(origin).append("]: ").append(log).append('\n')
    }

    /**
     * Updates log exporting StringBuilder as string to telemetry and clears buffer.
     */
    fun update() {
        if (debug) {
            telemetry!!.print(builder.toString())
        }
        builder = StringBuilder()
    }

    /**
     * Closes telemetry.
     */
    fun close() {
        telemetry!!.close()
    }

    /**
     * Sets a Telemetry Driver. It needs to implements [Telemetry]
     * @param telemetry Telemetry Driver. You can create one by implementing [Telemetry]
     * interface or you can use some of our drivers, like [org.wint3794.pathfollower.debug.telemetries.ConsolePrinter].
     */
    fun setTelemetry(telemetry: Telemetry?) {
        Log.telemetry = telemetry
    }

    /**
     * Sets Debugging Mode
     * @param debug Debug?
     */
    fun setDebuggingMode(debug: Boolean) {
        Log.debug = debug
    }

    fun getTelemetry(): Telemetry? {
        return telemetry
    }
}