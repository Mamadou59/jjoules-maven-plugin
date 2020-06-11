package com.jjoules.energyDisplay;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.jjoules.utils.Result;

/**
 * @author sanoussy
 *
 */
public class EnergyRegisterCSV extends EnergyDisplayHandler{
	
	public static EnergyRegisterCSV ENERGY_REGISTER_CSV = new EnergyRegisterCSV();
	
	private String fileName;

	private EnergyRegisterCSV() {
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public void displayIt(Map<String, Result> energyConsumedByDevice) {
		int id = 1;
		File file = new File(this.fileName);
		if (! file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			FileWriter  fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("id;tag;energyConsumed;duration\n");
			for(String domainName : energyConsumedByDevice.keySet()){
				Result result = energyConsumedByDevice.get(domainName);
				bw.write(id+";"+domainName+";"+result.getEnergyConsumed()+";"+result.getDuration()+"\n");
				id +=1;
			}
			bw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
//	public static void main(String[] args) {
//		EnergyRegisterCSV.ENERGY_REGISTER_CSV.setFileName("output.csv");
//		Map<String, Double> energyConsumedByDevice = new HashMap<String,Double>();
//		energyConsumedByDevice.put("Test1", 100.0);
//		energyConsumedByDevice.put("Test2", 200.0);
//		EnergyRegisterCSV.ENERGY_REGISTER_CSV.displayIt(energyConsumedByDevice);
//	}

}
