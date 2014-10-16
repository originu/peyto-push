package peyto.push.worker.push.app;

public interface IPushNotificationResolver {

	void fireSingleNotification( PushSingleNotificationMessage singleMsg );

	void fireMultiNotifications( PushMultiNotificationMessage multiMsg );

}
