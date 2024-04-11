// Import required classes 
import java.util.Properties;
import java.io.InputStream;
import com.boomi.execution.ExecutionUtil;

// Get Dynamic Process Property
delayTimer = ExecutionUtil.getDynamicProcessProperty("DPP_Delay_Timer");

// Convert String to Integer to perform mathematical operation. Here the output time delay is in seconds.
int waitFor = Integer.parseInt(delayTimer);
Thread.sleep(waitFor * 1000);

// Pass data stream
for( int i = 0; i < dataContext.getDataCount(); i++ ) {
    InputStream is = dataContext.getStream(i);
    Properties props = dataContext.getProperties(i);

    dataContext.storeStream(is, props);
}
