// Author: Adam Nunez, adam.a.nunez@gmail.com
// Copyright (C) 2014  name of author
// 
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
// 
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

package lfsr.simulator;

import javax.swing.UnsupportedLookAndFeelException;

/*
 *
 * LFSRSimulator.java
 * Purpose: This program is designed to aid in the creation of LFSRs in
 *          Verilog, VHDL, and AHDL. It entered beta on the 
 *          27th of March 2014.
 *
 * @author Adam Nunez, adam.a.nunez@gmail.com
 * @version 1.1 7 May 2014
 *
 */

public class LFSRSimulator {
    public static void main(String[] args) {
        try{
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName()
            );
        }
        catch (ClassNotFoundException | InstantiationException | 
               IllegalAccessException | UnsupportedLookAndFeelException e){}

        View view = new View();
        view.setVisible(true);
    }

    //To do:
    // AHDL
    // VHDL
    // MyHDL
    // Proper Docs
    // Image of circuit?
}