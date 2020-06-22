/**
 * 
 */
package com.jjoules.utils;


/**
 * @author sanoussy
 *
 */
public class Result {
	
	private String testName;
	private double energy;
	private long duration;

	/**
	 * 
	 */
	public Result(double energyConsumed,long duration) {
		this.energy = energyConsumed;
		this.duration = duration;
	}
	public Result(String testName,double energyConsumed,long duration) {
		this.energy = energyConsumed;
		this.duration = duration;
		this.testName = testName;
	}
	
	public Result(String testName,Result res) {
		this.testName = testName;
		this.energy = res.getEnergyConsumed();
		this.duration = res.getDuration();
	}

	
	/**
	 * @return the duration
	 */
	public String getTestName() {
		return testName;
	}
	/**
	 * @return the energyConsumed
	 */
	public double getEnergyConsumed() {
		return energy;
	}

	/**
	 * @return the duration
	 */
	public long getDuration() {
		return duration;
	}
	
//	public static void main(String[] args) {
//		Gson gson = new Gson();
//		Result result = new Result("test",20.0,10);
//		List<Result> res = new ArrayList<Result>();
//		res.add(result);
//		try {
//			File file = new File("out.json");
//			gson.toJson(result, new FileWriter(file.getAbsoluteFile()));
//			System.out.println(gson.toJsonTree(res));
//		} catch (JsonIOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}