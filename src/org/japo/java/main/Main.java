/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
//        Constantes
        final int TALLA_MIN = 20;
        final int TALLA_MAX = 60;
//        Variable
        int talla;
//        Random
        talla = RND.nextInt(TALLA_MAX - TALLA_MIN + 1) + TALLA_MIN;
        //Mensaje
        System.out.printf("Talla de zapato....: %d%n", talla);
    }
}
