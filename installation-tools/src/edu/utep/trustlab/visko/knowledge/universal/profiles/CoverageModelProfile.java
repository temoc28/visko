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

public class CoverageModelProfile {
	public static void create() {
		String documentURL;
		String baseURL = Repository.getRepository().getBaseURL();
		/************ profile for velocity ******************************/
		String dataTypeURI = "http://rio.cs.utep.edu/ciserver/ciprojects/HolesCode/HolesCodeSAW3.owl#d7-0";

		ToolkitProfileWriter wtr = new ToolkitProfileWriter("coverageModelProfile");
		wtr.addDataType(dataTypeURI);

		// for vtkImageReader
		wtr.addInputBinding(baseURL + "vtkImageDataReaderService.owl#littleEndian","true");
		wtr.addInputBinding(baseURL + "vtkImageDataReaderService.owl#dim", "3");
		wtr.addInputBinding(baseURL + "vtkImageDataReaderService.owl#dataOrigin", "0/0/0");
		wtr.addInputBinding(baseURL + "vtkImageDataReaderService.owl#dataSpacing", "1/1/1");
		wtr.addInputBinding(baseURL + "vtkImageDataReaderService.owl#dataExtent", "0/229/0/24/0/67");
		wtr.addInputBinding(baseURL + "vtkImageDataReaderService.owl#numScalarComponents", "1");
		wtr.addInputBinding(baseURL + "vtkImageDataReaderService.owl#readLowerLeft","true");

		// for vtkContourFilter
		wtr.addInputBinding(
		baseURL + "vtkContourFilterService.owl#numContours",
		"35");
		wtr.addInputBinding(
		baseURL + "vtkContourFilterService.owl#scalarRange",
		"0.0/9000.0");

		// for vtkPolyDataMapper
		wtr.addInputBinding(
		baseURL + "vtkPolyDataMapperService.owl#scalarRange",
		"0.0/9000.0");
		wtr.addInputBinding(
		baseURL + "vtkPolyDataMapperService.owl#xRotation",
		"105");
		wtr.addInputBinding(
		baseURL + "vtkPolyDataMapperService.owl#yRotation",
		"0");
		wtr.addInputBinding(
		baseURL + "vtkPolyDataMapperService.owl#zRotation",
		"0");
		wtr.addInputBinding(
		baseURL + "vtkPolyDataMapperService.owl#size",
		"400/300");
		wtr.addInputBinding(
		baseURL + "vtkPolyDataMapperService.owl#backgroundColor",
		"1/1/1");
		wtr.addInputBinding(
		baseURL + "vtkPolyDataMapperService.owl#magnification",
		"3");

		// for vtkVolume
		wtr.addInputBinding(
		baseURL + "vtkVolumeService.owl#xRotation",
		"105");
		wtr.addInputBinding(
		baseURL + "vtkVolumeService.owl#yRotation",
		"0");
		wtr.addInputBinding(
		baseURL + "vtkVolumeService.owl#zRotation",
		"0");
		wtr.addInputBinding(
		baseURL + "vtkVolumeService.owl#size",
		"400/300");
		wtr.addInputBinding(
		baseURL + "vtkVolumeService.owl#backgroundColor",
		"0/0/0");
		wtr.addInputBinding(
		baseURL + "vtkVolumeService.owl#magnification",
		"3");
		wtr.addInputBinding(
		baseURL + "vtkVolumeService.owl#colorFunction",
		"20,1.0,0.0,0.3/80,1.0,0.0,0.3");
		wtr.addInputBinding(
		baseURL + "vtkVolumeService.owl#opacityFunction",
		"0,0.0/40,1.0");

		wtr.setSupportingToolkit(baseURL + "vtk.owl#vtk");
		documentURL = wtr.saveDocument();
		System.out.println(documentURL);
		}
}
