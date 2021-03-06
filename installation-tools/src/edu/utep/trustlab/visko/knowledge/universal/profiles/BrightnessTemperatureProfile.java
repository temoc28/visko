/*
Copyright (c) 2012, University of Texas at El Paso
All rights reserved.
Redistribution and use in source and binary forms, with or without modification, are permitted
provided that the following conditions are met:

	-Redistributions of source code must retain the above copyright notice, this list of conditions
	 and the following disclaimer.
	-Redistributions in binary form must reproduce the above copyright notice, this list of conditions
	 and the following disclaimer in the documentation and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.*/


package edu.utep.trustlab.visko.knowledge.universal.profiles;

import edu.utep.trustlab.repository.Repository;
import edu.utep.trustlab.visko.ontology.service.writer.ToolkitProfileWriter;

public class BrightnessTemperatureProfile {
	public static void create() {
		String documentURL;
		String baseURL = Repository.getRepository().getBaseURL();
		/************ profile for brightness data ******************************/
		String dataTypeURI = "http://giovanni.gsfc.nasa.gov/data/brightness.owl#brightness";

		ToolkitProfileWriter wtr = new ToolkitProfileWriter("brightnessDataProfile");
		wtr.addDataType(dataTypeURI);

		// for netCDFGridContour
		wtr.addInputBinding(baseURL + "netCDFGridContour.owl#plotVariable", "ch4");
		wtr.addInputBinding(baseURL + "netCDFGridContour.owl#lbOrientation", "vertical");
		wtr.addInputBinding(baseURL + "netCDFGridContour.owl#cnLevelSpacingF", "10");
		wtr.addInputBinding(baseURL + "netCDFGridContour.owl#colorTable", "WhiteBlueGreenYellowRed");
		wtr.addInputBinding(baseURL + "netCDFGridContour.owl#font", "helvetica");
		wtr.addInputBinding(baseURL + "netCDFGridContour.owl#cnFillOn", "True");
		wtr.addInputBinding(baseURL + "netCDFGridContour.owl#cnLinesOn", "False");

		// for netCDFGridRaster
		wtr.addInputBinding(baseURL + "netCDFGridRaster.owl#plotVariable", "ch4");
		wtr.addInputBinding(baseURL + "netCDFGridRaster.owl#lbOrientation", "vertical");
		wtr.addInputBinding(baseURL + "netCDFGridRaster.owl#colorTable", "WhiteBlueGreenYellowRed");
		wtr.addInputBinding(baseURL + "netCDFGridRaster.owl#font", "helvetica");

		wtr.setSupportingToolkit(baseURL + "ncl.owl#ncl");
		documentURL = wtr.saveDocument();
		System.out.println(documentURL);
	}
}
