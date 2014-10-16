package peyto.push.admin.controllers;

import java.util.List;

import org.codehaus.jackson.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import peyto.push.admin.dto.PaginationResponseDTO;
import peyto.push.dto.PushKeyDTO;
import peyto.push.dto.PushKeyPaginationDTO;
import peyto.push.service.api.PushKeysService;

//@Controller
public class PushKeysController {
	
	@Autowired
	private PushKeysService	pushKeysService;
	
	@RequestMapping( value="/pushkeys", method = RequestMethod.PUT )
	@ResponseBody
	public ResponseEntity< ObjectNode > createOrUpdate( @RequestBody PushKeyDTO pushkey ) {
		pushKeysService.add( pushkey );
		return new ResponseEntity< ObjectNode > ( HttpStatus.CREATED );
	}

	@RequestMapping( value="/pushkeys/{pushkey}", method = RequestMethod.GET )
	public ResponseEntity< PushKeyDTO > retrieve( @PathVariable( "pushkey" ) String pushkey ) {
		PushKeyDTO pushKeyDTO = pushKeysService.get( pushkey );
		if ( pushKeyDTO != null ) {
			return new ResponseEntity< PushKeyDTO >( pushKeyDTO, HttpStatus.OK );
		} else {
			return new ResponseEntity< PushKeyDTO >( HttpStatus.NOT_FOUND );
		}
	}
	
	/**
	 * http://localhost:8080/peyto-push-server-master/pushkeys?page=1&size=10
	 * http://localhost:8080/peyto-push-server-master/pushkeys?page=1&size=10&queryKey=CREATED_DATE&orderKey=USER_ID&orderValue=ASC
	 * @param pagination
	 * @return
	 */
	@ResponseBody
	@RequestMapping( value="/pushkeys", method = RequestMethod.GET )
//	public ResponseEntity< PaginationResponseDTO< PushKeyDTO > > retrieve( 
//			@RequestParam( value = "offset", required=false ) int offset, 
//			@RequestParam( value = "limit", required=false ) int limit,
//			@RequestParam( value = "search", required=false ) String search,
//			@RequestParam( value = "name", required=false ) String name,
//			@RequestParam( value = "order", required=false ) String order ) {
	public ResponseEntity< PaginationResponseDTO< PushKeyDTO > > retrieve( @ModelAttribute PushKeyPaginationDTO pagination ) {

////		offset=0&limit=10&search=test
//		PushKeyPaginationDTO pagination	= new PushKeyPaginationDTO();
//		pagination.setOffset( offset );
//		pagination.setLimit( limit );
		
		HttpHeaders	headers	= new HttpHeaders();
		headers.add( "X-Total-Count", String.valueOf( pushKeysService.getSize() ) );
		List<PushKeyDTO> items = pushKeysService.getItems( pagination );
		PaginationResponseDTO< PushKeyDTO >	pk	= new PaginationResponseDTO< PushKeyDTO >();
		pk.setTotal(35 );
		pk.setRows( items );
		return new ResponseEntity< PaginationResponseDTO< PushKeyDTO > > ( pk, headers, HttpStatus.OK );
	}
//	@ResponseBody
//	@RequestMapping( value="/pushkeys", method = RequestMethod.GET )
//	public ResponseEntity< List< PushKeyDTO > > retrieve( 
//			@RequestParam( value = "offset", required=false ) int offset, 
//			@RequestParam( value = "limit", required=false ) int limit,
//			@RequestParam( value = "search", required=false ) String search ) {
////		public ResponseEntity< List< PushKeyDTO > > retrieve( @ModelAttribute PushKeyPaginationDTO pagination ) {
//		
////		offset=0&limit=10&search=test
//		PushKeyPaginationDTO pagination	= new PushKeyPaginationDTO();
//		pagination.setStartIndex( offset );
//		pagination.setEndIndex( offset + limit );
//		
//		HttpHeaders	headers	= new HttpHeaders();
//		headers.add( "X-Total-Count", String.valueOf( pushKeysService.getSize() ) );
//		List<PushKeyDTO> items = pushKeysService.getItems( pagination );
//		return new ResponseEntity< List< PushKeyDTO > > ( items, headers, HttpStatus.OK );
//	}

	// TODO 
	@RequestMapping( value="/pushkeys/{pushkey}/alarm/{isOn}", method = RequestMethod.PUT )
	public ResponseEntity< ObjectNode > updateAlarm( 
			@PathVariable( "pushkey" ) String pushkey, 
			@PathVariable( "" ) boolean isOn ) {
		int	result	= 1;
//		pushKeysService.add( pushkey );
		if ( result > 0 ) {
			return new ResponseEntity< ObjectNode > ( HttpStatus.OK );
		} else {
			return new ResponseEntity< ObjectNode > ( HttpStatus.NOT_FOUND );
		}
	}

	@ResponseBody
	@RequestMapping( value="/pushkeys/{pushkey}", method = RequestMethod.DELETE )
	public ResponseEntity< ObjectNode > delete( @PathVariable( "pushkey" ) String pushkey ) {
		int	result	= pushKeysService.delete( pushkey );
		if ( result > 0 ) {
			return new ResponseEntity< ObjectNode > ( HttpStatus.OK );
		} else {
			return new ResponseEntity< ObjectNode > ( HttpStatus.NOT_FOUND );
		}
	}

	@RequestMapping( value="/pushkeys", method = RequestMethod.DELETE )
	public ResponseEntity< ObjectNode > deleteAllByAppId( @RequestParam( value = "appId", required = true ) String appId ) {
		pushKeysService.deleteAllByAppId( appId );
		return new ResponseEntity< ObjectNode > ( HttpStatus.OK );
	}

	//@RequestMapping( value="/pushkeys", method = RequestMethod.DELETE )
	public ResponseEntity< ObjectNode > deleteAll() {
		pushKeysService.deleteAll();
		return new ResponseEntity< ObjectNode > ( HttpStatus.OK );
	}
}