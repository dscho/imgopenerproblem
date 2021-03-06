import io.scif.img.ImgOpener;
import io.scif.img.SCIFIOImgPlus;

public class UseImgOpener
{
	public static void main( final String[] args ) throws Exception
	{
		String path = System.getProperty("lsm.path");
		if (path == null) {
			path = "/Users/pietzsch/Downloads/HisYFP-SPIM/spim_TL18_Angle0.lsm";
		}
		useImgOpener( path );
	}

	public static void useImgOpener( final String fn ) throws Exception
	{
		final ImgOpener o = new ImgOpener();
		final SCIFIOImgPlus img = o.openImg( fn );
		img.cursor().next();
	}
}
