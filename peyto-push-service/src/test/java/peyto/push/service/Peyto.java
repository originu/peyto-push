package peyto.push.service;

public class Peyto {

	/*
	 * VM Option: -DPEYTO_HOME
	 */
	public static final String	PEYTO_HOME				= "PEYTO_HOME";

	/*
	 * VM Option: -Dspring.profiles.active
	 */
	public static final String	SPRING_PROFILES_ACTIVE	= "spring.profiles.active";
	
	public static final String	PROFILE_PRODUCTION		= "pro";
	public static final String	PROFILE_STAGING			= "sta";
	public static final String	PROFILE_DEVELOPMENT		= "dev";

	public static void setTestMode() {
		System.setProperty( PEYTO_HOME, "../peyto-push-home" );
	}
	
	public static void setSpringProfilesActive( String profile ) {
		System.setProperty( SPRING_PROFILES_ACTIVE, profile );
	}
}
