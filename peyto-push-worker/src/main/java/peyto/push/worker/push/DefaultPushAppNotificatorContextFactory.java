package peyto.push.worker.push;

import org.springframework.beans.factory.annotation.Autowired;

import peyto.push.common.types.PushType;
import peyto.push.dto.PushAPNSCertDTO;
import peyto.push.dto.PushGCMCertDTO;
import peyto.push.dto.PushWorkerCertDTO;
import peyto.push.service.impl.BasicPushAPNSCertsService;
import peyto.push.service.impl.BasicPushGCMCertsService;
import peyto.push.worker.push.apns.SimpleNotnoopAPNSNotificator;
import peyto.push.worker.push.gcm.BasicSimpleGCMNotificator;

public class DefaultPushAppNotificatorContextFactory {

	@Autowired
	private BasicPushAPNSCertsService		apnsCertService;

	@Autowired
	private BasicPushGCMCertsService		gcmCertService;
	
	public PushAppNotificatorContext create( PushWorkerCertDTO workerCert ) {
		PushAppNotificatorContext	context	= new PushAppNotificatorContext();
		if ( workerCert.isUseGcm() ) {
			PushGCMCertDTO gcmCert		= gcmCertService.getByGcmCertId( workerCert.getGcmCertId() );			
			context.put( PushType.GCM, new BasicSimpleGCMNotificator( gcmCert ) );
		}
		
		if ( workerCert.isUseApns() ) {
			PushAPNSCertDTO apnsCert	= apnsCertService.getByApnsCertId( workerCert.getApnsCertId() );
			// or ConnectionPoolingNotnoopAPNSNotificator
			context.put( PushType.APNS, new SimpleNotnoopAPNSNotificator( apnsCert ) );
		}
		return context;
	}

	public PushNotificator create( PushType pushType, int certId ) {
		switch ( pushType ) {
		case GCM:
			PushGCMCertDTO gcmCert		= gcmCertService.getByGcmCertId( certId );			
			return new BasicSimpleGCMNotificator( gcmCert );
		case APNS:
			PushAPNSCertDTO apnsCert	= apnsCertService.getByApnsCertId( certId );
			// or ConnectionPoolingNotnoopAPNSNotificator
			return new SimpleNotnoopAPNSNotificator( apnsCert );
		default:
			return null;
		}
	}
	
}
