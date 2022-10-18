package overriding;

public class BaseKrediManager {
	public double hesapla (double tutar) {   // public final double yazmak override edilmesini engelliyor.
		return tutar * 1.18;
	}
}
