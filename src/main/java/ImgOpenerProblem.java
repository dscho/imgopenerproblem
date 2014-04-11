import ij.IJ;
import ij.plugin.PlugIn;

public class ImgOpenerProblem implements PlugIn
{
	@Override
	public void run( final String arg0 )
	{
		try
		{
			UseImgOpener.main( new String[0] );
		}
		catch ( final Exception e )
		{
			IJ.handleException( e );
		}
	}
}
