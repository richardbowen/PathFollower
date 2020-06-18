/*
 * Copyright 2020 WinT 3794 (Manuel Díaz Rojo and Alexis Obed García Hernández)
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

package org.wint3794.pathfollower.models.structures;

/**
 * ADT of Mecanum Directives [Vd, Td, Vt]
 */
public class MecanumDirectives {
    private final double vd;
    private final double td;
    private final double vt;

    /**
     * Creates a MecanumDirectives object from Vd, Td and Vt.
     *
     * @param vd Desired Magnitude [0 - 1]
     * @param td Desired Angle [0 - 2 * Math.PI]
     * @param vt Desired Rotation [-1 - 1]
     */
    public MecanumDirectives(double vd, double td, double vt) {
        this.vd = vd;
        this.td = td;
        this.vt = vt;
    }

    /**
     * Creates a MecanumDirectives object from Vd and Td.
     *
     * @param vd Desired Magnitude [0 - 1]
     * @param td Desired Angle [0 - 2 * Math.PI]
     */
    public MecanumDirectives(double vd, double td) {
        this.vd = vd;
        this.td = td;
        this.vt = 0;
    }

    /**
     * Returns Desired Magnitude
     *
     * @return Desired Magnitude [double]
     */
    public double getVd() {
        return vd;
    }

    /**
     * Returns Desired Angle
     *
     * @return Desired Angle [double]
     */
    public double getTd() {
        return td;
    }

    /**
     * Returns Desired Rotation
     *
     * @return Desired Rotation [double]
     */
    public double getVt() {
        return vt;
    }

    /**
     * Returns array with directives
     *
     * @return MecanumDirectives as an array
     */
    public double[] getDirectives() {
        double[] directives = new double[3];
        directives[0] = vd;
        directives[1] = td;
        directives[2] = vt;
        return directives;
    }

    /**
     * Returns string with directives
     *
     * @return MecanumDirectives as a string
     */
    @Override
    public String toString() {
        return "MecanumDirectives{" +
                "Vd=" + vd +
                ", Td=" + td +
                ", Vt=" + vt +
                '}';
    }
}