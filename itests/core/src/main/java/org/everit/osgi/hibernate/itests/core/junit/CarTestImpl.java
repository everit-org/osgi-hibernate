package org.everit.osgi.hibernate.itests.core.junit;

/*
 * Copyright (c) 2011, Everit Kft.
 *
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

import org.everit.osgi.hibernate.itests.core.service.CarService;


public class CarTestImpl implements CarTest {

    private CarService carService;
    
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    /* (non-Javadoc)
     * @see org.everit.osgi.hibernate.tests.core.junit.CarTest#testCar()
     */
    @Override
    public void testCar() {
        System.out.println("HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        carService.saveCar("Trabant");
    }
}
