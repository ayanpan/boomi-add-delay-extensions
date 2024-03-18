# Add Time Delay in Boomi Process Execution with Extensions

The main advantage of this Groovy script is that we can edit the time delay (in seconds) in an extension, thereby, giving us flexibility to change the time in future through extensions without any code changes/deployments.

##Step-1:## Set a Dynamic Process Property, say, ##DPP_Delay_Timer##, in the Process. The value set for this Dynamic Process Property can be stored in a Process Property, which should be extended.

##Step-2:## Use the Groovy script - ##Time Delay with Extensions.groovy##. The output time delay will be in seconds.
