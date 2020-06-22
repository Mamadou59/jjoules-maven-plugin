/**
 * 
 */
package com.jjoules;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import com.jjoules.energyDisplay.EnergyRegisterJson;

/**
 * @author sanoussy
 *
 */
@Mojo(name = "saveResult",
defaultPhase = LifecyclePhase.TEST)
public class ResultSaverMojo extends AbstractMojo{


	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		EnergyRegisterJson.saveIt();
		
	}

}
