/* Copyright (c) 2001 - 2007 TOPP - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, availible at the root
 * application directory.
 */
package org.geonode.security;

import java.io.IOException;

import org.acegisecurity.Authentication;
import org.acegisecurity.AuthenticationException;

/**
 * A client that talks to GeoNode to authenticate the users based on cookies contents or
 * username/password
 * 
 * @author Andrea Aime - OpenGeo
 */
public interface GeonodeSecurityClient {

    /**
     * Authenticates a user based on cookie contents
     * 
     * @param gnCookie
     * @return
     * @throws AuthenticationException
     * @throws IOException
     */
    public Authentication authenticate(String cookieValue) throws AuthenticationException,
            IOException;
    
    /**
     * Gets the authentication for an anonymous user
     * 
     * @param gnCookie
     * @return
     * @throws AuthenticationException
     * @throws IOException
     */
    public Authentication authenticateAnonymous() throws AuthenticationException,
            IOException;

    /**
     * Authenticates based on username/password
     * 
     * @param username
     * @param password
     * @return
     * @throws AuthenticationException
     * @throws IOException
     */
    public Authentication authenticate(String username, String password)
            throws AuthenticationException, IOException;

}
