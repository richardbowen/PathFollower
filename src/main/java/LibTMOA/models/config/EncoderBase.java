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

package LibTMOA.models.config;

import LibTMOA.movement.encoder.Encoders;
import LibTMOA.movement.encoder.ZeroPowerBehavior;

public interface EncoderBase {
    /**
     * Sets encoder from Encoders ENUM
     *
     * @param encoder
     */
    void setMode(Encoders encoder);

    void setBrake(boolean brake);

    long getCurrentPosition();

    void setCurrentPosition(long currentPosition);

    void endUpdate();

    Encoders getEncoderMode();

    ZeroPowerBehavior getZeroPowerBehavior();
}