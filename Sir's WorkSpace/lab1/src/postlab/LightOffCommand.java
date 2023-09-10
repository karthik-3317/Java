package postlab;

public class LightOffCommand 
{ 
	Light light;
    public LightOffCommand(Light light)
    {
        this.light = light;
    }
    public void execute()
    {
         light.off();
    }
}
