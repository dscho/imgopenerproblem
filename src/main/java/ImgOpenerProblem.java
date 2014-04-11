import ij.plugin.PlugIn;

public class ImgOpenerProblem implements PlugIn
{
	@Override
	public void run( final String arg0 )
	{
		try
		{
			UseImgOpener.useImgOpener( "/Users/pietzsch/Downloads/HisYFP-SPIM/spim_TL18_Angle0.lsm" );
		}
		catch ( final Exception e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
